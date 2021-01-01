package com.xiongchao.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiongchao.common.utils.PageUtils;
import com.xiongchao.common.utils.Query;

import com.xiongchao.gulimall.product.dao.CategoryDao;
import com.xiongchao.gulimall.product.entity.CategoryEntity;
import com.xiongchao.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //查出所有分类
        CategoryDao categoryDao = this.baseMapper;
        List<CategoryEntity> categoryEntities = categoryDao.selectList(null);
        //一级分类
        List<CategoryEntity> leven1 = categoryEntities.stream()
                .filter((categoryEntity -> categoryEntity.getParentCid() == 0))
                .map(menu -> {
                    //组装数据
                    menu.setChildren(getChildren(menu, categoryEntities));
                    return menu;
                }).sorted((menu1, menu2) -> ((menu1.getSort() == null ? 0 : menu1.getSort())
                        - (menu2.getSort() == null ? 0 : menu2.getSort())))
                .collect(Collectors.toList());
        return leven1;
    }

    private List<CategoryEntity> getChildren(CategoryEntity entity,  List<CategoryEntity> all){
        return all.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == entity.getCatId();
        }).map(categoryEntity -> {
            //找到下面的子菜单
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> ((menu1.getSort() == null ? 0 : menu1.getSort())
                - (menu2.getSort() == null ? 0 : menu2.getSort()))
        ).collect(Collectors.toList());
    }

}
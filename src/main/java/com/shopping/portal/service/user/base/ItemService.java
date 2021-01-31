package com.shopping.portal.service.user.base;

import com.shopping.portal.entity.ItemCategoriesEntity;

import java.util.List;

public interface ItemService {

    List<ItemCategoriesEntity> getItemCategories(String username, Integer cityId);
}

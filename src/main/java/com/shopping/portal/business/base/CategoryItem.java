package com.shopping.portal.business.base;

import com.shopping.portal.entity.CategoriesItem;
import com.shopping.portal.request.BaseRequest;
import com.shopping.portal.response.BaseResponse;

import java.util.List;

public interface CategoryItem {

    BaseResponse getAllCategories(BaseRequest request);
    BaseResponse getJoinInformation(BaseRequest request);
}

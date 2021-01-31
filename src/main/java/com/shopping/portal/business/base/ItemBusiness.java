package com.shopping.portal.business.base;

import com.shopping.portal.request.BaseRequest;
import com.shopping.portal.request.ItemRequest;
import com.shopping.portal.response.BaseResponse;

public interface ItemBusiness {

    BaseResponse getAllCategories(BaseRequest request);
    BaseResponse getJoinInformation(BaseRequest request);
    BaseResponse getAllItemsAndCategories(ItemRequest request);
}

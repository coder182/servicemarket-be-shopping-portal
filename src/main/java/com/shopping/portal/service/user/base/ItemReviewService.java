package com.shopping.portal.service.user.base;

import com.shopping.portal.entity.ItemReviewEntity;
import com.shopping.portal.request.BaseRequest;
import com.shopping.portal.request.ItemReviewRequest;


public interface ItemReviewService  {

    ItemReviewEntity saveItemReview(ItemReviewRequest itemReviewRequest) throws Exception;
}

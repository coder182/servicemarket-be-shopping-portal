package com.shopping.portal.service.user.base;

import com.shopping.portal.entity.OrderCartEntity;
import com.shopping.portal.request.OrderCartRequest;

public interface OrderCartService {

    OrderCartEntity saveOrderCart(OrderCartRequest request) throws Exception;

}

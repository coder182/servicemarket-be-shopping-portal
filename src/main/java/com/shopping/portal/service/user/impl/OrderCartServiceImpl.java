package com.shopping.portal.service.user.impl;

import com.shopping.portal.entity.OrderCartEntity;
import com.shopping.portal.repository.OrderCartRepository;
import com.shopping.portal.request.OrderCartRequest;
import com.shopping.portal.service.user.base.OrderCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderCartServiceImpl implements OrderCartService {

    @Autowired
    OrderCartRepository orderCartRepository;


    @Override
    public OrderCartEntity saveOrderCart(OrderCartRequest request) throws Exception {

        OrderCartEntity orderCartEntity = new OrderCartEntity();

        orderCartEntity.setId(request.getId());
        orderCartEntity.setOrderTrackingId(request.getOrderTrackingId());
        orderCartEntity.setRefId(request.getRefId());
        orderCartEntity.setTotalPrice(request.getTotalPrice());
        orderCartEntity.setUserName(request.getUserName());

        orderCartRepository.save(orderCartEntity);

        return orderCartEntity;
    }
}

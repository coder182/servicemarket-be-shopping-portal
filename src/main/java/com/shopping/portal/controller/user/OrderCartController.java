package com.shopping.portal.controller.user;

import com.shopping.portal.request.OrderCartRequest;
import com.shopping.portal.response.BaseResponse;
import com.shopping.portal.service.user.base.OrderCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/order")
public class OrderCartController {

    @Autowired
    OrderCartService orderCartService;

    @PostMapping("/cart")
    public ResponseEntity<BaseResponse> postOrderCart(@Valid @RequestBody OrderCartRequest orderCartRequest) throws Exception{

        orderCartService.saveOrderCart(orderCartRequest);

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponseMessage("SUCCESS");
        baseResponse.setResponseCode("0100");

        return  ResponseEntity.ok(baseResponse);
    }
}

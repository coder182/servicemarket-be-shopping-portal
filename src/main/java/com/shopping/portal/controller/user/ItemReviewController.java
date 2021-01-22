package com.shopping.portal.controller.user;

import com.shopping.portal.entity.ItemReviewEntity;
import com.shopping.portal.request.ItemReviewRequest;
import com.shopping.portal.response.BaseResponse;
import com.shopping.portal.service.user.base.ItemReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/item")
public class ItemReviewController {

    @Autowired
    ItemReviewService itemReviewService;


    @PostMapping("/review")
    public ResponseEntity<BaseResponse> saveITemReview(@Valid @RequestBody ItemReviewRequest itemReviewRequest) throws  Exception{

        itemReviewService.saveItemReview(itemReviewRequest);

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponseMessage("SUCESS");
        baseResponse.setResponseCode("0100");

        return ResponseEntity.ok(baseResponse);
    }
}

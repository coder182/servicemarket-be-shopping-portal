package com.shopping.portal.controller;

import com.shopping.portal.business.base.CategoryItem;
import com.shopping.portal.request.BaseRequest;
import com.shopping.portal.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/category")
public class CategoryItemController {

    @Autowired
    CategoryItem categoryBusiness;

    @PostMapping("/getCategories")
    public ResponseEntity<BaseResponse> getAllCategories(@Valid @RequestBody BaseRequest request){

        return ResponseEntity.ok(categoryBusiness.getAllCategories(request));

    }

    @PostMapping("/getAll")
    public ResponseEntity<BaseResponse> getAllCategoriesWithItem(@Valid @RequestBody BaseRequest request){

        return ResponseEntity.ok(categoryBusiness.getJoinInformation(request));

    }
g


}

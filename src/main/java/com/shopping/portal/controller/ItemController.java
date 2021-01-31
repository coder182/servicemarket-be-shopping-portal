package com.shopping.portal.controller;

import com.shopping.portal.business.base.ItemBusiness;
import com.shopping.portal.request.BaseRequest;
import com.shopping.portal.request.ItemRequest;
import com.shopping.portal.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemBusiness categoryBusiness;

    @PostMapping("/getCategories")
    public ResponseEntity<BaseResponse> getAllCategories(@Valid @RequestBody BaseRequest request){

        return ResponseEntity.ok(categoryBusiness.getAllCategories(request));

    }

    @PostMapping("/getAll")
    public ResponseEntity<BaseResponse> getAllItemsWithCategories(@Valid @RequestBody ItemRequest request){

        return ResponseEntity.ok(categoryBusiness.getAllItemsAndCategories(request));

    }


}

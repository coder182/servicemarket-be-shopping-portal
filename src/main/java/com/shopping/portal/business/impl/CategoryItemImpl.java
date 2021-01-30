package com.shopping.portal.business.impl;

import com.shopping.portal.business.base.CategoryItem;
import com.shopping.portal.dto.CategoryItemResponseDto;
import com.shopping.portal.dto.CategoryItemdto;
import com.shopping.portal.entity.CategoriesItem;
import com.shopping.portal.repository.CategoryRepository;
import com.shopping.portal.request.BaseRequest;
import com.shopping.portal.response.BaseResponse;
import com.shopping.portal.response.CategoryItemResponse;
import com.shopping.portal.util.ConfigurationUtil;
import com.shopping.portal.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Component
public class CategoryItemImpl implements CategoryItem {

    @Autowired
    ConfigurationUtil configurationUtil;


    @Autowired
    CategoryRepository categoryRepository;




    @Override
    public BaseResponse getAllCategories(BaseRequest request) {


        List<CategoriesItem> categoryList =  categoryRepository.findAll();
         List<CategoryItemdto> categoryItemdtoList = new ArrayList<>();

         for(CategoriesItem categories:categoryList){
             CategoryItemdto categoryItemdto = new CategoryItemdto();
             categoryItemdto.setId(categories.getId());
             categoryItemdto.setCategoryName(categories.getCategoryName());
             categoryItemdtoList.add(categoryItemdto);
         }
        System.out.println(categoryRepository.findAll().size());

        return BaseResponse.builder().responseCode(Constants.SUCCESS_RESPONSE_CODE)
                .responseMessage(configurationUtil.getMessage(Constants.SUCCESS_RESPONSE_CODE)).response(categoryItemdtoList).build();

    }

    @Override
    public BaseResponse getJoinInformation(BaseRequest request) {

        List<CategoryItemResponse> categoryList =  categoryRepository.getJoinInformation();

        List<CategoryItemResponseDto> categoryItemdtoList = new ArrayList<>();


        for(CategoryItemResponse categories:categoryList){

            CategoryItemResponseDto categoryItemResponseDto= new CategoryItemResponseDto();


            categoryItemResponseDto.setCategoryName(categories.getCategoryName());

            categoryItemResponseDto.setId(categories.getId());
            categoryItemResponseDto.setItemName(categories.getItemName());
            categoryItemResponseDto.setImageUrl(categories.getImageUrl());
            categoryItemResponseDto.setItemPrice(categories.getItemPrice());
            categoryItemResponseDto.setDetails(categories.getDetails());



            categoryItemdtoList.add(categoryItemResponseDto);

        }
        System.out.println(categoryRepository.findAll().size());

        return BaseResponse.builder().responseCode(Constants.SUCCESS_RESPONSE_CODE)
                .responseMessage(configurationUtil.getMessage(Constants.SUCCESS_RESPONSE_CODE)).response(categoryItemdtoList).build();


    }

}

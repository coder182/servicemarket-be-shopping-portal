package com.shopping.portal.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import liquibase.pro.packaged.S;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class CategoryItemResponse {

        private  String id;
        private  String categoryName;
        private  String  itemName;
        private  String itemPrice;
        private  String details;
        private  String imageUrl;

        public CategoryItemResponse(String id,  String itemName, String itemPrice,  String imageUrl,String details,String categoryName) {
                this.id = id;
                this.categoryName = categoryName;
                this.itemName = itemName;
                this.itemPrice = itemPrice;
                this.details = details;
                this.imageUrl = imageUrl;
        }
}

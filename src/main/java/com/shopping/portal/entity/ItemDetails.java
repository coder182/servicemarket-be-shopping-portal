package com.shopping.portal.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "item")
public class ItemDetails {

    @Id
    private  String id;

    @NonNull
    @Column(name = "category_id")
    private String categoryId;

    @NonNull
    @Column(name = "delivery_city_id")
    private  String deliveryCityId;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_price")
    private String itemPrice;

    @Column(name = "item_stock")
    private  String itemStock;

    @Column(name = "image_url")
    private  String imageUrl;

    @Column(name = "user_name")
    private  String userName;

    @Column(name = "is_blocked")
    private  String isBlocked;

    @Column(name = "details")
    private String details;
}

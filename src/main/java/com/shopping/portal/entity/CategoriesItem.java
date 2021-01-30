package com.shopping.portal.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "item_categories")
public class CategoriesItem {


    @Id
    private String id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(targetEntity = ItemDetails.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="category_id",referencedColumnName = "id")
    private List<ItemDetails> categories;

}

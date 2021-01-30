package com.shopping.portal.repository;


import com.shopping.portal.entity.CategoriesItem;
import com.shopping.portal.response.CategoryItemResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository  extends JpaRepository<CategoriesItem,Integer> {

    @Query("SELECT new com.shopping.portal.response.CategoryItemResponse ( p.id,p.itemName,p.itemPrice,p.imageUrl,p.details,c.categoryName) FROM CategoriesItem c JOIN c.categories p")
    public List<CategoryItemResponse> getJoinInformation();

}

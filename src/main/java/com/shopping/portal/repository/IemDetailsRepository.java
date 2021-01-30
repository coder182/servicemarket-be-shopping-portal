package com.shopping.portal.repository;

import com.shopping.portal.entity.ItemDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IemDetailsRepository extends JpaRepository<ItemDetails,Integer> {
}

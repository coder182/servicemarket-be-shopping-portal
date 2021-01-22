package com.shopping.portal.service.user.impl;


import com.shopping.portal.entity.ItemReviewEntity;
import com.shopping.portal.repository.ItemReviewRepository;
import com.shopping.portal.request.ItemReviewRequest;
import com.shopping.portal.service.user.base.ItemReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class ItemReviewServiceImpl implements ItemReviewService {

    @Autowired
    ItemReviewRepository itemReviewRepository;

    @Override
    public ItemReviewEntity saveItemReview(ItemReviewRequest itemReviewRequest) throws Exception {

        ItemReviewEntity itemReviewEntity = new ItemReviewEntity();

        itemReviewEntity.setId(itemReviewRequest.getId());
        itemReviewEntity.setCommentDate(new Timestamp(System.currentTimeMillis()));
        itemReviewEntity.setCommnet(itemReviewRequest.getCommnet());
        itemReviewEntity.setItemId(itemReviewRequest.getItemId());
        itemReviewEntity.setUserName(itemReviewRequest.getUserName());

        itemReviewRepository.save(itemReviewEntity);
        return itemReviewEntity;
    }
}

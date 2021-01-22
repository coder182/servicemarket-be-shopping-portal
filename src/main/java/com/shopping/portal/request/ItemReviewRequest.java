package com.shopping.portal.request;


import lombok.*;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class ItemReviewRequest {

    private Integer id;

    @NotBlank
    private String commnet;

    @NotBlank
    private Timestamp commentDate;

    @NotBlank
    private int itemId;

    @NotBlank
    private String userName;
}

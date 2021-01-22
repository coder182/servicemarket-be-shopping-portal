package com.shopping.portal.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {

    private String responseCode;
    private String responseMessage;
    private Object response;




}

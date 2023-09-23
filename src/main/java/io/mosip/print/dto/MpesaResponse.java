package io.mosip.print.dto;

import lombok.Data;

@Data
public class MpesaResponse {
    private String status;
    private String message;
    private UserDto data;
    private String error;
}

package io.mosip.print.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private String userID;
    private String userType;
    private String token;
    private String message;
}

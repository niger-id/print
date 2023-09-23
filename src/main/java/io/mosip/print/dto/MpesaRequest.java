package io.mosip.print.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Instantiates a new mpesa request DTO.
 */
@Data
public class MpesaRequest implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;

	private String email;

	private String phoneNumber;

	private String password;
}

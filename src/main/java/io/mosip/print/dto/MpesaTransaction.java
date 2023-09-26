package io.mosip.print.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Instantiates a new mpesa transaction request DTO.
 */
@Data
public class MpesaTransaction implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	private String accountNo;

	private String customerType;

	private int amount;

}

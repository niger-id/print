package io.mosip.print.model;

import io.mosip.print.constant.BiometricFunction;
import io.mosip.print.constant.BiometricType;
import io.mosip.print.entity.RegistryIDType;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class SDKInfo {
	
	private String apiVersion;
	private String sdkVersion;
	private List<BiometricType> supportedModalities;
	private Map<BiometricFunction, List<BiometricType>> supportedMethods;
	
	/**
	 * eg: license expire details
	 */
	private Map<String, String> otherInfo;
	private RegistryIDType productOwner;
	
	public SDKInfo(String apiVersion, String sdkVersion, String organization, String type) {
		this.apiVersion = apiVersion;
		this.sdkVersion = sdkVersion;
		this.productOwner = new RegistryIDType(organization, type);
		this.supportedModalities = new ArrayList<>();
		this.supportedMethods = new HashMap<>();
		this.otherInfo = new HashMap<>();
	}
	
	public SDKInfo withSupportedMethod(BiometricFunction function, BiometricType biometricType) {
		if(!this.supportedMethods.containsKey(function))
			this.supportedMethods.put(function, new ArrayList<>());
		this.supportedMethods.get(function).add(biometricType);
		return this;
	}
	
}

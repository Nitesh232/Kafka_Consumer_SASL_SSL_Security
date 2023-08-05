package com.nitesh.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleMessage {

	private Integer messageIid;
	
	private String message;
	
}

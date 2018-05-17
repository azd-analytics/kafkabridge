package com.allianz.aid.KafkaBridge.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @Builder
public class Requests {

	  private long timestamp;
	  private String message;
	
}

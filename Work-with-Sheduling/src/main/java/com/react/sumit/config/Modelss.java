package com.react.sumit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component("mods")
public class Modelss {
	@Value("testers")
	private String testing;

}

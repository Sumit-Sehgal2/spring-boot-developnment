package com.react.sumit.all;

import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class logging {
	
	
static	Logger log=Logger.getLogger(logging.class);


@GetMapping("/get")
public ResponseEntity<String>getlogg()
{
	log.debug("its a debug message ");
	log.trace("its a trace ");
	log.info("its a Information ");
	log.warn("getting the warn");
	log.fatal("getting the fatal");
	
	return null;
	
}



}

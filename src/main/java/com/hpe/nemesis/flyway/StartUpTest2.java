package com.hpe.nemesis.flyway;

import javax.enterprise.context.ApplicationScoped;
 
import javax.inject.Inject;
 
import org.jboss.logging.Logger;

 

@ApplicationScoped
public class StartUpTest2 {

	@Inject
	Logger log;

	public void runTest() {
		log.info("############################runTest2############################");

	}
}

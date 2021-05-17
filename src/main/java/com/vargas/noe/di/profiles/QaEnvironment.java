package com.vargas.noe.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
//@Profile({"qa","default"})
public class QaEnvironment implements EnvironmentService{

	@Override
	public String getEnvironment() {
		return "Qa";
	}

}

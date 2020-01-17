package com.injection.propfile.beanpool;
//
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FootballCoach implements Coach {
	private String coachname;
	private String email;
	@Override
	public String getWorkout() {
		return "Do sprint 8 and stretches for muscle conditioning";
		
	}
	

}

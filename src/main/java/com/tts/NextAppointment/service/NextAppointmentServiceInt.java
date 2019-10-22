package com.tts.NextAppointment.service;

import java.util.ArrayList;

import com.tts.NextAppointment.model.NextAppointment;

public interface NextAppointmentServiceInt {
	
	 public ArrayList<NextAppointment> getAll();
	 
	 public ArrayList<NextAppointment> getName(String name);
	 
	 public ArrayList<NextAppointment> getService(String service);
	 
	 public ArrayList<NextAppointment> getLocation(String location);
	
	 public ArrayList<NextAppointment> getTime(Integer time);
	 
	 public ArrayList<NextAppointment> getDate(Integer date);

	 public ArrayList<NextAppointment> getAmount(Integer amount);
	 
	 public NextAppointment saveNextAppointment(NextAppointment nextAppointment);

	 public NextAppointment getNextAppointmentById(Long id);
	 
	 public void deleteNextAppointmentById(Long id);
	 
	 public void deleteAllNextAppointment();

	 public void updateNextAppointmentById(NextAppointment nextAppointmentWithChanges, Long id);




	 
}

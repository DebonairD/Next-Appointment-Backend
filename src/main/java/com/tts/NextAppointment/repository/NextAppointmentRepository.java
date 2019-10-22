package com.tts.NextAppointment.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.NextAppointment.model.NextAppointment;

@Repository
public interface NextAppointmentRepository extends CrudRepository<NextAppointment, Long>{

	public NextAppointment findNextAppointmentById(Long id);
	
	public ArrayList<NextAppointment> findAll();
	
	public ArrayList<NextAppointment> findNextAppointmentByName(String name);
	
	public ArrayList<NextAppointment> findNextAppointmentByService(String service);

	public ArrayList<NextAppointment> findNextAppointmentByLocation(String location);
	
	public ArrayList<NextAppointment> findNextAppointmentByTime(Integer time);
	
	public ArrayList<NextAppointment> findNextAppointmentByDate(Integer date);
	
	public ArrayList<NextAppointment> findNextAppointmentByAmount(Integer amount);





	
	

	





}

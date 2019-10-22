package com.tts.NextAppointment.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.NextAppointment.model.NextAppointment;
import com.tts.NextAppointment.repository.NextAppointmentRepository;

@Service
public class NextAppointmentServiceImpl implements NextAppointmentServiceInt{
	
	@Autowired
	NextAppointmentRepository nextAppointmentRepository;
	
	@Override
	public NextAppointment saveNextAppointment(NextAppointment nextAppointment) {
			return nextAppointmentRepository.save(nextAppointment);
	}
	@Override
	public NextAppointment getNextAppointmentById(Long id) {
			return nextAppointmentRepository.findNextAppointmentById(id);
	}
	@Override
	public ArrayList<NextAppointment> getAll() {
			return nextAppointmentRepository.findAll();
	}
	@Override
	public ArrayList<NextAppointment> getService(String service) {
		return nextAppointmentRepository.findNextAppointmentByService(service);
	}
	@Override
	public ArrayList<NextAppointment> getName(String name) {
		return nextAppointmentRepository.findNextAppointmentByName(name);
	}
	@Override
	public ArrayList<NextAppointment> getAmount(Integer amount){
			return nextAppointmentRepository.findNextAppointmentByAmount(amount);
	}

	@Override
	public ArrayList<NextAppointment> getLocation(String location) {
			return nextAppointmentRepository.findNextAppointmentByLocation(location);
	}
	@Override
	public ArrayList<NextAppointment> getDate(Integer date) {
		return nextAppointmentRepository.findNextAppointmentByDate(date);
	}
	@Override
	public ArrayList<NextAppointment> getTime(Integer time) {
			return nextAppointmentRepository.findNextAppointmentByTime(time);
	}
	@Override
	public void deleteAllNextAppointment() {
			nextAppointmentRepository.deleteAll();
		
	}
	@Override
	public void deleteNextAppointmentById(Long id) {
		    nextAppointmentRepository.deleteById(id);
	}
	@Override
	public void updateNextAppointmentById(NextAppointment nextAppointmentWithChanges, Long id) {
			NextAppointment currentNextAppointment = nextAppointmentRepository.findNextAppointmentById(id);
			currentNextAppointment.setName(nextAppointmentWithChanges.getName());
			currentNextAppointment.setAmount(nextAppointmentWithChanges.getAmount());
			currentNextAppointment.setService(nextAppointmentWithChanges.getService());
			currentNextAppointment.setDate(nextAppointmentWithChanges.getDate());
			currentNextAppointment.setTime(nextAppointmentWithChanges.getTime());
			currentNextAppointment.setLocation(nextAppointmentWithChanges.getLocation());
			nextAppointmentRepository.save(currentNextAppointment);
	}
	
}

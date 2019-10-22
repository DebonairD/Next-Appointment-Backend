package com.tts.NextAppointment.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tts.NextAppointment.model.NextAppointment;
import com.tts.NextAppointment.service.NextAppointmentServiceImpl;

@RestController
public class MainController {

	@Autowired
	NextAppointmentServiceImpl nextAppointmentServiceImpl;

	
	@GetMapping("/")
	public String index() {
		return "What Service Can I Schedule For You Today?";
	}
	@CrossOrigin
	@PostMapping("/nextAppointment")
	public void createNextAppointment(@RequestBody NextAppointment nextAppointment) {
		nextAppointmentServiceImpl.saveNextAppointment(nextAppointment);	
	}
	@CrossOrigin
	@GetMapping("/nextAppointment/{id}")
	public NextAppointment getNextAppointment(@PathVariable Long id) {
		return nextAppointmentServiceImpl.getNextAppointmentById(id);
	}
	@CrossOrigin
	@GetMapping("/nextAppointments")
	public ArrayList<NextAppointment> getAllNextAppointments(){
		return nextAppointmentServiceImpl.getAll();
	}
	@CrossOrigin
	@GetMapping("/nextAppointments/service")
	public ArrayList<NextAppointment> getNextAppointmentsByService(@RequestParam String service){
		return nextAppointmentServiceImpl.getService(service);
	}
	@CrossOrigin
	@GetMapping("/nextAppointments/name")
	public ArrayList<NextAppointment> getNextAppointmentsByName(@RequestParam String name){
		return nextAppointmentServiceImpl.getName(name);
	}
	@CrossOrigin
	@GetMapping("/nextAppointments/amount")
	public ArrayList<NextAppointment> getNextAppointmentByAmount(@RequestParam Integer amount){
		return nextAppointmentServiceImpl.getAmount(amount);
	}
	@CrossOrigin
	@GetMapping("/nextAppointments/time")
	public ArrayList<NextAppointment> getNextAppointmentByTime(@RequestParam Integer time){
		return nextAppointmentServiceImpl.getTime(time);
	}
	@CrossOrigin
	@GetMapping("/nextAppointments/date")
	public ArrayList<NextAppointment> getNextAppointmentByDate(@RequestParam Integer date){
		return nextAppointmentServiceImpl.getDate(date);
	}
	@CrossOrigin
	@GetMapping("/nextAppointments/location")
	public ArrayList<NextAppointment> getNextAppointmentByLocation(@RequestParam String location){
		return nextAppointmentServiceImpl.getLocation(location);
	}
	@CrossOrigin
	@DeleteMapping("/nextAppointments")
	public void deleteEverything() {
		nextAppointmentServiceImpl.deleteAllNextAppointment();
	}
	@CrossOrigin
	@DeleteMapping("/nextAppointment/{id}")
	public void deleteNextAppointment(@PathVariable Long id) {
		nextAppointmentServiceImpl.deleteNextAppointmentById(id);
	}
	@CrossOrigin
	@PutMapping("/nextAppointment/{id}")
	public void updateNextAppointment(@RequestBody NextAppointment nextAppointment, @PathVariable Long id) {
		nextAppointmentServiceImpl.updateNextAppointmentById(nextAppointment, id);
	}
	
}

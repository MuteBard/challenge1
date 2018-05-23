package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Appointments;
import com.example.demo.service.AppointmentService;

@RestController
public class AppointmentController {
	
	@Autowired
	private AppointmentService as;
	
	@CrossOrigin
	@RequestMapping("/getAppointments")
	public List<Appointments> AppointmentList(){
		return as.getAppointments();
	}

}
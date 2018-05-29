package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.model.Appointments;

@Component
public class AppointmentDao {
	private final String GET_APPOINTMENTS = "SELECT bookdate, booktime, description FROM appointment";
	private final String ADD_APPOINTMENT = "INSERT INTO appointment VALUES (DEFAULT, ?, ?, ?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Appointments> getAllAppointments() {
		return jdbcTemplate.query(GET_APPOINTMENTS, new BeanPropertyRowMapper<>(Appointments.class));
	}
	public void addAppointment(String date, String time, String desc) {
		jdbcTemplate.update(ADD_APPOINTMENT, date, time, desc);
	}
	
//	(ida ,species, name, ebells, months, rarity, eimage)
	
}
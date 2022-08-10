package io.inventory.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.inventory.model.Staff;
@Service
public interface StaffService {

	Collection<Staff> getAllSatff();

	Optional<Staff> getStaff(String id);

	String createStaff(Staff staff);

	String updateStaff(String id, Staff staff);

	String deleteStaff(String id);
	

}

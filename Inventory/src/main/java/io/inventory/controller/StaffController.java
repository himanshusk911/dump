package io.inventory.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.inventory.model.Staff;
import io.inventory.service.StaffService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/inventory")
public class StaffController {
	
	@Autowired
	StaffService staffResc;
	
	@RequestMapping("/staff")
	public String home() {
		return ("Welcome ");
	}
	

	@RequestMapping("/staffinfo")
	public Collection<Staff> getAllStaff(){
		return staffResc. getAllSatff();
	}

	@GetMapping("/staffinfo/{id}")
	public  Optional<Staff> getSatff(@PathVariable String id){
		return staffResc.getStaff(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addstaff")
	public void createStaff(@RequestBody Staff staff) {
		staffResc.createStaff(staff);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/staffinfo/{id}")
	public void updateStaff(@RequestBody Staff staff,@PathVariable String id) {
		staffResc.updateStaff(id, staff);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/staffinfo/{id}")
	public void deleteStaff(@PathVariable String  id) {
		staffResc.deleteStaff(id);
	}

}

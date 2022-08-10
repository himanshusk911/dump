package io.inventory.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.inventory.dao.InventoryDao;
import io.inventory.exception.StaffException;
import io.inventory.model.Staff;


@Service
public class StaffServiceImpl implements StaffService{
	
	@Autowired
	InventoryDao daoInvt;

	@Override
	public Collection<Staff> getAllSatff() {
		// TODO Auto-generated method stub
		return daoInvt.findAll();
	}

	@Override
	public Optional<Staff> getStaff(String id) {
		// TODO Auto-generated method stub
		Optional<Staff> staff = daoInvt.findById(id);
		if (!staff.isPresent()) {
			throw new StaffException("Id not found");
		}
		return staff;
	}

	@Override
	public String createStaff(Staff staff) {
		// TODO Auto-generated method stub
		daoInvt.insert(staff);
		return ("Added with id"+ staff.getId());
	}

	@Override
	public String updateStaff(String id, Staff staff) {
		// TODO Auto-generated method stub
		daoInvt.save(staff);
		return("Updated with id"+id);
	}

	@Override
	public String deleteStaff(String id) {
		// TODO Auto-generated method stub
		daoInvt.deleteById(id);
		return("Delete with id"+id);
	}

}

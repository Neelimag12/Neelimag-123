package com.Assignment.VaccinationCamp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment.VaccinationCamp.Entity.VaccineCenters;
import com.Assignment.VaccinationCamp.Repository.VaccineRepository;

@Service
public class VaccineService {
	@Autowired
	VaccineRepository vaccineRepository;

	public void addCenter(VaccineCenters vc) {
		  vaccineRepository.save(vc);
		
	}

	public List<VaccineCenters> getAllCenter() {
		return vaccineRepository.findAll();
	}

	public List<VaccineCenters> getAllCenterByDistrict(String district) {
		return vaccineRepository.findByDistrict(district);
		
	}

	public List<VaccineCenters> getAllCenterByPincode(int pincode) {
		
		return vaccineRepository.findByPincode(pincode);
	}

}



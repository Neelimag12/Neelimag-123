package com.Assignment.VaccinationCamp.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Assignment.VaccinationCamp.Entity.VaccineCenters;

@Repository
public interface VaccineRepository extends JpaRepository<VaccineCenters,Long>  {
	@Query("select v from VaccinationCenter v where v.centerPincode=?1")
	List<VaccineCenters> findByPincode(int pincode);
	
	@Query("select v from VaccinationCenter v where v.district=?1")
	List<VaccineCenters> findByDistrict(String district);

	void save(VaccineCenters vc);

	List<VaccineCenters> findAll();


}

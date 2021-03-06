package com.Assignment.VaccinationCamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Assignment.VaccinationCamp.Entity.VaccineCenters;
import com.Assignment.VaccinationCamp.Service.VaccineService;

@RestController
public class Controller {
	@Autowired
	VaccineService service;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addCenter(@RequestBody VaccineCenters vc ) {
		vc.setAvailablevaccine(400L);
		service.addCenter(vc);
		System.out.println(vc);
		
		
		
	}
	
	@RequestMapping(value="api/v1/pin")
	public ModelAndView searchByPin() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("pin");
		return mv;
	}
	
	@RequestMapping(value="api/v1/dist")
	public ModelAndView searchByDist() {
		ModelAndView mv=new ModelAndView();
		System.out.println("Hello");
		mv.setViewName("district");
		return mv;
	}
	
	@RequestMapping(value="api/v1/all", method=RequestMethod.GET)
	public ModelAndView getList(){
		ModelAndView mv=new ModelAndView();
		List<VaccineCenters> vcs=service.getAllCenter();
		System.out.print(vcs);
		mv.addObject("vcs", vcs);
		mv.addObject("message", vcs.size()+" center found");
		mv.setViewName("DetailedView");

		return mv;	
	}
	
	@RequestMapping(value="api/v1/district/{district}",method=RequestMethod.GET)
	public ModelAndView getListByDistrict(@PathVariable String district){
		ModelAndView mv=new ModelAndView();
		List<VaccineCenters> vcs=service.getAllCenterByDistrict(district);
		if(vcs.size()==0){
			mv.setViewName("DetailedView");
			mv.addObject("message", "No Center Found");
			return mv;
			
		}
		mv.setViewName("DetailedView");
		mv.addObject("message", vcs.size()+" center found");
		mv.addObject("vcs", vcs);
		return mv;
	}
	
	@RequestMapping(value="api/v1/pincode/{pincode}",method=RequestMethod.GET)
	public ModelAndView getListByPincode(@PathVariable int pincode){
		ModelAndView mv=new ModelAndView();
		List<VaccineCenters> vcs=service.getAllCenterByPincode(pincode);
		if(vcs.size()==0){
			mv.setViewName("DetailedView");
			mv.addObject("message", "No Center Found");
			return mv;
			
		}
		mv.setViewName("DetailedView");
		mv.addObject("message", vcs.size()+" center found");
		mv.addObject("vcs", vcs);
		return mv;
			
	}

}

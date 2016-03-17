package com.fuat.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fuat.model.EDM;
import com.fuat.service.EDMService;

@Controller
public class EDMController {
	@Autowired
	private EDMService edmService;
	

	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map) {
		EDM edm = new EDM();
		map.put("edm", edm);
		map.put("edmList", edmService.getAllEDM());

		return "edm";
	}
	
	

	@RequestMapping(value="/edm.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute EDM edm, BindingResult result, @RequestParam String action,
			Map<String, Object> map) {
		
		EDM edmResult = new EDM();
		switch(action.toLowerCase()){	
		case "add":
			edmService.add(edm);
			edmResult = edm;
			break;
		case "edit":
			edmService.edit(edm);
			edmResult = edm;
			break;
		case "delete":
			edmService.delete(edm.getFirstname());
			edmResult = new EDM();
			break;
		case "search":
			EDM searchedEDM = edmService.getEDM(edm.getFirstname());
			edmResult = searchedEDM!=null ? searchedEDM : new EDM();
			break;
		}
		map.put("edm", edmResult);
		map.put("edmList", edmService.getAllEDM());
		return "edm";
	}
}

package com.java.mobiliya.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.mobiliya.entity.RegDTO;
import com.java.mobiliya.service.RegDTOService;

@RestController
@RequestMapping("/reg")
public class RegDTOController {

	static {
		System.out.println(" Inside RegDTO Controller");
	}
	@Autowired
	RegDTOService regservice;

	@RequestMapping("/test")
	public String homepage() {
		System.out.println(" Inside Test");
		return "Test Spring Boot Method ----HomePage";
	}

	@GetMapping("/get/{id}")
	public Optional<RegDTO> getEmp(@PathVariable(value = "id") Long empId) {
		return regservice.findById(empId);
	}

	@PostMapping("/save")
	public RegDTO saveEmp(@RequestBody RegDTO registerCandidate) {
		return regservice.save(registerCandidate);
	}

}

package com.example.SpringMesseage.Contr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringMesseage.ent.Auto;
import com.example.SpringMesseage.repo.AutoRepo;

@RestController
@RequestMapping("/a")
public class SMCon {
	
	@Autowired
	AutoRepo repo;
	
	
	@PutMapping("/s")
	public String location() {
		System.out.println("coimbatore");
		return "tour";
	}
@PostMapping("/t")
public ResponseEntity<Object> SaveAddress(@RequestBody Auto aut){
	Auto A=repo.save(aut);
	return new ResponseEntity<Object>(A, HttpStatus.CONFLICT);
}
}

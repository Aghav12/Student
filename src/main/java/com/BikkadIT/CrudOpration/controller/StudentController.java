package com.BikkadIT.CrudOpration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.CrudOpration.entities.Student;
import com.BikkadIT.CrudOpration.service.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;
	
	@PostMapping(value = "/saveStudent", consumes = "application/json")
	public ResponseEntity<String> saveStudent (@RequestBody Student st) {
		boolean saveStudent = studentServiceI.saveStudent(st);
		
		if (saveStudent) {
			String msg = "Student Saved Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		}else {
		
			String msg = "Student Not Saved Successfully";
		return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		
	}
}

	@GetMapping(value = "/getAllStu",produces = "application/json")
	public List<Student> getAllStudent() {
		List<Student> allStudent = studentServiceI.getAllStudent();
		return allStudent;
		
	} 
		@PutMapping(value = "/updateStu", consumes = "application/json")
	public ResponseEntity<String > updateStudent(@RequestBody Student st){
		boolean saveStudent = studentServiceI.saveStudent(st);
		
		if(saveStudent) {
			String msg = "Student Update Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		
		}else {
			
			String msg = "Student Not Update Successfully";
		return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		
	}
	} 
		@DeleteMapping(value = "/deletAll")
		public ResponseEntity<String> deletAllStu () {
			boolean deletAllStu = studentServiceI.deletAllStu();
			if(deletAllStu) {
				String msg = "Student Deleted Successfully";
				return new ResponseEntity<String>(msg, HttpStatus.OK);
			}else {
				String msg = "Student not Deleted Successfully";
				return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
			}
			
			
		}
	}


package com.BikkadIT.CrudOpration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.CrudOpration.entities.Student;
import com.BikkadIT.CrudOpration.repository.StudentRepository;

@Service
public class StudentServiceI implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean saveStudent(Student st) {
		Student save = studentRepository.save(st);
		if (save != null) {
			return true;
		}else{		
			return false;
		}
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> all = studentRepository.findAll();
		return all;
	}

	@Override
	public boolean updateStudent(Student st) {
		Student save = studentRepository.save(st);
		
		if (save != null) {
			return true;
		}else {
		return false;
	}
}

	@Override
	public boolean deletAllStu() {
		List<Student> all = studentRepository.findAll();
		
		if(all.isEmpty()) {
			return false;
		}else {
			studentRepository.deleteAll();
			return true;
		}
		
	}
	}

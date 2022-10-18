package com.record.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.record.entity.EmploymentRecord;

@Service
public class RecordServiceImpl implements IRecordService {
	
	// fake list of employment record 
	
	List<EmploymentRecord> list= List.of(
			new EmploymentRecord(101L, "Wipro", "wiprohq@gmail.com", 5, 1311L),
			new EmploymentRecord(102L, "TCS", "tcs@gmail.com", 3, 1312L),
			new EmploymentRecord(103L, "Tech Mahindra", "techm@gmail.com", 6, 1313L),
			new EmploymentRecord(104L, "Congizant", "ctc@gmail.com", 10, 1314L),
			new EmploymentRecord(105L, "Tesla", "tesla@gmail.com", 3, 1315L),
			new EmploymentRecord(106L, "Google", "google@gmail.com", 7, 1316L),
			new EmploymentRecord(107L, "Lenovo", "lenovo@gmail.com", 2, 1311L),
			new EmploymentRecord(108L, "Dell", "dell@gmail.com", 3, 1317L),
			new EmploymentRecord(109L, "Samsung", "saumsung@gmail.com", 10, 1318L)
			
			);

	@Override
	public List<EmploymentRecord> getRecordOfEmployee(Long empId) {
		return list.stream().filter(employmentRecord -> employmentRecord.getEmpId().equals(empId)).collect(Collectors.toList());
	}

}

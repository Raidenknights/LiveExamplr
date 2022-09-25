package com.example.manas.LiveEmaple.employeeJPA;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EmployeeJPA {
	@Id
	@GeneratedValue
	 private Integer id;
	@Column(name="EmployeeName")
	 private String name;
	 private String techno;
	 @Column(name="EmployeeAge")
	 private Integer age;
	 @OneToMany(mappedBy="empJPA")
	 private List<EmployeeAddress> empAddress;
	 
	public EmployeeJPA(Integer id, String name, String techno, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.techno = techno;
		this.age = age;
	}
	
	public EmployeeJPA() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTechno() {
		return techno;
	}

	public void setTechno(String techno) {
		this.techno = techno;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<EmployeeAddress> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(List<EmployeeAddress> empAddress) {
		this.empAddress = empAddress;
	}
	 
}

package com.ravali.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_TBL4")
public class UserEntity4 {
	@GeneratedValue
	@Id
	@Column
	private Integer Eno;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private Integer age;
	public Integer getEno() {
		return Eno;
	}
	public void setEno(Integer eno) {
		Eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserEntity4 [Eno=" + Eno + ", ename=" + ename + ", email=" + email + ", age=" + age + "]";
	}
	
	
}

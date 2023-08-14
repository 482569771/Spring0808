package com.ssm.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.demo.form.RegisterForm;

@Mapper
public interface ATTMapper {

	void save(RegisterForm registerForm);
	
	void update(RegisterForm registerForm);
	
}

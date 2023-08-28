package com.ssm.demo.validator;

import java.time.LocalTime;

import org.apache.commons.beanutils.BeanUtils;



import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TimeCompareValidator implements ConstraintValidator<TimeCompare, Object>{

	private String startTimeField;
    private String endTimeField;
	
    @Override
    public void initialize(TimeCompare annotation) {
        this.startTimeField = annotation.startTime();
        this.endTimeField = annotation.endTime();
    }
    
    
	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		try {
			String startTime = BeanUtils.getProperty(obj, startTimeField);
            String endTime = BeanUtils.getProperty(obj, endTimeField);

            LocalTime start = LocalTime.parse(startTime);
            LocalTime end = LocalTime.parse(endTime);

            if (!start.isBefore(end)) {
                context.disableDefaultConstraintViolation();
                context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
                        .addPropertyNode("endTime")
                        .addConstraintViolation();
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
	}

	
	
}

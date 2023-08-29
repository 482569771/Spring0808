package com.ssm.demo.validator;

import java.time.Duration;
import java.time.LocalTime;

import org.apache.commons.beanutils.BeanUtils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TimeDifferenceValidator implements ConstraintValidator<TimeDifference, Object> {

	private String startTimeField;
	private String endTimeField;
	private long minDifference;

	@Override
	public void initialize(TimeDifference constraintAnnotation) {
		this.startTimeField = constraintAnnotation.startTime();
		this.endTimeField = constraintAnnotation.endTime();
		this.minDifference = constraintAnnotation.minDifference();
	}

	@Override
	public boolean isValid(Object object, ConstraintValidatorContext context) {
		try {
			String startTime = BeanUtils.getProperty(object, startTimeField);
			String endTime = BeanUtils.getProperty(object, endTimeField);

			LocalTime start = LocalTime.parse(startTime);
			LocalTime end = LocalTime.parse(endTime);

			long minutesDifference = Duration.between(start, end).toMinutes();

			if (minutesDifference < minDifference) {
				context.disableDefaultConstraintViolation();
				context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
						.addPropertyNode("endTime").addConstraintViolation();
				return false;
			}

			return true;
		} catch (Exception e) {
			return false;
		}
	}

}

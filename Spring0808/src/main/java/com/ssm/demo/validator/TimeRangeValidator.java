package com.ssm.demo.validator;

import java.time.LocalTime;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TimeRangeValidator implements ConstraintValidator<TimeRange, String> {

	private String min;
    private String max;

    @Override
    public void initialize(TimeRange constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return true;
        }

        LocalTime minValue = min.isEmpty() ? LocalTime.MIN : LocalTime.parse(min);
        LocalTime maxValue = max.isEmpty() ? LocalTime.MAX : LocalTime.parse(max);
        LocalTime currentValue = LocalTime.parse(value);

        return !currentValue.isBefore(minValue) && !currentValue.isAfter(maxValue);
    }

}

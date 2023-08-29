package com.ssm.demo.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = TimeDifferenceValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeDifference {
	String message() default "時間差は有効ではない";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String startTime();

    String endTime();

    long minDifference() default 0;
}

package com.ssm.demo.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = TimeCompareValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeCompare {
	String message() default "※終了時間は開始時間より後である必要があります";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String startTime();

    String endTime();
}

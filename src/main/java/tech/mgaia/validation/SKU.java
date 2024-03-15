package tech.mgaia.validation;

import jakarta.validation.Constraint;
import jakarta.validation.OverridesAttribute;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Pattern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@Pattern(regexp = "([A-Z]{2}\\d{4,20})?")
public @interface SKU {

    @OverridesAttribute(constraint = Pattern.class, name = "message")
    String message() default "SKU deve seguir o padrão XX9999";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

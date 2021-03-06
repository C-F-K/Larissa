package nl.uva.larissa.json.model.validate;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { NotInstanceOfValidator.class })
public @interface NotInstanceOf {
	String message() default "Is instance of disallowed type";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	Class<?> value();
}

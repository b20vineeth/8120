package net.xin.web.packages.framework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) 
 
public @interface Annotations {
	int max() default 25;
	int min() default 0;
	String regex() default "";
	String matcher() default "";
	boolean spit() default false;
	String spitBy() default ",";
	boolean decode() default false;
	boolean mandatory() default false;
	String callMethod() default "";
	String isUnique() default "";
}
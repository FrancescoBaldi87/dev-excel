/**
 * @author Francesco Baldi
 * @mail francesco.baldi1987@gmail.com
 */
package com.bld.read.report.excel.json.annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.bld.read.report.excel.json.deserialier.SheetDeserialaizer;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * The Interface JsonSheet.
 */
@Retention(RUNTIME)
@Target({ANNOTATION_TYPE,FIELD,PARAMETER,METHOD})
@JacksonAnnotationsInside
@JsonDeserialize(using = SheetDeserialaizer.class)
public @interface JsonSheet {

	/**
	 * Name.
	 *
	 * @return the string
	 */
	public String name();
	
	/**
	 * Field name.
	 *
	 * @return the string
	 */
	public String fieldName() default ""; 
	
	
	/**
	 * Key field.
	 *
	 * @return the string
	 */
	public String keyField()default"";
	
}

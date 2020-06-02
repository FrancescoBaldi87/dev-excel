/*
 * @author Francesco Baldi
 * @mail francesco.baldi1987@gmail.com
 * @class bld.generator.report.excel.annotation.ExcelQuery.java
 */
package bld.generator.report.excel.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * The Interface ExcelQuery. <br>
 * ExcelQuery is used to get the rows list direct of database, this work if the project is configured with spring-data-jpa and it is set the property "spring.datasource.url"<br>
 * It is used on {@link bld.generator.report.excel.SheetData} classes but not working on {@link bld.generator.report.excel.SheetDynamicData} classes
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface ExcelQuery {

	/**
	 * Select.
	 *
	 * @return the string
	 */
	public String select();
	
	/**
	 * Native query.
	 *
	 * @return true, if successful
	 */
	public boolean nativeQuery() default true;
	
	
	
}

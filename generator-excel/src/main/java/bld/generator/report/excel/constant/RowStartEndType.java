/**
 * @author Francesco Baldi
 * @mail francesco.baldi1987@gmail.com
 */
package bld.generator.report.excel.constant;

/**
 * The Enum RowStartEndType.
 */
public enum RowStartEndType {

	/** The row start. */
	ROW_START("RowStart"),
	
	/** The row end. */
	ROW_END("RowEnd"),
	
	/** The row empty. */
	ROW_EMPTY("");
	
	
	/** The value. */
	private String value;

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Instantiates a new row start end type.
	 *
	 * @param value the value
	 */
	private RowStartEndType(String value) {
		this.value = value;
	}

	/**
	 * Gets the parameter.
	 *
	 * @param paramter the paramter
	 * @return the parameter
	 */
	public String getParameter(String paramter) {
		return "${"+paramter+this.value+"}";
	}
	
}
/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class com.bld.generator.report.excel.data.ExcelColor.java
*/
package com.bld.generator.report.excel.data;

/**
 * The Class ExcelColor.<br>
 * This class is used as a property on {@link com.bld.generator.report.excel.data.LayoutCell} class.
 */
public class ExcelColor {

	/** The red. */
	private byte red;
	
	/** The green. */
	private byte green;
	
	/** The blue. */
	private byte blue;

	/**
	 * Gets the red.
	 *
	 * @return the red
	 */
	public byte getRed() {
		return red;
	}

	/**
	 * Sets the red.
	 *
	 * @param red the new red
	 */
	public void setRed(byte red) {
		this.red = red;
	}

	/**
	 * Gets the green.
	 *
	 * @return the green
	 */
	public byte getGreen() {
		return green;
	}

	/**
	 * Sets the green.
	 *
	 * @param green the new green
	 */
	public void setGreen(byte green) {
		this.green = green;
	}

	/**
	 * Gets the blue.
	 *
	 * @return the blue
	 */
	public byte getBlue() {
		return blue;
	}

	/**
	 * Sets the blue.
	 *
	 * @param blue the new blue
	 */
	public void setBlue(byte blue) {
		this.blue = blue;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + blue;
		result = prime * result + green;
		result = prime * result + red;
		return result;
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExcelColor other = (ExcelColor) obj;
		if (blue != other.blue)
			return false;
		if (green != other.green)
			return false;
		if (red != other.red)
			return false;
		return true;
	}

	
	
	
}

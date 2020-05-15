/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class bld.generator.report.excel.SheetSummary.java
*/

package bld.generator.report.excel;

import javax.validation.constraints.Size;

/**  
 * The Class SheetSummary.
 * 
 * SheetSummary is used for the generation of a summary sheet with 2 columns.
 * 1) the name of the field.
 * 2) The value.
 * 
 */
public abstract class SheetSummary extends BaseSheet implements SheetComponent{

	/**
	 * Instantiates a new sheet summary.
	 *
	 * @param sheetName the name sheet
	 */
	public SheetSummary(@Size(max = 30) String sheetName) {
		super(sheetName);
	}

	
	
}

/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class bld.generator.report.junit.entity.TotaleAutoreLibriSheet.java
*/
package bld.generator.report.junit.entity;

import bld.generator.report.excel.SheetFunctionTotal;
import bld.generator.report.excel.annotation.ExcelHeaderLayout;
import bld.generator.report.excel.annotation.ExcelMarginSheet;
import bld.generator.report.excel.annotation.ExcelSheetLayout;

/**
 * The Class TotaleAutoreLibriSheet.
 */
@ExcelSheetLayout(startColumn = 1)
@ExcelHeaderLayout
@ExcelMarginSheet(bottom = 1.5,left = 1.5,right = 1.5,top = 1.5)
public class TotaleAutoreLibriSheet extends SheetFunctionTotal<TotaleAutoreLibriRow>{

	
	/**
	 * Gets the row class.
	 *
	 * @return the row class
	 */
	@Override
	public Class<TotaleAutoreLibriRow> getRowClass() {
		return TotaleAutoreLibriRow.class;
	}
	

}
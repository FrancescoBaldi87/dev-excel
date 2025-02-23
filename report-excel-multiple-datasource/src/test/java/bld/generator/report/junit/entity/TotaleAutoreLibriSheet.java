/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class com.bld.generator.report.junit.entity.TotaleAutoreLibriSheet.java
*/
package bld.generator.report.junit.entity;

import org.apache.poi.ss.usermodel.BorderStyle;

import com.bld.generator.report.excel.SheetFunctionTotal;
import com.bld.generator.report.excel.annotation.ExcelAreaBorder;
import com.bld.generator.report.excel.annotation.ExcelBorder;
import com.bld.generator.report.excel.annotation.ExcelHeaderLayout;
import com.bld.generator.report.excel.annotation.ExcelMarginSheet;
import com.bld.generator.report.excel.annotation.ExcelSheetLayout;

/**
 * The Class TotaleAutoreLibriSheet.
 */
@ExcelSheetLayout(showHeader = false,startRow = -2,
areaBorder = {@ExcelAreaBorder(areaRange = "${totaleRowStart}:${totalePrezzoRowEnd}", border = @ExcelBorder(bottom = BorderStyle.MEDIUM_DASHED, top = BorderStyle.MEDIUM_DASHED, right = BorderStyle.MEDIUM_DASHED, left = BorderStyle.MEDIUM_DASHED)),
		@ExcelAreaBorder(areaRange = "${totNomeRowStart}:${totSessoRowEnd}", border = @ExcelBorder(bottom = BorderStyle.MEDIUM_DASHED, top = BorderStyle.MEDIUM_DASHED, right = BorderStyle.MEDIUM_DASHED, left = BorderStyle.MEDIUM_DASHED)),
}
)
@ExcelHeaderLayout
@ExcelMarginSheet(bottom = 1.5,left = 1.5,right = 1.5,top = 1.5)
public class TotaleAutoreLibriSheet extends SheetFunctionTotal<TotaleAutoreLibriRow>{

	
}

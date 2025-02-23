package bld.generator.report.junit.entity;

import java.util.Date;

import org.apache.poi.ss.usermodel.HorizontalAlignment;

import com.bld.common.spreadsheet.excel.annotation.ExcelDate;
import com.bld.generator.report.excel.RowSheet;
import com.bld.generator.report.excel.annotation.ExcelCellLayout;
import com.bld.generator.report.excel.annotation.ExcelColumn;
import com.bld.generator.report.excel.annotation.ExcelFunction;
import com.bld.generator.report.excel.annotation.ExcelFunctionRow;
import com.bld.generator.report.excel.annotation.ExcelFunctionRows;

@ExcelFunctionRows(excelFunctions = @ExcelFunctionRow(excelColumn = @ExcelColumn(name = "Sum", index = 6),
//excelSubtotal = @ExcelSubtotal(dataConsolidateFunction = DataConsolidateFunction.SUM), 
excelFunction = @ExcelFunction(function = "sum(${valueA}:${valueB})+${idUtente}", nameFunction = "total")))
//@ExcelSubtotals(labelTotalGroup = "Totale",sumForGroup=false)
public class BigDataUtenteRow implements RowSheet {

	@ExcelColumn(name = "Id", index = 0)
	@ExcelCellLayout(horizontalAlignment = HorizontalAlignment.RIGHT)
	private Integer idUtente;
	@ExcelColumn(name = "Nome", index = 2)
	@ExcelCellLayout
	private String nome;
	@ExcelColumn(name = "Cognome", index = 1)
	@ExcelCellLayout
	private String cognome;
	@ExcelColumn(name = "Data di nascita", index = 3)
	@ExcelCellLayout(horizontalAlignment = HorizontalAlignment.CENTER)
	@ExcelDate
	private Date dataNascita;
	@ExcelColumn(name = "Value A", index = 4)
	@ExcelCellLayout(horizontalAlignment = HorizontalAlignment.RIGHT)
	private Double valueA;

	@ExcelColumn(name = "Value B", index = 5)
	@ExcelCellLayout(horizontalAlignment = HorizontalAlignment.RIGHT)
	private Double valueB;

	public BigDataUtenteRow() {
		this.valueA = Math.random() * 1000;
		this.valueB = Math.random() * 1000;
	}

	public BigDataUtenteRow(Integer idUtente, String nome, String cognome, Date dataNascita) {
		super();
		this.idUtente = idUtente;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.valueA = Math.random() * 1000;
		this.valueB = Math.random() * 1000;
	}

	public Integer getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Integer idUtente) {
		this.idUtente = idUtente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Double getValueA() {
		return valueA;
	}

	public Double getValueB() {
		return valueB;
	}

	public void setValueA(Double valueA) {
		this.valueA = valueA;
	}

	public void setValueB(Double valueB) {
		this.valueB = valueB;
	}

}

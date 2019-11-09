package bld.generator.report.excel.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import bld.generator.report.excel.GenerateExcel;
import bld.generator.report.utils.ValueProps;

@Configuration
public class ExcelGeneratorConfiguration {
	
	@Autowired
	private GenerateExcel generateExcel;
	
	@Autowired
	private ValueProps valueProps;

	protected GenerateExcel getGenerateExcel() {
		return generateExcel;
	}

	protected ValueProps getValueProps() {
		return valueProps;
	}

	
	
	
}

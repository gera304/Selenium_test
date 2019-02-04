package test;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.WritableWorkbook;

public class Write {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\\\Users\\\\Mukul\\\\Desktop\\\\Mukul.xls");
		WritableWorkbook wk= Workbook.createWorkbook(f);

	}

}

package test;
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Read {

	public static void main(String[] args) throws BiffException, IOException {
		
		File f= new File("C:\\Users\\Mukul\\Desktop\\Mukul.xls");
		Workbook wb= Workbook.getWorkbook(f);
		Sheet ws= wb.getSheet(0);
		int r= ws.getRows();
		System.out.println("Row no"+r);
		int c= ws.getColumns();
		//System.out.println("Column"+c);
		try {
		for(int i=1; i<=r; i++)
		{
			for(int j=0; j<=i; j++)
			{
				Cell c1= ws.getCell(j,i);
				System.out.println(c1.getContents());
			}
			System.out.println();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}



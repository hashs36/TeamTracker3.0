package TTPOM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.*;

public class Readxlsx {
	
	public void readex() throws IOException {
		File file = new File("C:/Users/Harish.10/Desktop/paintings.xlsx");
		
		FileInputStream FIS = new FileInputStream(file);
		XSSFWorkbook  wb = new XSSFWorkbook(FIS);
		FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator(); 
		XSSFSheet sh = wb.getSheetAt(0);
		int rows = sh.getLastRowNum();
		
		Row r = sh.getRow(rows);
		int maxCell=  r.getLastCellNum();
		System.out.println(rows);
		System.out.println(maxCell);
		for (int i=0; i<=rows; i++) {
			for (int j=0 ;j<=maxCell;j++) {
				if(j==16 || j==13) {
				DataFormatter formatter = new DataFormatter();
				String val = formatter.formatCellValue(sh.getRow(i).getCell(j));
				//System.out.println(evaluator.evaluateFormulaCell(sh.getRow(6).getCell(j)));
				System.out.println(formatter.formatCellValue(sh.getRow(i).getCell(j), evaluator));
			}else {
				System.out.println(sh.getRow(i).getCell(j));
			}
			}}
		
	/*	Iterator<Row> rowIterator  =sh.rowIterator();
		while(rowIterator.hasNext()) {
			Row R = rowIterator.next();
			//System.out.println(R.getRowNum());
			Iterator<Cell> celliterator = R.cellIterator();
					while ( celliterator.hasNext()) {
						Cell cval = celliterator.next();
						//System.out.println(cval.getRow().getCell(1).);
				     	CellType CType =cval.getCellType();//STRING  BLANK NUMERIC
						//System.out.println(CType);
						if (CType==CType.NUMERIC) 
	                     {
	                       System.out.print(cval.getRow());
	                       //System.out.println(cval.getNumericCellValue());
	                       break;
	                     }else if (CType==CType.STRING) {
	                    	 //System.out.print(cval.getStringCellValue());
	                    	 break;
						}else if (CType==CType.BLANK)
	                     {
	                      // System.out.print(cval.getAddress());
	                       break;
	                           
	                     } else {
	                    	// System.out.println(cval.getCellFormula());
	                    	 break;
	                     }
					}
			
		}
		
*/
	}
	
	public void proper() throws IOException {
		Properties prop = new Properties();
		FileInputStream FIS = new FileInputStream("C:\\Users\\Harish.10\\eclipse-workspace\\TeamTracker\\Properties\\Properties.properties");
		prop.load(FIS);
		System.out.println(prop.getProperty("browser"));
		
	}
	
	private void test(String b) {
		
		System.out.println("hello private  method "+b);
		
	}
	
	public void swapnum() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Plese enter x value");
		int x=Integer.parseInt(sc.next());
		System.out.println("Plese enter y value");
		int y=Integer.parseInt(sc.next());
		x=x+y;
		y=x-y;
		x=x-y; 
		System.out.println("x value is::::"+x);
		System.out.println("y value is::::"+y);
	}
	
	public static void main(String[] args) throws IOException {
		Readxlsx R =new Readxlsx();
		//R.readex();
		//R.proper();
		//R.test("GOd always right");
		R.swapnum();
	}

}

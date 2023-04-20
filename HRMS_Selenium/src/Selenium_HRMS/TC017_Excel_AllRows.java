package Selenium_HRMS;
import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;
public class TC017_Excel_AllRows {
	
	public static void main(String args[]) throws Exception{
	    //Test Steps
		FileInputStream file = new FileInputStream("C:\\swathi_online training\\HRMS\\ReadExcel.xlsx");
	Workbook wb  = Workbook.getWorkbook(file);
	Sheet    st  = wb.getSheet(0);
	int rowcount = st.getRows();
	System.out.println(rowcount);

	for(int i=1; i<rowcount;i++) {
	String empid = st.getCell(0,i).getContents();
	String name = st.getCell(1,i).getContents();
	String email = st.getCell(2,i).getContents();
	String no = st.getCell(3,i).getContents();
	System.out.println(empid+"||"+name+"||"+email+"||"+no);
	}
	}
	}



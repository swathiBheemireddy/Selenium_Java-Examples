package Selenium_HRMS;
import jxl.Sheet;
import jxl.Workbook;
import java.io.FileInputStream;
public class TC016_Excel_Read {
	

	public static void main(String args[]) throws Exception{
	    //Test Steps
	//FileInputStream file = new FileInputStream("F:\\Suresh_Selenium\\ReadExcel.xls");
	FileInputStream file = new FileInputStream("C:\\swathi_online training\\HRMS\\ReadExcel.xlsx");
	Workbook wb  = Workbook.getWorkbook(file);
	Sheet    st  = wb.getSheet(0);
	int row=2;
	String empid = st.getCell(0,row).getContents();
	String name = st.getCell(1,row).getContents();
	String email = st.getCell(2,row).getContents();
	String no = st.getCell(3,row).getContents();
	System.out.println(empid+"||"+name+"||"+email+"||"+no);
	}
	}



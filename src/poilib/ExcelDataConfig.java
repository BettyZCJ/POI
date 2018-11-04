package poilib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public ExcelDataConfig(String excelPath) {
		try {
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
//			byte[] data = new byte[1024];
//			// 从文件输入流中读取数据存储到缓冲字节数组中
//			fis.read(data);
//			// 打印文件内容
//			System.out.println("文件内容:" + new String(data));
//			System.out.println(fis);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public String getData(int SheetNumber,int row, int column) {
		sheet1=wb.getSheetAt(SheetNumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
//		String data2 =wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
//		System.out.println(data2);
		return data;
	}
	public int getMaxRow(int SheetNumber) {
		sheet1=wb.getSheetAt(SheetNumber);
		int maxRow = sheet1.getLastRowNum();
		return maxRow;		
	}
	public int getMaxColumn(int SheetNumber,int columnIndex) {
		sheet1=wb.getSheetAt(SheetNumber);
		int maxColumn = sheet1.getColumnWidth(columnIndex);
		return maxColumn;		
	}
	

}

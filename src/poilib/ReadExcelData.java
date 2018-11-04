package poilib;

public class ReadExcelData {
	public static void main(String[] args) {
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\bettyzheng\\Documents\\testfile\\poitest1.xlsx");
		int columnwidth = excel.getMaxColumn(1, 1);
		int maxrow = excel.getMaxRow(0);
		System.out.println(maxrow);
		int i;
		for(i=0;i<=maxrow;i++) {
			System.out.println("username"+i+":"+excel.getData(0, i, 0));
			System.out.println("passwrod"+i+":"+excel.getData(0, i, 1));
		}
//		System.out.println(excel.getData(0, 1, 0));
	}

}

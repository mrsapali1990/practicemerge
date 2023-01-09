package com.ZP.utilities;

import java.util.ArrayList;

public class TestUtil {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel(String Sheetname) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader=new
					Xls_Reader("C:\\Users\\mallikarjun\\eclipse-workspace\\ZigWheelsProject\\src\\main\\java\\com\\ZP\\testData\\BikeName.xlsx");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount(Sheetname); rowNum++) {

			if (Sheetname.equals("MfgDetails")) // 1
			{
				String Manufacturer = reader.getCellData("MfgDetails", "Manufacturer", rowNum);
				System.out.println(Manufacturer);
				Object ob[] = {Manufacturer};
				myData.add(ob);
			}

			

			else {
				String caller = reader.getCellData("dataclose", "caller", rowNum);
				String shortdiscription = reader.getCellData("dataclose", "shortdiscription", rowNum);
				String CloseData = reader.getCellData("dataclose", "resolvenotes", rowNum);

				System.out.println(shortdiscription);

				Object ob3[] = { caller, shortdiscription, CloseData };
				myData.add(ob3);
			}

		}
		return myData;

	}

}

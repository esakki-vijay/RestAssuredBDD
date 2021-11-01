package common;

import java.io.File;
import java.util.HashMap;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider {

	public static HashMap<String, String> setUpData(int rowNum) {

		HashMap<String, String> dataMap = new HashMap<String, String>();

		try {

			OPCPackage pkg = OPCPackage.open(new File("./src/test/resources/Data/userData.xlsx"));

			XSSFWorkbook wb = new XSSFWorkbook(pkg);

			XSSFSheet sheet = wb.getSheet("users");

			XSSFRow row = sheet.getRow(rowNum);

			int cols = 0;

			if (row != null)
				cols = sheet.getRow(rowNum).getLastCellNum();
			else
				throw new Exception("Invalid row number specified in test data");

			for (int i = 0; i < cols; i++) {
				dataMap.put(sheet.getRow(0).getCell(i).toString(), sheet.getRow(rowNum).getCell(i).toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return dataMap;

	}

}

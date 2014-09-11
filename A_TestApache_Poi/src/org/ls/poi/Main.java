package org.ls.poi;

import java.util.Arrays;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;

public class Main {
	
	public static final long TYPE_1 = 0x01;//1
	public static final long TYPE_2 = 0x02;//2
	public static final long TYPE_3 = 0x04;//4
	public static final long TYPE_4 = 0x06;//8
	public static final long TYPE_5 = 0x08;//16
	public static final long TYPE_6 = 0x10;//32
	public static final long TYPE_7 = 0x20;//64
	public static final long TYPE_8 = 0x40;//128
	public static final long TYPE_9 = 0x80;//256
	public static final long TYPE_10 = 0x100;//
	public static final long MASK = 0xFFFF;
	
	
	public static String test(long ...a ) {
		if( null == a) {
			return "0";
		}
		String prefix = " and";
		StringBuffer describ = new StringBuffer();
		long result = 0;
		for (long i : a) {
			describ.append( prefix );
			describ.append("the value : " + i);
			result = result | i;
		}
		String des = describ.toString();
		if( des.startsWith(prefix) ) {
			des = des.replaceFirst(prefix, "");
		}
		System.out.println( des + " result is : " + result  );
		return "" + result;
	}
	
	public static void main(String[] args) {
//		System.out.println( TYPE_1 );
//		System.out.println( TYPE_1 << 1);
//		System.out.println( TYPE_1 << 2);
		
//		Entity e = new Entity();
//		e.setName("name1");
//		e.setData("data1");
//		new Main().export(e);
	}
	
	public void export(Entity e) {
		Workbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet( getSafeSheetName("new sheet") );
		Row row = sheet.createRow(0);
		
		
		
	}
	
	public String getSafeSheetName(String sheetName) {
		return WorkbookUtil.createSafeSheetName( sheetName );
	}
}

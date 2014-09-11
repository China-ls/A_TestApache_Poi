import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;


public class Test {

	public static void main(String[] args) throws Exception {
		Workbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet("new sheet");
		Row row = sheet.createRow((short) 0);
		row.createCell(0).setCellValue(1.1);
		row.createCell(1).setCellValue(new Date());
		row.createCell(2).setCellValue(Calendar.getInstance());
		row.createCell(3).setCellValue("a string");
		row.createCell(4).setCellValue(true);
		row.createCell(5).setCellType(Cell.CELL_TYPE_ERROR);
		Cell cell = row.createCell(6);
		cell.setCellType(Cell.CELL_TYPE_BOOLEAN);
		cell.setCellValue("哎哟喂");
		CellStyle cellStyle = wb.createCellStyle();
		// 设置单元格水平对齐类型
		cellStyle.setAlignment(CellStyle.ALIGN_CENTER); // 指定单元格居中对齐
		cellStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
		cellStyle.setWrapText(true);// 指定单元格自动换行

		// 设置单元格字体
		Font font = wb.createFont();
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		font.setFontName("宋体");
		font.setFontHeight((short) 600);
		cellStyle.setFont(font);

		cell.setCellStyle(cellStyle);
		
		Cell cell7 = row.createCell(7);
		InputStream is = new FileInputStream("C:\\Documents and Settings\\hx\\桌面\\360软件小助手截图20140910173728.png");
	    byte[] bytes = IOUtils.toByteArray(is);

	    int pictureIdx = wb.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);

	    CreationHelper helper = wb.getCreationHelper();
	    Drawing drawing = sheet.createDrawingPatriarch();
	    ClientAnchor anchor = helper.createClientAnchor();

	    // 图片插入坐标
	    anchor.setCol1(cell7.getColumnIndex());
	    anchor.setRow1(cell7.getRowIndex());
	    // 插入图片
	    Picture pict = drawing.createPicture(anchor, pictureIdx);
	    pict.resize();
	    
	    Cell cell8 = row.createCell(8);

	    int pictureIdx8 = wb.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);

	    CreationHelper helper8 = wb.getCreationHelper();
	    Drawing drawing8 = sheet.createDrawingPatriarch();
	    ClientAnchor anchor8 = helper8.createClientAnchor();

	    // 图片插入坐标
	    anchor8.setCol1(cell8.getColumnIndex());
	    anchor8.setRow1(cell8.getRowIndex());
	    // 插入图片
	    Picture pict8 = drawing.createPicture(anchor8, pictureIdx8);
	    pict8.resize();
	    
	    System.out.println( anchor8.getCol1() );
	    System.out.println( anchor8.getCol2() );
	    System.out.println( anchor8.getRow1() );
	    System.out.println( anchor8.getRow2() );
	    
	    
	    Row row1 = sheet.createRow((short) 1);
	    
	    row1.createCell(0).setCellValue(true);
	    row1.createCell(1).setCellValue("哎呦不错噢");
	    row1.createCell(2).setCellValue(3456789.87827364);
	    row1.createCell(4).setCellValue(3456789.87827364);
	    
		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream("E:\\workbook.xls");
		wb.write(fileOut);
		fileOut.close();
	}
}

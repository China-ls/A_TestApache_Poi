package org.ls.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

public abstract class CellBatch {
	
	protected String currentSheetName;
	protected Object[][] mSheets;
	protected Cell[][] rows;
	
	protected int rowLength;
	
	public void setRowLength(int rowlen) {
		this.rowLength = rowlen;
		
		//TODO init
		
		
	}
	
	public CellBatch() {
		
	}
	
	public void add2SheetAndRow(String sheet, Cell cell) {
		
	}
	
	public void addCell(int row, int col, int type, Object data, CellStyle style, String sheet) {
		Cell cell = new Cell(row,col, type,data, style, sheet);
		addCell(cell);
	}
	
	public void addCell(int row, int col, int type, Object data, CellStyle style) {
		Cell cell = new Cell(row,col, type,data, style, currentSheetName);
		addCell(cell);
	}
	
	public void addCell(int row, int col, int type, Object data, String sheet) {
		Cell cell = new Cell(row,col, type,data, null, sheet);
		addCell(cell);
	}
	
	public void addCell(int row, int col, int type, Object data) {
		Cell cell = new Cell(row,col, type,data, null, currentSheetName);
		addCell(cell);
	}
	
	public void setCurrentSheet(String sheet) {
		this.currentSheetName = sheet;
	}
	
	public Workbook createWorkBook() throws Exception {
		Workbook wb = new HSSFWorkbook();
		
		return wb;
	}
	
	public void addCell(Cell cell) {
		String sheet = cell.getSheet();
		int row = cell.getRow();
		int col = cell.getCol();
		
		
		
	}
	
}

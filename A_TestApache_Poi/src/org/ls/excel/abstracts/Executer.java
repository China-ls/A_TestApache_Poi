package org.ls.excel.abstracts;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellStyle;
import org.ls.excel.Cell;

/**
 * 1、设置头部
 * 2、设置数据部分
 * 3、设置样式
*/
public abstract class Executer {
	
	public static final int STYLE_TYPE_WORKBOOK = 0x01; // All the same
	public static final int STYLE_TYPE_ROW = STYLE_TYPE_WORKBOOK << 1; // one row one style
	public static final int STYLE_TYPE_COL = STYLE_TYPE_WORKBOOK << 2; // one column one style
	public static final int STYLE_TYPE_CELL = STYLE_TYPE_WORKBOOK << 3; // one cell one style
	
	protected int styleType;
	protected CellStyle mCellStyle;
	
	protected int defStartRow;
	
	public Executer() {
		this.styleType = STYLE_TYPE_WORKBOOK;
	}
	
	public Executer setStyleTypeWorkBook() {
		styleType = STYLE_TYPE_WORKBOOK;
		return this;
	}
	
	public Executer setStyleTypeRow() {
		styleType = STYLE_TYPE_ROW;
		return this;
	}
	
	public Executer setStyleTypeColumn() {
		styleType = STYLE_TYPE_COL;
		return this;
	}
	
	public Executer setStyleTypeCell() {
		styleType = STYLE_TYPE_CELL;
		return this;
	}
	
	public Executer setCellStyle(CellStyle mCellStyle) {
		this.mCellStyle = mCellStyle;
		return setStyleTypeWorkBook();
	}
	
	public abstract String[] onCreateTitleLine();
	
	public abstract ArrayList<Cell> onCreateData(int startRow, int startCol);
	
}
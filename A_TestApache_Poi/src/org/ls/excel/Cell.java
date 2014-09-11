package org.ls.excel;

import org.apache.poi.ss.usermodel.CellStyle;

public class Cell {
	public static final int TYPE_TEXT 			= 0x01;
	public static final int TYPE_DATE 			= TYPE_TEXT << 1;
	public static final int TYPE_NUMRIC 			= TYPE_TEXT << 2;
	public static final int TYPE_BOLLEAN 			= TYPE_TEXT << 3;
	public static final int TYPE_PIC 				= TYPE_TEXT << 4;
	public static final int TYPE_NULL_VALUE 		= TYPE_TEXT << 5;
	
	private String sheet;
	private int row;//ÐÐ
	private int col;//ÁÐ
	private int type;
	private Object data;
	private CellStyle mStyle;
	
	public Cell(){}
	
	public Cell(int row, int col, int type, Object data, CellStyle style, String sheet) {
		this.row = row;
		this.col = col;
		this.type = type;
		this.data = data;
		this.mStyle = style;
		this.sheet = sheet;
	}

	public String getSheet() {
		return (null == sheet) ? "" : sheet;
	}
	
	public void setSheet(String sheet) {
		this.sheet = sheet;
	}
	
	public void setStyle(CellStyle style) {
		this.mStyle = style;
	}
	
	public CellStyle getStyle() {
		return mStyle;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public void setTypeNullValue() {
		this.type = TYPE_NULL_VALUE;
	}
	public void setTypeNumeric() {
		this.type = TYPE_NULL_VALUE;
	}
	public void setTypeText() {
		this.type = TYPE_NULL_VALUE;
	}
	public void setTypeBoolean() {
		this.type = TYPE_NULL_VALUE;
	}
	public void setTypeDate() {
		this.type = TYPE_NULL_VALUE;
	}
	public void setTypePic() {
		this.type = TYPE_NULL_VALUE;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getData() {
		return data;
	}
	
	public boolean isTypeNullValue() {
		return this.type == TYPE_NULL_VALUE;
	}
	public boolean isTypeNumeric() {
		return this.type == TYPE_NULL_VALUE;
	}
	public boolean isTypeText() {
		return this.type == TYPE_NULL_VALUE;
	}
	public boolean isTypeBoolean() {
		return this.type == TYPE_NULL_VALUE;
	}
	public boolean isTypeDate() {
		return this.type == TYPE_NULL_VALUE;
	}
	public boolean isTypePic() {
		return this.type == TYPE_NULL_VALUE;
	}

	@Override
	public String toString() {
		return "Cell [sheet=" + sheet + ", row=" + row + ", col=" + col
				+ ", type=" + type + ", data=" + data + ", mStyle=" + mStyle
				+ "]";
	}
	
}

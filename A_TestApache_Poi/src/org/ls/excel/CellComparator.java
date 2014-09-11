package org.ls.excel;

import java.util.Comparator;


public class CellComparator implements Comparator<Cell> {

	@Override
	public int compare(Cell o1, Cell o2) {
		int row1 = o1.getRow();
		int row2 = o2.getRow();
		if( row1 < row2 ) {
			return -1;
		} else if( row1 == row2 ) {
			int col1 = o1.getCol();
			int col2 = o2.getCol();
			if( col1 < col2 ) {
				return -1;
			} else if( col1 == col2 ) {
				return 0;
			} else {
				return 1;
			}
		} else {
			return 1;
		}
	}

}

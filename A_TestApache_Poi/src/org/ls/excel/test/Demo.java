package org.ls.excel.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

import org.ls.excel.Cell;
import org.ls.excel.CellComparator;
import org.ls.excel.ExcelExporter;

public class Demo {
	public static void main(String[] args) {
		int[][] b = new int[][]{
				{123,321,1234},
				{1,2,3,4},
				{2,2,2,2},
		};
		
		int[][] a;
		
		int len = b.length;
		a = new int[len + 1][];
		for(int i = 0; i < len ; i ++ ) {
			a[i] = Arrays.copyOf(b[i], b[i].length);
		}
		
		int[] s = new int[]{5,5,5,55};
		a[len] = s;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println( Arrays.toString(a[i]) );;
		}
		
		Cell[] cels = new Cell[]{
				new Cell(1,0,Cell.TYPE_TEXT,"10",null,"a"),
				new Cell(1,2,Cell.TYPE_TEXT,"12",null,"a"),
				new Cell(0,1,Cell.TYPE_TEXT,"01",null,"a"),
				new Cell(1,1,Cell.TYPE_TEXT,"11",null,"a"),
				new Cell(1,3,Cell.TYPE_TEXT,"13",null,"a"),
				new Cell(2,0,Cell.TYPE_TEXT,"20",null,"a"),
				new Cell(2,1,Cell.TYPE_TEXT,"21",null,"a"),
				new Cell(0,0,Cell.TYPE_TEXT,"00",null,"a"),
				new Cell(0,3,Cell.TYPE_TEXT,"03",null,"a"),
				new Cell(0,2,Cell.TYPE_TEXT,"02",null,"a"),
				new Cell(2,3,Cell.TYPE_TEXT,"23",null,"a"),
				new Cell(2,2,Cell.TYPE_TEXT,"22",null,"a"),
		};
		
		Arrays.sort(cels, new CellComparator());
		
		for (int i = 0; i < cels.length; i++) {
			System.out.println( cels[i].toString() );
		}
		
//		ExcelExporter excel = new ExcelExporter();
		
		
		
	}
}

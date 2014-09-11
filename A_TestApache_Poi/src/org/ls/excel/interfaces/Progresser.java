package org.ls.excel.interfaces;

public interface Progresser {

	public void onProgress(int total, int current);
	
	public void onFail();
	public void onComplete();
}

package org.ssglobal.training.codes.itemH;

public class Product { 
	public String prodName = "";
	public int numberOfPieces = 0;
	
	public void downLoad(int i) {
		numberOfPieces += i;
	}

	public void upLoad(int i) {
		numberOfPieces -= i;
	}

	public String print() {
		return prodName + ", " + numberOfPieces + " pieces";
	}
	
}

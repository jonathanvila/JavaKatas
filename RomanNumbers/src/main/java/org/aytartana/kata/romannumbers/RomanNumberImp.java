package org.aytartana.kata.romannumbers;

public class RomanNumberImp implements RomanNumber {
	String[] letrasRomanas = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
	int[] valoresNumericos = {1,4, 5,9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
	
	public String getTransform(int i) {
		String result = (i > 0) ? "": null;
		while (i > 0) {
			int idx = letrasRomanas.length -1;
			while (idx >= 0) {
				if (i - valoresNumericos[idx] >= 0) {
					result += letrasRomanas[idx];
					i -= valoresNumericos[idx];
				} else {
				  idx--;
				}
			}
		}
		return result;
	}

}

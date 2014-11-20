package org.aytartana.kata.romannumbers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanNumberTest {

	private RomanNumber romannumber;

    @Before
	public void init() {
		romannumber = new RomanNumberImp();
	}

	@Test
	public void creation() {
		assertNotNull("Creation went well", romannumber);
	}
    
	@Test
	public void whenZeroThenNull() {
		String romanNumberStr = romannumber.getTransform(0);
		assertNull("Expect Null for a 0 number", romanNumberStr);
	}

	@Test
	public void whenOneDigitThenLetter() {
		assertEquals("Expect I for a 1 number", "I", romannumber.getTransform(1));
		assertEquals("Expect I for a 1 number", "V", romannumber.getTransform(5));
	}
	
	@Test
	public void when20thenXX() {
		assertEquals("Expect XX for a 20 number", "XX", romannumber.getTransform(20));	
	}
	
	@Test
	public void when35thenXXXV() {
		assertEquals("Expect XXXV for a 35 number", "XXXV", romannumber.getTransform(35));	
	}

	@Test
	public void when73thenLXXIII() {
		assertEquals("Expect LXXIII for a 73 number", "LXXIII", romannumber.getTransform(73));	
	}
	
	@Test
	public void when4thenIV() {
		assertEquals("Expect IV for a 4 number", "IV", romannumber.getTransform(4));	
	}
	
	@Test
	public void when1963thenMCMLXIII() {
		assertEquals("Expect MCMLXIII for a 1963 number", "MCMLXIII", romannumber.getTransform(1963));	
	}
	
	@Test
	public void when2872thenMMDCCCLXXII() {
		assertEquals("Expect MMDCCCLXXII for a 2872 number", "MMDCCCLXXII", romannumber.getTransform(2872));	
	}	
	
}

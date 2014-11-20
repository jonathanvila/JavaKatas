package kata.palabrasrepetidas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class PalabrasRepetidasTest {
	private PalabrasManager palabrasMng;
	/**
	 * Programa que dada una lista de palabras encontrar las que estan duplicadas
	 */

	@Before
	public void init() {
		palabrasMng = new PalabrasManagerImpl(); 
	}
	
	@Test
	public void whenEmptyThenNotNullAndEmpty() {
		String[] repetidas = palabrasMng.getRepeated("");
		assertNotNull("Expected not null", repetidas);
		assertEquals("Expected empty ", 0, repetidas.length);
	}
	
	@Test
	public void whenTwoSameWordsThenWord() {
		String[] repetidas = palabrasMng.getRepeated("hola", "hola");
		String[] expected = {"hola"}; 
		assertArrayEquals("Expected hola", expected, repetidas );
	}

	@Test
	public void whenMultipleSameWordsThenOnlyRepeatedWords() {
		String[] repetidas = palabrasMng.getRepeated("hola", "adios", "pepe", "juan", "hola", "pepe", "pepe", "pepe");
		String[] expected = {"hola", "pepe"}; 
		assertArrayEquals("Expected hola, pepe", expected, repetidas );
	}
}

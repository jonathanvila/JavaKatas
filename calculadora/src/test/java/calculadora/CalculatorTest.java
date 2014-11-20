package calculadora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {
	private Calculator calc;

	@Before
	public void setUp() {
		calc = new CalculatorImpl();
	}

	@After
	public void cleanUp() {
		calc = null;
	}

	@Test
	public void calcIntegerSumInitial() {
		Double valueA = 3D;
		Double valueB = 7D;
		Double valueExpected = 10D;
		Double valueCalculated = calc.sum(valueA, valueB).getValue();
		assertEquals("Checking integer sum  initial: " + valueA + " + "
				+ valueB, valueExpected, valueCalculated);
	}

	@Test
	public void calcIntegerSumRecurrent() {
		Double valueA = 3D;
		Double valueB = 7D;

		Double valueCalculated = calc.sum(valueA).sum(valueB).getValue();

		Double valueExpected = 10D;
		assertEquals("Checking integer sum :  0 + " + valueA, valueExpected,
				valueCalculated);
	}

	@Test
	public void calcIntegerSubsPositive() {
		Double valueA = 7D;
		Double valueB = 3D;

		Double valueExpected = 4D;
		Double valueCalculated = calc.sub(valueA, valueB).getValue();

		assertEquals("Checking integer subs : " + valueA + " - " + valueB,
				valueExpected, valueCalculated);
	}

	@Test
	public void calcIntegerSubsNegative() {
		Double valueA = 3D;
		Double valueB = 7D;

		Double valueExpected = -4D;
		Double valueCalculated = calc.sub(valueA, valueB).getValue();

		assertEquals("Checking integer subs : " + valueA + " - " + valueB,
				valueExpected, valueCalculated);
	}

	@Test
	public void calcIntegerFormulaWithAddsAndSubs() {
		Double valueExpected = 12D;
		Double valueCalculated = calc.sum(5D).sub(2D).sum(9D).getValue();

		assertEquals("Checking integer subs : 5 - 2 + 9 ", valueExpected,
				valueCalculated);
	}
}

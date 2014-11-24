package calculadora;


public class CalculatorImpl implements Calculator {
	private Double value = 0D;
	
	@Override
	public Calculator sum(Double valueA, Double valueB) {
		value = valueA;
		return sum(valueB);

	}
	
	@Override
	public Calculator sum(Double valueAdded) {
		value += valueAdded;
		return this;
	}

	@Override
	public Double getValue() {
		return value;
	}

	@Override
	public Calculator sub(Double valueA, Double valueB) {
		value = valueA;
		return sub(valueB);
	}

	@Override
	public Calculator sub(Double valueA) {
		value -= valueA;
		return this;
	}
}

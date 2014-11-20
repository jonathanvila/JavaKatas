package calculadora;


public interface Calculator {

	public Double getValue();

	public Calculator sum(Double valueA, Double valueB);

	public Calculator sum(Double valueAdded);

	public Calculator sub(Double valueA, Double valueB);

	public Calculator sub(Double d);

}

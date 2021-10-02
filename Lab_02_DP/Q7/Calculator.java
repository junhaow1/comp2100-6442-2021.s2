package Q7;

public class Calculator {

	public double add(double a, double b) {

		//START YOUR CODE
		Addition addition = new Addition(a,b);
		return addition.evaluate();



		//END YOUR CODE
	}

	public double subtract(double a, double b) {

		//START YOUR CODE
		Subtraction subtraction = new Subtraction(a,b);
		return subtraction.evaluate();


		//END YOUR CODE
	}

	public double multiply(double a, double b) {

		//START YOUR CODE
		Multiplication multiplication = new Multiplication(a,b);
		return multiplication.evaluate();


		//END YOUR CODE
	}

	public double divide(double a, double b) {

		//START YOUR CODE
		Division division = new Division(a,b);
		return division.evaluate();



		//END YOUR CODE
	}


}

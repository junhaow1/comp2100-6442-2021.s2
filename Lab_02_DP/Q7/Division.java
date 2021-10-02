package Q7;

public class Division extends Operation {

	public Division(double a, double b) {
		super(a, b);
	}

	@Override
	public double evaluate() throws ArithmeticException{

		//START YOUR CODE
//		try {
////			double c= this.a/this.b;
////			if (this.b ==0){
////				throw new ArithmeticException();
////			}
//			return  this.a/this.b;
//		} catch (ArithmeticException e) {
////			throw new ArithmeticException();
//			e.printStackTrace();
//		}
		if (this.b ==0){
			throw new ArithmeticException();
		}
		return  this.a/this.b;






		//END YOUR CODE
	}
}

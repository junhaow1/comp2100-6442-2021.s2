import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MarkCalculatorTest {
	/**
	 * Return a list of parameters which are different implementation of 
	 * interface {@linkplain MarkCalculator}. 
	 * Do NOT Modify this part
	 */
	@Parameters
	public static Iterable<? extends Object> getImplementations() {
		return Arrays.asList(
				new MarkCalculator0(),
				new MarkCalculator1(),
				new MarkCalculator2(),
				new MarkCalculator3(),
				new MarkCalculator4(),
				new MarkCalculator5(),
				new MarkCalculator6(),
				new MarkCalculator7(),
				new MarkCalculator8(),
				new MarkCalculator9(),
				new MarkCalculator10(),
				new MarkCalculator11(),
				new MarkCalculator12(),
				new MarkCalculator13(),
				new MarkCalculator14(),
				new MarkCalculator15()
		);
	}

	@Parameter
	public MarkCalculator calculator;

	/*
	 * Hint: Many students get stuck in this lab. Ensure you create out-of-bounds,
	 * 	tests which expect an exception. Furthermore, note that if the first,
	 * 	statement in such a test results in an exception, then later statements
	 * 	will not be executed.
	 */
	// ########## YOUR CODE STARTS HERE ##########

	/* EXAMPLE Test case 1 */
	@Test(timeout = 1000, expected = ComponentOutOfRangeException.class)
	public void testLabOutBoundException_1() throws ComponentOutOfRangeException {
		//Test when lab marks are out-of-bounds
		this.calculator.calculateMark(-1, 0, 0, 0, true, false);

	}

	@Test(timeout = 1000, expected = ComponentOutOfRangeException.class)
	public void testLabOutBoundException_2() throws ComponentOutOfRangeException {
		//Test when lab marks are out-of-bounds
		this.calculator.calculateMark(11, 0, 0, 0, true, false);

	}

	@Test(timeout = 1000, expected = ComponentOutOfRangeException.class)
	public void testAssignment1OutBoundException_1() throws ComponentOutOfRangeException {
		//Test when assignment marks are out-of-bounds
		this.calculator.calculateMark(5, -1, 5, 0, true, false);
	}

	@Test(timeout = 1000, expected = ComponentOutOfRangeException.class)
	public void testAssignment1OutBoundException_2() throws ComponentOutOfRangeException {
		//Test when assignment marks are out-of-bounds
		this.calculator.calculateMark(5, -1, 5, 11, true, false);
	}

	@Test(timeout = 1000, expected = ComponentOutOfRangeException.class)
	public void testAssignment2OutBoundException_1() throws ComponentOutOfRangeException {
		//Test when assignment marks are out-of-bounds

		this.calculator.calculateMark(5, 5, -1, 0, true, false);

	}

	@Test(timeout = 1000, expected = ComponentOutOfRangeException.class)
	public void testAssignment2OutBoundException_2() throws ComponentOutOfRangeException {
		//Test when assignment marks are out-of-bounds
		this.calculator.calculateMark(5, 5, 11, 0, true, false);
	}

	@Test(timeout = 1000, expected = ComponentOutOfRangeException.class)
	public void testFinalException() throws ComponentOutOfRangeException {
		//Test when assignment marks are out-of-bounds
		this.calculator.calculateMark(5, 5, 5, -1, true, false);
	}

	@Test(timeout = 1000, expected = ComponentOutOfRangeException.class)
	public void testFinalExceedException() throws ComponentOutOfRangeException {
		//Test when assignment marks are out-of-bounds
		this.calculator.calculateMark(5, 5, 5, 101, true, false);

	}

	//TODO: write other test cases

	/* EXAMPLE Test case 2 */
	@Test(timeout = 1000)
	public void testGrade() throws ComponentOutOfRangeException {
		assertEquals(new MarkGrade(0, Grade.N), this.calculator.calculateMark(0, 0, 0, 0, true, false));
		assertEquals(new MarkGrade(46, Grade.PX), this.calculator.calculateMark(4, 5, 5, 45, true, false));
		assertEquals(new MarkGrade(50, Grade.P), this.calculator.calculateMark(5, 5, 5, 50, true, false));
		assertEquals(new MarkGrade(60, Grade.C), this.calculator.calculateMark(6, 6, 6, 60, true, false));
		assertEquals(new MarkGrade(70, Grade.D), this.calculator.calculateMark(7, 7, 7, 70, true, false));
		assertEquals(new MarkGrade(80, Grade.HD), this.calculator.calculateMark(8, 8, 8, 80, true, false));
	}


	@Test(timeout = 1000)
	public void testGradeNCN() throws ComponentOutOfRangeException {
		assertEquals(new MarkGrade(null, Grade.NCN), this.calculator.calculateMark(0, 0, 0, 0, false, false));
	}

	@Test(timeout = 1000)
	public void testRedeemable() throws ComponentOutOfRangeException {
		assertEquals(new MarkGrade(60, Grade.C), this.calculator.calculateMark(0, 0, 0, 60, true, true));
		assertEquals(new MarkGrade(70, Grade.D), this.calculator.calculateMark(0, 0, 0, 70, true, true));
		assertEquals(new MarkGrade(80, Grade.HD), this.calculator.calculateMark(0, 0, 0, 80, true, true));
	}

	@Test(timeout = 1000)
	public void testRound() throws ComponentOutOfRangeException {
		assertEquals(new MarkGrade(93, Grade.HD), this.calculator.calculateMark(10, 7, 10, 95, true, false));
	}



	// ########## YOUR CODE ENDS HERE ##########
}

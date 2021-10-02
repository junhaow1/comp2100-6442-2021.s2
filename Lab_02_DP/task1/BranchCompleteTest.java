package task1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class BranchCompleteTest {

	@Test
	public void test() {

		// TODO
		// START YOUR CODE
		// HINT: assertEquals(result, BranchComplete.findSomething(a, b, c, d));
		assertEquals(-1, BranchComplete.findSomething(-1,-2,-3,0));
		assertEquals(-18, BranchComplete.findSomething(-1,-2,3,0));
		assertEquals(2, BranchComplete.findSomething(2,1,0,0));
		assertEquals(0, BranchComplete.findSomething(1,0,1,2));
//		System.out.println(BranchComplete.findSomething(-1,-2,-3,0));
//		System.out.println(BranchComplete.findSomething(-1,-2,3,0));
//		System.out.println(BranchComplete.findSomething(1,0,-1,-2));
//		System.out.println(BranchComplete.findSomething(1,0,1,2));





		// END YOUR CODE
	}
}

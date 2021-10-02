package Q5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Fill in the items below with your UID and name:
 * @author:
 * @UID:
 */
public class BSTBranchCompleteTest {
	@Test(timeout=1000)
	public void test() {
		
		BranchComplete bc = new BranchComplete();

		// START YOUR CODE
		//HINT: assertEquals(xx, bc.DNATreeCalc(xx, xx, xx));
//		assertEquals();
		bc.DNATreeCalc(1,1,1);
		bc.DNATreeCalc(2,1,1);

		// END YOUR CODE
	}
}

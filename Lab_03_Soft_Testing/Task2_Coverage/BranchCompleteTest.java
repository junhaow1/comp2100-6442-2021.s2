import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * Task 2.2
 * You are given the class BranchComplete with the method attemptToMakeFriend.
 *  Implement the minimum number of JUnit tests to achieve branch complete
 *  for the method attemptToMakeFriend.
 *
 * Please write your test in the attemptToMakeFriendTest() method. Your tests should pass.
 *  Finally, you are not allowed to alter the signatures of the given methods and the package
 *  structures of the given classes.
 *
 */
public class BranchCompleteTest {
    @Test(timeout = 1000)
    public void attemptToMakeFriendTest() {
        // Implement your test cases
        // START YOUR CODE
        BranchComplete.attemptToMakeFriend("42");
        BranchComplete.attemptToMakeFriend("ok");
        BranchComplete.attemptToMakeFriend("wolf");
        BranchComplete.attemptToMakeFriend("elsee");



        // END YOUR CODE
    }
}
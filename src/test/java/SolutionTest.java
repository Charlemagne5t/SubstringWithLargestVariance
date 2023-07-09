import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void largestVarianceTest1(){
        String s = "aababbb";
        int expected = 3;
        int actual = new Solution().largestVariance(s);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void largestVarianceTest2(){
        String s = "abcde";
        int expected = 0;
        int actual = new Solution().largestVariance(s);

        Assertions.assertEquals(expected, actual);
    }
}

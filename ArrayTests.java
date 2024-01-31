import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{1, 2, 3}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input2));
  }

  @Test 
  public void testAverage(){
    double[] input1 = {1.0};
    double[] input2 = {1.0,2.0,3.0};
    double[] input3 = {-1, 2, 3};
    assertEquals(Double.valueOf(0), (Double)ArrayExamples.averageWithoutLowest(input1));
    assertEquals(Double.valueOf(2.5), (Double)ArrayExamples.averageWithoutLowest(input2));
    assertEquals(Double.valueOf(2.5), (Double)ArrayExamples.averageWithoutLowest(input3));
  }
}

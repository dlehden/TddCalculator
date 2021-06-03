import org.junit.Assert;

import junit.framework.TestCase;
/*
 * 기존 계산 TDD 를 구현하면서 점차적으로 변수 및 테스트를 진행 시켜보기
 */
public class StringCalculatorTest extends TestCase{
	public void testSplitWhenCommna() throws Exception {
		StringCalculator cal = new StringCalculator();
		String[] result = cal.split("1,2,3");
		Assert.assertArrayEquals(new String[] {"1","2","3"},result);
		
	}
	public void testSplitWhenNewLine() throws Exception {
		StringCalculator cal = new StringCalculator();
		String[] result = cal.split("1\n2\n3\n");
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		Assert.assertArrayEquals(new String[] {"1","2","3"},result);
		
	}
	public void testSplitWhenNewLineComma() throws Exception {
		StringCalculator cal = new StringCalculator();
		String[] result = cal.split("1\n2\n3\n");
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		Assert.assertArrayEquals(new String[] {"1","2","3"},result);
	}
}

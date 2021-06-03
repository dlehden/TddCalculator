import org.junit.Assert;

import junit.framework.TestCase;
/*
 * 기존 계산 TDD 를 구현하면서 점차적으로 변수 및 테스트를 진행 시켜보기
 * 공통적으로 사용되는 변수를 위로 올리기 
 * 
 */
public class StringCalculatorTest2 extends TestCase{
	StringCalculator cal = new StringCalculator();

	public void testSplitWhenCommna() throws Exception {
		String[] result = cal.split("1,2,3");
		Assert.assertArrayEquals(new String[] {"1","2","3"},result);
	}
	public void testSplitWhenNewLine() throws Exception {
		String[] result = cal.split("1\n2\n3");
		Assert.assertArrayEquals(new String[] {"1","2","3"},result);
	}
	public void testSplitWhenNewLineAndComma() throws Exception {
		String[] result = cal.split("1,2\n3");
		Assert.assertArrayEquals(new String[] {"1","2","3"},result);
	}

}




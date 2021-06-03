import org.junit.Assert;

import junit.framework.TestCase;
/*
 * ���� ��� TDD �� �����ϸ鼭 ���������� ���� �� �׽�Ʈ�� ���� ���Ѻ���
 * ���������� ���Ǵ� ������ ���� �ø��� 
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




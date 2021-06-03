import org.junit.Assert;

import junit.framework.TestCase;
/*
 * ���� ��� TDD �� �����ϸ鼭 ���������� ���� �� �׽�Ʈ�� ���� ���Ѻ���
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

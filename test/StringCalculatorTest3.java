import org.junit.Assert;

import junit.framework.TestCase;
/*
 * ���� ��� TDD �� �����ϸ鼭 ���������� ���� �� �׽�Ʈ�� ���� ���Ѻ���
 * ���������� ���Ǵ� ������ ���� �ø��� 
 * ������ �ϳ��� �����Ͱ� �´��� üũ �����غ���
 * 
 */
public class StringCalculatorTest3 extends TestCase{
	StringCalculator cal = new StringCalculator();

	public void testTextEmptyReturnZero() throws Exception {
		int result = cal.add("");
		Assert.assertEquals(0,result);
	}
	
	public void testCheckTextOne() throws Exception {
		int result = cal.add("1");
		Assert.assertEquals(1,result);
	}
	public void testCheckAddOneAndTwoTrue() throws Exception {
		int resultToTrue = cal.add("1,2");
		Assert.assertEquals(3,resultToTrue);
	}
	public void testCheckAddOneAndTwoFalse() throws Exception {
		int resultToFalse = cal.add("1,2");
		Assert.assertEquals(1,resultToFalse);
	}
	public void testCheckAddOneAndTwoAndThreeTrue() throws Exception {
		int resultToTrue = cal.add("1,2,3");
		Assert.assertEquals(6,resultToTrue);
	}
	

	
}




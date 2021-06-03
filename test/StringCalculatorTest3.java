import org.junit.Assert;

import junit.framework.TestCase;
/*
 * 기존 계산 TDD 를 구현하면서 점차적으로 변수 및 테스트를 진행 시켜보기
 * 공통적으로 사용되는 변수를 위로 올리기 
 * 각각의 하나의 데이터가 맞는지 체크 생각해보기
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





public class StringCalculator {
	int add(String text) {
		if(text.isEmpty()) {
			return 0;
		}
		
		//1�� 1,2 �ΰ��϶��� ����
//		if(text.contains(",")) {
//			return Integer.parseInt(split(text)[0]) + Integer.parseInt(split(text)[1]);
//		}
		//2�� ���� for�� üũ
		String[] numbers =split(text);
			int sum = 0;
			for(int i=0; i < numbers.length; i++) {
				sum+=Integer.parseInt(numbers[i]);
			}
		 return sum;
	}

	public String[] split(String text) {
		// TODO Auto-generated method stub
		return text.split(",|\n");
	}
	
	public static void main(String[] args) {
		StringCalculator cal  = new StringCalculator();
		/*tdd ó���� ����*/
		System.out.println("value is empty: " + + cal.add(""));
		System.out.println("value is number one:" + cal.add("1"));
		System.out.println("value is add 1 + 2 : " +cal.add("1,2"));
		System.out.println("value is add 1 +2 + 3 : " + cal.add("1,2,3"));
	}

}

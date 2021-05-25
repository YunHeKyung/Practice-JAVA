package exam1;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 103029770;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);
		
		
		long longValue = 300;
		intValue = (int)longValue;
		System.out.println(intValue); // 300그대로 저장
		
		intValue = '경';
		char charValue = (char)intValue;
		System.out.println(intValue);
		
		intValue = 44221;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		double doubleValue = 3.141592;
		intValue = (int)doubleValue;
		System.out.println(intValue); // 실수부분 소수점 아래자리는 보존되지 않는다.
		
		
		
				
		

	}

}

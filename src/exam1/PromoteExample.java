package exam1;

public class PromoteExample {

	public static void main(String[] args) {
	   byte byteValue = 10;
	   int intValue = byteValue;
	   System.out.println(intValue); //byte->int
	   
	   
	   char charValue = '가';
	   intValue = charValue;
	   System.out.println("가의 유니코드 : "+intValue); // char -> int
	   
	   
	   intValue = 500;
	   long longValue = intValue;
	   System.out.println(longValue);  //int -> long
	   
	   intValue = 200;
	   double doubleValue = intValue;
	   System.out.println(doubleValue);  //int -> double
	}

}

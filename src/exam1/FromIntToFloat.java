package exam1;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		int num0 = 123456780;
		
	   float num3 = num2;
	   System.out.println(num3);
	   
	   num2 = (int)num3;
	   System.out.println(num2);
	   
	   int result = num1 - num2;
	   System.out.println(result);
	   
	   
	   double num4 = num1;
	   System.out.println(num4);
	   
	   num1 = (int)num4;
	   System.out.println(num1);
	   
	   
	   int 답 = num0 - num1;
	   System.out.println(답);
	    
	}

}

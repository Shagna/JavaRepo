package stringexample;

public class StringClass {

	public static void main(String[] args) {
		String s="java";
		System.out.println(s);
			
		//method 1. length() 
	    System.out.println("length: "+s.length());
		
		//method 2.charAt();
		System.out.println("Character at: "+s.charAt(2));
		//Method3. valueOf
		int num=10;
		String num1=String.valueOf(num);
		System.out.println("Value of num: "+num1);
		
		// method 4. equals()
		String str="java";
		System.out.println("Strings equals: "+str.equals(str));
		
		// method 5. equalsIgnoreCase()
		String str2="Java";
		System.out.println("Strings equals: "+s.equalsIgnoreCase(str2));
		
		// method 6. isEmpty()
		String str3="";
		System.out.println("Srtign is empty: "+str3.isEmpty());
		
		// method 7. toUppercase()
		String str4="hi";
		System.out.println("Srtign to uppercase: "+str4.toUpperCase());
		
		// method 8. toLowercase()
		String str5="HII";
		System.out.println("Srtign to lower case: "+str5.toLowerCase());
		
		// method 9. contains()
		String str7="HII";
		System.out.println("String conatins ll? "+str7.contains("ll"));
		
		//Method 10. concat()
		String s11="java";
		String combine= s11.concat(" Program");
		System.out.println(combine);

	}

}

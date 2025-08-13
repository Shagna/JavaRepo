package SamplePackage;

public class ClassPackage {

	public static void main(String[] args) {
		//by using string literal
				String s="java";
				String s1="java";
				//using new keyword
				String s2= new String("java");
				String s3=new String("java");
				System.out.println(s==s1);
				System.out.println(s2==s3);
				System.out.println(s==s2);
				System.out.println(s.equals(s1));

	}

}

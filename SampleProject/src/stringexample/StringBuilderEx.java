package stringexample;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder name=new StringBuilder("Java");
	    System.out.println(name);

		//Method 1: append()
	    name.append(" Programing");
	    System.out.println(name);
	    
	    //Method 2: insert()
	    name.insert(15, " Language");
	    System.out.println(name);
	    
	    //Method 3: replace()
	    name.replace(5,15, "Program");
	    System.out.println(name);
        
	    //Method 4: delete()
	    name.delete(12,21);
	    System.out.println(name);
	    
	    //Method 5: capacity()
	    StringBuilder name1=new StringBuilder("");
	    StringBuilder sb=new StringBuilder("red");

	    System.out.println(name1.capacity());
	    System.out.println(sb.capacity());
	    
	    //Method 6: length()
	    System.out.println(sb.length());
	    
	    //Method 7: charAt()
	    System.out.println(name.charAt(2));
	    
	    //Method 8: subString()
	    System.out.println(name.substring(5));
	    System.out.println(name.substring(5,8));
	    
	    //Method 9; reverse()
	    System.out.println(name.reverse());


	}

}

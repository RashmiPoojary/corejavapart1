package corejavapart1;

public class StringOperation {

	public static void main(String[] args) {
		String s="Sachin";    
		System.out.println("upper case: "+s.toUpperCase());    
		System.out.println("lower case: "+s.toLowerCase());   
		System.out.println(s);	
		System.out.println("start with: "+s.startsWith("Sa"));
		
		System.out.println("ends with: "+s.endsWith("n"));
		System.out.println("character at index 0: "+s.charAt(0));    
		System.out.println("character at index 3: "+s.charAt(3));
		System.out.println("length is : "+s.length());
		String s1=" Sachin";
		System.out.println("length before trim : "+s1.length());
		System.out.println(s1.trim());
		System.out.println("length after trim : "+s1.length());
		String replaceString=s.replace("Sachin","shreya");      
		System.out.println(replaceString); 
		int result;
	    result = s.indexOf('i');
	    System.out.println(result);
	    String s2="java string split method by javatpoint";  
	    String[] words=s2.split("\\s"); 
	    for(String w:words)
	    {  
	    System.out.println(w);  
	    }  

	}

}

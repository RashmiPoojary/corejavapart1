package corejavapart1;

public class StringBufferOperation {

	public static void main(String[] args) {
//		StringBuffer s = new StringBuffer("GeeksforGeeks");
//        int p = s.length();
//        int q = s.capacity();
//        System.out.println("Length of string GeeksforGeeks="+ p);
//        System.out.println("Capacity of string GeeksforGeeks=" + q);
		StringBuffer sb=new StringBuffer();  
        System.out.println(sb.capacity());  
        sb.append("DataFlair");  
        System.out.println(sb.capacity());
        sb.append("DataFlair is company that teaches programming!!!");  
        System.out.println(sb.capacity()); 
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());  
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
	}
}

import java.util.*;
public class Practice_Project6 {
	public static void main(String args[])
	{
		System.out.println("ArrayList");
		//creating Arraylist
		ArrayList<String> al=new ArrayList<String>();
		al.add("Hello");
		al.add("Hii");
		System.out.println(al);
		//creating linkedlist
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> icecream=new LinkedList<String>();
		icecream.add("Vennela");
		icecream.add("Chocolate");
		Iterator<String> i=icecream.iterator();  
	      while(i.hasNext()){  
	       System.out.println(i.next());  
	      }
	    //creating vector
	      System.out.println("\n");
		System.out.println("Vector");
		Vector<String> cl=new Vector<String>();
		cl.add("1st");
		cl.add("2nd");
		System.out.println(cl);
	    //creating stack
		System.out.println("\n");
		System.out.println("Stack");
		Stack<String> s=new Stack<String>();
		s.push("stack1");
		s.push("stack2");
		System.out.println(s);
	    //creating hashset
	     System.out.println("\n");
	     System.out.println("HashSet");
	     HashSet<Integer> hset=new HashSet<Integer>();  
	     hset.add(1);  
	     hset.add(2);  
	     hset.add(2);
	     hset.add(4);
	     System.out.println(hset);
	   //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> lhset=new LinkedHashSet<Integer>();  
	       lhset.add(2);  
	       lhset.add(3);  
	       lhset.add(2);
	       lhset.add(4);	       
	       System.out.println(lhset);
	  }
}

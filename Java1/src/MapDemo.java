import java.util.*;
public class MapDemo {
	public static void main(String args[])
	{
		
	
	HashMap<Integer,String> names=new HashMap<Integer,String>();      
    names.put(1,"sree");    
    names.put(2,"Moni");    
    names.put(3,"Sai");   
     
    System.out.println("\nThe elements of Hashmap are ");  
    for(Map.Entry m:names.entrySet()){    
     System.out.println(m.getKey()+" "+m.getValue());    
    }
    
   //HashTable
     
    Hashtable<Integer,String> dept=new Hashtable<Integer,String>();  
    
    dept.put(4,"IT");  
    dept.put(5,"CSE");  
    dept.put(6,"MECH");  
    dept.put(7,"ECE");  

    System.out.println("\nThe elements of HashTable are ");  
    for(Map.Entry n:dept.entrySet()){    
     System.out.println(n.getKey()+" "+n.getValue());    
    }
    
    
    //TreeMap
    
    TreeMap<Integer,String> clg=new TreeMap<Integer,String>();    
    clg.put(1,"Abc");    
    clg.put(2,"Xyz");    
    clg.put(3,"Cde");       
    
    System.out.println("\nThe elements of TreeMap are ");  
    for(Map.Entry l:clg.entrySet()){    
     System.out.println(l.getKey()+" "+l.getValue());    
    }  
	}
    


}

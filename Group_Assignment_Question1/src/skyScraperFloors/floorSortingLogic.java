package skyScraperFloors;
import java.util.*;


public class floorSortingLogic {
	
	public static void main(String[] Args){

	HashMap<Integer, Integer> floors = new HashMap<>();
	
	
	Scanner sc = new Scanner(System.in);  
	System.out.print("Please enter the number of floors in the building");  
	
	int numberOfFloors = sc.nextInt();
	
	for(int i=1; i<numberOfFloors+1; i++) {
   
		System.out.print("Please enter the floors size given on day "+i); 
		
//		int k = sc.nextInt();
		floors.put(i, sc.nextInt());
		
		
		
	}
	
//    floors.put(1, 4);
//    floors.put(2, 1);
//    floors.put(3, 3);
//    floors.put(4, 7);
//    floors.put(5, 6);
//    floors.put(6, 2);
//    floors.put(7, 5);
    
    
	HashMap<Integer, Integer> reverseFloors = new HashMap<>();
	   
//    System.out.println(floors);
//    System.out.println(floors.keySet());
    
    
    Set<Integer> floorKeySet = new HashSet<Integer>(); 
    
    floorKeySet = floors.keySet();
    
    
   for(Integer i: floorKeySet) {
    	
	   reverseFloors.put(floors.get(i),i);
    	
    }
   

   
    
    
    
    
    ArrayList<Integer> valueSet = new ArrayList<Integer>();
   
    
    for(Integer i: floorKeySet) {
    	
    	valueSet.add(floors.get(i));
    	
    }
   
//    System.out.println(floors);

//    System.out.println(reverseFloors);    
    
//    System.out.println(valueSet);
    
    Collections.sort(valueSet, Collections.reverseOrder()); 
    
//    System.out.println(valueSet);

    Stack<Integer> valueStack = new Stack<Integer>();
    Stack<Integer> keyStack = new Stack<Integer>();
    
    
	HashMap<Integer, String> output = new HashMap<>();
	
	
	
	for(int i=1;i<numberOfFloors+1;i++) {
		
		output.put(i,"");	
	}

         
//	System.out.println(output);  	

//	System.out.println( valueSet);
	
	
	
output.put( reverseFloors.get(valueSet.get(0)), output.get(reverseFloors.get(valueSet.get(0)))+String.valueOf(valueSet.get(0)));

	
for(int i=1;i<numberOfFloors;i++) {
	
if((reverseFloors.get(valueSet.get(i)) <     reverseFloors.get(valueSet.get(i-1)) )
		
//		&& ( i != numberofFloors)        
		
		) {
	
	output.put(    reverseFloors.get(valueSet.get(i-1))        ,    output.get(reverseFloors.get(valueSet.get(i-1)))+" "+String.valueOf(valueSet.get(i))    );

	
	reverseFloors.put(valueSet.get(i), reverseFloors.get(valueSet.get(i-1)));


} else {
	
	
output.put(    reverseFloors.get(valueSet.get(i))        ,    output.get(reverseFloors.get(valueSet.get(i)))+" "+String.valueOf(valueSet.get(i))    );

			
	
}
	
	
	
}


for(int i=1;i<numberOfFloors+1;i++) {

	
System.out.println("Day: "+i);
System.out.println(output.get(i));

	
	
	
}







//System.out.println(output);  	



    
   
    		 
    	 
    	 
           
     
  
    
 
    
    
    
   
    	
    	
    	
    }
    }





























	
	
  
    
	

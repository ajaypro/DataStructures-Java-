package ds.Hashtable;

public class Hashtable {
    String [] hashArray;
    int arraySize;
    int slots; // counter to increment the slots in the hashtable after insertion
    
    public Hashtable(int slots) {
    	createPrimeNumber(slots);
    }
    
    private void createPrimeNumber(int slots){
    	
    	if(isPrime(slots)) {
    		hashArray = new String[slots];
    		arraySize = slots;
    	} else {
    		int primeCount = getNextPrime(slots);
    		hashArray = new String[primeCount];
    		arraySize = primeCount;
    		
    		System.out.println("Hash table size given is "+slots+ "is not a prime" );
    		System.out.println("Hash table size has changed"+primeCount );
    	}
    
    }
    
    private boolean isPrime(int num) {
    	for(int i = 2; i * i <= num; i++) {
    		if(num % i == 0)
    			return false;
    	}
    	return true;
    }
    
    private int getNextPrime(int num) {
    	for(int i = num; true; i++) {
    	    if(isPrime(i))
    	    	return i;
    	}
    }
    
    //preferred to return index position of array
    private 	int hashFunc1(String word) {
    	int hashVal = word.hashCode();
    	hashVal = hashVal %arraySize;
    	
    	//Java might have -ve hashvalue
    	if(hashVal < 0) {
    		hashVal += arraySize;
    	}
    	return hashVal; // got the index position
    }
    
    //return stepsize of open addressing(concept of looking through the array index)
    private int hashFunc2(String word) {
    	int hashVal = word.hashCode();
    	hashVal = hashVal % arraySize;
    	if(hashVal < 0 ) {
    		hashVal = hashVal + arraySize;
    	}
    	// this statement return the stepsize
    	// As per research we take prime num < arraysize 
    	return 3 - hashVal %3;
    }
    
    public void insert(String word) {
    	int hashVal = hashFunc1(word);
    	int stepSize = hashFunc2(word);
    	
    	while(hashArray[hashVal] != null) {
    		hashVal = hashVal + stepSize;
    		hashVal = hashVal % arraySize;
    	}
    	
    	hashArray[hashVal] = word;
    	System.out.println("Word inserted at "+ hashVal + "is" +word);
    }
    
    public String find(String word) {
    	int hashVal = hashFunc1(word);
    	int stepSize = hashFunc2(word);
    	
    	while(hashArray[hashVal] != null) {
    		  if(hashArray[hashVal].equals(word)) {
    			  return hashArray[hashVal];
    		  }
    		  hashVal = hashVal + stepSize;
    		  hashVal = hashVal%arraySize;
    	}
    	return hashArray[hashVal];
    }
    
    public void displayTable() {
    	for(int i = 0; i<hashArray.length; i++) {
    		if(hashArray[i] != null) {
    			System.out.print(hashArray[i]+" ");
    		} else {
    			System.out.print("** ");
    		}
    		System.out.println("");
    	}
    }
}

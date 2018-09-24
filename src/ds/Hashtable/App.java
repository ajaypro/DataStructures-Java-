package ds.Hashtable;


public class App {

	public static void main(String[] args) {
	
      
       /**
        * //Hashtable table = new Hashtable(50);
        * Hashtable is more efficient when using size is large you would get a output of items placed at
        * different index position based on prime number
        */
       
		 Hashtable table = new Hashtable(5);
       table.insert("Apple");
       table.insert("Orange");
       table.insert("Custard");
       table.insert("Pie");
       
       System.out.println(" ");
       
       table.displayTable();
       System.out.println(" ");
       System.out.println("------Find out the position-----");
       System.out.println(table.find("Apple"));
       System.out.println(table.find("Bus"));
       System.out.println(table.find("Custard"));
       
       
	}

}

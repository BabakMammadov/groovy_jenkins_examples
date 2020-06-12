/*
static methods which meant that we could access those methods directly from the class. 
instance methods wherein the methods are accessed by creating objects of the class
*/
class Example { 
   int x; 
	
   public int getX() { 
      return x; 
   } 
	
   public void setX(int pX) { 
      x = pX; 
   } 
	
   static void main(String[] args) { 
      Example ex = new Example(); 
      ex.setX(100); 
      println(ex.getX()); 
   } 
}


Example ex = new Example();
println(ex.main())
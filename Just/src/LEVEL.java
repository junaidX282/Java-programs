import java.time.LocalDate;

class Sample{
	
   enum LEVEL {

	LOW,
	MEDIUM,
	HIGH
	
	
   }
   public static void main(String[] args) {
	
	   LEVEL l=LEVEL.HIGH;
	  
	   switch(l) {
	   
	   case LOW:
		   System.out.println("level low");
		   break;
		   
	   case MEDIUM:
		   System.out.println("LEVEL MEDIUM");
		   break;
		   
	   case HIGH:
		   System.out.println("level is high");
		   break;
	   }
	   for(LEVEL S:LEVEL.values()) {
		   System.out.println(S);
	   }
}
   
}
package upcast;
			
			 class Sample {
			
				void drawing() {
					System.out.println("drawing ");
				}
			}


		 class Vehicle extends Sample{
			
			 void drawing() {
				 System.out.println(" drawing vehicles");
			 }
		}
 
 
		 class Nature extends Sample{
			 void drawing() {
				 System.out.println(" drawing nature");
			 }
		 }
 
 
		 class Building extends Sample{
			void drawing() {
				System.out.println("drawing building");
			}
		
		 }
 
 
 class Test{
	 
	 public static void main(String[] args) {
		Sample s;
		int a=10;
		System.out.println(a+"");
		s=new Nature();
		s.drawing();

		s=new Vehicle();
		s.drawing();

		s=new Building();
		s.drawing();
	   
	 } 
	 
 }
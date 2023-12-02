
public class A40 {

	public static void main(String[] args) {
		
		String sample="Hello123@World!";
		
//		char [] ch = sample.toCharArray();
		
		int s=0,l=0,numbers=0,special=0,letters=0;
		for(int i=0;i<sample.length();i++) {
			
			
			if(sample.charAt(i)>='a'&& sample.charAt(i)<='z' ||  sample.charAt(i)>'A' && sample.charAt(i)<'Z' ) {
				s++;
			}
			else if(sample.charAt(i)>48 && sample.charAt(i)<57) {
				numbers++;
			}else {
				special++;
			}
		}System.out.println(s +"  "+numbers+" "+special);
	}	
}


public class A39 {

	public static void main(String[] args) {
		
		String sample="HelloWorld45";
		
		char [] ch = sample.toCharArray();
		
		int s=0,l=0,numbers=0,special=0,letters=0;
		for(int i=0;i<sample.length();i++) {
			
			
			if(sample.charAt(i)>='a'&& sample.charAt(i)<='z' ) {
				s++;
			}else if( sample.charAt(i)>'A' && sample.charAt(i)<'Z') {
				l++;
			}
		}System.out.println(s +" "+l);
		
	
	}
}

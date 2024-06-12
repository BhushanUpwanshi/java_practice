import java.util.Scanner;

public abstract class TESTER {
	public static void main(String[] args) {
		System.out.println((int)('0')+"  "+(int)('9'));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s= sc.nextLine();
		char[] arr= s.toCharArray();
		
		int countLowercase=0;
		int countUowercase=0;
		int countSpaces=0;
		int countDigits=0;
		int countOtherChar=0;
		for(char c:arr) {
			if((int)(c)>=97 && (int)(c)<=122) {
				countLowercase++;
			}else if((int)(c)>=65 && (int)(c)<=90) {
				countUowercase++;
			}else if((int)c ==32) {
				countSpaces++;
			}else if((int)(c)>=48 && (int)(c)<=57) {
				countDigits++;
			}
			else {
				countOtherChar++;
			}
			
		}
		System.out.println("countLowercase : "+countLowercase+",\n countUowercase : "+countUowercase
				+",\n countSpaces : "+countSpaces+",\n countDigits : "+countDigits+
				",\n countOtherChar : "+countOtherChar);
	}
}

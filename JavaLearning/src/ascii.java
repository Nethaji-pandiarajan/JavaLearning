import java.util.Scanner;

public class ascii {
	
	
	public static void main(String args[]) {
		
//		System.out.println("Enter a character");
//		Scanner sc = new Scanner(System.in);
//		char asc = sc.next().charAt(0);
//		
//		int asci = asc;
//		
//		System.out.println(asci);
		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		
//		for(int i = 0 ; i<a;i++) {
//			for(int j=0; j<=i ; j++) {
//				System.out.print(j);
//			}
//			System.out.println("");
//		}
		

        String str= "Geeks", nstr="";
        char ch;
      
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
      
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        System.out.println(ch);//extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
		
	

}

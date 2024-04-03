//Accept a integer number and when the program is executed print the binary, octal and
//hexadecimal equivalent of the given number.
//Sample Output:
//java Test
//Enter Number : 20
//Given Number :20
//Binary equivalent :10100
//Octal equivalent :24
//Hexadecimal equivalent :14
//Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())
import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		
       int num;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number - ");
       num=sc.nextInt();
       System.out.println("Given number = "+num);
       
       Integer i = new Integer(num);
       System.out.println("Binary Equivalent : "+i.toBinaryString(num));
       System.out.println("Octal Equivalent : "+i.toOctalString(num));
       System.out.println("Hexagonal Equivalent :"+i.toHexString(num));
       
	}

}

import java.util.*;
public class ConvertDecimalToBinary 
{
static Scanner keyboard = new Scanner(System.in);
public static void main (String [] args)
{
    String s = "";
	int A[] = new int [8];
	while (true)
	{
	System.out.println("Enter a integer number for binary conversion or a negative one for exit : "); 
	//--------CONVERSION PART--------CONVERSION PART--------CONVERSION PART--------
	int n = keyboard.nextInt();
	if (n<0) {System.out.println("Have a nice day.");break;}
	for (int i = A.length - 1; i >= 0; --i)
	{
		if ((n>=(Math.pow(2, i))) && ((n/2)<=(Math.pow(2, i))))  // also works without: && ((n/2)<=(Math.pow(2, i))))
		{
			A[i] = 1;
			n = n-(int)(Math.pow(2, i));
		}
		else A[i] = 0;
	}
	//--------REVERSING THE ARRAY--------REVERSING THE ARRAY--------REVERSING THE ARRAY--------
	for (int i = 0; i< A.length/2; ++i) 
	{
		int temp = A[i]; A[i] = A[A.length-1-i];A[A.length-1-i] = temp;
	}
	//--------PRINTING PART--------PRINTING PART--------PRINTING PART--------
	for (int i = 0; i< A.length; ++i) System.out.print(A[i] + " ");
	System.out.println();
	/*System.out.println("Would you like to convert another number?"); s = keyboard.next();
	if (s.equals("n")||s.equals("N")||s.equals("no")||s.equals("NO")||s.equals("No")||s.equals("nO")) 
		{
		System.out.println("Have a nice day.");
		break;
		}*/
	}
}
}

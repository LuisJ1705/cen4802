import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

class fibTest {

	@Test
		public void test() {}
		 //method to return the n-th digit from the fibonacci sequence
	    static int fibonacci(int n)
	    {
	    	{
	    //if the n input is 1 or less then return n
	    if (n <= 1)
	       return n;
	    //recursive fibonacci sequence functions
	    return fibonacci(n-1) + fibonacci(n-2);}
	    }
	    //main method 
	    public static void main (String args[])
	    {
	    //declare n variable
	    int n;
	    //create Scanner class input
	    Scanner input=new Scanner(System.in);
	    //get input n from user
	    System.out.println("Enter any value for n: ");
	    n=input.nextInt();
	    //print n-th number in sequence
	    System.out.println("The "+n+"th value of the Fibonacci sequence is "+fibonacci(n));
	}
	}


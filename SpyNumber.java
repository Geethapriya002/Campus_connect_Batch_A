import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0, prd = 1;
		while(temp != 0){
		    sum = sum + (temp % 10);
		    temp = temp / 10;
		}
	System.out.println(sum);
	temp = n;
	while(temp != 0){
	    prd = prd * (temp % 10);
	    temp = temp / 10;
	    }
	    System.out.println(prd);
	    if( sum == prd){
	        System.out.println("It is a spy number");
	    }
	    else{
	        System.out.println("It is not a spy number");
	    }
    }
}
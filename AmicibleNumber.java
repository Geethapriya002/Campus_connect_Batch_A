import java.util.*;
public class AmicibleNumber
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int sum1 = 0, sum2 = 0;
	for(int i = 1; i<num1; i++){
	    if(num1 % i == 0){
	        sum1 += i;
	    }
	}
	System.out.println(sum1);
	for(int i = 1; i<num2; i++){
	    if(num2 % i == 0){
	        sum2 += i;
	    }
	}
	System.out.println(sum2);
	if(sum1 == num2 && sum2 == num1){
	    System.out.println("Amicible number");
	}
	else{
	    System.out.println("Not an Amicible Number");
	    }
    }
}

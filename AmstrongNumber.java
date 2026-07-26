import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int original = n;
		int count = 0, sum = 0;
		while(n != 0){
            count++;
		    n = n / 10;
		}
		n = original;
		while(n != 0){
		    int digit = n % 10;
		    int power = 1;
		    for(int i = 1; i<= count; i++){
		        power *= digit;
		    }
		    sum += power;
		    n /= 10;
		}
		if(sum == original){
		    System.out.println("Amstrong number");
		}
		else{
		    System.out.println("Not an amstrong number");
		}
    }
}
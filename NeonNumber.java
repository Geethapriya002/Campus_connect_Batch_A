import java.util.*;
public class NeonNumber
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int	n = sc.nextInt();
    int a = n * n;
    System.out.println(a);
    int sum = 0;
    while(a != 0){
        sum = sum + (a % 10);
        a = a / 10;
    }
    if(sum == n){
        System.out.println("Neon Number");
    }
    else{
        System.out.println("Not a neon number");
    }
	}
}
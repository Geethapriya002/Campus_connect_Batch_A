import java.util.*;
public class SunnyNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n + 1;
        boolean sunny = false;
        for(int i=1; i<=a; i++){
            if(i * i == a){
                sunny = true;
            }
        }
        if(sunny){
            System.out.println(" Sunny number");
        }
        else{
            System.out.println("Not a sunny number");
        }
    }
}
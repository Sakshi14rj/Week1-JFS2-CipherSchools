import java.util.Scanner;
public class Test5 {
    public static void main (String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Speed :");
    	int speed = sc.nextInt();
    	
    	System.out.println("Today is Your Birthday ?");
    	boolean isbirthday = sc.nextBoolean();
    	
    	if(isbirthday==true) {
    		speed=-5;
    	}
    	
    	if(speed>80)
    	System.out.printf("High ticket");
        else if(speed>=60) 
    	System.out.printf("Mid ticket");
        else
        System.out.println("No ticket");
    }
}
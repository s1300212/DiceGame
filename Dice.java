import java.util.Random;
import java.util.Scanner;
public class Dice{
    public static void main(String[] args){
	int sum=0;
	Random rand = new Random();
	int m = rand.nextInt(6)+1;
	int a = rand.nextInt(6)+1;
	sum += (m+a);
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name ?");
	System.out.print(">");
	String name = sc.next();
	System.out.println("Hello,"+name+"!");

	System.out.println("Rolling dice...");
	System.out.println("Die 1 :"+ m);
	System.out.println("Die 2 :"+ a);
	System.out.println("Total value:"+ sum);
	if(7<sum ){System.out.println(name +" won!");}
	else System.out.println(name+" lost");
    }

    

}

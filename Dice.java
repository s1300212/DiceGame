import java.util.Random;
public class Dice{
    public static void main(String[] args){
	int sum=0;
	Random rand = new Random();
	int m = rand.nextInt(6)+1;
	int a = rand.nextInt(6)+1;
	sum += (m+a);
	System.out.println("Rolling dice...");
	System.out.println("Die 1 :"+ m);
	System.out.println("Die 2 :"+ a);
	System.out.println("Total value:"+ sum);
	if(7<sum ){System.out.println("You won");}
	else System.out.println("You lost");
    }

    

}

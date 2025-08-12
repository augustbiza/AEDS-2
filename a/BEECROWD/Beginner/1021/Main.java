import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        double money = scan.nextDouble();
                
        //banknotes
        int hundred = (int)money/100;
            if(hundred > 0) money %= 100;
            
        int fifty = (int)money/50;
            if(fifty > 0) money %= 50;
            
        int twenty = (int)money/20;
            if(twenty > 0) money %= 20;
            
        int ten = (int)money/10;
            if(ten > 0) money %= 10;
            
        int five = (int)money/5;
            if(five > 0) money %= 5;
            
        int two = (int)money/2;
            if(two > 0) money %= 2;
        //at this point the money is between 0 and 1.99

        //cents
        money *= 100;   //convert money to cents: ex($1.79 = 179 cents)

        int c100 = (int)money/100;
            money %= 100;

        int c50 = (int)money/50;
            money %= 50;

        int c25 = (int)money/25;
            money %= 25;

        int c10 = (int)money/10;
            money %= 10;

        int c5 = (int)money/5;
            money %= 5;

        int c1 = (int)money;

        System.out.println("NOTAS:");
        System.out.println(hundred+" nota(s) de R$ 100.00");
        System.out.println(fifty+" nota(s) de R$ 50.00");
        System.out.println(twenty+" nota(s) de R$ 20.00");
        System.out.println(ten+" nota(s) de R$ 10.00");
        System.out.println(five+" nota(s) de R$ 5.00");
        System.out.println(two+" nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(c100+" moeda(s) de R$ 1.00");
        System.out.println(c50+" moeda(s) de R$ 0.50");
        System.out.println(c25+" moeda(s) de R$ 0.25");
        System.out.println(c10+" moeda(s) de R$ 0.10");
        System.out.println(c5+" moeda(s) de R$ 0.05");
        System.out.println(c1+" moeda(s) de R$ 0.01");

        
        scan.close();
 
    }
 
}
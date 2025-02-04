import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int moneyInitial = scan.nextInt();
        int money = moneyInitial;
        
        int hundred = money / 100;
            if(hundred > 0) money -= 100*hundred;
        
        int fifty = money/ 50;
            if(fifty > 0) money -= 50*fifty;
        
        int twenty = money/20;
            if(twenty > 0) money -= 20*twenty;
            
        int ten = money/10;
            if(ten > 0) money -= 10*ten;
            
        int five = money/5;
            if(five > 0) money -= 5*five;
            
        int two = money / 2;
            if(two > 0) money -= 2*two;
            
        int one = money;
        
        System.out.printf("%d\n", moneyInitial);
        System.out.printf("%d nota(s) de R$ 100,00\n", hundred);
        System.out.printf("%d nota(s) de R$ 50,00\n", fifty);
        System.out.printf("%d nota(s) de R$ 20,00\n", twenty);
        System.out.printf("%d nota(s) de R$ 10,00\n", ten);
        System.out.printf("%d nota(s) de R$ 5,00\n", five);
        System.out.printf("%d nota(s) de R$ 2,00\n", two);
        System.out.printf("%d nota(s) de R$ 1,00\n", one);

        scan.close();
    }
 
}
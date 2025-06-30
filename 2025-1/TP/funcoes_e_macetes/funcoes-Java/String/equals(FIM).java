
public static boolean comparaFim(String str, int tam) {     //str.equals("FIM")

        boolean igualFim = false;

        if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(tam-1) == 'M') igualFim = true;   //tam-1 = ultimo char, em java não possui \0

        return igualFim;
}

public static void main(String[] args) {

        String str = new String();
        int tam = 1;
        
        do{
            
            str = scan.nextLine();
            tam = str.length();

            if(!comparaFim(str, tam)) {

            }

        } while(!comparaFim(str, tam));
}
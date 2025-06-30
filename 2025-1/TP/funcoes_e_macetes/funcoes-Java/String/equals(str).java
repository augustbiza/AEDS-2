
public static boolean comparaSTRING(String str, String str2) {     //str.equals("STRING")

        boolean igualSTRING = false;
        int tam1 = str.length(), tam2 = str2.length();

        if(tam1 == tam2) 

        if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(tam-1) == 'M') igualSTRING = true;   //tam-1 = ultimo char, em java não possui \0

        return igualSTRING;
    }

public static void main(String[] args) {

        String str = new String();
        int tam = 1;
        
        do{
            
            str = scan.nextLine();
            tam = str.length();

            if(!comparaSTRING(str, "string")) {

            }

        } while(!comparaSTRING(str, "string"));
}
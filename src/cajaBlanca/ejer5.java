package cajaBlanca;

public class ejer5 {
    public static void main(String[] args) {
        String frase ="hoolaa";
        System.out.println(StringClean(frase));
        System.out.println(ClearStringRecursive(frase));
    }
        //recursive
    private static String StringClean(String str) {
        if (str.length() <=1)
            return str;
        else if (str.charAt(0) != str.charAt(1))
            return str.charAt(0) + StringClean(str.substring(1));
        else
            return StringClean(str.substring(1));
    }

    //iterative
    private static String ClearStringRecursive(String str){
        if(str.length() <=1)
            return str;
        else if(str.charAt(0) != str.charAt(1))
            return str.charAt(0) + ClearStringRecursive(str.substring(1));
        else
            return ClearStringRecursive(str.substring(1));
    }
}

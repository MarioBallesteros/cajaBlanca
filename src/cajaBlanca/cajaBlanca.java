package cajaBlanca;

public class cajaBlanca {

        public static void main(String[] args) {
            String cadena="hola";
            System.out.println(contarLetras(cadena,'a'));
        }
        static int contarLetras(String cadena,char letra) {
            int contador=0,n=1,lon;
            lon=cadena.length();
            if(lon>0){
                do{
                    if(cadena.charAt(contador)==letra) n++;
                    contador++;
                    lon--;
                }while(lon>0);
            }
            return n;
        }

    }


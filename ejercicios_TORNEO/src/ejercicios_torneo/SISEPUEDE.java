
package ejercicios_torneo;


public class SISEPUEDE {
    public static void main(String[] args){
        String nombres = "Juan Luis ";
        
        String cad1 = nombres.substring(0 , nombres.indexOf(" "));
        System.out.println("cad1 = " + cad1);
        int k = nombres.indexOf(cad1) + cad1.length();
        System.out.println("k = " + k);
        int m = nombres.indexOf(" ", k + 1);
        System.out.println("m = " + m);
        String cad2 = nombres.substring(k + 1 , m);
        System.out.println("cad2 = " + cad2);
    }
    
    
}

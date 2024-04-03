
package ejercicioss_unidad3;



public class ejercicio_figura2 {
public static void main(String [] args){
    int nren, ncar, topCar = 1, topEsp=4, nesp;
    
    for(nren=1; nren <= 5; nren++){
    
        for(nesp=1; nesp <= topEsp; nesp++ ){
            System.out.print("A");
        }//ciclo de espacios
        
        for(ncar=1; ncar <= topCar; ncar++){
            System.out.print("*");
        }//ciclo de caracteres
    
    topCar += 2;
    topEsp--;
    System.out.println("");
    }//ciclo de renglones

}
}

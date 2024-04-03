
package ejercicioss_unidad3;


public class ejercicio_figura4 {
public static void main(String [] args){
//MARTÍNEZ LÓPEZ EDGAR DANIEL
//GRUPO: A
    int cont, nren , topCar = 1, topEsp = 4, nEsp, nCar;
    
        for(nren = 1 ;  nren <= 9 ; nren++){
        
            for(nEsp = 1 ; nEsp <= topEsp; nEsp++){//ciclo de espacios
                System.out.print(" ");
            }      
            for(nCar = 1 ; nCar <= topCar ;nCar++) {//ciclo de caracteres
                System.out.print("*");
            }
                
        if(nren < 5){
        topEsp--;
        topCar++;
        }
        else{
        topEsp++;
        topCar--;
        }
        System.out.print("\n");
        }
    }
}

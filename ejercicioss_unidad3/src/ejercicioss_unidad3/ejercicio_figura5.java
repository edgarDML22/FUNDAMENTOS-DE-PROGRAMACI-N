
package ejercicioss_unidad3;


public class ejercicio_figura5 {
public static void main(String [] args){
//MARTÍNEZ LÓPEZ EDGAR DANIEL
//GRUPO: A
    int nren, ncar, topcar=1;

    for(nren = 1 ; nren <= 9 ; nren++){
        
        for(ncar = 1; ncar <= topcar; ncar++){
            System.out.print("*");
        }//ciclo de caracteres
        
        System.out.print("\n");
        
        if(nren<5){
        topcar++;
        }
        else{
        topcar--;
        }
    }
}
}

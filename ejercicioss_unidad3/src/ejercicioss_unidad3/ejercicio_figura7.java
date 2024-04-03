
package ejercicioss_unidad3;


public class ejercicio_figura7 {
public static void main(String [] args){
//k es para imprimir asteriscos
//r es el contador de renglones
//i es para imprimir espacios
int  maxC=8, maxE=0;

    for( int r = 1 ; r <= 11; r++ ){
        for( int i =1; i <= maxE; i++){
            System.out.print(" ");
        }
        for(int k = 1; k<= maxC; k++){
        System.out.print("*");
        }
        
    if (r<6){
    maxE+=2;
    }   
    else {
    maxE-=2;
    }  
        System.out.print("\n");
    }
}
}

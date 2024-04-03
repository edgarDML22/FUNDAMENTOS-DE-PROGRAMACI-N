
package ejercicioss_unidad3;


public class ejercicio_figura6 {
public static void main(String [] args){
//k es para imprimir asteriscos
//r es el contador de renglones
int  maxC=7, maxE=0;

    for( int r = 1 ; r <= 7; r++ ){
        for( int i =1; i <= maxE; i++){
            System.out.print(" ");
        }
        for(int k = 1; k<= maxC; k++){
        System.out.print("*");
        }
        
    if (r<4){
    maxC-=2;
    maxE++;
    }
        
    else {
    maxC+=2;
    maxE--;
    }  
        System.out.print("\n");
    }
}
}


package ejercicios_unidad5;
import java.util.Scanner;

public class POO_ejercicio2 {
    //FERNÁNDEZ GARIBAY ALFONSO MARÓN
    //CHACÓN ARELLANO GABRIEL
    //MARTÍNEZ LÓPEZ EDGAR DANIEL
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número de personas de la pila");
        int N = sc.nextInt();
        String arreglo[] = new String[N];
        
        Pila pila = new Pila(N); //Creación del objeto de la clase Pila
        
        boolean flag = true;
        
        while(flag){
            System.out.println("¿Qué desea hacer? (Ingrese el número de opción)");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar pila");
            System.out.println("4. Vaciar pila");
            System.out.println("5. Terminar programa");
            
            int opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese nombre");
                    String nombre = sc.next();
                    System.out.println(pila.Agregar_elementos(nombre));
                break;
                
                case 2:
                    System.out.println("El elemento eliminado fue: " + pila.Eliminar_elemento());                    
                break;
                
                case 3:
                    pila.Mostrar_elementos();
                break;
                
                case 4:
                    pila.Vaciar_pila();
                break;
                
                case 5:
                default:
                    flag = false;
                    break;                                                                            
            }
            
            
        }
        
    }
    
}

class Pila{
    String arreglo[];
    int contador;
    
    
    public Pila(int N){//Método constructor
        arreglo = new String[N];
        contador = 0;
    }
    
    
    public boolean Agregar_elementos(String nombre){
        boolean retorno = Verificar_llena();
            if(retorno){
                contador++;
                arreglo[contador - 1] = nombre;
            }                
    return retorno;    
    }
    
    public boolean Verificar_llena(){
        boolean v = false;
            for (int i = 0; i < arreglo.length; i++) {
                if(arreglo[i] == null){
                    v = true;
                    break;                    
                }            
            }
    return v;    
    }
    
    public String Eliminar_elemento(){
        boolean flag = Verificar_vacia();
        String eliminado;
        if (!flag) {
            eliminado = arreglo[contador - 1];
            arreglo[contador - 1] = null;
            contador--;                        
        }
        else{
            eliminado = "";
        }     
    return eliminado;    
    }
    
    public boolean Verificar_vacia(){
        boolean v = true;
            for (int i = 0; i < arreglo.length; i++) {
                if(arreglo[i] != null){
                    v = false;
                    break;
                }            
            }       
    return v;    
    }

    
    public void Vaciar_pila(){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = null;           
        }
        contador = 0;
    }   
    
    
    public void Mostrar_elementos(){
        System.out.println("La pila en este momento está acomodada de la siguiente forma: ");        
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.println("\t" + arreglo[i]);
            
        }
    }
}   

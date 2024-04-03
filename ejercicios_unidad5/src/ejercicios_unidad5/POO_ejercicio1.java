
package ejercicios_unidad5;

import java.util.Scanner;


public class POO_ejercicio1 {
    //FERNÁNDEZ GARIBAY ALFONSO MARÓN
    //CHACÓN ARELLANO GABRIEL
    //MARTÍNEZ LÓPEZ EDGAR DANIEL
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número de personas de la fila");
        int N = sc.nextInt();
        String arreglo[] = new String[N];
        
        
        Cola fiesta = new Cola( N , arreglo);//SE LE ENVIAN AL CONSTRUCTOR
        
        boolean flag = true;
        while(flag){
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("4. Vaciar");
            System.out.println("5. Terminar programa");
            
           int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    
                    System.out.println("Ingrese nombre");
                    String nombre = sc.next();
                    System.out.println(fiesta.Agregar_elemento(nombre));
                break;
                
                case 2:
                    System.out.println(fiesta.Eliminar_elemento());
                break;
                
                case 3: 
                    fiesta.Mostrar_elementos();
                break;
                
                case 4: 
                    fiesta.Vaciar_cola();
                break;
                
                default:
                    flag = false;
                break;    
                
            }
            
        }                                                                                                                                                                      
    }    
}

class Cola{
    int n;
    int contador;
    String[] arreglo;
    
    
    public Cola(int N , String[] _arreglo){//Método constructor
        n = N;
        arreglo = _arreglo;            
    }
    
    public boolean Agregar_elemento(String nombre){
        boolean flag = Verificar_llena();
            if(flag){
                contador++;
                arreglo[contador - 1] = nombre;                
            }                                                                                   
    return flag;    
    }
    
    public boolean Verificar_llena(){
        boolean v = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {                
                v = true;                
                break;
            
            }
        }
    return v;            
    }
    
    public String Eliminar_elemento(){        
        boolean v = Verificar_vacia();
        
        if (v) {
            return "COLA VACIA";            
        }
        else{
            String eliminado = arreglo[0];
            contador--;
            Recorrer_elementos();
            return eliminado;
        }                    
    }
    
    public boolean Verificar_vacia(){
        boolean v = true;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null) {
                v = false;
                break;
                
            }                        
        }
        return v;
    }
    
    public void Recorrer_elementos(){
        for (int i = 0; i < contador; i++) {
            arreglo[i] = arreglo[i + 1];    
        }
        arreglo[contador] = null;
        
    }
    
    public void Vaciar_cola(){
        for (int i = 0; i < contador; i++) {
            arreglo[i] = null;
            
        }
        contador = 0;
    }
    
    public void Mostrar_elementos(){
        for(String elemento: arreglo){
            System.out.print(elemento + "\t");
        }
        System.out.println("");
    }
    
    
    
    
}//Class Cola

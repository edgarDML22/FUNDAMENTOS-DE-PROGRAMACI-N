
package ejercicios_unidad5;



public class POO_ejercicio3 {
    //FERNÁNDEZ GARIBAY ALFONSO MARÓN
    //CHACÓN ARELLANO GABRIEL
    //MARTÍNEZ LÓPEZ EDGAR DANIEL
    public static void main(String [] args){
        Quebrados frac = new Quebrados(4, 6 ,8);
               
        System.out.println("Se muestran los atributos del objeto");
        frac.mostrar();
        
            String suma = frac.sumar("2 5/7");
            System.out.println("Al invocar el método SUMAR se obtuvo el resultado siguiente: " + suma);
            
            String resta = frac.restar("2 5/7");
            System.out.println("Al invocar el método RESTAR se obtuvo el resultado siguiente: " + resta);
            
            String producto = frac.multiplicar("2 5/7");
            System.out.println("Al invocar el método MULTIPLICAR se obtuvo el resultado siguiente: " + producto);
            
            String cociente = frac.dividir("2 5/7");
            System.out.println("Al invocar el método DIVIDIR se obtuvo el resultado siguiente: " + cociente);
                                                
        frac.reset();
        System.out.println("Se muestran los atributos del objeto después de emplear el método RESET");
        frac.mostrar();
        
        
    }                        
}

class Quebrados{
    int Entero;
    int Numerador;
    int Denominador;
    
    public Quebrados(int entero, int numerador, int denominador){//Método constructor
        Entero = entero;
        Numerador = numerador;
        Denominador = denominador;                                
    }
    
    public void mostrar(){
        System.out.println("ENTERO: " + Entero);
        System.out.println("NUMERADOR: " + Numerador);
        System.out.println("DENOMINADOR: " + Denominador);
    }
    public void reset(){
        Entero = 1;
        Numerador = 1;
        Denominador = 2;
                        
    }
    
    
    public String sumar(String cad){
    
        int ent = Integer.parseInt(cad.substring(0, cad.indexOf(" ")));
        int num = Integer.parseInt(cad.substring(2 , cad.indexOf("/")));
        int den = Integer.parseInt(cad.substring(cad.indexOf("/") + 1 , cad.length()));                
        
        //SUMA DE FRACCIONES
        int numR =  Numerador*den + num*Denominador;
        int denR = Denominador*den;
        
        
        //SIMPLIFICAR LA FRACCIÓN SI ES POSIBLE
        int entero_s = 0;
        if (numR >= denR) {
            entero_s = numR / denR; 
            numR = numR % denR;                  
        }                
        //SUMAR LOS ENTEROS
        int entR = Entero + ent + entero_s;  
        
        String retorno = Entero + " " + Numerador + "/" + Denominador + " + " + ent + " " + num + "/" + den + " = "+entR + " " + numR + "/" + denR;        
        
        
        return retorno;
    }
    
    public String restar(String cad){
    
        int ent = Integer.parseInt(cad.substring(0, cad.indexOf(" ")));
        int num = Integer.parseInt(cad.substring(2 , cad.indexOf("/")));
        int den = Integer.parseInt(cad.substring(cad.indexOf("/") + 1 , cad.length()));                
        
        //RESTA DE FRACCIONES
        int numR =  Numerador*den - num*Denominador;
        int denR = Denominador*den;
        
        
        //SIMPLIFICAR LA FRACCIÓN SI ES POSIBLE
        int entero_s = 0;
        if (numR >= denR) {
            entero_s = numR / denR; 
            numR = numR % denR;                  
        }                
        //SUMAR LOS ENTEROS
        int entR = Entero - ent + entero_s;  
        
        String retorno = Entero + " " + Numerador + "/" + Denominador + " - " + ent + " " + num + "/" + den + " = "+entR + " " + numR + "/" + denR;        
        
        
        return retorno;
    }
    
    public String multiplicar(String cad){
    
        int ent = Integer.parseInt(cad.substring(0, cad.indexOf(" ")));
        int num = Integer.parseInt(cad.substring(2 , cad.indexOf("/")));
        int den = Integer.parseInt(cad.substring(cad.indexOf("/") + 1 , cad.length()));                
        
        int num1 = Entero*Denominador + Numerador;
        int den1 = Denominador;        
        int num2 = ent*den + num;        
        int den2 = den;
        
        //MULTIPLICACION DE FRACCIONES
        int numR =  num1*num2;        
        int denR = den1*den2;
        
        
        
        //SIMPLIFICAR LA FRACCIÓN SI ES POSIBLE
        int entR = 0;
        if (numR >= denR) {
            entR = numR / denR; 
            numR = numR % denR;                  
        }                
          
        
        String retorno = Entero + " " + Numerador + "/" + Denominador + " X " + ent + " " + num + "/" + den + " = "+entR + " " + numR + "/" + denR;        
        
        
        return retorno;
    }
    
    public String dividir(String cad){
    
        int ent = Integer.parseInt(cad.substring(0, cad.indexOf(" ")));
        int num = Integer.parseInt(cad.substring(2 , cad.indexOf("/")));
        int den = Integer.parseInt(cad.substring(cad.indexOf("/") + 1 , cad.length()));                
        
        int num1 = Entero*Denominador + Numerador;
        int den1 = Denominador;        
        int num2 = ent*den + num;        
        int den2 = den;
        
        //DIVISION DE FRACCIONES
        int numR =  num1*den2;        
        int denR = num2*den1;
        
        
        
        //SIMPLIFICAR LA FRACCIÓN SI ES POSIBLE
        int entR = 0;
        if (numR >= denR) {
            entR = numR / denR; 
            numR = numR % denR;                  
        }                
          
        
        String retorno = Entero + " " + Numerador + "/" + Denominador + " / " + ent + " " + num + "/" + den + " = "+entR + " " + numR + "/" + denR;        
        
        
        return retorno;
    }
    
    
    
}

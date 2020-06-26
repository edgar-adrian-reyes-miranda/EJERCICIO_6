package SEPARARARRAYS;

import java.util.Arrays;

public class ARRAYSLIST {
    static int[] separaParesImpares(int[] lista){
        int[] nuevo=new int[lista.length];
        int i, posicionNuevoIzq=0, posicionNuevoDer=lista.length-1;
        
        
        for (i=0;i < lista.length;i++){
            if (lista[i]%2==0){
                nuevo[posicionNuevoIzq]=lista[i];
                posicionNuevoIzq++;
            } else {
                nuevo[posicionNuevoDer]=lista[i];
                posicionNuevoDer--;
            }                
        }
        return nuevo;
    }
    
    public static void main(String[] args) {
        int[] elementos=new int[10];
        int i;
        
        
        for (i=0;i < elementos.length;i++){
            elementos[i]=(int)(Math.random()*100+1);
        }
        System.out.println("Numeros pares e impares al azar: "+Arrays.toString(elementos));
        
        elementos=separaParesImpares(elementos);
        System.out.println("Numeros pares e impares ordenados: "+Arrays.toString(elementos));        
    }
  
}
                
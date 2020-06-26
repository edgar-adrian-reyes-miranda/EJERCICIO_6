package SEPARARARRAYS;

import java.util.Scanner;

public class ARRAYSLIST {
    
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        int au[]=new int[10];
        int pares=0, impares=0;
        for (int i = 0; i < 10; i++) {
        System.out.println("Ingresa numeros aleatorios: ");
        au[i]=num.nextInt();
        if(au[i]%2==0){
            pares++;
        }else{
            impares++;
        }
        }
       
        int par[]=new int[pares];
        int im[]= new int [impares];
        pares=0;
        impares=0;
        for (int i = 0; i < 10; i++) {
    if(au[i]%2==0){        
        par[pares]=au[i];
            pares++;
           
            
            }else{
        im[impares]=au[i];
               impares++;
            }
        }
        System.out.println("NUMEROS PARES E IMPARES");
        System.out.println("PARES");
       /* for (int i = 0; i < 10; i++) {
         if(pares<pares || pares>pares){
             System.out.println(pares+" ");    
         }else if(impares<impares|| impares>impares){
             System.out.println(impares+" ");
         }   
        }*/
        for (int i = 0; i <pares; i++) {
            System.out.println(par[i]+ " ,");
        }
        
        System.out.println("IMPARES");
        for (int i = 0; i < impares; i++) {
            System.out.print(im[i]+"  ,\n");
        
        }
    }
}
                
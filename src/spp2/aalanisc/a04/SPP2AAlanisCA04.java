/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aalanisc.a04;
import java.util.Scanner ;
/**
 *
 * @author anamartha
 */
public class SPP2AAlanisCA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opEntrada;
        Scanner T = new Scanner (System.in);
        double tan , sen , cos , ang ;
        
         System.out.println("Menu de trigonometría");
         System.out.println("Introduzca la opcion que desea utilizar");
         System.out.println("1.Calcular el seno");
         System.out.println("2.Calcular el coseno");
         System.out.println("3.Calcular la Tangente");
         System.out.println("4.Salida");
         
         opEntrada = T.nextInt();
         
         switch (opEntrada) {
             case 1 :
                 System.out.println("Calcular el seno");
                 System.out.println("Introduce un angulo entre 0 y 360");
                 ang = T.nextDouble();
                 ang = Math.toRadians(ang);
                 sen = Math.sin(ang ) ;
                 System.out.println("el seno del angulo es " + sen);
                 break ;
                 
             case 2 :
                 System.out.println("Calcular el coseno del angulo");
                 System.out.println("Introduce un angulo entre 0 y 360");
                 ang = T.nextDouble();
                 ang = Math.toRadians(ang);
                 cos = Math.cos(ang);
                 System.out.println("El coseno del angulo es" + cos);
                 break ;
                 
             case 3 :
                 System.out.println("Calcular la tangente del angulo");
                 System.out.println("Introduce un angulo entre 0 y 360");
                 ang = T.nextDouble() ;
                 ang = Math.toRadians(ang);
                 tan = Math.tan(ang);
                 System.out.println("La tangente del angulo es " + tan);
                 break ;
                 
             default :
                 System.out.println("HASTA PRONTO");
            
         
                 
                 
         }
         
    }
    
    
}

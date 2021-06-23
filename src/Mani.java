
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermolp
 */

public class Mani {
 
   public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("--------------------------------");
          System.out.println("CALCULAR LA AREA DE EL CUADRADO");
         Cuadrado cu = new Cuadrado();
       int x1,x2,x3,x4,y1,y2,y3,y4;
          System.out.println("Introuduce el valor de el primer verice ");
          System.out.println("Valor de la x:");
          x1= sc.nextInt();
          System.out.println("Valor de  la y :");
          y1 =sc.nextInt();
          System.out.println("Introuduce el valor de el segundo verice ");
          System.out.println("Valor de la x:");
          x2= sc.nextInt();
          System.out.println("Valor de  la y :");
          y2 =sc.nextInt();
          System.out.println("Introuduce el valor de el tercero verice ");
          System.out.println("Valor de la x:");
          x3= sc.nextInt();
          System.out.println("Valor de  la y :");
          y3=sc.nextInt();
          System.out.println("Introuduce el valor de el cuato verice ");
          System.out.println("Valor de la x:");
          x4= sc.nextInt();
          System.out.println("Valor de  la y :");
          y4=sc.nextInt();
           cu= new Cuadrado(x1,x2,x3,x4,y1,y2,y3,y4); 
     
        System.out.println("Area de el cuadrado es :"+ cu.getAreaCu());
         System.out.println("--------------------------------");
          System.out.println("CALCULAR LA AREA DE EL RECTANGULO");
         
       Rectangulo re = new Rectangulo();
        int x1r,x2r,x3r,x4r,y1r,y2r,y3r,y4r;
          System.out.println("Introuduce el valor de el primer verice ");
          System.out.println("Valor de la x:");
          x1r= sc.nextInt();
          System.out.println("Valor de  la y :");
          y1r =sc.nextInt();
          System.out.println("Introuduce el valor de el segundo verice ");
          System.out.println("Valor de la x:");
          x2r= sc.nextInt();
          System.out.println("Valor de  la y :");
          y2r=sc.nextInt();
          System.out.println("Introuduce el valor de el tercero verice ");
          System.out.println("Valor de la x:");
          x3r= sc.nextInt();
          System.out.println("Valor de  la y :");
          y3r=sc.nextInt();
          System.out.println("Introuduce el valor de el cuato verice ");
          System.out.println("Valor de la x:");
          x4r= sc.nextInt();
          System.out.println("Valor de  la y :");
          y4r=sc.nextInt();
           re= new Rectangulo(x1r,x2r,x3r,x4r,y1r,y2r,y3r,y4r);
     
        System.out.println("Area de el Rectangulo es :"+ re.getAreaRe());
        
         System.out.println("--------------------------------");
          System.out.println("CALCULAR LA AREA DE EL TRAPECIO");
          
           
          Trapecio tra = new Trapecio();
           int x1t,x2t,x3t,x4t, y1t,y2t,y3t,y4t;
             System.out.println("Introuduce el valor de el primer verice ");
          System.out.println("Valor de la x:");
          x1t= sc.nextInt();
          System.out.println("Valor de  la y :");
          y1t =sc.nextInt();
          System.out.println("Introuduce el valor de el segundo verice ");
          System.out.println("Valor de la x:");
          x2t= sc.nextInt();
          System.out.println("Valor de  la y :");
          y2t=sc.nextInt();
          System.out.println("Introuduce el valor de el tercero verice ");
          System.out.println("Valor de la x:");
          x3t= sc.nextInt();
          System.out.println("Valor de  la y :");
          y3t=sc.nextInt();
          System.out.println("Introuduce el valor de el cuato verice ");
          System.out.println("Valor de la x:");
          x4t= sc.nextInt();
          System.out.println("Valor de  la y :");
          y4t=sc.nextInt();
         
      
          tra= new Trapecio( x1t,x2t,x3t,x4t, y1t,y2t,y3t,y4t);
          
          System.out.println("Area de Trapecio :" + tra.getAreaTra());
       
    
       }
} 

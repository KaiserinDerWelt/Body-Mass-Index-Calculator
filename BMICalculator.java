/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionnutricional;

import java.util.Scanner;

/**
 *
 * @author marianalicona
 */
public class EvaluacionNutricional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
      // TODO code application logic here
      //Aqui comenzare a hacer los arreglos unidimensionales
        //ARREGLO NOMBRES
        String Nombres [] = {"Mariana", "Cinthya", "Sebastian", "Miguel", "Elia", "Justino", "Jorge", "Lucas", "Mateo","Esther"};
        //SOLICITUD DE DATOS
        
        //SOLICITUD DE DATOS PRIMER PARTICIPANTE
        int Edad0;
        Scanner EdadMariana= new Scanner(System.in);
        System.out.print("Por favor ingrese la edad del 1er participante:");
        Edad0= EdadMariana.nextInt();
        
        double Altura0;
        Scanner AlturaP1 = new Scanner (System.in);
        System.out.print("Ingrese la estatura en metros del 1er participante: ");
        Altura0= AlturaP1.nextDouble();
        
        double Peso0;
        Scanner PesoP1= new Scanner (System.in);
        System.out.print("Ingrese el peso en kg del 1er participante");
        Peso0= PesoP1.nextDouble();
        //ARREGLO 
        System.out.print(Nombres [0]+" Tiene una edad de: ");
        System.out.print(Edad0);
        
      

        //SOLICITUD DE DATOS 2DO PARTICIPANTE
        int Edad1;
        Scanner EdadCinthya= new Scanner (System.in);
        System.out.print("Por favor ingrese la edad del 2do participante:");
        Edad1= EdadCinthya.nextInt();
        
        double Altura1;
        Scanner AlturaP2 = new Scanner (System.in);
        System.out.print("Por favor ingrese la altura en metros del 2do participante: ");
        Altura1= AlturaP2.nextDouble();
        
        double Peso1;
        Scanner PesoP2 = new Scanner (System.in);
        System.out.print("Por favor ingrese el peso en kg del 2do participante:");
        Peso1= PesoP2.nextDouble();
        
        //SOLICITUD DE DATOS 3RO PARTICIPANTE
        int Edad2;
        Scanner EdadSebastian= new Scanner(System.in);
        System.out.print("Por favor ingrese la edad del 3er participante:");
        Edad2= EdadSebastian.nextInt();
        
         double Altura2;
        Scanner AlturaP3 = new Scanner (System.in);
        System.out.print("Por favor ingrese la altura en metros del 3er participante: ");
        Altura1= AlturaP3.nextDouble();
        
        double Peso2;
        Scanner PesoP3 = new Scanner (System.in);
        System.out.print("Por favor ingrese el peso en kg del 3er participante:");
        Peso1= PesoP3.nextDouble();
       
        //SOLICITUD DE DATOS 4TO PARTICIPANTE
        int Edad3;
        Scanner EdadMiguel =new Scanner(System.in);
        System.out.print(" Por favor ingrese la edad del 4to participante:");
        Edad3= EdadMiguel.nextInt();
        
         double Altura3;
        Scanner AlturaP4 = new Scanner (System.in);
        System.out.print("Por favor ingrese la altura en metros del 4to participante: ");
        Altura1= AlturaP4.nextDouble();
        
        double Peso3;
        Scanner PesoP4 = new Scanner (System.in);
        System.out.print("Por favor ingrese el peso en kg del 4to participante:");
        Peso1= PesoP4.nextDouble();
        
        //SOLICITUD DE DATOS 5TO PARTICIPANTE
        int Edad4;
        Scanner EdadElia =new Scanner (System.in);
        System.out.print("Porfavor ingrese la edad del 5to participante:");
        Edad4= EdadElia.nextInt();
        
        double Altura4;
        Scanner AlturaP5 = new Scanner (System.in);
        System.out.print("Por favor ingrese la altura en metros del 5to participante: ");
        Altura1= AlturaP5.nextDouble();
        
        double Peso4;
        Scanner PesoP5 = new Scanner (System.in);
        System.out.print("Por favor ingrese el peso en kg del 5to participante:");
        Peso1= PesoP5.nextDouble();
        
        //SOLICITUD DE DATOS 6TO PARTICIPANTE
        int Edad5;
        Scanner EdadJustino= new Scanner (System.in);
        System.out.print("Por favor ingrese la edad del 6to participante:");
        Edad5= EdadJustino.nextInt();
        
        double Altura5;
        Scanner AlturaP6 = new Scanner (System.in);
        System.out.print("Por favor ingrese la altura en metros del 6to participante: ");
        Altura1= AlturaP5.nextDouble();
        
        double Peso5;
        Scanner PesoP6 = new Scanner (System.in);
        System.out.print("Por favor ingrese el peso en kg del 6to participante:");
        Peso1= PesoP6.nextDouble();
        
        //SOLICITUD DE DATOS 7MO PARTICIPANTE
        int Edad6;
        Scanner EdadJorge =new Scanner(System.in);
        System.out.print("Por favor ingrese la edad del 7mo participante:");
        Edad6=  EdadJorge.nextInt();
        
        double Altura6;
        Scanner AlturaP7 = new Scanner (System.in);
        System.out.print("Por favor ingrese la altura en metros del 7mo participante: ");
        Altura1= AlturaP7.nextDouble();
        
        double Peso6;
        Scanner PesoP7 = new Scanner (System.in);
        System.out.print("Por favor ingrese el peso en kg del 7mo participante:");
        Peso1= PesoP7.nextDouble();
        
        //SOLICITUD DE DATOS 8V0 PARTICIPANTE
        int Edad7;
        Scanner EdadLucas = new Scanner(System.in);
        System.out.print("Por favor ingrese la edad del 8vo participante:");
        Edad7= EdadLucas.nextInt();
        
        double Altura7;
        Scanner AlturaP8 = new Scanner (System.in);
        System.out.print("Por favor ingrese la altura en metros del 8vo participante: ");
        Altura1= AlturaP8.nextDouble();
        
        double Peso7;
        Scanner PesoP9 = new Scanner (System.in);
        System.out.print("Por favor ingrese el peso en kg del 8vo participante:");
        Peso1= PesoP9.nextDouble();
        
        //SOLICITUD DE DATOS 9NO PARTICIPANTE
        int Edad8;
        Scanner EdadMateo =new Scanner(System.in);
        System.out.print("Por favor ingrese la edad del 9no participante:");
        Edad8= EdadMateo.nextInt();
        
        double Altura8;
        Scanner AlturaP9 = new Scanner (System.in);
        System.out.print("Por favor ingrese la altura en metros del 9no participante: ");
        Altura1= AlturaP9.nextDouble();
        
        double Peso8;
        Scanner PesoP10 = new Scanner (System.in);
        System.out.print("Por favor ingrese el peso en kg del 9no participante:");
        Peso1= PesoP10.nextDouble();
        
        //SOLICITUD DE DATOS 10MO PARTICIPANTE
        int Edad9;
        Scanner EdadEsther =new Scanner(System.in);
        System.out.print("Porfavor ingrese la edad del 10mo participante:");
        Edad9= EdadEsther.nextInt();
        
        double Altura9;
        Scanner AlturaP11 = new Scanner (System.in);
        System.out.print("Por favor ingrese la altura en metros del 10mo participante: ");
        Altura1= AlturaP9.nextDouble();
        
        double Peso9;
        Scanner PesoP11 = new Scanner (System.in);
        System.out.print("Por favor ingrese el peso en kg del 10mo participante:");
        Peso1= PesoP11.nextDouble();
        
    }
    }


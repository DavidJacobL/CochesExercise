public class ClaseCoches
  {
    
    public static void main(String[] args)
    {
     
        
/**
 *
 * @author DAVID JACOB LÓPEZ
 * 5090-17-12655
 */
        
        
        
      //INSTANCIAMOS LOS COCHES DENTRO DEL VOID PRINCIPAL
      Coche coche1 = new Coche();
      Coche coche2 = new Coche();
      Coche coche3 = new Coche();
      Coche coche4 = new Coche();
    
   
      
      //ASIGNAMOS LOS ATRIBUTOS A CADA COCHE.
      coche1.marca = "Mazda";
      coche1.modelo = "CX5 2019";
      coche1.color = "Gris";
      coche1.numDoors = 4;
      coche1.cntKM = 100;
      coche1.speed = 150;
       coche1.price = 200000;
      coche1.placa ="P 536FPL";
      coche1.power = false;
      
       coche2.marca = "Honda";
      coche2.modelo = "Civic Type R 2019";
      coche2.color = "Negro";
      coche2.numDoors = 4;
      coche2.cntKM = 150;
      coche2.speed = 250;
        coche2.price = 250000;
      coche2.placa ="P 953VCJ";
      coche2.power = true;
      
      coche3.marca = "Aston Martin ";
      coche3.modelo = "Vantaje 2019";
      coche3.color = "Blanco";
      coche3.numDoors = 2;
      coche3.cntKM = 1000;
      coche3.speed = 60;
        coche3.price = 1200000;
      coche3.placa ="P 640LKA";
      coche3.power = false;
      
      
      coche4.marca = "Toyota";
      coche4.modelo = "Fortuner 2019";
      coche4.color = "Negro";
      coche4.numDoors = 4;
      coche4.cntKM = 500;
      coche4.speed = 100;
        coche4.price = 300000;
      coche4.placa ="P 862GGG";
      coche4.power = true;
      
    
      
      
      
   
        /*DESPLEGAMOS EN PANTALLA LOS DATOS DEL COCHE 1, Y ASI SUSECIVAMENTE 
            PARA LOS DEMÁS COCHES
      */
      
         System.out.println("\t\n============ COCHE # 1 ============\t\n");
      //COCHE 1  
      System.out.println("Marca: " +coche1.marca);
      System.out.println("Modelo: " + coche1.modelo);
      System.out.println("Color: " + coche1.color);
      System.out.println("No. de Puertas: " + coche1.numDoors);
      System.out.println("KM Recorridos: "+coche1.cntKM);
      System.out.println("Velocidad: " +coche1.speed);
       System.out.println("Precio: Q." +coche1.price);
        System.out.println("Placa: " +coche1.placa);
      System.out.println("¿Encendido?: " + coche1.power);
      
      
       
         System.out.println("\t\n============ COCHE # 2 ============\t\n");
       
         //COCHE 2 
         System.out.println("Marca: " +coche2.marca);
      System.out.println("Modelo: " + coche2.modelo);
      System.out.println("Color: " + coche2.color);
      System.out.println("No. de Puertas: " + coche2.numDoors);
      System.out.println("KM Recorridos: "+coche2.cntKM);
      System.out.println("Velocidad: " +coche2.speed);
        System.out.println("Precio: Q." +coche2.price);
        System.out.println("Placa: " +coche2.placa);
      System.out.println("¿Encendido?: " + coche2.power);
      
      
         System.out.println("\t\n============ COCHE # 3 ============\t\n");
      
         //COCHE 3  
         System.out.println("Marca: " +coche3.marca);
      System.out.println("Modelo: " + coche3.modelo);
      System.out.println("Color: " + coche3.color);
      System.out.println("No. de Puertas: " + coche3.numDoors);
      System.out.println("KM Recorridos: "+coche3.cntKM);
      System.out.println("Velocidad: " +coche3.speed);
        System.out.println("Precio: Q." +coche3.price);
        System.out.println("Placa: " +coche3.placa);
      System.out.println("¿Encendido?: " + coche3.power);
      
  
         System.out.println("\t\n============ COCHE # 4 ============\t\n");
      
         //COCHE 4  
      System.out.println("Marca: " +coche4.marca);
      System.out.println("Modelo: " + coche4.modelo);
      System.out.println("Color: " + coche4.color);
      System.out.println("No. de Puertas: " + coche4.numDoors);
      System.out.println("KM Recorridos: "+coche4.cntKM);
      System.out.println("Velocidad: " +coche4.speed);
        System.out.println("Precio: Q." +coche4.price);
        System.out.println("Placa: " +coche4.placa);
      System.out.println("¿Encendido?: " + coche4.power);
      
      
      
  //==============================LLAMANDO A LOS MÉTODOS DENTRO DE LA CLASE COCHE ==========================================================
      //COCHE 1
  
         System.out.println("\t\n============ COCHE #1 ============\t\n");
      coche1.arrancar();
      System.out.println(coche1.power);
      coche1.acelerar();
      System.out.println(coche1.speed);
      coche1.acelerar();
      System.out.println(coche1.speed);    
      coche1.acelerar();
      System.out.println(coche1.speed);    
      coche1.frenar();
      System.out.println(coche1.speed);    
      coche1.frenar();
      System.out.println(coche1.speed);    
      coche1.frenar();
      System.out.println(coche1.speed);
      coche1.parar();
      System.out.println(coche1.power);
       coche1.claxon();
      coche1.consultarCuentaKilometros();
    
     
         System.out.println("\t\n============ COCHE #2 ============\t\n");
        //COCHE 2
      coche2.arrancar();
      System.out.println(coche2.power);
      coche2.acelerar();
      System.out.println(coche2.speed);
      coche2.acelerar();
      System.out.println(coche2.speed);    
      coche2.acelerar();
      System.out.println(coche2.speed);    
      coche2.frenar();
      System.out.println(coche2.speed);    
      coche2.frenar();
      System.out.println(coche2.speed);    
      coche2.frenar();
      System.out.println(coche2.speed);
      coche2.parar();
      System.out.println(coche2.power);
      coche2.claxon();
      coche2.consultarCuentaKilometros();
    
  
         System.out.println("\t\n============ COCHE #3 ============\t\n");   
        //COCHE 3
      coche3.arrancar();
      System.out.println(coche3.power);
      coche3.acelerar();
      System.out.println(coche3.speed);
      coche3.acelerar();
      System.out.println(coche3.speed);    
      coche3.acelerar();
      System.out.println(coche3.speed);    
      coche3.frenar();
      System.out.println(coche3.speed);    
      coche3.frenar();
      System.out.println(coche3.speed);    
      coche3.frenar();
      System.out.println(coche3.speed);
      coche3.parar();
      System.out.println(coche3.power);
     coche3.claxon();
      coche3.consultarCuentaKilometros();
    
             
         System.out.println("\t\n============ COCHE #4 ============\t\n");
      
        //COCHE 4
      coche4.arrancar();
      System.out.println(coche4.power);
      coche4.acelerar();
      System.out.println(coche4.speed);
      coche4.acelerar();
      System.out.println(coche4.speed);    
      coche4.acelerar();
      System.out.println(coche4.speed);    
      coche4.frenar();
      System.out.println(coche4.speed);    
      coche4.frenar();
      System.out.println(coche4.speed);    
      coche4.frenar();
      System.out.println(coche4.speed);
      coche4.parar();
      System.out.println(coche4.power);
      coche4.claxon();
      coche4.consultarCuentaKilometros();
    
      
    
    }
  }


class Coche
{
    
       /*DEFINIMOS LOS ATRIBUTOS QUE TENDRAN LOS COCHES, EN ESTE CASO:
      -MARCA
      -MODELO
      -COLOR
      -NÚMERO DE PUERTAS
      -VELOCIDAD
      -CONTADOR DE KILÓMETROS
      -Y UNA VARIABLE TIPO BOOLEAN QUE MOSTRARÁ SI EL COCHE ESTA ARRANCADO O NO.
      */
    
  String marca;
  String modelo;
  String color;
  String placa;
  int numDoors;
  int cntKM;
  int speed;
  double price;
  
  boolean power;
  
  void arrancar()
  {
   power = true;
  }
  
  void parar()
  {
    power = false;
  }
  
  void acelerar()
  {
    speed = speed + 1;
  }
  
  void frenar()
  {
     speed =  speed - 1;
  }
  
  void claxon()
  {
    System.out.println("Piiiiiiiiiiiiiiiiiip");
  }
  
  int consultarCuentaKilometros()
  {
    return cntKM;
  }
}



























































        
/**
 *
 * @author DAVID JACOB LÓPEZ
 * 5090-17-12655
 */
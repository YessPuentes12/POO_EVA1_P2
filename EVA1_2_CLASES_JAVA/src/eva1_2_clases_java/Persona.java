/*

 */
package eva1_2_clases_java;

/**

 */
public class Persona {
   String nombre;
   String apellido;
   int edad;
   boolean estadoCivil;
  //MÉTODOS: Comportamiento
  //Lectura y escritura de atributos
  //Método get --> leer   Método set --> escribir
  //Métodos:
  //Modificador valor de entorno nombre(argumento) [implementos]
   
 //-----------------------------------------------------------------------------
   public String getNombre(){
     return nombre;
   }
  public void setNombre(String valor){
  nombre = valor;
  } 
  //-----------------------------------------------------------------------------
  public String getApellido(){
    return apellido;
  }
  public void setApellido(String valor){
     apellido = valor;
  }
  //-----------------------------------------------------------------------------
     public int getEdad(){
   return edad;    
   }
  public void setEdad(int valor){
  edad = valor;
  }
  //-----------------------------------------------------------------------------
  public boolean getEstadoCivil(){
   return estadoCivil;
  }
  public void setEstadoCivil(boolean valor){
      estadoCivil = valor;
  }
 //-----------------------------------------------------------------------------
  public void imprimirDatos(){
   System.out.println("Datos almacenados:");
   System.out.println("\nNombre completo: " +nombre+ " " +apellido+ "\nEdad: " +edad);
   if (estadoCivil){
   System.out.println("Estado civil: Casad@" );   
   } else {
   System.out.println("Estado civil: Solter@");
   }
   
 }
  
  
  
  
  
}


/*

 */
package eva1_2_clases_java;

 //Persona() --> constructor;
 //constructor --> método
public class EVA1_2_CLASES_JAVA {


    public static void main(String[] args) {
      /*
      //CLASE ES LA RECETA:
      //OBJETO ES EL PLATILLO
      //INSTANCIACIÓN:
      //1. Declarar identificador para el objeto
      //2. Asignar memoria con new
      //3. Invocar su constructor
      
    perso1.nombre = "Yessly";
    perso1.apellido = "Mayorga";
    perso1.edad = 18;
    perso1.estadoCivil = false; //True = casad@    False = solter@
    System.out.println("Nombre = " +perso1.nombre); */
      
      Persona perso1 = new Persona();
      
 //----------------------------------------------------------------------------- 
 
       perso1.setNombre("Yessly");
       perso1.setApellido("Mayorga Puentes");
       perso1.setEdad(18);
       perso1.setEstadoCivil(false);
       perso1.imprimirDatos();
       
 //----------------------------------------------------------------------------- 
     //PERSONA 2
     
   Persona perso2 = new Persona();  
     perso2.setNombre("Juan");
     perso2.setApellido("Perez Jolote");
     perso2.setEdad(50);
     perso2.setEstadoCivil(true);
     perso2.imprimirDatos();
     
 //-----------------------------------------------------------------------------      
      
    }
    
}

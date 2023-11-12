package iso_bc01;
import iso_bc01.Presentacion.*;
import iso_bc01.Dominio.*;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Bienvenido a nuestra aplicación: " );
        registrarse();

    }

    public static void registrarse(){
         IU_Registrarse login = new IU_Registrarse();
         Usuario user = login.Registrarse("Juan","Juanito13@gmail.com","12345abc","Calle de la piruleta 13");
         System.out.println("Usuario registrado con éxito");  
    }


}

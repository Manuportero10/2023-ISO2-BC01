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

        implementacion_iteracion2();


    }

    public static void registrarse(){
         IU_Registrarse login = new IU_Registrarse();
         Usuario user = login.Registrarse("Juan","Juanito13@gmail.com","12345abc","Calle de la piruleta 13");
         System.out.println("Usuario registrado con éxito");  
    }

    public static void implementacion_iteracion2(){
        IU_Registrarse login = new IU_Registrarse();
        Usuario user = login.RegistraeseComoOrganizadorDeEventos(null);
        System.out.println("Usuario registrado con éxito");
        IU_Evento interfaz_eventos = new IU_Evento();
        
        // A CONTINUACIÓN SE MUESTRAN LOS MÉTODOS DE LA CLASE IU_Evento a forma de ejemplo de su funcionamiento.
        interfaz_eventos.anadirEvento("12/12/2020","Fiesta de cumpleaños","Fiesta de cumpleaños de Juan", 20);
        System.out.println("Evento añadido con éxito");
        interfaz_eventos.borrarEvento(1);
        System.out.println("Evento borrado con éxito");
        interfaz_eventos.editarEvento();
        System.out.println("Evento editado con éxito");
        interfaz_eventos.mostrarInfo();
        System.out.println("Información mostrada con éxito");
    }


}

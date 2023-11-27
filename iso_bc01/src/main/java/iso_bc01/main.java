package iso_bc01;
import iso_bc01.Presentacion.*;
import iso_bc01.Dominio.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        //implementacion_iteracion1();
        System.out.println( "Bienvenido a nuestra aplicación: " );
        registrarse();

        //implementacion_iteracion2();
        implementacion_iteracion2();

        //implementacion_iteracion3();
	    implementacion_iteracion3();

        //implementacion_iteracion4();
        List<Evento> lista_Eventos = implementacion_iteracion4();
        if(lista_Eventos.isEmpty()) //Aplicamos control de Errores (gestión de calidad) 
            System.out.println("No hay eventos");   




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

    public static void implementacion_iteracion3() {
        IU_Evento interfaz_eventos = new IU_Evento();
       Evento evento = new Evento(0, null, null, null, null);
        interfaz_eventos.anadirEvento("12/12/2020","Fiesta de cumpleaños","Fiesta de cumpleaños de Juan", 20);
        interfaz_eventos.click_abrir_evento(evento);

        if (evento.abrirEvento() == true) {
            System.out.println("Evento abierto con éxito");
        } else {
            System.out.println("No se ha podido abrir el evento");
        }

        //si queremos cerrar el evento
        interfaz_eventos.click_cerrar_evento(evento);
        if (evento.cerrarEvento() == true) {
            System.out.println("Evento cerrado con éxito");
        } else {
            System.out.println("No se ha podido cerrar el evento");
            
        }
    }

    public static List<Evento> implementacion_iteracion4() {
        IU_Evento interfaz_eventos = new IU_Evento();

        Evento evento = new Evento(0, null, null, null, null);
        interfaz_eventos.anadirEvento("12/12/2020","Fiesta de cumpleaños","Fiesta de cumpleaños de Juan", 20);
        interfaz_eventos.click_abrir_evento(evento);

        interfaz_eventos.click_consultar_eventos(evento);
        List<Evento> lista_Eventos = new ArrayList<Evento>();
        controlEvento control = new controlEvento();
        lista_Eventos = control.consulta_eventos(evento);

        interfaz_eventos.mostrarEvento(lista_Eventos);
        return lista_Eventos; 
    }

    public static boolean implementacion_iteracion5() {
        IU_Evento interfaz_eventos = new IU_Evento();
 
        Evento evento = new Evento(0, null, null, null, null);
        Asistente asistente = new Asistente(null,null,null,0,null,null,null,null,1);
        boolean valido = interfaz_eventos.registrarseEvento(evento,asistente);
     
        if (valido == true) {
            System.out.println("Registrado");
        } else {
            System.out.println("No registrado");
            
        }
        
    }


}
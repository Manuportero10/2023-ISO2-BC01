package iso_bc01;
import iso_bc01.Presentacion.*;
import iso_bc01.Dominio.*;
import java.util.*;


public class main 
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

        //implementacion_iteracion5();
        implementacion_iteracion5();

        //implementacion iteracion 6
        implementacion_iteracion6();

        //implementacion iteracion 7
        implementacion_iteracion7();

    }

    public static void registrarse(){
        Usuario usuario = new Usuario();
         IU_Registrarse login = new IU_Registrarse();
         Usuario user = login.RegistrarseComoAsistente(usuario,"Juanito13@gmail.com","calle de la piruleta 13");
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

    public static void implementacion_iteracion5() {
        IU_Evento interfaz_eventos = new IU_Evento();
 
        Evento evento = new Evento(0, null, null, null, null);
        Asistente asistente = new Asistente(); //Creamos al asistente con los datos necesarios
        boolean valido = interfaz_eventos.RegistrarseEvento(evento,asistente);

        if (valido == true) { //control de errores
            interfaz_eventos.MostrarMensaje("Registrado");
        } else {
            interfaz_eventos.MostrarMensajeError("No registrado - Error");  
        }
        
    }

    public static void implementacion_iteracion6(){
        Alumno alumno = new Alumno();
        IU_AsignarAlumno I_alumno = new IU_AsignarAlumno("a345","1235");
        boolean esValido = controlAsignar.comprobar_alumno("a354");

        if (esValido) { //control de errores
            controlAsignar.asignar_evento_a_alumno("a345","1235");
        }
        else {
            System.out.println("Alumno no valido");
        }
        Profesor profesor = new Profesor();
        IU_AsignarProfesor I_prof = new IU_AsignarProfesor("p456","1235");
        esValido = controlAsignar.comprobar_profesor("p456");

        if (esValido) {
            controlAsignar.asignar_evento_a_profesor("p456","1235");
        }
        else {
            System.out.println("Profesor no valido");
        }

    }

    public static void implementacion_iteracion7(){
        // implementación de la iteración 7 - Solicitar certificado
        IU_Evento interfaz_eventos = new IU_Evento();
        Evento evento = new Evento(0, null, null, null, null);
        Asistente asistente = new Asistente(); //Creamos al asistente con los datos necesarios
        boolean valido = interfaz_eventos.RegistrarseEvento(evento,asistente);

        if (valido == true) { //control de errores
            interfaz_eventos.MostrarMensaje("Registrado");
        } else {
            interfaz_eventos.MostrarMensajeError("No registrado - Error");  
        }
        interfaz_eventos.click_solicitar_certificado(evento,asistente);
        interfaz_eventos.MostrarMensaje("Certificado solicitado");
        interfaz_eventos.mostrarCertificado(evento, asistente); //mostramos el certificado
    }



}

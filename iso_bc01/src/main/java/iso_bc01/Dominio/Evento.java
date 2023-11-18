package Diagrama_de_clases.Dominio;

public class Evento {

	private int id;
	private Date fecha;
	private String nombre;
	private String descripcion;
	private Asistente[] asistentes;

	/**
	 * 
	 * @param id
	 * @param fecha
	 * @param nombre
	 * @param descripcion
	 * @param asistentes
	 */
	public Evento(int id, Date fecha, String nombre, String descripcion, Asistente[] asistentes) {
		// TODO - implement Evento.Evento
		throw new UnsupportedOperationException();
	}

	public int getID() {
		// TODO - implement Evento.getID
		throw new UnsupportedOperationException();
	}

	public date getFecha() {
		// TODO - implement Evento.getFecha
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String gestDescripcion() {
		// TODO - implement Evento.gestDescripcion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void setID(int id) {
		// TODO - implement Evento.setID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
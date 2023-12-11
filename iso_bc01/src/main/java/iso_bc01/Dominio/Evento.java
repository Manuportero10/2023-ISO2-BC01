package iso_bc01.Dominio;

public class Evento {

	private int id;
	private String fecha;
	private String nombre;
	private String descripcion;
	private Asistente[] asistentes;
	private boolean abierto;

	/**
	 * 
	 * @param id
	 * @param fecha
	 * @param nombre
	 * @param descripcion
	 * @param asistentes
	 */
	public Evento(int id, String fecha, String nombre, String descripcion, Asistente[] asistentes) {
		// TODO - implement Evento.Evento
		throw new UnsupportedOperationException();
	}

	public int getID() {
		// TODO - implement Evento.getID
		throw new UnsupportedOperationException();
	}

	public String getFecha() {
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
	public void setFecha(String fecha) {
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

	public boolean abrirEvento() {
		// TODO - implement Evento.abrirEvento
		throw new UnsupportedOperationException();
	}

	public boolean cerrarEvento() {
		// TODO - implement Evento.cerrarEvento
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param a
	 */
	public boolean registrarse(Asistente a) {
		// TODO - implement Evento.registrarse
		throw new UnsupportedOperationException();
	}

	public boolean generar_estadisticas() {
		// TODO - implement Evento.generar_estadisticas
		throw new UnsupportedOperationException();
	}

}
package principal;

import java.util.Date;

public class Grupo {

	private String nombre;
	private String estilo;
	private int n_miembros;
	
	
	public Grupo(String nombre, String estilo, int n_miembros) {
		super();
		this.nombre = nombre;
		this.estilo = estilo;
		this.n_miembros = n_miembros;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public int getN_miembros() {
		return n_miembros;
	}
	public void setN_miembros(int n_miembros) {
		this.n_miembros = n_miembros;
	}
	
	
	
}

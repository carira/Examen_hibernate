package principal;
import java.util.Date;
public class Festival {
	
	private String nombre;
	private String lugar;
	private String fecha_ini;
	private String fecha_fin;
	
	
	public Festival(String nombre, String lugar, String fecha_ini, String fecha_fin) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public String getFecha_ini() {
		return fecha_ini;
	}


	public void setFecha_ini(String fecha_ini) {
		this.fecha_ini = fecha_ini;
	}


	public String getFecha_fin() {
		return fecha_fin;
	}


	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	
	
	
}

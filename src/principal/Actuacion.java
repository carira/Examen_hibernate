package principal;

public class Actuacion {

	private int Id;
	private String escenario;
	private String hora;
	
	
	public Actuacion(String escenario, String hora) {
		
		this.escenario = escenario;
		this.hora = hora;
		
		
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getEscenario() {
		return escenario;
	}


	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
	
	
	
	
}


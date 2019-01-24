package principal;


import java.util.Calendar;
import java.util.Date;
import org.hibernate.Session;


public class Principal {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------");
		System.out.println("creando");
		System.out.println("-------------------------------------");
		
		System.out.println("\n"+"\n"+"\n");
		
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
	
	
	cargarTablas(session);
	recuperarDatos(session);
	
	session.close();
	HibernateUtilities.getSessionFactory().close();
	
}

private static void cargarTablas(Session session) {
	
	session.beginTransaction();
	Festival fes1 = new Festival("Rototom", "Castello","10 de Agost", "18 de Agost");
	Festival fes2 = new Festival("Viñaroc", "castellon","2 de Maig", "6 de Maig");
	
	Actuacion act1 = new Actuacion("Principal","17:30");
	Actuacion act2 = new Actuacion("Cubierto","13:00");
	
	Grupo grp1 = new Grupo("Doble V", "RAP", 5);
	Grupo grp2 = new Grupo("Pepinos", "Rock", 4);
	 
	session.saveOrUpdate(fes1);
	session.saveOrUpdate(act1);
	session.saveOrUpdate(grp1);

	session.saveOrUpdate(fes2);
	session.saveOrUpdate(act2);
	session.saveOrUpdate(grp2);
	session.getTransaction().commit();
	
}

private static void recuperarDatos(Session session) {
	session.beginTransaction();
	Festival fes1 = session.get(Festival.class, "Rototom");
	Actuacion act1 = session.get(Actuacion.class, 1);
	Grupo grp1 = session.get(Grupo.class, "Doble V");
	
	Festival fes2 = session.get(Festival.class, "Viñaroc");
	Actuacion act2 = session.get(Actuacion.class, 2);
	Grupo grp2 = session.get(Grupo.class, "Pepinos");
	
	
	
	
	session.getTransaction().commit();
	
	
	
	
	
	System.out.println("\n"+"\n"+"\n" );
	System.out.println("-----------------------------------------------------------------------------" );
	System.out.println("Festival recuperada: "+fes1.getNombre()+"\n Lugar: "+fes1.getLugar()+"\n INICIO: "+fes1.getFecha_ini()+"\n FIN: "+fes1.getFecha_fin());
	System.out.println("Grupo recuperado: "+grp1.getNombre());
	System.out.println("Actuación recuperada: "+act1.getEscenario());
	System.out.println("-----------------------------------------------------------------------------" );
	System.out.println("\n");
	
	System.out.println("\n");
	System.out.println("-----------------------------------------------------------------------------" );
	System.out.println("Festival recuperada: "+fes2.getNombre()+"\n Lugar: "+fes2.getLugar()+"\n INICIO: "+fes2.getFecha_ini()+"\n FIN: "+fes2.getFecha_fin());
	System.out.println("Grupo recuperado: "+grp2.getNombre());
	System.out.println("Actuación recuperada: "+act2.getEscenario());
	System.out.println("-----------------------------------------------------------------------------" );
	System.out.println("\n"+"\n"+"\n" );
}

}
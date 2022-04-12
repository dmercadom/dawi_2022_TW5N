package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo01 {
	
	public static void main(String[] args) {
	
		Usuario u = new Usuario();
		u.setCodigo(10);
		u.setNombre("Daniel");
		u.setApellido("Mercado");
		u.setUsuario("dmercado@gmail.com");
		u.setClave("12345");
		u.setFchnacim("1981/10/13");
		u.setTipo(1);
		u.setEstado(1);
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion01");
		EntityManager em = fabrica.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(u);
		
		em.getTransaction().commit();
		
		em.close();
		
	}
	
}

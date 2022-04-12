package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {


	public static void main(String[] args) {
		
		Usuario u = new Usuario();
		u.setCodigo(10);
		u.setNombre("Luis");
		u.setApellido("Perez");
		u.setUsuario("lperez@gmail.com");
		u.setClave("12345");
		u.setFchnacim("1981/10/13");
		u.setTipo(2);
		u.setEstado(1);
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion01");
		EntityManager em = fabrica.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario ok = em.merge(u); //Actualizar si el codigo existe, sino existe lo agrega
		
		em.getTransaction().commit();
		
		em.close();
	}
}

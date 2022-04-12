package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

public class Proveedor {

	@Entity
	@Table(name = "tb_proveedor")
	@Data
	public class Categoria {
		@Id
		private int idprovedor;
		private String nombre_rs;
		private String telefono;
		private String email;
		
}
}
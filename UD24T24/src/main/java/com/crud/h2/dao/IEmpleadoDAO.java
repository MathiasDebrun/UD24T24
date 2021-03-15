package com.crud.h2.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Empleado;

/**
 * @author Jose
 *
 */
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	//Listar Empleados or campo nombre
	public List<Empleado> findByNombre(String nombre);

	public List<Empleado> findBytrabajo(String trabajo);
	
}

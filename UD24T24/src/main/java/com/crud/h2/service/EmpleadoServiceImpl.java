package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IEmpleadoDAO;
import com.crud.h2.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	//Utilizamos los metodos de la interface IEmpleadoDAO, es como si instaciaramos.
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado Empleado) {
		
		return iEmpleadoDAO.save(Empleado);
	}

	@Override
	public Empleado EmpleadoXID(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}
	@Override

	public List<Empleado> listarEmpleadoXTrabajo(String trabajo) {
		return iEmpleadoDAO.findBytrabajo(trabajo);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado Empleado) {
		
		return iEmpleadoDAO.save(Empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}


	@Override
	public List<Empleado> listarEmpleadoNomnbre(String nombre) {
		
		return iEmpleadoDAO.findByNombre(nombre);
	}

	@Override
	public List<Empleado> EmpleadoXTrabajo(String trabajo) {
		// TODO Auto-generated method stub
		return null;
	}

}

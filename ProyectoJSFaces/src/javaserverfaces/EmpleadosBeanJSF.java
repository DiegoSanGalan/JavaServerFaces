package javaserverfaces;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import services.employees.Operaciones;
import clasesDTOAutogeneradas.Employees;

@ManagedBean
@RequestScoped
public class EmpleadosBeanJSF {

	private Employees empleadoDTO;
	private int idEmp;

	/**
	 * @param empleadoDTO
	 */
	public EmpleadosBeanJSF(Employees empleadoDTO) {
		this.empleadoDTO = empleadoDTO;
	}

	/**
	 * 
	 */
	public EmpleadosBeanJSF() {
	
       //idEmp = 100;
		
	}

	/**
	 * @return the empleadoDTO
	 */
	public Employees getEmpleadoDTO() {
		return empleadoDTO;
	}

	/**
	 * @param empleadoDTO the empleadoDTO to set
	 */
	public void setEmpleadoDTO(Employees empleadoDTO) {
		this.empleadoDTO = empleadoDTO;
	}
	
	
	/**
	 * Método para obtener el empleado utilizando JavaServerFaces (JSF)
	 * @return String con el nombre del archivo xhtml al que enviamos
	 */
	public String obtenerEmpleadoID ()  //metodo que devuelve una lista de departamentos de la base de datos.
	{
		
		
		Operaciones oper = new Operaciones();
		
		this.empleadoDTO = oper.obtenerEmpleado(idEmp);
		
	
		
		return "mostrarEmpleado";
	}
	
	/**
	 * @return the idEmp
	 */
	public int getIdEmp() {
		return idEmp;
	}

	/**
	 * @param idEmp the idEmp to set
	 */
	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}

	public String mostrar ()
	{
		Operaciones oper = new Operaciones();
			
		this.empleadoDTO = oper.obtenerEmpleado(100);
		
		
		String vuelta ="";
		vuelta = "que pasa tio";
		
		return vuelta;
	}
	
	
}

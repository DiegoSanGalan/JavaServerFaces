package javaserverfaces;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import services.employees.Operaciones;
import clasesDTOAutogeneradas.Employees;

@ManagedBean
@RequestScoped
public class EmpleadosBeanJSF {

	private Employees empleadoDTO;
	private int idEmp;
	
	
	@ManagedProperty (value = "#{idDep}")
	private int idDep;
	private List<Employees> listaEmp;

	/**
	 * @param empleadoDTO
	 */
	public EmpleadosBeanJSF(Employees empleadoDTO) {
		this.empleadoDTO = empleadoDTO;
	}

	/**
	 * @return the idDep
	 */
	public int getIdDep() {
		return idDep;
	}

	/**
	 * @param idDep the idDep to set
	 */
	public void setIdDep(int idDep) {
		this.idDep = idDep;
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
	public void obtenerEmpleadoID ()  //metodo que devuelve una lista de departamentos de la base de datos.
	{
		
		
		Operaciones oper = new Operaciones();
		
		this.empleadoDTO = oper.obtenerEmpleado(idEmp);
		
	
		
		//return "mostrarEmpleado";
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

		
	public void empleadosPorDepartamento()
	{
		Operaciones oper = new Operaciones();
		//System.out.println(idDep);
		this.listaEmp = oper.obtenerEmpleadosPorDepartamento(idDep);
		
		//return null;
	}

	/**
	 * @return the listaEmp
	 */
	public List<Employees> getListaEmp() {
		return listaEmp;
	}

	/**
	 * @param listaEmp the listaEmp to set
	 */
	public void setListaEmp(List<Employees> listaEmp) {
		this.listaEmp = listaEmp;
	}
	
	
	public void valida (FacesContext context, UIComponent toValidate, Object value) throws ValidatorException
	  {
	  
	  System.out.println("El Valor pasado y verificado es =  " + idEmp);
	  String val_aux = value.toString();
	  if (!val_aux.contains("5"))
	  {
	  System.out.println("La palabra NO tenía a: validación hecha");
	  FacesMessage msg = new FacesMessage("La palabra debe contener al menos un 5");
	  msg.setSeverity(FacesMessage.SEVERITY_ERROR);
	  throw new ValidatorException(msg);  
	  } else 
	  {
	  System.out.println("La palabra tenía la: validación hecha");
	 
	  }
	  
	  }
	
	
	
}

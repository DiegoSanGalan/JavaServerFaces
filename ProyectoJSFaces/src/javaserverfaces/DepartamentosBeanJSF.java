package javaserverfaces;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import services.employees.Operaciones;

import clasesDTOAutogeneradas.Departments;
import clasesDTOAutogeneradas.Employees;


@ManagedBean
@SessionScoped
public class DepartamentosBeanJSF {

	private List<Departments> lista;
	private List<Employees> listaEmp;
	private int idDep; // para poder almacenar el elemento seleccionado de la lista de departamentos
	//private String ;
	private int idEmp;
	private Employees empDTO;
	
	

	/**
	 * @return the empDTO
	 */
	public Employees getEmpDTO() {
		return empDTO;
	}

	/**
	 * @param empDTO the empDTO to set
	 */
	public void setEmpDTO(Employees empDTO) {
		this.empDTO = empDTO;
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
	public DepartamentosBeanJSF() {
		
	}

	/**
	 * @param lista
	 */
	public DepartamentosBeanJSF(List<Departments> lista) {
		
		this.lista = lista;
	}

	/**
	 * @return the lista
	 */
	public List<Departments> getLista() {
		return lista;
	}

	/**
	 * @param lista the lista to set
	 */
	public void setLista(List<Departments> lista) {
		this.lista = lista;
	}
	
	
	@PostConstruct
	public void init ()  //metodo que devuelve una lista de departamentos de la base de datos.
	{
		Operaciones oper = new Operaciones();
		this.lista = oper.listaDepartamentos();
		
		
		
		/*Employees empDTO = new Employees();
		Operaciones oper = new Operaciones();
		
		empDTO = oper.obtenerEmpleado(150);*/
		
	}
	
	public void empleadosPorDepartamento()
	{
		Operaciones oper = new Operaciones();
		//System.out.println(idDep);
		this.listaEmp = oper.obtenerEmpleadosPorDepartamento(idDep);
		
		//return null;
	}
	
	/**
	 * Método para obtener el empleado utilizando JavaServerFaces (JSF)
	 * @return String con el nombre del archivo xhtml al que enviamos
	 */
	public void obtenerEmpleadoID ()  //metodo que devuelve una lista de departamentos de la base de datos.
	{
		Operaciones oper = new Operaciones();
		this.empDTO = oper.obtenerEmpleado(idEmp);
		//return "mostrarEmpleado";
	}
	
}

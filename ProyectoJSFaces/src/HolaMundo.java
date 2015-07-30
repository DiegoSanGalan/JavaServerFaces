

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HolaMundo {
	

	private String nombre;
	private int num;
	
	public HolaMundo()
	{
		
	}

	public String getNombre() {
		
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int longuitud()
	{
		return this.nombre.length();
	}
	
	public void mostrar ()
	{
		System.out.println(num);
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

}

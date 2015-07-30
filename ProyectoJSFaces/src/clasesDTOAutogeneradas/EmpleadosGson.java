package clasesDTOAutogeneradas;

import java.math.BigDecimal;
import java.util.Date;

public class EmpleadosGson {

	private int employeeId;
	//private Jobs jobs;
	//private Departments departments;
	//private Employees employees;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	//private Date hireDate;
	private BigDecimal salary;
	/**
	 * 
	 */
	public EmpleadosGson() {
		
	}
	//private BigDecimal commissionPct;
	/**
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phoneNumber
	 * @param salary
	 */
	public EmpleadosGson(int employeeId, String firstName, String lastName,
			String email, String phoneNumber, BigDecimal salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the salary
	 */
	public BigDecimal getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmpleadosGson [employeeId=" + employeeId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", salary=" + salary + "]";
	}
	
	
	
}

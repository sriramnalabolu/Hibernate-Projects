package in.ineuron.model;
// Generated 11-Apr-2024, 8:26:37 pm by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "employee", catalog = "firstdatabase")
public class Employee implements java.io.Serializable {

	/**
	 *
	 */
	
	private static final long serialVersionUID = 1L;


	public Employee() {
	}

	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String joiningDate;
	private String retiringDate;
	private String dept;

	
	public Employee(Integer id, String name, Integer age, String gender, String joiningDate, String retiringDate,
			String dept) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.joiningDate = joiningDate;
		this.retiringDate = retiringDate;
		this.dept = dept;
	}

	@Column(name = "id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "gender", length = 10)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "joining_date", length = 20)
	public String getJoiningDate() {
		return this.joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Column(name = "retiring_date", length = 20)
	public String getRetiringDate() {
		return this.retiringDate;
	}

	public void setRetiringDate(String retiringDate) {
		this.retiringDate = retiringDate;
	}

	@Column(name = "dept", length = 10)
	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", joiningDate="
				+ joiningDate + ", retiringDate=" + retiringDate + ", dept=" + dept + "]";
	}

}

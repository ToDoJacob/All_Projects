package co.jacob.exception;

public class Emp {
	int id;
	String name;
	String dept;
	
	//»ý¼ºÀÚ
	public Emp(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	//setter getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		Emp target = (Emp)obj;
//		return super.equals(obj);
		return this.id == target.id 
				&& this.name.equals(target.name);
	}

	
	//hashCode
	@Override
	public int hashCode() {
		return id + name.hashCode();
	}


	
	

}

package an.practice1.data1;

public class Data {
	
	private Long EmpId;
	private String Name;
	private String Domain;
	private String Company;
	
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Data(Long empId, String name, String domain, String company) {
		EmpId = empId;
		Name = name;
		Domain = domain;
		Company = company;
	}

	public Long getEmpId() {
		return EmpId;
	}

	public void setEmpId(Long empId) {
		EmpId = empId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDomain() {
		return Domain;
	}

	public void setDomain(String domain) {
		Domain = domain;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}
	
	

}

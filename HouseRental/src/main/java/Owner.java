
public class Owner {

	private String location;
	private String owner_name;
	private String contact_number;
	private String email;
	private String type;
	private String area;
	private String sp;
	private String rp;
	
	
	public Owner(String location, String owner_name, String contact_number, String email, String type, String area, String sp,
			String rp) {
		super();
		this.location = location;
		this.owner_name = owner_name;
		this.contact_number = contact_number;
		this.email = email;
		this.type = type;
		this.area = area;
		this.sp = sp;
		this.rp = rp;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSp() {
		return sp;
	}
	public void setSp(String sp) {
		this.sp = sp;
	}
	public String getRp() {
		return rp;
	}
	public void setRp(String rp) {
		this.rp = rp;
	}
	
	
}

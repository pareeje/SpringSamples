package paromita.com.springdemo;

public class Triangle {
	
	private String msg;
	private String type;
	
	public Triangle(String type){
		this.type = type;
	}
	
	public void draw(){
		System.out.println(getType() + " " + getMsg());
	}

	
	public String getType() {
		return type;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}

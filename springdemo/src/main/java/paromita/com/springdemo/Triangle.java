package paromita.com.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean {
	
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

	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialize called.");
	}
	
	public void destroy() throws Exception {
		System.out.println("Destroy called.");
		
	}

}

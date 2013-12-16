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
		System.out.println("InitializingBean Initialize called for Triangle.");
	}
	
	public void destroy() throws Exception {
		System.out.println("DisposableBean Destroy called for Triangle.");
		
	}

	public void myInit(){
		System.out.println("My init method called for Triangle.");
	}
	
	public void cleanUp(){
		System.out.println("My cleanup method called for Triangle.");
	}
}

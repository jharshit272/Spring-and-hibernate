package com.javatpoint;  
import javax.jws.WebService;  

//Service Implementation  

@WebService(endpointInterface = "com.javatpoint.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{  
	
	static int num = 10;
	
	@Override  
	public String getHelloWorldAsString(String name) {  
		return "Hello World JAX-WS " + name;  
		
	}

	@Override
	public String getHelloWorldAsString1(String name) {
		// TODO Auto-generated method stub
		System.out.println(num++);
		return "Hi";
	}  
}  
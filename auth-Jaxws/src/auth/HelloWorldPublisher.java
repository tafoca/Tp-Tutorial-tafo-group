package auth;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		String url = "http://localhost:8088/ws/hello";
		Endpoint.publish(url, new HelloWorldImpl());
		
		System.out.println(url);

	}

}

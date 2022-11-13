package service;

import javax.xml.ws.Endpoint;

public class MainUserPublish {

	public static void main(String[] args) {
		String url = "http://localhost:8086/ws/users";
		Endpoint.publish(url, new UserWSImpl());
		System.out.println(url);

	}

}

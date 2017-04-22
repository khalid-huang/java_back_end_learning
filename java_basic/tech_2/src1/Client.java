package client;

import service.test.*;

public class Client {
	public  static void main(String args[]) {
		Service service = new Service();
		System.out.println(service.run());
	}
}
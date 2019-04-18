package cliententer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		//创建套接字对象
		Socket client=null;
		try {
			client=new Socket("10.10.49.116",8888);
			Scanner in=new Scanner(client.getInputStream());
			PrintWriter out=new PrintWriter(client.getOutputStream());
			ObjectInputStream ois=new ObjectInputStream(client.getInputStream());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

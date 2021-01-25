package application;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket servidor = new ServerSocket(5555);
		System.out.println("Porta 5555 esta aberta");
		
		Socket cliente = servidor.accept();
		System.out.println("Nova conexao com o cliente" + cliente.getInetAddress().getHostAddress());
		
		Scanner s = new Scanner(cliente.getInputStream());
		
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		
		s.close();
		servidor.close();
		cliente.close();
	}

}

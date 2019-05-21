import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        for(int port = 1; port <= 65535; port++){
            try {
                Socket socket = new Socket();
                ServerSocket sSocket = new ServerSocket(50563);
                socket = sSocket.accept();
                System.out.println("connecté");
                socket.close();
                sSocket.close();
            } catch (IOException e) {
                System.err.println("Le port " + port + " est déjà utilisé ! ");
            }
        }
    }
}
package calculatrice;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatriceService {

        private static final Logger LOGGER = Logger.getLogger(CalculatriceService.class.getName());

        private static ServerSocket server;
        private static int PORT = 33002;

        public static void lunch() throws IOException, ClassNotFoundException, ArithmeticException{
            server = new ServerSocket(PORT);
            LOGGER.log(Level.INFO,"Server running");


            while(true){
                Socket socket = server.accept();
                LOGGER.log(Level.INFO,"Connexion established");

                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());



                double nb1=(double) ois.readObject();
                double nb2=(double) ois.readObject();
                String op=(String) ois.readObject();

                LOGGER.log(Level.INFO,"message reçu");

                //----------------Calcul------------------------------------------------
                Calcul c = new Calcul();
                double resultat = 0;

                try{
                    resultat = c.calculer(nb1,nb2,op.charAt(0));
                    System.out.println();
                    System.out.println("|| "+nb1+" "+op+" "+nb2+" = "+resultat+" ||");
                }
                catch (ArithmeticException e) {
                    System.out.println("Impossible de diviser par zéro!");
                }
                oos.writeObject(resultat);
            }


        }
}

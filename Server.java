/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 399611
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            int porta = 1222;
            ServerSocket server = new ServerSocket(porta);
            System.out.println("Servidor iniciado em " + porta);
            Socket cliente = server.accept();
            System.out.println("nova conexao + "+
                                cliente.getInetAddress().getHostAddress() );
            //leitura
            Scanner scanner = new Scanner(cliente.getInputStream());
            while (scanner.hasNextLine()) {
                String scan = scanner.nextLine();
                System.out.println(scan);
                
                if(scan.equals("exit")){
                    System.out.println("Recebido exit");
                    System.out.println("Encerrando");
                    break;
                }
            }
            scanner.close();
            //cliente.close();
            server.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}

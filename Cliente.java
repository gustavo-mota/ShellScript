/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author 399611
 */
public class Cliente {
    public static void main(String[] args) throws IOException{
        Socket cliente = new Socket("127.0.0.1", 1222);
        System.out.println("Cliente conectou ao server");
        PrintStream saida = new PrintStream(cliente.getOutputStream());
        Scanner teclado = new Scanner(System.in);
        while (teclado.hasNextLine()) {
            saida.println(teclado.nextLine());
            
        }
        saida.close();
        teclado.close();
        cliente.close();
    }
}

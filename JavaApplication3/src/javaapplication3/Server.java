/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author HieuNguyen
 */
public class Server {

    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(8080);
        Socket client = s.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println("Clients: " + inputLine);
            if (inputLine.equals("Bye.")) {
                break;
            }

        }
    }

}

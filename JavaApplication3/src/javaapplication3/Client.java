/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author HieuNguyen
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Socket c = new Socket("localhost", 8080);
        PrintWriter out = new PrintWriter(c.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("Bye.")) {
            input = sc.nextLine();
            System.out.println(input);
        }
    }

}

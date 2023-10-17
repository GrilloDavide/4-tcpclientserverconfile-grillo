package it.fi.meucci;


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main( String[] args ) throws IOException {

        Socket mioSocket = new Socket( InetAddress.getLocalHost() , 6789);

    
         //BufferedReader fileIn = new 
        //FileOutputStream fileOut = new ?????????



        mioSocket.close();
    }

}
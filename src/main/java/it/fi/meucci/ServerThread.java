package it.fi.meucci;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread{

    ServerSocket server;
    Socket client;
    BufferedReader inClient;
    DataOutputStream outClient;

    public ServerThread(Socket client) throws IOException {
        this.client = client;
        inClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
        outClient = new DataOutputStream(client.getOutputStream());
    }

    @Override
    public void run() {
        try{
           startComm();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void startComm() throws IOException {

        outClient.writeBytes("Invio del file\n");
        

        


        System.out.println("Termine connessione con "+client.getPort());
        client.close();
    }
}

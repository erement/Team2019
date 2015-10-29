package com.rebty.team2019.Classes;

import java.net.Socket;

class Connector extends Thread
{
    public static void main(String args[])
    {
    	StringBuilder arg = new StringBuilder();
        try
        {
            Socket socket = new Socket("localhost", 250);

            for(int i=0;i<args.length;i++){
            	arg.append(args[i]+" ");
          }
           
            args[0] = arg.append("\n"+socket.getInetAddress().getHostAddress() +":"+socket.getLocalPort()).toString();

            socket.getOutputStream().write(args[0].getBytes());

            byte buf[] = new byte[512*1024];
            int r = socket.getInputStream().read(buf);
            String data = new String(buf, 0, r+8);
            switch(data.substring(0, 3)){
             
            } 
            System.out.println(data);
            socket.close();
        }
        catch(Exception e)
        {System.out.println("init error: " + e.getMessage());}
    }
}
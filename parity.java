package com.recursion;
import java.io.*;
import java.util.*;
public class parity {
    String dataR= "";
    String dataS= "";
    int i,option,len;
    int count1,count0;
    void Sender()throws IOException{
        System.out.println("At sender*****************************");
        System.out.println("EnterBinary data:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        dataS=br.readLine();
        len=dataS.length();
        for(i=0;i<dataS.length();i++){
            if(dataS.charAt(i)!='1' && dataS.charAt(i)!='0'){
                System.out.println("Enter binary values");
                return;
            }
        }
        System.out.println("Event Parity or Odd Parity?");
        System.out.println("Enter 1 for even or 2 for odd");
        Scanner s=new Scanner(System.in);
        option=s.nextInt();
        if(option==1){
            System.out.println("Sender has agreed for Even parity");
            even();
        }
        else{
            System.out.println("Sender has agreed for odd parity");
            odd();
        }
        System.out.println();
    }
    void even()throws IOException{
        count1=count0=0;
        for(i=0;i<dataS.length();i++){
            if(dataS.charAt(i)=='1'){
                count1++;
            }
            if(dataS.charAt(i)=='0'){
                count0++;
            }
        }
        if(count1%2==0){
            dataS=dataS+'0';
            System.out.println("Data after even parity:");
            for(i=0;i<dataS.length();i++){
                System.out.print(dataS.charAt(i));
            }
        }
        else{
            dataS=dataS+'1';
            System.out.println("Data after even parity:");
            for(i=0;i<dataS.length();i++){
                System.out.print(dataS.charAt(i));
            }
        }
    }
    void odd()throws IOException{
        count1=count0=0;
        for(i=0;i<dataS.length();i++){
            if(dataS.charAt(i)=='1'){
                count1++;
            }
            if(dataS.charAt(i)=='0'){
                count0++;
            }
        }
        if(count1%2!=0){
            dataS=dataS+'0';
        }
        else{
            dataS=dataS+'1';
        }
        System.out.println("Data after odd parity:");
        for(i=0; i<dataS.length(); i++){
            System.out.print(dataS.charAt(i));
        }
    }
    void Receiver()throws IOException{
        System.out.println("\n\nAt receiver********************************");
        System.out.println("Enter Binary data:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        dataR=br.readLine();
        len+=1;
        if(len!=dataR.length()){
            System.out.println("Enter Binary data of length: "+len);
            return;
        }
        for(i=0;i<dataR.length();i++){
            if(dataR.charAt(i)!='1' && dataR.charAt(i)!='0'){
                System.out.println("Enter binary values");
                return;
            }
        }
        count1=count0=0;
        for(i=0;i<dataR.length();i++){
            if(dataR.charAt(i)=='1'){
                count1++;
            }
            if(dataR.charAt(i)=='0'){
                count0++;
            }
        }
        if(option==1){
            if(count1%2==0){
                System.out.println("Data received successfully with no error");

            }
            else{
                System.out.println("Error has been detected in received data");
            }
        }
        else{
            if(count1%2!=0){
                System.out.println("Data received successfully with no error");

            }
            else{
                System.out.println("Error has been detected in received data");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        parity p=new parity();
        p.Sender();
        p.Receiver();
    }
}
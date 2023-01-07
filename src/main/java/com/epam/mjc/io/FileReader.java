package com.epam.mjc.io;
import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))){
            String [] readName = (reader.readLine().split(": "));
            String name = readName[1];
            String [] readAge = (reader.readLine().split(": "));
            int age = Integer.parseInt(readAge[1]);
            String [] readMail = (reader.readLine().split(": "));
            String mail = readMail[1];
            String [] readPhone = (reader.readLine().split(": "));
            long phone = Long.parseLong(readPhone[1]);
            return new Profile(name, age, mail, phone);}

        catch (IOException e){
            e.printStackTrace();
        }
        return new Profile();
    }}


package com.amigoscode.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E1 {

    public static void main(String[] args) {

        // E1
//        try {
//            File file = new File("data.csv");
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(data);
//            bufferedWriter.close();
//            System.out.println("Data written to file");
//        } catch (IOException e) {
//            System.err.println("Cannot write to file: " + e.getMessage());
//        }

        // E2
        // read back the contents stored in data.csv
//        try {
//            FileReader fileReader = new FileReader("data.csv");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            StringBuilder fileContents = new StringBuilder();
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                fileContents.append(line).append("\n");
//            }
//            bufferedReader.close();
//            System.out.println("Contents of file:");
//            System.out.println(fileContents);
//        } catch (IOException e) {
//            System.err.println("Cannot read from file: " + e.getMessage());
//        }

        // E3
        // print each line of data.csv
//        try {
//            FileReader fileReader = new FileReader("data.csv");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//            bufferedReader.close();
//        } catch (IOException e) {
//            System.err.println("Cannot read from file: " + e.getMessage());
//        }

        // E4
        // print each line but skip header
        try {
            FileReader fileReader = new FileReader("data.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String header = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Cannot read from file: " + e.getMessage());
        }

    }

    private static final String data = """
            id,first_name,last_name,email,gender
            1,Fanchette,Williamson,fwilliamson0@github.com,F
            2,Aleksandr,Matts,amatts1@webs.com,M
            3,Maurie,Cordero,mcordero2@google.co.jp,M
            4,Donnajean,Crowson,dcrowson3@google.com.hk,F
            5,Ricardo,Gofton,rgofton4@nytimes.com,M
            6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
            7,Marjorie,Blumsom,mblumsom6@joomla.org,F
            8,Lester,Huyghe,lhuyghe7@jugem.jp,M
            9,Merrily,Stangoe,mstangoe8@tiny.cc,F
            10,Reider,Karel,rkarel9@github.io,M
            11,Dory,Jolliff,djolliffa@wufoo.com,F
            12,Homerus,Averay,haverayb@skyrock.com,M
            13,Alyda,Muglestone,amuglestonec@is.gd,F
            14,Pinchas,Louca,ploucad@google.es,M
            15,Cherin,Eltringham,celtringhame@parallels.com,F
            16,Mufi,Rothert,mrothertf@dropbox.com,F
            17,Jordana,Everex,jeverexg@ucla.edu,F
            18,Belle,Rother,brotherh@auda.org.au,F
            19,Clevie,Sifflett,csiffletti@furl.net,M
            20,Gretchen,Abell,gabellj@1688.com,F
            """;
}

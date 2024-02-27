package com.amigoscode.classesAndObjectsII;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String data = """
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

        // E1
        // create a file with named data.csv under src with and write some code to add the contents of the following string to the file.
        // Read the file and turn each row into objects stored in a an Array of type Person.
        String filePath = "data.csv";
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.err.println("Cannot write to file: " + e.getMessage());
            e.printStackTrace();
        }

        // read the file and create an array od person objects
        List<Person> personList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String header = bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.trim().split(",");
                int id = Integer.parseInt(fields[0]);
                String firstName = fields[1];
                String lastName = fields[2];
                String email = fields[3];
                String gender = fields[4];

                Person person = new Person(id, firstName, lastName, email, gender);
                personList.add(person);
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.err.println("Cannot read from file: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println(personList);


        // E2
        // create two persons, one male and one female
        Person femalePerson = new Person(21, "Jane", "Doe", "jane-doe@email.com", "F");
        Person malePerson = new Person(22, "John", "Doe", "john-doe@email.com", "M");


        // E3
        Garage garage = new Garage(2);
        Car car1 = new Car(1, "Toyota", "Corolla", 2021, "ABC123");
        Car car2 = new Car(2, "Honda", "Civic", 2021, "XYZ123");
        garage.addCar(car1);
        garage.addCar(car2);
        Car[] cars = garage.getAllCars();
        for (Car car : cars) {
            System.out.println("Car: " + car.getMake() + " " + car.getModel());
        }
        CarService carService = new CarService();
        carService.repairCar(car1);
        carService.washCar(car1);


        // E4
        // Create a survey questionnaire application that saves users answers to a file. Think about the classes and that you might need. For example, Questionnaire - id, createdAt, List of Questions Question - the question Person - name, email, dob
        Questionnaire questionnaire = new Questionnaire(1);
        // add some sample questions
        questionnaire.addQuestion(new Question("What is your favorite color?"));
        questionnaire.addQuestion(new Question("What is your favorite food?"));
        // Get user details
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your email: ");
        String email = scanner.nextLine();
        System.out.println("Enter your date of birth (YYYY-MM-DD): ");
        String dobString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = null;
        try {
            dob = dateFormat.parse(dobString);
        } catch (Exception e) {
            System.err.println("Invalid date format: " + e.getMessage());
            e.printStackTrace();
        }
        // Create a person object with user details
        QuestionPerson person = new QuestionPerson(name, email, dob);
        // Answer the questions
        String[] answers = new String[questionnaire.getQuestions().size()];
        for (int i = 0; i < questionnaire.getQuestions().size(); i++) {
            System.out.println(questionnaire.getQuestions().get(i).getQuestionText());
            answers[i] = scanner.nextLine();
        }
        // save the user answers to a file
        saveAnswersToFile(person, answers);
        scanner.close();

    }

    private static void saveAnswersToFile(QuestionPerson person, String[] answers) {
        String fileName = "survey_answers.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("Name: " + person.getName() + "\n");
            writer.write("Email: " + person.getEmail() + "\n");
            writer.write("Date of Birth: " + person.getDob() + "\n");
            for (int i = 0; i < answers.length; i++) {
                writer.write("Question " + (i + 1) + ": " + answers[i] + "\n");
            }
            writer.write("\n");
            writer.close();
            System.out.println("Survey answers saved to " + fileName);
        } catch (IOException e) {
            System.err.println("Cannot write to file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

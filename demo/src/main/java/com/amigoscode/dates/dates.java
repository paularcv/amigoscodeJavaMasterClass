package com.amigoscode.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class dates {

    public static void main(String[] args) {

        // E1
        System.out.println("Todays date: " + LocalDate.now());
        System.out.println("Todays time: " + LocalDateTime.now());

        // E2
        System.out.println("My birthday: " + LocalDate.of(1990, 1, 1));
        System.out.println("My birthday: " + LocalDate.of(1990, 1, 1).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        // E3
        LocalDate birthdate = LocalDate.of(1990, 1, 1);
        LocalDate birthdatePlus100Days = birthdate.plusDays(100);
        System.out.println("My birthday plus 100 days: " + birthdatePlus100Days);

        // E4
        LocalDate birthdate2 = LocalDate.of(1990, 1, 1);
        LocalDate currentDate = LocalDate.now();
        System.out.println("My age: " + calculateAge(birthdate2, currentDate));

    }

    // E4
    // function that can calculate age
    private static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        // hint: subtract todays date[year] - date [year]
//        LocalDate today = LocalDate.now();
//        return today.getYear() - date.getYear();

        Period period = Period.between(birthDate, currentDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        if (months < 0 || (months == 0 && days < 0)) {
            years--;
        }
        return years;
    }
}

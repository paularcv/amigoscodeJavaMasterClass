package com.amigoscode.cliProject;

import com.amigoscode.cliProject.booking.CarBooking;
import com.amigoscode.cliProject.booking.CarBookingDAO;
import com.amigoscode.cliProject.booking.CarBookingService;
import com.amigoscode.cliProject.car.Car;
import com.amigoscode.cliProject.car.CarService;
import com.amigoscode.cliProject.user.User;
import com.amigoscode.cliProject.user.UserService;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        CarBookingDAO carBookingDAO = new CarBookingDAO();
        CarService carService = new CarService();
        UserService userService = new UserService();
        CarBookingService carBookingService = new CarBookingService(carBookingDAO, carService);

        Scanner scanner = new Scanner(System.in);

        boolean keepLooping = true;

        while (keepLooping) {
            try {
                displayMenu();
                String choice = scanner.nextLine();
                switch (Integer.parseInt(choice)) {
                    case 1 -> bookCar(userService, carBookingService, scanner);
                    case 2 -> displayAllUserBookedCars(userService, carBookingService, scanner);
                    case 3 -> allBookings(carBookingService);
                    case 4 -> displayAllAvailableCars(carBookingService, false);
                    case 5 -> displayAllAvailableCars(carBookingService, true);
                    case 6 -> displayAllUsers(userService);
                    case 7 -> keepLooping = false;
                    default -> System.out.println(choice + "not a valid option");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void allBookings(CarBookingService carBookingService) {
        List<CarBooking> carBookings = carBookingService.getBookings();
        if (carBookings.isEmpty()) {
            System.out.println("No bookings available");
            return;
        }
        for (CarBooking carBooking : carBookings) {
            System.out.println("Booking = " + carBooking);
        }
    }

    private static void displayAllUsers(UserService userService) {
        List<User> users = userService.getUsers();
        if (users.isEmpty()) {
            System.out.println("No users in the system");
            return;
        }
        for (User user : users) {
            System.out.println("User = " + user);
        }
    }

    private static void displayAllAvailableCars(CarBookingService carBookingService, boolean isElectric) {
        List<Car> availableCars = isElectric ? carBookingService.getAvailableElectricCars() : carBookingService.getAvailableCars();
        if (availableCars.isEmpty()) {
            System.out.println("No cars available for renting");
            return;
        }
        for (Car car : availableCars) {
            System.out.println("Car = " + car);
        }
    }

    private static void displayAllUserBookedCars(UserService userService, CarBookingService carBookingService, Scanner scanner) {
        displayAllUsers(userService);

        System.out.println("➡️ select user id");
        String userId = scanner.nextLine();

        User user = userService.getUserById(UUID.fromString(userId));
        if (user == null) {
            System.out.println("No user found with id " + userId);
            return;
        }

        List<Car> userBookedCars = carBookingService.getUserBookedCars(user.getId());
        if (userBookedCars.isEmpty()) {
            System.out.println("No cars booked by user " + user);
            return;
        }
        for (Car car : userBookedCars) {
            System.out.println("Booked Car by user = " + car);
        }
    }

    private static void bookCar(UserService userService, CarBookingService carBookingService, Scanner scanner) {
        displayAllAvailableCars(carBookingService, false);
        System.out.println("➡️ select car reg number");
        String carRegNumber = scanner.nextLine();

        displayAllUsers(userService);

        System.out.println("➡️ select user id");
        String userId = scanner.nextLine();

        try {
            User user = userService.getUserById(UUID.fromString(userId));
            if (user == null) {
                System.out.println("No user found with id " + userId);
            } else {
                UUID bookingId = carBookingService.bookCar(user, carRegNumber);
                String confirmationMessage = """
                        🎉 Successfully booked car with reg number %s for user %s
                        Booking ref: %s
                        """.formatted(carRegNumber, user, bookingId);
                System.out.println(confirmationMessage);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void displayMenu() {
        System.out.println("""
                \n
                1️⃣ - Book Car
                2️⃣ - View All User Booked Cars
                3️⃣ - View All Bookings
                4️⃣ - View Available Cars
                5️⃣ - View Available Electric Cars
                6️⃣ - View all users
                7️⃣ - Exit
                """);
    }
}

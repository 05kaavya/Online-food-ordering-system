package com.examly;

import com.examly.entity.*;
import com.examly.service.*;
import com.examly.exception.*;
import java.util.*;


public class MainModule {
    private static final CustomerService customerService new CustomerServiceImpl();
    private static final RestaurantService restaurantService = new RestaurantServiceImpl();
    private static final MenuService menuService = new MenuServiceImpl();
    private static final OrderService orderService = new OrderServiceImpl();
    private static final PaymentService paymentService = new PaymentServiceImpl();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        while(true){
            displayMenu();
            System.out.print("Chhose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1: registerCustomer();break;
                case 2: createRestaurant();break;
                case 3: createMenuItem();break;
                case 4: viewRestaurants();break;
                case 5: placeOrder();break;
                case 6: viewOrders();break;
                case 7: makePayment();break;
                case 8: System.out.println("Exiting..."); System.exit(0);
                default: System.out.println("Choose an option: "); break;
            }
        }
    }


    
    private static void displayMenu() {
        System.out.println("\n=== Welcome to the Online Food Delivery System ===");
        System.out.println("1. Register Customer");
        System.out.println("2. Create Restaurant");
        System.out.println("3, Create Menu Item");
        System.out.println("4, View Restaurants");
        System.out.println("5, Place Order");
        System.out.println("6, View Orders");
        System.out.println("7, Make Payment");
        System.out.println("8, Exit");
    }

    private static void registerCustomer(){
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        System.out.print("Enter customer phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter customer password: ");
        String password = scanner.nextLine();

        Customer customer = new Customer(0,name, email, phoneNumber, password);
        try{
            boolean success = customerService.createCustomer(customer);
            System.out.println("Customer registered successfully!");
        }catch(EmailAlreadyRegisteredException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    private static void createRestaurant(){
        System.out.print("Enter restaurant name: ");
        String name = scanner.nextLine();
        System.out.print("Enter restaurant address: ");
        String address = scanner.nextLine();
        System.out.print("Enter cuisine type: ");
        String cuisineType = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine();

        int restaurantId = (int) (Math.random()*1000) + 1;
        Restaurant restaurant = new Restaurant(restaurantId, name, address, cuisineType, contactNumber);
        boolean success = restaurantService.createRestaurant(restaurant);
        System.out.println("Restaurant created successfully!");
    }

    private static void createmenuItem(){
        System.out.print("Enter restaurant ID to add menu item: ");
        int restaurantId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter menu item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter cuisine type: ");
        String cuisineType = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine();








               




}
    



}





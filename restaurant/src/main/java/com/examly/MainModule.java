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
            int choice = scanner.nectInt();
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
        
    }






               




}
    



}





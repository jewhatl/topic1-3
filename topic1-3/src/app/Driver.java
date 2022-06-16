package app;

import car.*;
import racecar.*;
import game.*;
import java.util.Scanner;

public class Driver
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Tire tire;
        Engine engine;
        Car car;
        Game game;
        
        game = new Game();
        
        tire = new Tire();
        engine = new Engine();
        car = new Car();
        
        int     menuChoice;

        do
        {
            System.out.println("1. Start the car");
            System.out.println("2. Run the car");
            System.out.println("3. Stop the car");
            System.out.println("4. Restart the car");
            System.out.print("Enter action choice: ");

            menuChoice = input.nextInt();

        } while (menuChoice < 1 && menuChoice > 5);

        input.close();

        switch (menuChoice)
        {
            case 1:
                int tirePsi = 0;
                System.out.print("Enter desired tire psi: ");
                tirePsi = input.nextInt();
                input.close();
                tire.checkPressure(tirePsi); 
            case 2:
                // start the car method
                break;
            case 3:
                // Run the car method
                break;
            case 4:
                // Stop the car method
                break;
            case 5:
                // Restart the car method
                break;
        }
    }
}



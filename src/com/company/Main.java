package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    VehicleShowroom vehicleShowroom = new VehicleShowroom();
//            Vehicle normalVehicle = new NormalVehicle("123",EngineType.DISEL, 10, 10);
//            Vehicle sportsVehicle = new SportsVehicle("455", EngineType.OIL, 50, 15, true);
//            Vehicle heavyVehicle =new HeavyVehicle("145", EngineType.DISEL, 400, 25, 500);
//            //vehicleShowroom.addVehicle(normalVehicle);
//            vehicleShowroom.addVehicle(sportsVehicle);
//            vehicleShowroom.addVehicle(heavyVehicle);
//            
//            System.out.println("Total Visitors: " + vehicleShowroom.getVisitors());
//            
//            vehicleShowroom.showVehicleList();
            //vehicleShowroom.removeVehicle(heavyVehicle);
            //vehicleShowroom.showVehicleList();

            
             System.out.println("Welcome to Showroom Manager!");
             Scanner sc=new Scanner(System.in);
             int decider;
             int menuChooser;
             VehicleShowroom vehicleShowroom = new VehicleShowroom();
             int engine_type;
             String model_no;
             int engine_power;
             int tyre_size;
             float weight;
             String model_to_remove;
             
             
             
             while(true){
                 System.out.println("Press-1 to add Car|| "
                    + "Press-2 to Show Car List|| "
                    + "Press-3 Remove Car"
                         );
            menuChooser=sc.nextInt();
        switch (menuChooser) {
            case 1:
                System.out.println("Select From The Menu Below:");
                System.out.println("Press-1 for Normal Car|| Press-2 for Sports Car"
                        + "||Press-3 for Heavy Vehicle");
                decider=sc.nextInt();
                System.out.println("Enter Vehicle Data");
                System.out.println("Enter Model No.:");
                model_no=sc.next();
                System.out.println("Enter Engine Power:");
                engine_power=sc.nextInt();
                System.out.println("Enter tyre Size:");
                
                tyre_size=sc.nextInt();
                switch (decider) {
                    case 1:
                        System.out.println("Select Engine Type: 1->GAS"
                                + "2->OIL "
                                + "3->DISEL");
                        engine_type=sc.nextInt();
                     switch (engine_type) {
                         case 1:
                             {
                                 Vehicle normalVehicle = new NormalVehicle(model_no,EngineType.GAS, engine_power, tyre_size);
                                 vehicleShowroom.addVehicle(normalVehicle);
                                 break;
                             }
                         case 2:
                             {
                                 Vehicle normalVehicle = new NormalVehicle(model_no,EngineType.OIL, engine_power, tyre_size);
                                 vehicleShowroom.addVehicle(normalVehicle);
                                 break;
                             }
                         case 3:
                             {
                                 Vehicle normalVehicle = new NormalVehicle(model_no,EngineType.DISEL, engine_power, tyre_size);
                                 vehicleShowroom.addVehicle(normalVehicle);
                                 break;
                             }
                         default:
                             System.out.println("Invalid Input..");
                             break;
                     }
                        break;

                    case 2:
                        Vehicle sportsVehicle = new SportsVehicle(model_no, EngineType.OIL, engine_power, tyre_size, true);
                        vehicleShowroom.addVehicle(sportsVehicle);
                        break;
                    case 3:
                        System.out.println("Enter Weight:");
                        weight=sc.nextFloat();
                        Vehicle heavyVehicle =new HeavyVehicle(model_no, EngineType.DISEL, engine_power, tyre_size, weight);
                        vehicleShowroom.addVehicle(heavyVehicle);
                        
                        break;
                    default:
                        System.out.println("Invelid Selection..");
                        break;
                        
                }  break;
        
            case 2:
                
                
                System.out.println("Vehicle List:");
                vehicleShowroom.showVehicleList();
                System.out.println("Total Expected Visitors: " + vehicleShowroom.getVisitors());
                      
                break;
            case 3:
                
                     {
                         System.out.println("Enter Model Number:");
                         model_to_remove=sc.next();
                         vehicleShowroom.removeVehicle(model_to_remove);
                     }
                
                break;

           
            default:
                break;
        } 
        } 
            
            
    }
}

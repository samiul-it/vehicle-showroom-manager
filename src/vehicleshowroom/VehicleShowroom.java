
package vehicleshowroom;

import java.util.ArrayList;
import java.util.Scanner;


public class VehicleShowroom {

   
    public static void main(String[] args) {
        

             ArrayList<VehicleModel> vehicleList = new ArrayList<VehicleModel>();

             System.out.println("Welcome to Showroom Manager!");
             Scanner sc=new Scanner(System.in);
             int decider;
             int menuChooser;
             int expectedVisitor=0;
             
             
             while(true){
                 System.out.println("Press-1 to add Car|| "
                    + "Press-2 to Remove Car|| "
                    + "Press-3 to Show Car List" +
                         "||Press-4 for Expected Visitors");
            menuChooser=sc.nextInt();
        switch (menuChooser) {
            case 1:
                System.out.println("Select From The Menu Below:");
                System.out.println("Press-1 for Normal Car|| Press-2 for Sports Car"
                        + "||Press-3 for Heavy Vehicle");
                decider=sc.nextInt();
                switch (decider) {
                    case 1:
                        vehicleList.add(new NormalVehicle());
                        expectedVisitor=expectedVisitor+30;
                        break;
                    case 2:
                        System.out.println("Sports Engine Type Oil Only");
                        vehicleList.add(new SportsVehicle());
                        expectedVisitor=expectedVisitor+50;
                        break;
                    case 3:
                        System.out.println("Heavy Engine Type Disel Only");
                        vehicleList.add(new HeavyVehicle());
                        expectedVisitor=expectedVisitor+30;
                        break;
                    default:
                        break;
                        
                }  break;
        
            case 2:
                
                
                System.out.println("ArrayList:"+vehicleList);
                
                int removeItem;
                System.out.println("Enter the Item No. You Want to delete:");
                removeItem=sc.nextInt();
                vehicleList.remove(removeItem);
                expectedVisitor=expectedVisitor-30;
                System.out.println("Vehicle deteted..!");
                
                System.out.println("ArrayList:"+vehicleList);
                
                break;
            case 3:
                
                System.out.println("ArrayList:"+vehicleList);
                System.out.println("Current Expected Visitor of The Showroom:"+expectedVisitor);
                break;
            case 4:
                System.out.println("Current Expected Visitor of The Showroom:"+expectedVisitor);
            break;
            default:
                break;
        } 
        }    
             
             
             
             
             
    }
    
}



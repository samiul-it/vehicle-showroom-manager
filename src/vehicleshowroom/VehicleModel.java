package vehicleshowroom;

import java.util.Scanner;

public class VehicleModel {
    Scanner sc=new Scanner(System.in);
    
    
    String vehicle_name;
    String model_no;
    int engine_type_selector;
    String engine_type;
    int engine_power;
    String tyre_size;
    boolean isTurbo=true;
    boolean heavyCapacity=true;
    
    
 
    public VehicleModel() {
        
        System.out.println("Enter Vehicle Name:");
        vehicle_name=sc.next();
        System.out.println("Enter Model No.:");
        model_no=sc.next();
        System.out.println("Enter Engine Type :1->Oil,2->Gas,3->Disel");
        engine_type_selector=sc.nextInt();
        switch (engine_type_selector) {
            case 1:
                engine_type="Oil";
                break;
            case 2:
                engine_type="Gas";
                break;
            case 3:
                engine_type="Disel";
                break;
            default:
                System.out.println("Invalid Input:Default Selected");
                engine_type="Gas";
                break;
        }
        
        
        System.out.println("Enter Engine Power:");
        engine_power=sc.nextInt();
        System.out.println("Enter tyre size:");
        tyre_size=sc.next();
        
    }
    
    void PrintVehicleData(){
         System.out.println("Vehicle Name:"+vehicle_name);
         System.out.println("Vehicle Model Number:"+model_no);
         System.out.println("Vehicle Engine Type:"+engine_type+"  Engine");
         System.out.println("Vehicle Engine Power:"+engine_power+"CC");
         System.out.println("Vehicle Tyre Size:"+tyre_size+"Inch.");
         
    }
    public String toString(){
        return "[ Vehicle Name:" + vehicle_name + ",Vehicle Model:" + model_no + ",Engine Type:"
                + "" + engine_type + ",Engine Displacement:" 
                + engine_power + ",Tyre Size:" + tyre_size + ",Turbo Engine:" + isTurbo + ",Heavy Capacity:"
                + heavyCapacity + "]";
    }
}

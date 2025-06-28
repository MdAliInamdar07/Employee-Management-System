import java.util.*;
public class MainMenu extends Admin {
    int choice1 , key ;
    static Scanner sc = new Scanner(System.in);

    public void menuForE(){
        while(true){
            System.out.println("Press '1' to check another employee's ID");
            System.out.println("Press 2 to look at details of employee");
            System.out.println("Press 3 to return to main menu");
            choice1 = sc.nextInt();

            switch(choice1){

                case 1 :
                    System.out.println("Enter the Employee ID to be checked");
                    key = sc.nextInt();
                    if(map.containsKey(key)){
                        System.out.println("Yes, the employee is present");
                    }
                    else{
                        System.out.println("Employee not found");
                    }
                    break;

                case 2 :
                    System.out.println("Enter the Employee ID for the details to be searched.");
                    key = sc.nextInt();
                    if(map.containsKey(key)) {
                        System.out.println("Employee details : " + map.get(key));
                    }
                    else{
                        System.out.println("Employee not found");
                    }
                    break;
                case 3 :
                    String[] arguments = {};
                    MainMenu.main(arguments);
                default:
                    System.out.println("This is not a valid option");
                }
            }    
    }
         public static void main(String []args){

        MainMenu ob = new MainMenu();
        while(true) {
            System.out.println("Press 1. to log in as admin");
            System.out.println("Press 2. to log in as an employee ");
            System.out.println("Press 3 to exit ");
            int choice2 = sc.nextInt();

            if (choice2 == 1) {
                ob.menuForA();
            } else if (choice2 == 2) {
                ob.menuForE();
            }
            else if (choice2 == 3) {
                System.out.println("Thank you");
                System.exit(0);
            }
        }
    }

}

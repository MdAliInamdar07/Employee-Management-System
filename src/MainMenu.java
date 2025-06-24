import java.util.*;
public class MainMenu extends Admin {
    int choice1 , key ;
    static Scanner sc = new Scanner(System.in);

    public void menuForE(){

        System.out.println("Press '1' to check another employee's ID");
        System.out.println("Press 2 to look at details of employee");

        choice1 = sc.nextInt();

        switch(choice1){

            case 1 :
                System.out.println("Enter the Employee ID to be checked");
                key = sc.nextInt();
                if(map.containsKey(key)){
                    System.out.println("Yes, the key is present");
                }
                break;

            case 2 :
                System.out.println("Enter the Employee ID for the details to be searched.");
                key = sc.nextInt();
                System.out.println("Employee details : " +map.get(key));
                break;
        }
    }

    public static void main(String []args){

        MainMenu ob = new MainMenu();
        System.out.println("Press 1. to log in as admin");
        System.out.println("Press 2. to log in as an employee ");

        int choice2 = sc.nextInt();

        if(choice2 == 1){
            ob.menuForA();
        }
        else if(choice2 == 2){
            ob.menuForE();
        }

    }

}

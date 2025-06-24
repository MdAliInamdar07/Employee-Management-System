import java.util.*;

public class Admin
{
    Scanner sc = new Scanner(System.in);
    int input , id;
    String name,department;
    HashMap< Integer , Admin> map = new HashMap<>();
    public Admin() {
        // default constructor
    }
    public Admin(String name , String department){

        this.name = name;
        this.department = department;

    }

    public void menuForA(){

        System.out.println("Press 1. to insert an employee record.");
        System.out.println("Press 2. to get records of all employees inserted.");
        System.out.println("Press 3. to remove an employee record.");

        input = sc.nextInt();

        switch(input){

            case 1:
                System.out.println("Enter the key");
                id = sc.nextInt();
                System.out.println("Enter the name of the Employee");
                name = sc.nextLine();
                System.out.println("Enter the department of the Employee");
                department = sc.nextLine();
                if(map.containsKey(id)){
                    System.out.println("This key already exists. Pleaase try again.");
                }
                else{
                    map.put(id, new Admin(name , department));
                }
                break;

            case 2 :
                for(Map.Entry<Integer, Admin>e : map.entrySet()){
                    System.out.println(e.getKey());
                    System.out.println(e.getValue());

                }
                break;

            case 3:
                if(map.containsKey(id)){
                    System.out.println("This key already exists. Cannot be removed.");
                }
                else{
                    System.out.println("Enter the Employee ID to be removed");
                    id = sc.nextInt();
                    map.remove(id);
                }

        }
    }

}


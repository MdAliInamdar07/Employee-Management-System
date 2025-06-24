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
        while(true) {
            System.out.println("Press 1. to insert an employee record.");
            System.out.println("Press 2. to get records of all employees inserted.");
            System.out.println("Press 3. to remove an employee record.");
            System.out.println("Press 4 to exit");
            input = sc.nextInt();

            switch (input) {

                case 1:
                    System.out.println("Enter the key");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name of the Employee");
                    name = sc.nextLine();
                    System.out.println("Enter the department of the Employee");
                    department = sc.nextLine();
                    if (map.containsKey(id)) {
                        System.out.println("This key already exists. Pleaase try again.");
                    } else {
                        map.put(id, new Admin(name, department));
                    }
                    break;

                case 2:
                    for (Map.Entry<Integer, Admin> e : map.entrySet()) {
                        int key = e.getKey();
                        Admin emp = e.getValue();
                        System.out.println("Employee ID :: " + key);
                        System.out.println("Name : " + emp.name + " Department : " + emp.department);

                    }
                    break;

                case 3:
                    if (map.containsKey(id)) {
                        System.out.println("Enter the Employee ID to be removed");
                        id = sc.nextInt();
                        sc.nextLine();
                        map.remove(id);
                        System.out.println("Employee removed. ");

                    }
                    else {
                        System.out.println("This key doesn't exist ");
                    }
                    break;
                case 4:
                    System.out.println("Thank you");
                    System.exit(0);
            }
        }
    }

}


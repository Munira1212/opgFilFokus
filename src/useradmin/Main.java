package useradmin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Main() {
        users = new ArrayList<User>();
        readFile();
    }
void run() {




    Scanner sc= new Scanner(System.in);

    int numberInput= sc.nextInt();
    ArrayList<User> users = new ArrayList<>();

    void viewUserList() {
        System.out.println("\nUSER LIST:");
        for (int i = 0; i < users.size(); i++)
        System.out.println("#" + i + ": " + users.get(i));
    }

    void createNewUser() {
        int id;
        String name;
        String password;
        User user;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCREATE NEW USER\n");

        System.out.print("Id: ");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");

    name = scanner.nextLine();

    System.out.print("Password: ");
    password = scanner.nextLine();


    user = new User(id, name, password);
    users.add(user);
    saveFile();
    System.out.println("\nUser added.");

    }

    void deleteUser() {
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDELETE USER:");
        System.out.print("Enter # of user to delete: ");
        userNumber = scanner.nextInt();
        users.remove(userNumber);
        saveFile();
        System.out.println("\nUser deleted.");

    }

   void readFile() {
        // Implement this ...

    }
     void saveFile() {
         // Implement this ...
    return
    }

    void run() {
        boolean running;
    }     Menu menu = new Menu("MENU:", "Please choose option: ", new String[]
            { "1. View user list", "2. Create new user", "3. Delete user", "9. Quit" });
    readFile();

running = true;
while (running) {
    menu.printMenu();
    int userChoice = menu.readChoice();


    switch (userChoice ) {
        case 1:
            menu.viewUserList();
            break;
        case 2:
          createNewUser
            break;

            case 3:
                deleteUser();
                break;

                case 9:
                    running = false;
                    break;
                    default:
                        System.out.println("\nIllegal choice.");
            }
    }
}
public static void main(String[] args) {

    new Main().run();
}
}







}

    public static void main(String[] args) {
       new Main().run();
    }
}

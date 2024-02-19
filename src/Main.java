// Joleyne Hernandez 02/17/24

import java.util.Scanner;

public class Main {

    public static int prompt(Scanner input) {
        System.out.println("What contact would you like to see 1, 2, or 3? or Type 0 to End");
        int task = input.nextInt();
        input.nextLine();

        return task;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person contact1 = new Person("Joleyne");
        AddressBook book1 = new AddressBook("128279@swcsd.us");

        Person contact2 = new Person("Olinger");
        AddressBook book2 = new AddressBook("StoneVessel@gmail.com");

        Person contact3 = new Person("Frida the Pug");
        AddressBook book3 = new AddressBook("PugLife.com");

        System.out.println("What's the name of the person? ");
        String userName = input.nextLine();
        Person contact4 = new Person(userName);

        System.out.println("What's the email address of " + userName + "?");
        String userEmail = input.nextLine();
        AddressBook book4 = new AddressBook(userEmail);

        int task = prompt(input);
        while(task != 0){
            switch (task){
                case 1:
                    book1.display(contact1);
                    task = prompt(input);
                    break;
                case 2:
                    book2.display(contact2);
                    task = prompt(input);
                    break;
                case 3:
                    book3.display(contact3);
                    task = prompt(input);
                    break;
                default:
                    System.out.println("Select 0");
                    prompt(input);
                    break;
            }
        }
    }
}
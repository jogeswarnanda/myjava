
public class App {

    // My first java program
    /* 
     * Multi line comment
     */
    public static void main(String[] args) {

        /*System.out.println("I like pizaa ");
        int year = 2025;
        System.out.println("The year is >> " + year);
        double price = 19.99;
        System.out.println("The price is  $" + price);
        char str1 = 'S';
        System.out.println("The char is  :" + str1);
        boolean isStudent = false;
        if (isStudent == true) {
            System.out.println("I am a student");
        } else {
            System.out.println("I am NOT a student");
        }

        String name = "Jogeswar";
        System.out.println("You are .." + name);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ur Name :");
        String name1 = scanner.nextLine();
        System.out.print("Enter ur Age :");
        int age = scanner.nextInt();
        System.out.print("Enter ur GPA :");
        double gpa = scanner.nextDouble();
        System.out.print("Are you student? (True/False) :");
        boolean isStudent1 = scanner.nextBoolean();
        System.out.println("Hello " + name1 + "!");
        System.out.println("You are " + age + " years old. ");
        System.out.println("Your GPA is " + gpa + " .");
        if (isStudent1) {
            System.out.println("You enrolled as a student..");
        } else {
            System.out.println("You enrolled as a non-student..");
        }
        scanner.close(); 
         
        // common issue while using integer inputs >>
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ur age :");
        int age = scanner.nextInt();
        // Need to add the below next line command to get rid of new line taken as input for the next scanner. 
        scanner.nextLine();
        System.out.print("Enter ur fav color :");
        String color1 = scanner.nextLine();
        System.out.println("You are " + age + " years old.");
        System.out.println("You like the color " + color1);
        scanner.close(); 
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width  :");
        width = scanner.nextDouble();
        System.out.print("Enter height :");
        height = scanner.nextDouble();
        area = (width * height);
        System.out.println("Area :" + area + "cm2");
        scanner.close(); 
        // MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        System.out.print("Enter an adjective (desription):");
        adjective1 = scanner.nextLine();
        System.out.print("Enter an noun (animal / person):");
        noun1 = scanner.nextLine();
        System.out.print("Enter a verb with -ing (action):");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (desription):");
        adjective2 = scanner.nextLine();
        System.out.print("Enter an adjective (desription):");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to a  " + adjective1 + " zoo. ");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close(); 
        // ARITHMATIC OPERATORS >>>>
        double x = 11;
        double y = 2;
        double z = 18;
        z = x / y;
        //augumented assignment operators
        x += y;
        x *= y;
        System.out.println(x);*/

 /* 
        //SHOPPIN CART PROGRAM
        String item = " ";
        int quantity = 0;
        double price = 0.0;
        double total = 0.0;
        char currency = '$';
        Scanner scanner = new Scanner(System.in);
        System.out.print("What you want to buy ? :");
        item = scanner.nextLine();

        System.out.print("What quantity ? :");
        quantity = scanner.nextInt();

        System.out.print("Enter price :");
        price = scanner.nextDouble();

        total = quantity * price;
        System.out.print("You have bought " + quantity + " " + item + "/s" + "\n");
        System.out.print("-------------------------- \n");
        System.out.println("Your Total Bill :" + currency + total);

        scanner.close(); 
        Random random = new Random();
        int number;
        number = random.nextInt(1, 10);
        // MATH METHODS >>
        //  System.out.println(number);
        //  System.out.println(Math.E);
        double result;
        result = Math.pow(2, 5);
        result = Math.abs(-2);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.88);
        result = Math.max(10, 20);
        result = Math.min(10, 20);
        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius :");
        double r = scanner.nextDouble();
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.printf("The circumference is   : %.1fcm\n", circumference);
        System.out.printf("The Area is            : %.1fcm²\n", area);
        System.out.printf("The Volume        is   : %.1fcm³\n", volume);
        scanner.close(); */
        //Printf 
        String name = "Jogeswar";
        char firstletter = 'J';
        int age = 35;
        double height = 5.7;
        boolean isEmployed = true;
        // Int : %d, double %f, string %s, char %c, boolen %b >>>
        System.out.printf("Hello %s \n", name);
        System.out.printf("First letter : %c \n", firstletter);
        System.out.printf("Age : %d \n", age);
        System.out.printf("Height : %.1f \n", height);
        System.out.printf("Employment : %b \n", isEmployed);
        System.out.printf("%s is %d years old. \n", name, age);

    }
}

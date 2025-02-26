package org.example;

public class StringMethods {
    public static void main(String[] args) {
        // Length
        String secretPassword = "kitems";
        int numberOfCharactersInPassword = secretPassword.length();
        System.out.println("Password length: " + numberOfCharactersInPassword);
        if (secretPassword.length() > 12) {
            System.out.println("Longer passwords are more secure, good choice");
        } else {
            System.out.println("Consider using a longer password");
        }

        // Lowercase and Uppercase
        String email = "Clara.James@MTANEAPOLIS.edu";
        email = email.toLowerCase();
        System.out.println("Lowercase email: " + email);

        String classIdentifier = "iigs 2545";
        classIdentifier = classIdentifier.toUpperCase();
        System.out.println("Uppercase class identifier: " + classIdentifier);

        // Ends with
        System.out.println("Does email end with .edu? " + email.endsWith(".edu"));
        System.out.println("Does email end with .com? " + email.endsWith(".com"));
        String exampleEmail = "test@email.com";
        if (exampleEmail.endsWith(".edu")) {
            System.out.println("This is an education email address");
        } else {
            System.out.println("This is not an education email address");
        }

        // Starts with
        String classCode = "IJEG2545"; // Assuming user input is "IJEG2545"
        System.out.println("Does class code start with IJEG? " + classCode.startsWith("IJEG"));
        if (classCode.startsWith("IJEG")) {
            System.out.println("This is an IJEG class");
        } else {
            System.out.println("This is NOT an IJEG class");
        }

        // Contains
        String supportTicketDescription1 = "The server is down!";
        String supportTicketDescription2 = "My mouse mat is missing";
        String supportTicketDescription3 = "All the servers need to be rebooted.";
        String supportTicketDescription4 = "Server problem - All the servers need to be rebooted.";
        String supportTicketDescription5 = "I dropped my drink into the server";
        String supportTicketDescription6 = "THE SERVER DOWN!!!";

        System.out.println("Does description 1 contain 'server'? " + supportTicketDescription1.contains("server"));
        System.out.println("Does description 2 contain 'server'? " + supportTicketDescription2.contains("server"));
        System.out.println("Does description 3 contain 'server'? " + supportTicketDescription3.contains("server"));
        System.out.println("Does description 4 contain 'server'? " + supportTicketDescription4.contains("server"));
        System.out.println("Does description 5 contain 'server'? " + supportTicketDescription5.contains("server"));
        System.out.println("Does description 6 contain 'server'? " + supportTicketDescription6.contains("server"));
        //Checking for a server problem
            String serverProblem = "The SERVER IS DOWN!!";
            String searchTerm = "server";
            if (serverProblem.toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println("Found a server problem");
            } else {
                System.out.println("This is not a server problem");
            }
            String uppercaseServerProblem = serverProblem.toUpperCase();
            String uppercaseSearchTerm = searchTerm.toUpperCase();
            if (uppercaseServerProblem.contains(uppercaseSearchTerm)) {
                System.out.println("Server problem");
            } else {
                System.out.println("Not a server problem");
            }

            //Splitting a class identifier into department and code
            String javaClass = "IJEC 2545";
            String[] javaClassIdentifierParts = javaClass.split(" ");
            String department = javaClassIdentifierParts[0];
            String code = javaClassIdentifierParts[1];
            System.out.println(department);
            System.out.println(code);

            //Trimming whitespace from user address input
            String userAddressInput = " 1503 Hennepin Avenue";
            userAddressInput = userAddressInput.trim();
            System.out.println(userAddressInput);

            //Formatting and printing class information
            String className = "Java Programming";
            double credits = 6.0;
            int studentsEnrolled = 24;
            String format = "Online";

            System.out.println("The " + className + " is " + credits + " credits, delivered "
                    + format + ", there are " + studentsEnrolled + " students enrolled.");
            System.out.printf("The %s is %.3f credits, delivered %s, there are %d students enrolled%n",
                    className, credits, format, studentsEnrolled);

            System.out.println("End of example program with Java String methods!");
        }
    }

public class week1 {
        public static void main(String[] args) {
            // 1. Print Hello World! to the console
            System.out.println("Hello World!");
    
            // 2. Print two additional lines using System.out.print
            System.out.print("This is my first program\n");
            System.out.print("I am on module ST4003CEM\n");
    
            // 3. Print the specified output
            System.out.println("A \"quoted\" String is\n'much' better if you learn\nthe rules of \"escape sequences.\"\nAlso, \"\" represents an empty\nString. Don't forget: use \\\" instead of \" !\n'' is not the same as \"\n");
    
            // 4. Print the pattern
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    
            // 5. Print the pattern
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    
            // 6. Print the specified output
            System.out.println("A well-formed Java program has a main method with { and } braces.\n\nA System.out.println statement has ( and ) and usually a String that starts and ends with a \" character.\n(But we type \\\" instead!)\n\nWhat is the difference between\na ' and a \"?  Or between a \" and a \\\"?\n\nOne is what we see when we're typing our program. The other is what appears on the \"console.\"");
        }
    }
    


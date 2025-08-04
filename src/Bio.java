import java.util.Scanner;

public class Bio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // TODO: prompt for the age.
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        // TODO: use input.nextInt() to start age.

        // TODO: prompt for GPA.
        System.out.print("Enter your G.P.A: ");
        double gpa = input.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("G.P.A: " + gpa);
        // TODO: repeat for age
        // TODO: repeate for gpa.

        int gpaTruncated = (int) gpa;

        Integer gpaTruncatedWrapper = gpaTruncated;

        // I am
        // now done

        /*
        With the
        assignment.
         */
    }
}

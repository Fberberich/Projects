import java.util.Scanner;

class Project5 {
    public static void main(String[] args) {
        System.out.println("Enter the first complex number: ");
        Scanner input = new Scanner(System.in);
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        System.out.println("Enter the second complex number: ");
        double c1 = input.nextDouble();
        double d1 = input.nextDouble();
        Complex com1 = new Complex(a1, b1);
        Complex com2 = new Complex(c1, d1);
        double a2 = com1.getRealPart();
        double b2 = com1.getImaginaryPart();
        double c2 = com2.getRealPart();
        double d2 = com2.getImaginaryPart();

        // addition
        System.out.printf("\n(%.1f + %.1fi) + (%.1f + %.1fi) = %s", a2, b2, c2, d2, com1.add(com2));

        // Subtraction
        System.out.printf("\n(%.1f + %.1fi) - (%.1f + %.1fi) = %s", a2, b2, c2, d2, com1.subtract(com2));
        // Multiplication
        System.out.printf("\n(%.1f + %.1fi) * (%.1f + %.1fi) = %s", a2, b2, c2, d2, com1.Multiply(com2));
        // Division
        System.out.printf("\n(%.1f + %.1fi) / (%.1f + %.1fi) = %s", a2, b2, c2, d2, com1.add(com2));

        // Absolute value
        System.out.printf("\n|%.1f + %.1fi| = %f", a2, b2, com1.abs());
        input.close();
    }

}
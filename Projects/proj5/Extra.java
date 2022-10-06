import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first pair of x and y: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        Complex z1 = new Complex(x1, y1);

        System.out.println("Enter the second pair of x and y: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        Complex z2 = new Complex(x2, y2);

        System.out.println("Enter the third pair of x and y: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        Complex z3 = new Complex(x3, y3);
        input.close();

        ComplexTriangle triangle = new ComplexTriangle(z1, z2, z3);

        System.out.println("The area of the triangle is: " + ComplexTriangle.area(triangle));

    }

    static class ComplexTriangle extends Complex{
        private Complex point1;
        private Complex point2;
        private Complex point3;

        //constructors
        public ComplexTriangle(){
            point1 = new Complex();
            point2 = new Complex();
            point3 = new Complex();
        }

        public ComplexTriangle(Complex point1, Complex point2, Complex point3){
            this.point1 = point1;
            this.point2 = point2;
            this.point3 = point3;
        }

        //getters and setters
        public Complex getPoint1() {
            return point1;
        }

        public void setPoint1(Complex point1) {
            this.point1 = point1;
        }

        public Complex getPoint2() {
            return point2;
        }

        public void setP2(Complex point2) {
            this.point2 = point2;
        }

        public Complex getPoint3() {
            return point3;
        }

        public void setP3(Complex point3) {
            this.point3 = point3;
        }

        //methods
        public static double area(ComplexTriangle t){
 
            double a = t.getPoint1().getRealPart();
            double b = -1 * t.getPoint1().getImaginaryPart();
            //double c = 1
            double d = t.getPoint2().getRealPart();
            double e = -1 * t.getPoint2().getImaginaryPart();
            //double f = 1
            double g = t.getPoint3().getRealPart();
            double h = -1 * t.getPoint3().getImaginaryPart();
            //double i = 19

            // JA: This is not using the correct formula
            return Math.abs((a*e + b*g + d*h - e*g - b*d - a*h)/2);

        }
    }
}
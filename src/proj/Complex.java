/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

/**
 *
 * @author Johnson Eyo
 */
public class Complex {

    public static String angle(String arg) {

        return null;
    }

    public static String conjugate() {
        Accumulator acm = new Accumulator(2, 0.9);
        System.out.printf("\nConjugate of %s+%si is ", acm.getRealPart(), acm.getComplexPart());
        return String.format("\n%s%si", acm.getRealPart(), -acm.getComplexPart());
    }

    public static String conjugate(double a, double b) {

        if (b < 0) {
            b = +b;
        } else {
            b = -b;
        }

        return String.format("\nOutput is %s,%si", a, b);
    }

    public static String magnitude() {

        Accumulator acm = new Accumulator(2, 3);
        double f = Math.pow(acm.getRealPart(), 2) + Math.pow(acm.getComplexPart(), 2);
        return String.format("\nthe magnitude of %.2f+%si is %.2f", acm.getRealPart(), acm.getComplexPart(), Math.sqrt(f));

    }

    public static String magnitude(double a, double b) {

        Accumulator acm = new Accumulator(a, b);
        double f = Math.pow(acm.getRealPart(), 2) + Math.pow(acm.getComplexPart(), 2);
        return String.format("\nthe magnitude of %.2f,%si is %.2f", acm.getRealPart(), acm.getComplexPart(), Math.sqrt(f));

    }

    public static String angle() {
        return "\nthis function has been implemented yet ,press .? help for further instructions";
    }

    public static String end() {
        System.exit(0);
        return "program closed";
    }

    public String add(double real_part, double complex_part) {
        Accumulator acm = new Accumulator(2, 0.9);
        double rp = real_part + acm.getRealPart();
        double cp = complex_part + acm.getComplexPart();
        return String.format("\nOutput is %s,%si", rp, cp);

    }

    public String sub(double real_part, double complex_part) {
        Accumulator acm = new Accumulator(2, 0.9);
        double rp = real_part + (-acm.getRealPart());
        double cp = complex_part + (-acm.getComplexPart());
        return String.format("\nOutput is %s,%si", rp, cp);

    }

    public String multiply(double a, double b) {
        Accumulator acm = new Accumulator(2, 3);
        double aa = acm.getRealPart() * a;
        double bb = acm.getComplexPart() * b;
        return String.format("\nOutput is %s,%si", aa, bb);
    }

    public String divide(String arg) {
        return null;
    }

    public String add(double real_part, double complex_part, double real_part2, double complex_part2) {
        return String.format("\nOutput is %s,%si", real_part + real_part2, complex_part + complex_part2);
    }

    public String sub(double real_part, double complex_part, double real_part2, double complex_part2) {
        return String.format("\nOutput is %s,%si", real_part + (-real_part2), complex_part + (-complex_part2));
    }

    public String multiply(double a, double b, double c, double d) {
        double aa = a * c;
        double bb = b * d;
        return String.format("\nOutput is %s,%si", aa, bb);
    }

    public String div(double a, double b, double c, double d) {
        double dd = 0.0;

        if (d < 0) {
            dd = +d;
        } else {
            dd = -d;
        }

        double rp_up = a * c;
        double cp_up = b * dd;

        double rp_up2 = c * c;
        double cp_up2 = d * dd;

        return String.format("\nOutput is %s,%si/%s,%si", rp_up, cp_up, rp_up2, cp_up2);

    }

}

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
public class Launcher {

    public static void main(String[] command) {
        try {
            new Tester(command);
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("\nUsage : java -jar ComplexImpl .? help ");
            System.out.println("press ?. help for help");
            System.out.println("press ?. a+bi (operator) c+di to perform a function");
            System.out.println("press ?. cnj/mag/ang to perform operation on accumulator");
            System.out.println("press ?. end to exit program");
        }
    }
}

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
public class Command {

    public void validateCommandAlt(String[] com) throws ViolatedCommandFormatException {

        if (com.length == 3) {

            if (!com[0].equals(".?")) {
                throw new ViolatedCommandFormatException("Please start command with .? operand ");
            }
            if (!com[1].equals("add") & !com[1].equals("sub") & !com[1].equals("mul") & !com[1].equals("div")
                    & !com[1].equals("+") & !com[1].equals("-") & !com[1].equals("/") & !com[1].equals("*") & !com[1].equals("cnj") & !com[1].equals("mag")) {
                throw new ViolatedCommandFormatException("Invalid command/action, Usage ,mul,sub,div,add,-+/* ");
            }
            if (com[2].toCharArray()[0] <= 0) {
                throw new ViolatedCommandFormatException("Not a real number, Usage 0 - 20");
            }

            if (com[2].toCharArray()[1] != '+' & com[2].toCharArray()[1] != '-') {
                throw new ViolatedCommandFormatException("Invalid operand, Usage a+bi");
            }
            if (com[2].toCharArray()[2] <= 0) {
                throw new ViolatedCommandFormatException("Invalid complex part, Usage bi or ib");
            }

        } else if (com.length > 3) {
           
            if (!com[0].equals(".?")) {
                throw new ViolatedCommandFormatException("Please start command with .? operand ");
            }

            if (com[1].toCharArray()[0] <= 0) {
                throw new ViolatedCommandFormatException("Not a real number, Usage 0 - 20");
            }

            if (com[1].toCharArray()[1] != '+' & com[1].toCharArray()[1] != '-') {
                throw new ViolatedCommandFormatException("Invalid operand, Usage a+bi");
            }
            if (com[1].toCharArray()[2] <= 0) {
                throw new ViolatedCommandFormatException("Invalid complex part, Usage bi or ib");
            }
           
            if (!com[2].equals("+") & !com[2].equals("-") & !com[2].equals("/")  & !com[2].equals("mul")) {
                throw new ViolatedCommandFormatException("Invalid command/action, Usage -+/*,or any valid real part and complex part numbers ");
            }

            if (com[3].toCharArray()[0] <= 0) {
                throw new ViolatedCommandFormatException("Not a real number, Usage 0 - 20");
            }

            if (com[3].toCharArray()[1] != '+' & com[3].toCharArray()[1] != '-') {
                throw new ViolatedCommandFormatException("Invalid operand, Usage a+bi");
            }
            if (com[3].toCharArray()[2] <= 0) {
                throw new ViolatedCommandFormatException("Invalid complex part, Usage bi or ib");
            }

        } else {
            if (!com[0].equals(".?")) {
                throw new ViolatedCommandFormatException("Please start command with .? operand ");
            }
            if (!com[1].equals("cnj") & !com[1].equals("mag") & !com[1].equals("ang") & !com[1].equals("end")
                    & !com[1].equals("help")) {
                throw new ViolatedCommandFormatException("Invalid command/action, Usage cnj.mag ");
            }

        }

    }

    public String performArithmeticAlt(String[] com) {
        if (com.length < 3) {

            switch (com[1]) {
                case "cnj":

                    return Complex.conjugate();
                //Unsupported 
                case "mag":
                    return Complex.magnitude();

                case "ang":
                    return Complex.angle();

                case "end":
                    System.out.println("Program exited");
                    return Complex.end();
                    
                case "help":
                    System.out.println("press ?. help for help");
                    System.out.println("press ?. a+bi (operator) c+di to perform a function");
                    System.out.println("press ?. cnj/mag/ang to perform operation on accumulator");
                    System.out.println("press ?. end to exit program");
                    return Complex.end();    

                default:
                    return String.format("Wrong command/operation ");
            }

        } else if (com.length > 3) {

            Complex c = new Complex();

            String user_input = com[1];
            char[] u_in = user_input.toCharArray();

            double real_part = Double.parseDouble(String.valueOf(u_in[0]));
            double complex_part = Double.parseDouble(String.valueOf(u_in[1]).concat(String.valueOf(u_in[2])));

            String user_input2 = com[3];
            char[] u_in2 = user_input2.toCharArray();

            double real_part2 = Double.parseDouble(String.valueOf(u_in2[0]));
            double complex_part2 = Double.parseDouble(String.valueOf(u_in2[1]).concat(String.valueOf(u_in2[2])));

         
            
            switch (com[2]) {
              
                case "add":
                case "+":

                    return c.add(real_part, complex_part, real_part2, complex_part2);

                case "sub":
                case "-":
                    c = new Complex();
                    return c.sub(real_part, complex_part, real_part2, complex_part2);
                    
                case "mul":
                    c = new Complex();
                    return c.multiply(real_part, complex_part, real_part2, complex_part2); 
                
                case "/":
                case "div":     
                  c = new Complex();
                    return c.div(real_part, complex_part, real_part2, complex_part2);       

                default:
                    return String.format("Wrong command/operation ");
            }

        } else {

            Complex c = new Complex();
            
            double rp = 0.0;
            double cp = 0.0;
            
            String user_input = com[2];
            char[] u_in = user_input.toCharArray();

            double real_part = Double.parseDouble(String.valueOf(u_in[0]));
            double complex_part = Double.parseDouble(String.valueOf(u_in[1]).concat(String.valueOf(u_in[2])));

            switch (com[1]) {
                case "add":
                case "+":
                    c = new Complex();
                    return c.add(real_part, complex_part);

                case "sub":
                case "-":
                    c = new Complex();
                    return c.sub(real_part, complex_part);
                    
                 case "mul":
                case "*":
                    c = new Complex();
                    return c.multiply(real_part, complex_part);    

                case "cnj":

                    return Complex.conjugate(real_part, complex_part);

                case "mag":

                    return Complex.magnitude(real_part, complex_part);

                default:
                    return String.format("Wrong command/operation ");
            }

        }

    }

}

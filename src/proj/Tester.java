/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Johnson Eyo
 */
public class Tester extends Command {

    /**
     *
     * command :- 2+5j - 4+9j
     */
    public Tester(String[] com) {

        try {

            super.validateCommandAlt(com);
            String result = performArithmeticAlt(com);
            System.out.println(result);
        } catch (ViolatedCommandFormatException ex) {

            // Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            System.out.println(ex.getMessage());
        }

    }

}

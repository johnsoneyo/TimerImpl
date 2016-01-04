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
public class ViolatedCommandFormatException extends Exception {

    private String message;

    public ViolatedCommandFormatException(String string) {
        message = string;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

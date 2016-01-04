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
public class Accumulator {
    
    private final double realPart;
    private final double complexPart;

    public Accumulator(double realPart, double complexPart) {
        this.realPart = realPart;
        this.complexPart = complexPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getComplexPart() {
        return complexPart;
    }
    
    
    
}

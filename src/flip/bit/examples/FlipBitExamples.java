/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flip.bit.examples;

import java.math.BigInteger;

/**
 *
 * @author Momir Sarac
 */
public class FlipBitExamples {

    public static void main(String[] args) {

        // create 2 BigInteger objects
        BigInteger bi1, bi2;

        // assign value to bi1
        bi1 = new BigInteger("12");//1100

        // perform flipbit operation on bi1 with index 3 and store it to bi2
        bi2 = bi1.flipBit(3); // remember counting starts at 0, therefore it flips 4th bit 1100 -> 0100

        String str = "Flipbit operation on " + bi1 + " at index 3 gives " + bi2;

        // print bi2 value
        System.out.println(str);
    }
}

package com.tiennv.ec;

import java.math.BigInteger;

public class ByteArrayExample {
    public static void main(String[] args) {
        byte[] x = {0x02, 0x0};

        System.out.println(x);
        BigInteger xint = new BigInteger(x);
        System.out.println(xint);

        System.out.println("size of bits: " + xint.bitLength());

        System.out.println(xint.toString(2));
        System.out.println(xint.toString(8));
        System.out.println(xint.toString(10));
        System.out.println(xint.toString(16));

    }
}
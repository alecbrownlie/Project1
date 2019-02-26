package com.algorithms;
import java.math.BigInteger;

public class Fibonacci {

	public BigInteger getNthElement(int n) { 
        BigInteger a = BigInteger.valueOf(0); 
        BigInteger b = BigInteger.valueOf(1); 
        BigInteger c = BigInteger.valueOf(1); 
        for (int i = 2 ; i <= n; i++) 
        { 
            c = a.add(b); 
            a = b; 
            b = c; 
        } 
        return a; 
    } 
}
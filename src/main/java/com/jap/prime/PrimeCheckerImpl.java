package com.jap.prime;

import java.util.concurrent.atomic.AtomicInteger;

public class PrimeCheckerImpl {
    public boolean primeNumberCheck(int number) {
        // write the logic here to check is a number is prime or not
        PrimeChecker primeChecker = number1 -> {
            int count =0;
            boolean flag = false;
            if (number == 0 || number == 1){
                return flag;
            }
            for (int i = 2; i <number; i++) {
                if(number%i == 0){
                    count++;
                }
            }
            if (count == 0){
                flag = true;
            }
            return flag;
        };
        return primeChecker.isPrimeNumber(number);
    }
}




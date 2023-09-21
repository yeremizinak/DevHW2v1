package org.example;

public class SumCalculator {
    public int sum(int n) {
        if(n==0){
            throw new IllegalArgumentException("Cannot enter 0");
        }
        int res = 0;
        for(int i=1; i<=n; i++){
            res+=i;
        }
        return res;
    }
}



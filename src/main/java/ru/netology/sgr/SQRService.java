package ru.netology.sgr;
public class SQRService {
    public int calcNumberOfSquareNumbers(int startOfRange, int endOfRange) {
        int r=0;
        for (int i = 10;i<=99; i++) {
            if (startOfRange <= i * i && i * i <= endOfRange){
                r=r+1;
            }
        }
        return r;
    }

}
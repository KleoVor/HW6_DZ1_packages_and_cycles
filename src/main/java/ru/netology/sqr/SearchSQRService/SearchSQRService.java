package ru.netology.sqr.SearchSQRService;

public class SearchSQRService {
    public int calcSQR(int beginingRange, int endRange) {

        int i;
        int counter = 0;

        for (i = 10; i <= 99; i++) {
            if (i*i >= beginingRange & i*i <= endRange)
               counter = counter+1;

        }
        return counter;

    }

}

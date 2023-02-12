package ru.netology.sqr;

import ru.netology.sqr.SearchSQRService.SearchSQRService;

public class Main {
    public static void main(String[] args) {
        SearchSQRService service = new SearchSQRService();
        int counter = service.calcSQR(200, 400);

        System.out.println(counter);

    }
}
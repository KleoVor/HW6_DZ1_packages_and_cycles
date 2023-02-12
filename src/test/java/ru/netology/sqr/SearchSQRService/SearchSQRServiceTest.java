package ru.netology.sqr.SearchSQRService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SearchSQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/range.csv")

    public void testSearchSQRService(int expected, int beginingRange, int endRange) {
        SearchSQRService service = new SearchSQRService();
        int counter = service.calcSQR(beginingRange, endRange);

        //System.out.println(counter);

        Assertions.assertEquals(expected, counter);


    }
/*

тестить буду границы i. Т.е. i от 10 до 99 включая границы i, то граничными значеиями будут i = 9/10/11/98/99/10

0,   98,    99    i=9
1,  100,   101    i=10
1,  121,   123    i=11
1, 9603,  9604    i = 98
2, 9604,  9801    i = 99
0, 9802, 10000    i = 100

Так же проверм очень маленкое число и очень большое

0, 0,0000000000000001, 0
0, 9999, 2147395600


 */

}

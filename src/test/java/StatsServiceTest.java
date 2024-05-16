import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumAllSalesTest() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void averageSalesAmountTest() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void salesAboveAverageTest() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void salesBelowAverageTest() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }


}

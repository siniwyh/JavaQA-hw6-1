import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sum = service.sumAllSales(sales);
        long average = service.averageSalesAmount(sales);
        int maxSales = service.maxSales(sales);
        int minSales = service.minSales(sales);
        int salesBelowAvg = service.salesBelowAverage(sales);
        int salesAboveAvg = service.salesAboveAverage(sales);
        System.out.println("Сумма всех продаж: " + sum);
        System.out.println("Средняя сумма продаж в месяц: " + average);
        System.out.println("Номер месяца, в котором был пик продаж: " + maxSales);
        System.out.println("Номер месяца, в котором был минимум продаж: " + minSales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + salesBelowAvg);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + salesAboveAvg);

    }
}

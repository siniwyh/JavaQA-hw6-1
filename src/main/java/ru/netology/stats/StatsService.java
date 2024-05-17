package ru.netology.stats;


public class StatsService {
    public long sumAllSales(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum = sum + sale;

        }
        return sum;
    }

    public long averageSalesAmount(long[] sales) {
        long sum = sumAllSales(sales);
        int count = 0;

        for (int i = 0 ; i < sales.length ; i++) {
            count = count + 1;
        }
        return sum / count;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int salesAboveAverage(long[] sales) {
        int count = 0;
        long average = averageSalesAmount(sales);

        for (long sale : sales) {
            if (sale > average) {
                count = count + 1;
            }
        }

        return count;
    }

    public int salesBelowAverage(long[] sales) {
        int count = 0;
        long average = averageSalesAmount(sales);

        for (long sale : sales) {
            if (sale < average) {
                count = count + 1;
            }
        }

        return count;
    }
}

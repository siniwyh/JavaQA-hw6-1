package ru.netology.stats;


public class StatsService {
    public int sumAllSales(int[] sales) {
        int sum = 0;

        for (int i = 0 ; i < sales.length ; i++) {
            sum = sum + sales[i];

        }
        return sum;
    }

    public int averageSalesAmount(int[] sales) {
        int sum = sumAllSales(sales);
        int count = 0;

        for (int i = 0 ; i < sales.length ; i++) {
            count = count + 1;
        }
        return sum / count;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int salesAboveAverage(int[] sales) {
        int count = 0;
        int average = averageSalesAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count = count + 1;
            }
        }

        return count;
    }

    public int salesBelowAverage(int[] sales) {
        int count = 0;
        int average = averageSalesAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count = count + 1;
            }
        }

        return count;
    }
}

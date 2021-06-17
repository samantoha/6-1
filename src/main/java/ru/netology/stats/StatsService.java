package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }
    public int findAverageSum(long[] sales) {
        int averageSum = 0;
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        averageSum = sum / 12;
        return averageSum;
    }

    public int findMaxMonth(long[] sales) {
        int month = 0;
        int maxMonth = 0;
        long currentMax = sales[0];
        for (long sale : sales) {
            month += 1;
            if (currentMax <= sale) {
                currentMax = sale;
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public long findMinMonth(long[] sales) {
        int month = 0;
        int minMonth = 0;
        long currentMin = sales[0];
        for (long sale : sales) {
            month += 1;
            if (currentMin > sale) {
                currentMin = sale;
                minMonth = month;
            }
        }
        return minMonth;
    }

    public int belowAverage(long[] sales) {
        int month = 0;
        int monthAmount = 0;
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long average = sum / 12;
        long  amount = sales[0];
        for (long sale : sales) {
            month += 1;
            if (sale < average) {
                 monthAmount += 1;
            }
        }
        return monthAmount;
    }
    public int overAverage(long[] sales) {
        int month = 0;
        int monthAmount = 0;
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long average = sum / 12;
        long  amount = sales[0];
        for (long sale : sales) {
            month += 1;
            if (sale > average) {
                monthAmount += 1;  
            }
        }
        return monthAmount;
    }
}


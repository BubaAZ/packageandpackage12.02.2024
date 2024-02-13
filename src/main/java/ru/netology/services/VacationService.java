package ru.netology.services;

public class VacationService {
    public int calcMonth(int income, int expense, int threshold) {
        int money = 0;
        int count = 0;

        for (int month = 1; month < 12; month++) {
            if (money >= threshold) {
                count++;
                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать. Потратил -" + expense + ", затем ещё -" + (money - expense - ((money - expense) / 3)));
                money = ((money - expense) / 3);
            } else {
                System.out.println("Месяц " + month + ". Денег " + money + ". Придётся работать. Заработал +" + income + ", потратил -" + expense);
                money = money + income - expense;
            }
        }
        return count;
    }
}


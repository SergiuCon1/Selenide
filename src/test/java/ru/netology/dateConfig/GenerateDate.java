package ru.netology.dateConfig;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GenerateDate {

    public String setDateNotEarlyThreeDays(int days) {
        String date = LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return date;
    }
//
//    public String setDateNotEarlyTwoDays() {
//        String date = LocalDate.now().plusDays(2).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        return date;
//    }
//
//    public String setCurrentDate() {
//        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        return date;
//    }
//
//    public String setDateForOneMonth() {
//        String date = LocalDate.now().plusMonths(1).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        return date;
//    }
//
//    public String setDateForOneYear() {
//        String date = LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        return date;
//    }
}

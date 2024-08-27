package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UtilGuia1 {

    private UtilGuia1(){}

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static LocalDate getLocalDate(String dateTimeZone){
        return LocalDate.parse(dateTimeZone.substring(0,10), FORMATTER);
    }
}

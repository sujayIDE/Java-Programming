package dateandtimeapi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Demo {
    public static void main(String[] args) {
        //today date
        System.out.println("Today date :");
        LocalDate todayDate=LocalDate.now();
        System.out.println(todayDate);

        System.out.println("=====================================================");
        //covert default date format to customize format
        System.out.println("customized format : ");
        String format = todayDate.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy"));
        System.out.println(format);

        System.out.println("=============================================================");
        //specific data
        System.out.println("Specific date : ");
        LocalDate localDate=LocalDate.of(2026,12,24);
        System.out.println(localDate);


        System.out.println("==============================================================");
        //difference between two dates
        System.out.println("difference between two dates : ");
        LocalDate localDate1=LocalDate.of(2020,1,1);
        LocalDate localDate2=LocalDate.of(2026,8,24);

        System.out.println("Difference between two dates in days : "+ ChronoUnit.DAYS.between(localDate1,localDate2));
        System.out.println("Difference between two dates in months : "+ChronoUnit.MONTHS.between(localDate1,localDate2));
        System.out.println("Difference between two dates in Years  : "+ChronoUnit.YEARS.between(localDate1,localDate2));

        System.out.println("====================================================================");
        System.out.println("Display all zone id's : ");
        ZoneId.getAvailableZoneIds()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Date in specific zone :");
        System.out.println("Date in America/Caracas : "+LocalDate.now(ZoneId.of("America/Caracas")));

        System.out.println();
        System.out.println("Local Time : "+ LocalTime.now());

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("Date and time without timezone : "+localDateTime);

        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println("Date and time with timezone  : "+zonedDateTime);

        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Europe/Monaco"));
        System.out.println(now);
    }
}

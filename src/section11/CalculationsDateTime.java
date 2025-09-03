package section11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculationsDateTime {
    public static void main(String[] args) {

        LocalDate data04 = LocalDate.parse("2025-08-31");
        LocalDateTime data05 = LocalDateTime.parse("2025-08-31T23:27:47");
        Instant data06 = Instant.parse("2025-09-01T01:27:47Z");

        LocalDate pastWeekLocalDate = data04.minusWeeks(1);
        LocalDate nextWeekLocalDate = data04.plusWeeks(1);
        Duration LocalDateDuration = Duration.between(pastWeekLocalDate.atStartOfDay(), nextWeekLocalDate.atStartOfDay());

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("LocalDateDurantion = " + LocalDateDuration.toDays());

        System.out.println();

        LocalDateTime pastWeekLocalDateTime = data05.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = data05.plusWeeks(1);
        Duration LocalDateTimeDuration = Duration.between(pastWeekLocalDateTime, nextWeekLocalDateTime);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("LocalDateTimeDurantion = " + LocalDateTimeDuration.toDays());

        System.out.println();

        Instant pastWeekInstant = data06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = data06.plus(7, ChronoUnit.DAYS); // Instant não suporta semanas diretamente
        Duration InstantDuration = Duration.between(pastWeekInstant, nextWeekInstant);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
        System.out.println("InstantDurantion = " + InstantDuration.toDays());

    }
}

package section11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalToLocal {
    public static void main(String[] args) {
        LocalDate data04 = LocalDate.parse("2025-08-31");
        LocalDateTime data05 = LocalDateTime.parse("2025-08-31T23:27:47");
        Instant data06 = Instant.parse("2025-09-01T01:27:47Z");

        LocalDate r1 = LocalDate.ofInstant(data06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(data06, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(data06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(data06, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println();

        System.out.println(data04.getDayOfMonth());
        System.out.println(data04.getMonthValue());
        System.out.println(data04.getYear());

        System.out.println();

        System.out.println(data05.getSecond());
        System.out.println(data05.getMinute());
        System.out.println(data05.getHour());
        System.out.println(data05.getDayOfMonth());
        System.out.println(data05.getMonthValue());
        System.out.println(data05.getYear());

        // for (String zone : ZoneId.getAvailableZoneIds()) {
        //     System.out.println(zone);
        // }

    }
}

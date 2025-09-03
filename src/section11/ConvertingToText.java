package section11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertingToText {
    public static void main(String[] args) {
        LocalDate data04 = LocalDate.parse("2025-08-31");
        LocalDateTime data05 = LocalDateTime.parse("2025-08-31T23:27:47");
        Instant data06 = Instant.parse("2025-08-31T23:27:47Z");

        DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter format03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter format04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter format05 = DateTimeFormatter.ISO_INSTANT;

        System.out.println(data04.format(format01));
        System.out.println(format01.format(data04));
        System.out.println(data04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println();

        System.out.println(data05.format(format02));
        System.out.println(format02.format(data05));
        System.out.println(data05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println(data05.format(format04));

        System.out.println();

        System.out.println(format03.format(data06));
        System.out.println(format05.format(data06));

    }
}

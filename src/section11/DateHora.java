package section11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateHora {
    public static void main(String[] args) {
        // Instâncias de Date-Hora

        DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate data01 = LocalDate.now();
        LocalDateTime data02 = LocalDateTime.now(); // Data baseado no computador
        Instant data03 = Instant.now(); // Horário UTC+00:00, baseado no GMT - Londres

        LocalDate data04 = LocalDate.parse("2025-08-31");
        LocalDateTime data05 = LocalDateTime.parse("2025-08-31T23:27:47");
        Instant data06 = Instant.parse("2025-08-31T23:27:47Z");
        Instant data07 = Instant.parse("2025-08-31T23:27:47-03:00");

        LocalDate data08 = LocalDate.parse("31/08/2025", format01);
        LocalDateTime data09 = LocalDateTime.parse("31/08/2025 08:40", format02);

        LocalDate data10 = LocalDate.of(2025, 8, 31);
        LocalDateTime data11 = LocalDateTime.of(2025, 8, 31, 8, 43, 30);

        System.out.println(data01);
        System.out.println(data02);
        System.out.println(data03);
        System.out.println(data04);
        System.out.println(data05);
        System.out.println(data06);
        System.out.println(data07);
        System.out.println(data08);
        System.out.println(data09);
        System.out.println(data10);
        System.out.println(data11);
    }
}

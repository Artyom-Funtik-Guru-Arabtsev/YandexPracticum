<<<<<<< Updated upstream
import Trash.Airport;
import Trash.AirportDatabase;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class Practicum {
    // Задайте форматирование для времени и даты в формате часы:минуты день.месяц.год
    // Пример - 12:15 02.11.21
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd.MM.yy");
    // Задайте форматирование для времени в формате часы:минуты
    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
=======
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

>>>>>>> Stashed changes

class Practicum {
    public static void main(String[] args) {
<<<<<<< Updated upstream
        System.out.println("Тест №1:");
        printFlightInformation(
                "12:15 02.11.21",
                "VKO",
                "LED",
                30,
                1,
                55
        );

        System.out.println("\nТест №2:");
        printFlightInformation(
                "14:00 03.10.21",
                "SVX",
                "VVO",
                0,
                9,
                5
        );

        System.out.println("\nТест №3:");
        printFlightInformation(
                "06:00 12.12.21",
                "DME",
                "VVO",
                0,
                12,
                0
        );

        System.out.println("\nТест №4:");
        printFlightInformation(
                "23:00 29.03.22",
                "LED",
                "SVX",
                0,
                2,
                55
        );


    }

    private static void printFlightInformation(
            String formattedDepartureTime,
            String departureAirportCode,
            String arrivalAirportCode,
            int delay,
            int flightDurationHours,
            int flightDurationMinutes
    ) {
        Airport departureAirport;
        Airport arrivalAirport;
        // С помощью класса AirportDatabase получите данные об аэропортах вылета и посадки.
        // При получении исключения выведите сообщение исключения.
        try {
            departureAirport = AirportDatabase.getAirportByCode(departureAirportCode);
        } catch (IllegalStateException e) {
            System.out.println("Неизвестный код аэропорта: " + departureAirportCode);
            return;
        }

        try {
            arrivalAirport = AirportDatabase.getAirportByCode(arrivalAirportCode);
        } catch (IllegalStateException e) {
            System.out.println("Неизвестный код аэропорта: " + arrivalAirportCode);
            return;
        }

        // Создайте экземпляр ZonedDateTime с помощью formattedDepartureTime и зоны аэропорта вылета.
        ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.parse(formattedDepartureTime,DATE_TIME_FORMATTER),
                ZoneId.of(departureAirport.getZone()));

        // Выведите информацию о том, между какими городами будет перелёт.
        System.out.println("Ваш билет на рейс " + departureAirport.getCity() +" - " + arrivalAirport.getCity() + ":");

        // Найдите продолжительность полёта.
        Duration flightDuration = Duration.ofHours(flightDurationHours).plusMinutes(flightDurationMinutes);
        // Найдите время прибытия с учётом зоны прилёта.
        ZonedDateTime arrival = departure.plus(flightDuration).withZoneSameInstant(ZoneId.of(arrivalAirport.getZone()));

        // Заполните данные для передачи в метод печати билета.
        // Город вылета
        String departureCity = departureAirport.getCityForTicket();
        // Город прилёта
        String arrivalCity = arrivalAirport.getCityForTicket();
        // Отформатированное время прилёта
        String formattedArrivalTime = DATE_TIME_FORMATTER.format(arrival);
        // Только время вылета
        String departureTimeOnly = TIME_FORMATTER.format(departure);

        printTicket(
                formattedDepartureTime,
                departureAirportCode,
                arrivalAirportCode,
                departureCity,
                arrivalCity,
                formattedArrivalTime,
                departureTimeOnly
        );

        // Добавьте проверку на случай задержки.
        if (delay > 0) {
            // Определите продолжительность задержки.
            Duration delayDuration = Duration.ofMinutes(delay);
            // Вычислите время вылета с учётом задержки.
            ZonedDateTime departureWithDelay = departure.plus(delayDuration).withZoneSameInstant(ZoneId.of(departureAirport.getZone()));
            // Вычислите время прилёта с учётом задержки.
            ZonedDateTime arrivalWithDelay = arrival.plus(delayDuration).withZoneSameInstant(ZoneId.of(arrivalAirport.getZone()));

            System.out.println("Ваш вылет задерживается.");
            // Выведите продолжительность задержки в формате часы:минуты
            System.out.println("Задержка: " + delayDuration.toHours() + ":" + delayDuration.toMinutesPart());
            // Выведите отформатированное время вылета с учётом задержки.
            System.out.println("Обновлённое время вылета: " + DATE_TIME_FORMATTER.format(departureWithDelay));
            // Выведите отформатированное время прилёта с учётом задержки.
            System.out.println("Обновлённое время прилёта: " + DATE_TIME_FORMATTER.format(arrivalWithDelay));
        } else {
            System.out.println("Удачного полёта!");
        }
    }

    private static void printTicket(
            String departureTime,
            String departureAirportCode,
            String arrivalAirportCode,
            String departureCity,
            String arrivalCity,
            String arrivalTime,
            String departureTimeOnly
    ) {
        System.out.println(
                " _______________________________________________________\n" +
                        "|                                            |          |\n" +
                        "|  " + departureCity + "|" + departureAirportCode + "      " + departureTime + "  |   " + departureAirportCode + "    |\n" +
                        "|  " + arrivalCity + "|" + arrivalAirportCode + "      "
                        + arrivalTime + "  |   " + arrivalAirportCode + "    |\n" +
                        "|                                            |          |\n" +
                        "|  BOARDING TIME   --:--      SEAT  1A       |   " + departureTimeOnly + "  |\n" +
                        "|  GATE  23                                  |   1A     |\n" +
                        "|____________________________________________|__________|");
=======
        LocalDate secretDate = LocalDate.of(2020, 1, 10);
        LocalTime secretTime = LocalTime.of(12, 30);

        int result = decode(secretDate, secretTime);
        System.out.println(result);
    }

    private static int decode(LocalDate secretDate, LocalTime secretTime) {
        // объедините secretDate и secretTime
        LocalDateTime newTime = LocalDateTime.of(secretDate, secretTime);

        // вычтите 2 месяца, 25 дней и 100 минут
        LocalDateTime secretMoment = newTime.minusMonths(2).minusDays(25).minusMinutes(100);
        // найдите произведение порядкового номера дня в году и часов из secretMoment
        return secretMoment.getDayOfYear() * secretMoment.getHour();
>>>>>>> Stashed changes
    }
}
public class Time {
    public static String hoursAndMinutes(int k){
        int hour = k / 3600;
        int minutes = k % 3600 / 60;
        return "Часов прошло: " + hour + "\nМинут прошло: " + minutes;
    }

    public static void main(String[] args) {
        System.out.println(hoursAndMinutes(11543));
    }
}

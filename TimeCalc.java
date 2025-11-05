public class TimeCalc {
    public static void main(String[] args) {
        String[] parts = args[0].split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int minutesAdd = Integer.parseInt(args[1]);


        int totalMinutes = hours * 60 + minutes + minutesAdd;


        int newHour = (totalMinutes / 60) % 24;
        int newMinute = totalMinutes % 60;


        System.out.printf("%02d:%02d\n", newHour, newMinute);
    }
}

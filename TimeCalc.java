public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String[] parts = args[0].split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int minutesadd = Integer.parseInt(args[1]);
        int plusminutes;
        if (minutes+minutesadd>60){
             plusminutes = (minutes+minutesadd) % 60;
        }else{
             plusminutes = minutes+minutesadd;
        }
        int hoursadd;
        if (minutes+minutesadd>60){
          hoursadd = (minutesadd+minutes) / 60;  
        }else{
           hoursadd = 0; 
        }
        int newhour = hours + hoursadd;
        if (hours+hoursadd>24){
        newhour = (hours+hoursadd)%24;
        }else{
            newhour = hours+hoursadd;
        }
        if (plusminutes<10){
        System.out.println(newhour + ":0" + plusminutes);
        }else{
        System.out.println(newhour + ":" + plusminutes);
        }

            
        

    }
}

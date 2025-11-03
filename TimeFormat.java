// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
		String time24h = args[0];

        int hours24 = Integer.parseInt(time24h.substring(0, 2)); 
        String minutes = time24h.substring(3, 5); 

        String amPm;
        int hours12;

        
        if (hours24 == 0) {
            hours12 = 0; 
            amPm = "AM";
            
        } else if (hours24 >= 1 && hours24 <= 11) {
            hours12 = hours24; 
            amPm = "AM";

        } else if (hours24 == 12) {
            hours12 = 12; 
            amPm = "PM";

        } else {
            hours12 = hours24 - 12; 
            amPm = "PM";
        }
        
        String output = hours12 + ":" + minutes + " " + amPm;

        System.out.println(output);
}
}
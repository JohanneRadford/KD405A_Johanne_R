import java.util.Calendar;

import javax.swing.JOptionPane;

public class ClockLogic {

	private ClockLogic digitalClockGUI;
	private static int alarmHour;
	private static int alarmMinute;
	private static DigitalClockGUI digClockGUI;

	
	public ClockLogic (DigitalClockGUI digitalClockGUI){
		this.digClockGUI = digitalClockGUI;
		ClockThread ca = new ClockThread();
		ca.start();
		
	}
	
public static void setAlarm(int hours, int minutes){
	//alarmHour = Integer.parseInt(digClockGUI.textFieldHours.getText()) ;
	//alarmMinute = Integer.parseInt(digClockGUI.textFieldMinutes.getText()); 
	
		if (hours >= 1 && hours <= 24) {
			hours = alarmHour;

		} 
		
	
	
	if(minutes>=1 && minutes <= 60){
		minutes = alarmMinute;
		
	} 

	if (alarmHour >= 0 && alarmMinute >=0){
		
		digClockGUI.showAlarmTimeOnLabel(String.valueOf(hours) + ":" + String.valueOf(minutes));
		
	} else {
		
		digClockGUI.showAlarmTimeOnLabel("Hours must be between 1 and 24 and minutes must be between 0 and 60");


	}
		

}	
	
	
	
	public void clearAlarm(){
		
		
	}
	
	
	
	private class ClockThread extends Thread{
		@Override
		public void run() {
			while(true){
				
				Calendar c = Calendar.getInstance();
				int hour = c.get(Calendar.HOUR_OF_DAY);
				int min = c.get(Calendar.MINUTE);
				int second = c.get(Calendar.SECOND);
				
				// String time = hour+":"+ min + ":" + second;
			//	System.out.println(time);


				digClockGUI.setTimeOnLabel(String.valueOf(hour) + " : "+ String.valueOf(min) + " : " + String.valueOf(second));
				
				
				//if(Integer.parseInt(digClockGUI.textFieldHours.getText()) == alarmHour && Integer.parseInt(digClockGUI.textFieldMinutes.getText()) == alarmMinute){

			if( hour == alarmHour && min == alarmMinute){
					
					digClockGUI.activateAlarm(true);
				} else { 
					digClockGUI.activateAlarm(false);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
					return;
				}
				
			
			}
			
			
		}

			
			
	}
	


		
	}


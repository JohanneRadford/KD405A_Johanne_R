import java.util.Calendar;

public class ClockLogic {

	private ClockLogic clockLogic;
	private int alarmHour;
	private int alarmMinute;
	private DigitalClockGUI digClockGUI;

	
	public ClockLogic (DigitalClockGUI digitalClockGUI){
		this.digClockGUI = digitalClockGUI;
		ClockThread ca = new ClockThread();
		ca.start();
		
	}
	
	public void setAlarm(int hours, int minutes){
		
		
		
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
				
				//String time = hour+":"+ min + ":" + second;
			//	System.out.println(time);


				digClockGUI.setTimeOnLabel(String.valueOf(hour) + " : "+ String.valueOf(min) + " : " + String.valueOf(second));
				
				
				
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
					return;
				}
				
			
			}
			
			
		}

			
			
		}

	
		
		
	}


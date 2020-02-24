// Write a thread program to display timer where timer will get refresh after every
// 10seconds.( Use Runnable implementation ) 


package assignment.lab8;
import java.util.Date;


class TimerDisplay implements Runnable {
	
	public void run() {
		for( ;  ;  ) {
			try {
				Date d = new Date();
				System.out.println(d);
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class Excersie2DisplayTimer {

	public static void main(String[] args) {
		
		TimerDisplay td = new TimerDisplay();
		Thread t = new Thread(td);
		t.start();

	}

}

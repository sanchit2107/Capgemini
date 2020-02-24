//  Write a program to do the following operations using Thread:  Create an user defined Thread class called as “CopyDataThread .java” . 
//  This class will be designed to copy the content from one file “source.txt ” to another file “target.txt” and after every 10 characters 
// copied,   “10 characters are copied” message  will be shown to user.(Keep delay of 5 seconds after every 10 characters  read.) 
//  Create another class “FileProgram.java” which will create above thread. Pass required File Stream classes to  CopyDataThread constructor 
// and implement the above functionality. 


package assignment.lab8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDataThread extends Thread {
	
	InputStream is = null;
	OutputStream os = null;
	public CopyDataThread(InputStream is, OutputStream os) {
		this.is = is;
		this.os = os;
	}

	public void run() {
			
			int read, count = 0;
			try {
				while((read=is.read())>0) {
					count++;
					if(count == 10) {
						os.write(read);
						System.out.println("10 characters are copied");
						Thread.sleep(5000);
					}
					else {
						os.write(read);
					}
					
				}
				os.flush();
			} catch (IOException | InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	}
}

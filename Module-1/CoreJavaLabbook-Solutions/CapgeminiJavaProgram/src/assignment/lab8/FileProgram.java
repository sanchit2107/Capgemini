package assignment.lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileProgram {

	public static void main(String[] args) throws FileNotFoundException {
		
		String inFile = "C:\\JavaWorkspace\\CapgeminiJavaProgram\\src\\assignment\\lab8\\source.txt";
		String outFile = "C:\\JavaWorkspace\\CapgeminiJavaProgram\\src\\assignment\\lab8\\target.txt";
		
		File iFile = new File(inFile);
		File oFile = new File(outFile);
		
		InputStream is = null;
		OutputStream os = null;
		
		is = new FileInputStream(iFile);
		os = new FileOutputStream(oFile);
		
		CopyDataThread c1 = new CopyDataThread(is, os);
		Thread t = new Thread(c1);
		t.start();

	}

}

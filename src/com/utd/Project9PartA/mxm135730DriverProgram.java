package com.utd.Project9PartA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * 
 * @author Maaniccka Sentil Manickam Poonkundran
 * Driver Program to run the Project
 *
 */
public class mxm135730DriverProgram {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		mxm135730OperationFunction of = new mxm135730OperationFunction();
		
		/**
		 * Read the input from the file 
		 */
		BufferedReader br = new BufferedReader(new FileReader("mxm135730InputProject9PartA.txt"));
		String line = null;
		of.parseFirstLineInput(br.readLine());		// read the first line to set the no of nodes, edges and root node
		while( (line = br.readLine()) != null) 
			of.addToGraph(line);
		br.close();
		
//		of.root.PrintGraph();
		
		of.MaximumMatchingInGeneralGraph();

	}

}

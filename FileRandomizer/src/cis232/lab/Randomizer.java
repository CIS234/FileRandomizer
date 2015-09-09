package cis232.lab;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Randomizer {

	public static void main(String[] args) throws IOException{
		
		File originalFile = new File("original_list.txt");
		Scanner input = new Scanner(originalFile);
		ArrayList<String> lines = new ArrayList<>();
		ArrayList<String> randLines = new ArrayList<>();
		
		Random rn = new Random();
		int randNum;
		PrintWriter writer = new PrintWriter("randNames.txt");
		
		while(input.hasNextLine()){
			lines.add(input.nextLine());
		}
		
		int count=0;

		while(lines.size()!=0)
		{
			randNum = rn.nextInt(lines.size());
			randLines.add(lines.get(randNum));
			lines.remove(randNum);
			writer.println(randLines.get(count));
			count++;			
		}
		
		writer.close();
		
		//For testing purposes, output all the lines
//		for(String line : randLines){
//			System.out.println(randLines);
//		}
		
		input.close();
	}

}

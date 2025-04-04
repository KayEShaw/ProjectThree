package processor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class MidiCsvParser {
	static void checkLine(int length) {
		if (length != 6) {
			throw new ArithmeticException("Invalid line there aren't 6 variables");
		}
	}
	/**
	 * the function CsvProcess takes in a file parameter
	 * this function will 
	 * 1. scan in a line from the file
	 * 2. separate the six variables that should be in each line from the file
	 * 3. make a new MidiEventData object and assign it the variables value
	 * 4. store/add each object to a MidiEventData List
	 * 5. return this list
	 * @param File
	 * @return List<MidiEventData>
	 */
	public static List<MidiEventData> CsvProcess(File file) {
		List<MidiEventData> DataList = new ArrayList<>();
		
		try(Scanner scanner = new Scanner(file)){
			while(scanner.hasNextLine()) {
				//scan in line and separate variables
				String line;
				line = scanner.nextLine();
				String[] StringValues;
				StringValues = line.split(","); //separate the list
				
				checkLine(StringValues.length);//throw an exception if there aren't enough variables
				int Tick = Integer.parseInt(StringValues[0].trim());
				int OnOff = Integer.parseInt(StringValues[1].trim());
				int Channel = Integer.parseInt(StringValues[2].trim());
				int Note = Integer.parseInt(StringValues[3].trim()); 
				int Velocity = Integer.parseInt(StringValues[4].trim());
				int Instrument = Integer.parseInt(StringValues[5].trim());
				
				//make MidiEventData object and assign values
				MidiEventData object = new MidiEventData(Tick, Velocity, Note, Channel, Instrument, OnOff);
				object.toString();
				
				//add the object to the list
				DataList.add(object);
			}

		}
		catch(FileNotFoundException | ArithmeticException e ) {
		e.getMessage();
		}
		return DataList; 
	}

}

package processor;

import java.io.File;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
	File myFile = new File("testtxt");
	List<MidiEventData> events = MidiCsvParser.CsvProcess(myFile);

	for(int i = 0; i < events.size(); i++) {
		System.out.println(events.get(i));
	}
	}

}

package processor;

import java.io.File;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
	File myFile = new File("mystery_song.csv");
	List<MidiEventData> events = MidiCsvParser.CsvProcess(myFile);

	System.out.println(events);
}}

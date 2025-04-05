package main;

import java.io.File;
import java.util.List;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import processor.MidiCsvParser;
import processor.MidiEventData;

import pitch.PitchStrategy;
import pitch.HigherPitchStrategy;
import pitch.LowerPitchStrategy;

import instrument.InstrumentStrategy;
import instrument.AcousticGrandPianoStrategy;
import instrument.ElectricBassGuitarStrategy;
import instrument.TrumpetStrategy;

import abstractFactory.MidiEventFactoryAbstract;
import abstractFactory.MidiEventFactory;
import abstractFactory.StandardMidiEventFactory;
import abstractFactory.StandardMidiEventFactoryAbstract;
import abstractFactory.LegatoMidiEventFactory;
import abstractFactory.LegatoMidiEventFactoryAbstract;
import abstractFactory.StaccatoMidiEventFactory;
import abstractFactory.StaccatoMidiEventFactoryAbstract;

public class Main {
	public static void main(String[] args) {
	try {
		System.out.println("running main");
		//get sequencer
		Sequencer sequencer = MidiSystem.getSequencer();
		sequencer.open();
		//get sequence
		Sequence sequence = new Sequence(Sequence.PPQ, 384);
		//create a track
		Track track = sequence.createTrack();
		
		//get notes
		File myFile = new File("mystery_song.csv");
		List<MidiEventData> events = MidiCsvParser.CsvProcess(myFile);
		
		//get factory
		MidiEventFactoryAbstract factoryAbstract = null;
		factoryAbstract = new StandardMidiEventFactoryAbstract();
		MidiEventFactory factory = factoryAbstract.createFactory();
		
		//get instrument
		InstrumentStrategy instrument = new ElectricBassGuitarStrategy();
		instrument.applyInstrument(track, 0);
		instrument = new TrumpetStrategy();
		instrument.applyInstrument(track, 1);
		
		//choose pitch
		PitchStrategy pitch = new LowerPitchStrategy();
		
		//add the notes
		for(MidiEventData event : events) {
			int noteChanges = pitch.modifyPitch(event.getNote());
			noteChanges = pitch.modifyPitch(noteChanges);
			
			if(event.getNoteOnOff() == ShortMessage.NOTE_ON) {
				track.add(factory.CreateNoteOn(event.getStartEndTick(), noteChanges, event.getVelocity(), event.getChannel()));
			}
			else {
				track.add(factory.CreateNoteOff(event.getStartEndTick(), noteChanges, event.getChannel()));
			}
		}
		
		//playing the sequence
		sequencer.setSequence(sequence);
		sequencer.start();
		while ( sequencer . isRunning () | sequencer . isOpen ()) { Thread . sleep (100);
		}
		Thread . sleep (500);
		sequencer . close ();
	} catch(Exception e){
		e.printStackTrace();
	}

	}

}

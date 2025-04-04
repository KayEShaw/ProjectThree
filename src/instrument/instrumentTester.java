package instrument;

import javax.sound.midi.*;

public class instrumentTester {

	public static void main(String[] args) {
		try {
			/**
			 * Sequence represents your entire MIDI file 
			 * Holds one or more Track objects
			 */
			Sequence sequence = new Sequence(Sequence.PPQ, 384);
			Track track = sequence.createTrack();
			
			/**
			 * Creates an instance of the Electric Guitar class
			 */
			ElectricBassGuitarStrategy ElectricBassGuitar = new ElectricBassGuitarStrategy();
			
			/**
			 * Calls method to apply the track into the event
			 */
			ElectricBassGuitar.applyInstrument(track, 0);
			
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.setSequence(sequence);
			
			Synthesizer synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();

            // 8. Connect the synthesizer to the sequencer
            Transmitter transmitter = sequencer.getTransmitter();
            Receiver receiver = synthesizer.getReceiver();
            transmitter.setReceiver(receiver);
			
			sequencer.start();
			
			while(sequencer.isRunning()) {
				Thread.sleep(100);
			}
			sequencer.close();
			synthesizer.close();
			
		} catch (InvalidMidiDataException | MidiUnavailableException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

package processor;

public class MidiEventData {
	private int startEndTick , velocity , note , channel , noteOnOff ;
	private int instrument ;
	/**
	 * constructor method
	 * initialized the variables of the instance
	 * @param startEndTick
	 * @param velocity
	 * @param note
	 * @param channel
	 * @param instrument
	 * @param noteOnOff
	 */
	public MidiEventData(int startEndTick, int velocity, int note, int channel, int instrument, int noteOnOff) {
		System.out.println("New object created\n");
		this.startEndTick = startEndTick;
		this.velocity = velocity;
		this.note = note;
		this.channel = channel;
		this.instrument = instrument;
		this.noteOnOff = noteOnOff;
	}
	/**
	 * getter for StartEndTick
	 * @return startEndTick
	 */
	public int getStartEndTick() {
		return startEndTick;
	}
	/**
	 * setter for startEndTick
	 * @param startEndTick
	 */
	public void setStartEndTick(int startEndTick) {
		this.startEndTick = startEndTick;
	}
	/**
	 * getter for Velocity
	 * @return
	 */
	public int getVelocity() {
		return velocity;
	}
	/**
	 * setter for Velocity
	 * @param velocity
	 */
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	/**
	 * getter for note
	 * @return
	 */
	public int getNote() {
		return note;
	}
	/**
	 * setter for note
	 * @param note
	 */
	public void setNote(int note) {
		this.note = note;
	}
	/**
	 * getter for channel
	 * @return
	 */
	public int getChannel() {
		return channel;
	}
	/**
	 * setter for channel
	 * @param channel
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	/**
	 * getter for noteOnOff
	 * @return
	 */
	public int getNoteOnOff() {
		return noteOnOff;
	}
	/**
	 * setter for noteOnOff
	 * @param noteOnOff
	 */
	public void setNoteOnOff(int noteOnOff) {
		this.noteOnOff = noteOnOff;
	}
	/**
	 * getter for Instrument
	 * @return
	 */
	public int getInstrument() {
		return instrument;
	}
	/**
	 * setter for Instrument
	 * @param instrument
	 */
	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}
	
	@Override
	public String toString() {
		return "MidiEventData [startEndTick=" + startEndTick + ", noteOnOff=" + noteOnOff + ", channel=" + channel + ", note=" + note+ ", velocity=" + velocity 
				+ ", instrument=" + instrument + "]";
	}
	
}

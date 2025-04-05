package abstractFactory;

public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	/**
	 * returns a factory of type standard
	 */
	@Override
	public MidiEventFactory createFactory() {
		MidiEventFactory factory = new StandardMidiEventFactory();
		return factory;
	}
	
}

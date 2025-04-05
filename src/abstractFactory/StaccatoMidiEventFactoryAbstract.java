package abstractFactory;

public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	
	/**
	 * sends back a factory of type Staccato
	 */
	@Override
	public MidiEventFactory createFactory() {
		MidiEventFactory factory = new StaccatoMidiEventFactory();
		return factory;
	}
	
}

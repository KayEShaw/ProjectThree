package abstractFactory;

public interface MidiEventFactoryAbstract {
	/**
	 * creates a factory of the assigned type
	 * @return
	 */
	MidiEventFactory createFactory();
}

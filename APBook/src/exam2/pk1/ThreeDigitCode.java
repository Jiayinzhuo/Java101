package exam2.pk1;

public class ThreeDigitCode extends ThreeDigitInteger {
	private boolean isValid;

	/**
	 * @param aValue
	 *            a 3-digit int
	 */
	public ThreeDigitCode(int aValue) {
		super(aValue);
		isValid = isValid();
		/* implementation code */ }

	/**
	 * A ThreeDigitCode is valid if and only if the remainder when the sum of
	 * the hundreds and tens digits is divided by 7 equals the ones digit. Thus
	 * 362 is valid while 364 is not.
	 * 
	 * @return true if ThreeDigitCode is valid, false otherwise
	 */
	public boolean isValid() {
		return isValid;
		/* implementation not shown */ }

}
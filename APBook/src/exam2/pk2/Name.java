package exam2.pk2;

public class Name {

	public static void main(String[] args) {
		String firstName = getFirstName("Ms. Anjali DeSouza");
		System.out.println(firstName);
	}

	/**
	 * Precondition: - fullName starts with a title followed by a period. - A
	 * single space separates the title, first name, and last name.
	 * 
	 * Ms. Anjali DeSouza Anjali
	 * 
	 * @param fullName
	 *            a string containing a title, period, blank, and last name
	 * @return the first name only in fullName
	 */
	public static String getFirstName(String fullName) {
		final String BLANK = " ";
		String temp, firstName;

		// int k = fullName.indexOf(BLANK);
		// temp = fullName.substring(k + 1);
		// k = temp.indexOf(BLANK);
		// firstName = temp.substring(0, k);

		int k = fullName.indexOf(BLANK);
		firstName = fullName.substring(k + 1);
		k = firstName.indexOf(BLANK);
		firstName = firstName.substring(0, k);

		return firstName;
	}

}

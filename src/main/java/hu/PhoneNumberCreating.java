package hu;

public class PhoneNumberCreating {

	public static String createPhoneNumber(int[] numbers) {
		String phoneNumber = "(";
		for (int i = 0; i < 3; i++) {
			phoneNumber += numbers[i];
		}
		phoneNumber += ") ";
		for (int i = 3; i < numbers.length; i++) {
			phoneNumber += numbers[i];
			if (i == 5) {
				phoneNumber += "-";
			}
		}
		return phoneNumber;
	}
}

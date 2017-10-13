package be.pxl.lambdaexpressions.opdracht1;

public class NumberSelector {

	private NumberMachine numbermachine;

	public NumberSelector(NumberMachine numbermachine) {
		this.numbermachine = numbermachine;
	}

	public String showEvenNumbers() {
		return numbermachine.processNumbers(new NumberFilter() {

			@Override
			public boolean check(int integer) {
				return integer % 2 == 0;
			}
		});
	}

	public String showNumbersAbove(int number) {
		return numbermachine.processNumbers(i -> i > number);
	}

	public String printHexNumbers() {
		return numbermachine.convertNumbers(Integer::toHexString);
	}
}

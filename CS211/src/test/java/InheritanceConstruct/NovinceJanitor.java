package InheritanceConstruct;

public class NovinceJanitor extends Janitor {

	public NovinceJanitor(String vac, double bono) {
		super(vac, bono, false);
	}
	@Override
	public String getVacationForm() {
		String a=super.getVacationForm();
		return a+a+a+a;
	}
	@Override
	public void clean() {
		System.out.println("Workin' for the man."
				+ "\nI need more training.");
	}
}

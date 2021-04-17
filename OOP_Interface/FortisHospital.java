package OOP_Interface;

public class FortisHospital extends MedicalOrg implements USMedical, UKMedical, IndianMedical {

	// USMedical
	
	public void ambulanceServices() {
		System.out.println("FH  -- ambulanceServices");
	}

	public void cardioServices() {
		System.out.println("FH  -- cardioServices");
	}

	
	public void emergencyServices() {
		System.out.println("FH  -- emergencyServices");
	}

	
	public void orthoServices() {
		System.out.println("FH  -- orthoServices");
	}

	// UKMedical
	
	public void neuroServices() {
		System.out.println("FH  -- neuroServices");
	}

	
	public void entServices() {
		System.out.println("FH  -- entServices");
	}

	// IndianMedical
	@Override
	public void oncologyServices() {
		System.out.println("FH  -- oncologyServices");

	}

	@Override
	public void physioServices() {
		System.out.println("FH  -- physioServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH  -- pediaServices");

	}

	// non overridden methods:
	public void medicalInsurance() {
		System.out.println("FH  -- medicalInsurance");
	}

	public void medicalTraining() {
		System.out.println("FH  -- medicalTraining");
	}

	@Override
	public void billing() {
		System.out.println("US -- Medical -- Billing");
	}

	// WHO
	@Override
	public void swineFlu() {
		System.out.println("FH  -- swineFlu");

	}

	@Override
	public void covid19() {
		System.out.println("FH  -- covid19");

	}

}

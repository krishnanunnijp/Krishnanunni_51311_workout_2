package Qn4.MedicineManagement;

public class Syrup extends MedicineCompany {
    private String additionalInfo;

    public Syrup(String companyName, String[] companyAddresses) {
        super(companyName, companyAddresses);
        this.additionalInfo = "Shake well before use";
    }
    @Override
    public void displayLabels() {
        System.out.println("Company name:   " + super.getCompanyName() + "\n"
                + "Company address:  " + "\n"
                + super.getCompanyAddresses()[0] + "\n"
                + super.getCompanyAddresses()[1] + "\n"
                + super.getCompanyAddresses()[2] + "\n"
                + super.getCompanyAddresses()[3] + "\n"
                +"Additional Information:   "+this.additionalInfo );
    }
}

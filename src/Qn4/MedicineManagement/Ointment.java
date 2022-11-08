package Qn4.MedicineManagement;

class Ointment extends MedicineCompany {
    private String additionalInfo;

    public Ointment(String companyName, String[] companyAddresses) {
        super(companyName, companyAddresses);
        this.additionalInfo = "for external use only";
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

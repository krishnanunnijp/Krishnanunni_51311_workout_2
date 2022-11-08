package Qn4.MedicineManagement;

class MedicineCompany {
    private String companyName;
    private String[] companyAddresses = new String[4];

    MedicineCompany(String companyName, String[] companyAddresses) {
        this.companyName = companyName;
        this.companyAddresses = companyAddresses;
    }

    public void displayLabels() {
        System.out.println("Company name:   " + this.companyName + "\n"
                + "Company address:  " + "\n"
                + companyAddresses[0] + "\n"
                + companyAddresses[1] + "\n"
                + companyAddresses[2] + "\n"
                + companyAddresses[3]);
    }

    public String[] getCompanyAddresses() {
        return companyAddresses;
    }

    public String getCompanyName() {
        return companyName;
    }
}

package Qn4.MedicineManagement;

class Main {
    public static void main(String[] args) {
        String[] companyAddress = new String[4];                                              //Only for testing purposes
        String companyName = "NEST MEDICALS";
        companyAddress[0] = "NEST TECH-PARK";
        companyAddress[1] = "INFO PARK ROAD";
        companyAddress[2] = "KAKKANAD";
        companyAddress[3] = "KOCHI";
        MedicineCompany medicineCompany = new MedicineCompany(companyName, companyAddress);
        int a = 0;
        MedicineCompany[] medicine = new MedicineCompany[3];                                    //Assignment conditions
        for (int i = 0; i < 3; i++) {
            a = (int) (Math.random() * (3) + 1);
            switch (a) {
                case 1:
                    medicine[i] = new Tablet(companyName, companyAddress);
                    break;
                case 2:
                    medicine[i] = new Syrup(companyName, companyAddress);
                    break;
                case 3:
                    medicine[i] = new Ointment(companyName, companyAddress);
                    break;

            }
        }
        medicineCompany.displayLabels();                                                         //polymorphism evaluation and testing
        medicine[0].displayLabels();
        medicine[1].displayLabels();
        medicine[2].displayLabels();
    }
}
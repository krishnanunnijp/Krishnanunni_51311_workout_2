package Qn1.Faculty;

class FullTimeFaculty extends Faculty {
    private double basic;
    private double allowance;

    FullTimeFaculty(int facultyId, double basic, double allowance) {         //constructor is a special method reference: google.com
        super(facultyId, basic + allowance);
        this.basic = basic;
        this.allowance = allowance;

    }
    @Override
    public void printFacultyDetails(){                                              // hided the irrelevant features such as basic and allowances
        super.printFacultyDetails();
        System.out.println("Qn1.Faculty Type:"+"Full Time");
    }
}

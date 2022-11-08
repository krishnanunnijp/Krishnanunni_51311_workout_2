package Qn1.Faculty;

class PartTimeFaculty extends Faculty {
    private int hour;
    private double rate;
    PartTimeFaculty(int facultyId,int hour, double rate) {           //constructor is a special method reference: google.com
        super(facultyId,hour*rate);
        this.hour = hour;
        this.rate = rate;
    }
    @Override
    public void printFacultyDetails(){                                      // hided the irrelevant features such as  hour and rate
        super.printFacultyDetails();
        System.out.println("Qn1.Faculty Type:"+"Part-time Time");
    }

}

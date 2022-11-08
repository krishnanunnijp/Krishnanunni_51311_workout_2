package Qn1.Faculty;

class DriverClass {
    public static void main(String[] args) {
        FullTimeFaculty fullTimeFaculty1 = new FullTimeFaculty(11124, 12000, 7000);
        FullTimeFaculty fullTimeFaculty2 = new FullTimeFaculty(11137, 15000, 2000);
        PartTimeFaculty partTimeFaculty1 = new PartTimeFaculty(11125, 8, 128);
        PartTimeFaculty partTimeFaculty2 = new PartTimeFaculty(11131, 7, 543);
        fullTimeFaculty1.printFacultyDetails();
        fullTimeFaculty2.printFacultyDetails();
        partTimeFaculty1.printFacultyDetails();
        partTimeFaculty2.printFacultyDetails();
    }
}
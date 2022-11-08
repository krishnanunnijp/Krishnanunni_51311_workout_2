package Qn1.Faculty;

class Faculty {
    private int facultyId;
    private double salary;
    Faculty(int facultyId,double salary){
        this.facultyId = facultyId;
        this.salary = salary;
    }
    protected void printFacultyDetails() {
        System.out.println("Qn1.Faculty Details"+"\n"+
                "Qn1.Faculty ID:"+this.facultyId + "\n"+
                "Salary:"+this.salary );
    }
}

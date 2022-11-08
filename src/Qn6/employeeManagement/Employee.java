package Qn6.employeeManagement;

class Employee {
    String Name;
    int EmpId;
    String result;
    double ass1 = -1, ass2 = -1, ass3 = -1;

    public Employee(String name, int EmpId) {
        this.Name = name;
        this.EmpId = EmpId;
    }

    public Employee(String name, int EmpId, int ass1, int ass2, int ass3) {
        this.Name = name;
        this.EmpId = EmpId;
        setAss1(ass1);
        setAss2(ass2);
        setAss3(ass3);
        setResult();
    }

    private boolean validateScore(double score) {
        if (0 <= score && score <= 100) {
            return true;
        } else {
            return false;
        }
    }

    private boolean promoterOrNot(double score1, double score2, double score3) {
        if (75 <= score1 && 75 <= score2 && 75 <= score3) {
            return true;
        } else {
            return false;
        }
    }

    public void setAss1(double ass1) {
        if (validateScore(ass1)) {
            this.ass1 = ass1;
        } else {
            System.out.println("Not an Acceptable mark");
        }
    }

    public void setAss2(double ass2) {
        if (validateScore(ass1)) {
            this.ass2 = ass2;
        } else {
            System.out.println("Not an Acceptable mark");
        }
    }

    public void setAss3(double ass3) {
        if (validateScore(ass3)) {
            this.ass3 = ass3;
        } else {
            System.out.println("Not an Acceptable mark");
        }
    }

    public void setResult() {
        if (promoterOrNot(this.ass1, this.ass2, this.ass3)) {
            this.result = "Promoted";
        } else {
            this.result = "Demoted";
        }
    }

    public String getResult() {
        return result;
    }
}

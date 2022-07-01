

class HrDepartment extends SuperDepartment{ //HrDepartment extends SuperDepartment because it is a subclass
    @Override
    public String departmentName(){
        return "HR Department";
        // overrides the departmentName()
    }

    @Override
    public String getTodaysWork(){
        return "Fill today's worksheet and mark your attendance";
        // overrides the getTodaysWork()
    }

    @Override
    public String getWorkDeadline(){
        return "Complete by EOD";
        // overrides the getWorkDeadline()
    }

    public String doActivity(){
        return "team Lunch";
        // returns team Lunch on being called
    }
}
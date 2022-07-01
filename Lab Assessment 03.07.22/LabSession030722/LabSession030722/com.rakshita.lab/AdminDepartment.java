class AdminDepartment extends SuperDepartment{ //AdminDepartment extends SuperDepartment because it is a subclass
    @Override
    public String departmentName(){
        return "Admin Department";
        // overrides the departmentName()
    }

    @Override
    public String getTodaysWork(){
        return "Complete your documents Submission";
        // overrides getTodaysWork()
    }

    @Override
    public String getWorkDeadline(){
        return "Complete by EOD";
        // overrides the getWorkDeadline()
    }
} 
class TechDepartment extends SuperDepartment{ //TechDepartment extends SuperDepartment because it is a subclass
    @Override
    public String departmentName(){
        return "Tech Department";
        // overrides the departmentName()
    }

    @Override
    public String getTodaysWork(){
        return "Complete coding of module 1";
        // overrides the getTodaysWork()
    }

    @Override
    public String getWorkDeadline(){
        return "Complete by EOD";
        // overrides the getWorkDeadline()
    }

    public String getTechStackInformation(){
        return "core Java";
        // returns core Java on being called
    }
}
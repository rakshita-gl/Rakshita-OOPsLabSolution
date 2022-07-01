import java.lang.*;
class SuperDepartment{ //super class
    public String departmentName(){
        return "Super Department";
    // returns Super Department on being called
    }

    public String getTodaysWork(){
        return "No Work as of now";
        // returns No Work as of now on being called
    }

    public String getWorkDeadline(){
        return "Nil";
        // returns Nil on bieng called
    }

    public String isTodatAHoliday(){
        return "Today is not a holiday";
        // returns Today is not a holiday on being called
    }
}

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

public class lab030722{
    public static void main(String[] args) {
        AdminDepartment ad = new AdminDepartment();
        System.out.println("Welcome to "+ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(ad.isTodatAHoliday());

        HrDepartment hr = new HrDepartment();
        System.out.println("\nWelcome to "+hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodatAHoliday());

        TechDepartment td = new TechDepartment();
        System.out.println("\nWelcome to "+td.departmentName());
        System.out.println(td.getTodaysWork());
        System.out.println(td.getWorkDeadline());
        System.out.println(td.getTechStackInformation());
        System.out.println(td.isTodatAHoliday());
    }
}

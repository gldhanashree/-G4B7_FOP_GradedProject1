package gl_G4B7;

public class DepartmentInfo {

	public static void main(String[] args) {
	AdminDepartment Admin = new AdminDepartment();
	Admin.departmentName();
	Admin.getTodayswork();
	Admin.getWorkDeadline();
	Admin.isTodayAHoliday();

	System.out.println("");
	
	HrDepartment Hr = new HrDepartment();
	Hr.departmentName();
	Hr.doActivity();
	Hr.getTodayswork();
	Hr.getWorkDeadline();
	Hr.isTodayAHoliday();
	
	System.out.println("");
	
	TechDepartment Tech = new TechDepartment();
	Tech.departmentName();
	Tech.getTodayswork();
	Tech.getWorkDeadline();
	Tech.getTechStackInformation();
	Tech.isTodayAHoliday();
	}

}

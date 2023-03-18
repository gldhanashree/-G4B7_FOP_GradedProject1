package gl_G4B7;

public class SuperDepartment {
	public void departmentName() {
		System.out.println("Super Department");
	}
	public void getTodayswork() {
		System.out.println("No work as of now");
	}
	public void getWorkDeadline() {
		System.out.println("Nil");
	}
	public void isTodayAHoliday() {
		System.out.println("Today is not a Holiday.");
	}
}
	 class AdminDepartment extends SuperDepartment{
		public void departmentName() {
			System.out.println(" Welcome to Admin Department");
		}
		public void getTodayswork() {
			System.out.println("Complete your documents submission");
		}
		public void getWorkDeadline() {
			System.out.println("Complete by EOD");
		}
	 }
	 class HrDepartment extends SuperDepartment{
		public void departmentName() {
			System.out.println(" Welcome to HR Department");
		}
		public void doActivity() {
			System.out.println("team Lunch");
		}
		public void getTodayswork() {
			System.out.println("Fill today’s timesheet and mark your attendance");
		}
		public void getWorkDeadline() {
			System.out.println("Complete by EOD");
		}
	}
	class TechDepartment extends SuperDepartment{
		public void departmentName() {
			System.out.println(" Welcome to Tech Department");
		}
		public void getTechStackInformation() {
			System.out.println(" Core Java");
		}
		public void getTodayswork() {
			System.out.println("Complete coding of Module 1");
		}
		public void getWorkDeadline() {
			System.out.println("Complete by EOD");
		}
	}
	




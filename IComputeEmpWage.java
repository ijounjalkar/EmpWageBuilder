package empwage;

public interface IComputeEmpWage {
	 public void computeEmpWage();
	 public void addcompanyEmpWage(String company, int empRatePerHour, int numofWorkingdays, int maxhourpermonth);
	public int getTotalWage(String company);

}

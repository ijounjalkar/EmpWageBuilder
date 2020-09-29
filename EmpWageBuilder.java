public class EmpWageBuilder{
  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;

  public static int computeEmpWage(String company, int empRatePerHour, int numofWorkingdays, int maxhourpermonth) {

       int emphrs =0;
       int totalEmphrs = 0;
       int totalworkingdays = 0;
       
       while ( totalEmphrs <=  maxhourpermonth && totalworkingdays < numofWorkingdays) {
         totalworkingdays++;
         int empcheck = (int) Math.floor(Math.random()  * 10) % 3;
         switch (empcheck) {
             case IS_PART_TIME:
                    emphrs = 4;
                    break;
             case IS_FULL_TIME:
                    emphrs = 8;
                    break;
             default:
                    emphrs = 0;
                    break;
           }
           totalEmphrs += emphrs;
           System.out.println("Day#: " +totalworkingdays+ "Emp Hrs: " +emphrs);
         }
         int totalEmpWage = totalEmphrs * empRatePerHour;
         System.out.println("Total Emp Wage for company: " +company+" is: "+totalEmpWage);
         return totalEmpWage;
         javac
      }
      public static void main(String [ ] args){
            computeEmpWage( "Dmart", 20, 2, 10);
           
            }
     
} 
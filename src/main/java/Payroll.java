

/**
 *
 * @author Meena
 */
public final class Payroll 
{
    
   private String name;
   private String JobTitle;
   private double salary;
   private int hrs_weekly;
   
   
   static Assistant ass;
   static Dentist den;
   static Cleaner clen;
   static secretary seci;
   
   private Payroll()
   {
       
   }
   private Payroll(BuildMe build)
    {
        JobTitle = build.JobTitle;
        name = build.name;
        salary = build.salary;
        hrs_weekly = build.hrs_weekly;
    }
    public static class BuildMe
    {
        private String name;
        private String JobTitle;
        private double salary;
        private int hrs_weekly;
        
        //mandatory value
        public BuildMe(String JobTitle)
        {
            this.JobTitle = JobTitle;
        }
        //"SETTERS"
        public BuildMe name(String name)
        {
            this.name = name;
            return this;
        }
        public BuildMe Jobi(String JobTitle)
        {
            this.JobTitle = JobTitle;
            return this;
        }
        public BuildMe Hours(int hrs_weekly)
        {
            this.hrs_weekly = hrs_weekly;
            return this;
        }
        public BuildMe Job(double salary)
        {
            this.salary = salary;
            return this;
        }
        //RETURN OUTERCLASS IN INNERCLASS
        public BuildMe roll(Payroll pat)
        {
            this.JobTitle= pat.getJob();
            return this;
        }
        public Payroll build()
        {
            return new Payroll(this);
        }
    }
    
 //GETTERS!!!!!!!!!!
  
   public String getName()
   {
       return name;
   }
   public String getJob()
   {
       return JobTitle;
   }
    public double getSal()
   {
       return salary;
   }
     public int hrsWeek()
   {
       return hrs_weekly;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payroll dent = (Payroll) o;

        if(JobTitle.equals(dent.JobTitle)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return JobTitle.hashCode();
    }
}

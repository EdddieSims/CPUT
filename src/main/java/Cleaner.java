


/**
 *
 * @author Meena
 */
public final class Cleaner 
{
    
   private String name;
   private String JobType;
   private String CleanerType;
   
   private Cleaner()
   {
       
   }
   private Cleaner(BuildMe build)
    {
        JobType = build.JobType;
        name = build.name;
        CleanerType = build.CleanerType;
    }
    public static class BuildMe
    {
        private String name;
        private String JobType;
        private String CleanerType;
        //mandatory value
        public BuildMe(String JobType)
        {
            this.JobType = JobType;
        }
        
        //"SETTERS"
       
        public BuildMe name(String name)
        {
            this.name = name;
            return this;
        }
        public BuildMe Job(String JopType)
        {
            this.JobType = JobType;
            return this;
        }
        public BuildMe CleanerTy(String CleanerType)
        {
            this.CleanerType = CleanerType;
            return this;
        }
        
        //RETURN OUTERCLASS IN INNERCLASS
        public BuildMe clean(Cleaner cl)
        {
            this.JobType = cl.getJob();
            return this;
        }
        public Cleaner build()
        {
            return new Cleaner(this);
        }
    }
    
 //GETTERS!!!!!!!!!!
  
   public String getName()
   {
       return name;
   }
   public String getJob()
   {
       return JobType;
   }
   public String getCleaner()
   {
       return CleanerType;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cleaner priv = (Cleaner) o;

        if(JobType.equals(priv.JobType)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return JobType.hashCode();
    }
}


package model;




/**
 *
 * @author Meena
 */
public final class secretary 
{
    
   private String name;
   private String JobType;
   
   
   private secretary ()
   {
       
   }
   private secretary (BuildMe build)
    {
        JobType = build.JobType;
        name = build.name;
    }
    public static class BuildMe
    {
        private String name;
        private String JobType;
        
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
        //LISTS
       
        //RETURN OUTERCLASS IN INNERCLASS
         public BuildMe sec(secretary pat)
        {
            this.JobType= pat.getJob();
            return this;
        }
        public secretary build()
        {
            return new secretary(this);
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
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

       secretary secki = (secretary) o;

        if(JobType.equals(secki.JobType)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return JobType.hashCode();
    }
}


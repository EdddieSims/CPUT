package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.List;

/**
 *
 * @author Meena
 */
public final class Assistant 
{
    
   private String name;
   private String JobType;
   
   
   private Assistant ()
   {
       
   }
   private Assistant (BuildMe build)
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
        public BuildMe assi(Assistant ass)
        {
            this.JobType= ass.getJob();
            return this;
        }
        public Assistant build()
        {
            return new Assistant(this);
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

        Assistant priv = (Assistant) o;

        if(JobType.equals(priv.JobType)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return JobType.hashCode();
    }
}




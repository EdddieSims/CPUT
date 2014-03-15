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
public final class ITSupport   
{
    
   private String SuppName;
   private String SupportType;
   private String InvoiceDet;
   private static List<Products> prodz;
   
   private ITSupport  ()
   {
       
   }
   private ITSupport(BuildMe build)
   {
        SuppName = build.SuppName;
        SupportType = build.SupportType;
        InvoiceDet = build.InvoiceDet;
   }
    public static class BuildMe
    {
        private String SuppName;
        private String InvoiceDet;
        private String SupportType;
        
        //mandatory value
        public BuildMe(String SuppName)
        {
            this.SuppName = SuppName;
        }
        
        //"SETTERS"
       
        public BuildMe name(String SupportType)
        {
            this.SupportType = SupportType;
            return this;
        }
        public BuildMe inv(String InvoiceDet)
        {
            this.InvoiceDet = InvoiceDet;
            return this;
        }
        //LISTS
       
        //RETURN OUTERCLASS IN INNERCLASS
        public ITSupport  build()
        {
            return new ITSupport (this);
        }
        public BuildMe itt(ITSupport it)
        {
            this.SuppName= it.getSuppName();
            return this;
        }
    }
    
 //GETTERS!!!!!!!!!!
  
   public String getSuppName()
   {
       return SuppName;
        
   }
   public String getinv()
   {
       return InvoiceDet;
   }
   public String getEquip()
   {
       return SupportType;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

       ITSupport  it = (ITSupport  ) o;

        if(SuppName.equals(it.SuppName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return SuppName.hashCode();
    }
}


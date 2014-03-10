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
public final class TeethSuppliers 
{
    
   private String SuppName;
   private String teethType;
   private String InvoiceDet;
   private static List<Products> prodz;
   
   private TeethSuppliers ()
   {
       
   }
   private TeethSuppliers(BuildMe build)
   {
        SuppName = build.SuppName;
        teethType = build. teethType;
        InvoiceDet = build.InvoiceDet;
   }
    public static class BuildMe
    {
        private String SuppName;
        private String InvoiceDet;
        private String teethType;
        
        //mandatory value
        public BuildMe(String SuppName)
        {
            this.SuppName = SuppName;
        }
        
        //"SETTERS"
       
        public BuildMe name(String  teethType)
        {
            this. teethType =  teethType;
            return this;
        }
        public BuildMe inv(String InvoiceDet)
        {
            this.InvoiceDet = InvoiceDet;
            return this;
        }
        //LISTS
       
        //RETURN OUTERCLASS IN INNERCLASS
        public TeethSuppliers build()
        {
            return new TeethSuppliers(this);
        }
        public BuildMe teet(TeethSuppliers pat)
        {
            this.SuppName= pat.getSuppName();
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
       return  teethType;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeethSuppliers tee = (TeethSuppliers) o;

        if(SuppName.equals(tee.SuppName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return SuppName.hashCode();
    }
}


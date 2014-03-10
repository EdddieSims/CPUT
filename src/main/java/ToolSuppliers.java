


import java.util.List;

/**
 *
 * @author Meena
 */
public final class ToolSuppliers 
{
    
   private String SuppName;//to feix dental Tools
   private String equipType2;
   private String InvoiceDet;
   private static List<Products> prodz;
   
   private ToolSuppliers ()
   {
       
   }
   private ToolSuppliers(BuildMe build)
   {
        SuppName = build.SuppName;
        equipType2 = build. equipType2;
        InvoiceDet = build.InvoiceDet;
   }
    public static class BuildMe
    {
        private String SuppName;
        private String InvoiceDet;
        private String equipType2;
        
        //mandatory value
        public BuildMe(String SuppName)
        {
            this.SuppName = SuppName;
        }
        
        //"SETTERS"
       
        public BuildMe name(String  equipType2)
        {
            this. equipType2 =  equipType2;
            return this;
        }
        public BuildMe inv(String InvoiceDet)
        {
            this.InvoiceDet = InvoiceDet;
            return this;
        }
        //LISTS
       
        //RETURN OUTERCLASS IN INNERCLASS
         public BuildMe tooli(ToolSuppliers pat)
        {
            this.SuppName= pat.getSuppName();
            return this;
        }
        public ToolSuppliers build()
        {
            return new ToolSuppliers(this);
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
       return  equipType2;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToolSuppliers tee = (ToolSuppliers) o;

        if(SuppName.equals(tee.SuppName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return SuppName.hashCode();
    }
}

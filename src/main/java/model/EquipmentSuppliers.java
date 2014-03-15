package model;




import java.util.List;

/**
 *
 * @author Meena
 */
public final class EquipmentSuppliers  
{
    
   private String SuppName;
   private String equipType;
   private String InvoiceDet;
   private static List<Products> prodz;
   
   private EquipmentSuppliers ()
   {
       
   }
   private EquipmentSuppliers (BuildMe build)
   {
        SuppName = build.SuppName;
        equipType = build.equipType;
        InvoiceDet = build.InvoiceDet;
   }
    public static class BuildMe
    {
        private String SuppName;
        private String equipType;
        private String InvoiceDet;
        
        //mandatory value
        public BuildMe(String SuppName)
        {
            this.SuppName = SuppName;
        }
        
        //"SETTERS"
       
        public BuildMe name(String equipType)
        {
            this.equipType = equipType;
            return this;
        }
        public BuildMe inv(String InvoiceDet)
        {
            this.InvoiceDet = InvoiceDet;
            return this;
        }
        //LISTS
       
        //RETURN OUTERCLASS IN INNERCLASS
        public EquipmentSuppliers build()
        {
            return new EquipmentSuppliers(this);
        }
        public BuildMe equip(EquipmentSuppliers e)
        {
            this.SuppName= e.getSuppName();
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
       return equipType;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EquipmentSuppliers priv = (EquipmentSuppliers) o;

        if(SuppName.equals(priv.SuppName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return SuppName.hashCode();
    }
}


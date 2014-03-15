package model;




import java.util.List;

/**
 *
 * @author Meena
 */
public final class Orders  
{
    
   private String OrderNum;
   private String OrderDate;
   private String InvoiceDet;
   private static List<Products> prodz;
   
   private Orders()
   {
       
   }
   private Orders(BuildMe build)
   {
        OrderNum = build.OrderNum;
        OrderDate = build.OrderDate;
        InvoiceDet = build.InvoiceDet;
   }
    public static class BuildMe
    {
        private String InvoiceDet;
        private String OrderDate;
        private String OrderNum;
        
        //mandatory value
        public BuildMe(String OrderNum)
        {
            this.OrderNum = OrderNum;
        }
        
        //"SETTERS"
       
        public BuildMe name(String OrderDate)
        {
            this.OrderDate = OrderDate;
            return this;
        }
        public BuildMe inv(String InvoiceDet)
        {
            this.InvoiceDet = InvoiceDet;
            return this;
        }
        //LISTS
       
        //RETURN OUTERCLASS IN INNERCLASS
        public BuildMe or(Orders o)
        {
            this.OrderNum= o.getOrderNumber();
            return this;
        }
         
        public Orders build()
        {
            return new Orders(this);
        }
    }
    
 //GETTERS!!!!!!!!!!
  
   public String getOrderNumber()
   {
       return OrderNum;
        
   }
   public String getinv()
   {
       return InvoiceDet;
   }
   public String getEquip()
   {
       return OrderDate;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

       Orders  it = (Orders) o;

        if(OrderNum.equals(it.OrderNum)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return OrderNum.hashCode();
    }
}
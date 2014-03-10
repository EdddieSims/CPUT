/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Meena
 */
public final class Products  
{
    
   private String ProdId;
   private String ProdDescr;
   private String InvoiceDet;
   
   
   private Products ()
   {
       
   }
   private Products (BuildMe build)
   {
        ProdId = build.ProdId;
        ProdDescr = build.ProdDescr;
        InvoiceDet = build.InvoiceDet;
   }
    public static class BuildMe
    {
        private String InvoiceDet;
        private String ProdId;
        private String ProdDescr;
        
        //mandatory value
        public BuildMe(String ProdId)
        {
            this.ProdId = ProdId;
        }
        
        //"SETTERS"
       
        public BuildMe name(String ProdDescr)
        {
            this.ProdDescr = ProdDescr;
            return this;
        }
        public BuildMe inv(String InvoiceDet)
        {
            this.InvoiceDet = InvoiceDet;
            return this;
        }
        //LISTS
       
        //RETURN OUTERCLASS IN INNERCLASS
         public BuildMe prods(Products pat)
        {
            this.ProdId= pat.getProdId();
            return this;
        }
        public Products build()
        {
            return new Products(this);
        }
    }
    
 //GETTERS!!!!!!!!!!
  
   public String getProdId()
   {
       return ProdId;
        
   }
   public String getinv()
   {
       return InvoiceDet;
   }
   public String geProdDescr()
   {
       return ProdDescr;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

       Products  it = (Products) o;

        if(ProdId.equals(it.ProdId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return ProdId.hashCode();
    }
}
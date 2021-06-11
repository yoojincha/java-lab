class Cal{
   void sum(int a, int b){
        int result=a+b;
        System.out.println(a+" + "+b+" = "+ result);
   }
   
   void sum(double a, double b){
       double result= a+b;
       System.out.println(a+" + "+b+" = "+ result);
  }
   
   void sum(double a, int b){
        double c = (double)b;
        double result= a+c;
        System.out.println(a+" + "+b+" = "+ result);
   }
   
}

class CalSum
{
   public static void main (String[] args)
   {
      Cal cal = new Cal();
      cal.sum(10,20);
      cal.sum(10.0,20.0);
      cal.sum(10.0,20);
      
   }
}
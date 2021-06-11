class Calc{
   public static int average(int [] array){
      int sum = 0;
      
      for(int i=0; i<array.length; ++i){
         sum +=array[i];
      }
      
      return sum/array.length;
   }
   public double average(double [] array){
      double sum = 0;
      
      for(int i=0; i<array.length; ++i){
         sum +=array[i];
      }
      
      return sum/array.length;
   }
}

class Averages
{
   public static void main (String[] args)
   {
      int[] array1={1,2,3,4,5,6};
      double[] array2= {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
      
      Calc a = new Calc();
      
      System.out.println(Calc.average(array1));
      System.out.println(a.average(array2));
      
   }
}
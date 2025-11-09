class Sample
{
   static int x;
   static double y;
   static char z;
   
   static
   {
	   x=100;
	   y=2.2;
	   z='A';
   }
   public static void main(String[] args)
   {
	   System.out.println(Sample.x);
	   System.out.println(Sample.y);
	   System.out.println(Sample.z);
   }
}
public class Function {
    public static void main(String[] args) {
//        System.out.println("In main Method..");
//        wishes();
//        System.out.println("Method calling complete... ");
//        wishes();
//        System.out.println("Pyramid....\n");
        LeftPyramid();
        System.out.println("\n");
          RightPyramid();
        System.out.println("\n");
        Pyramid();

    }

    public static void wishes()
        {
        System.out.println("Hii....Mahabir Mahato");
    }
    public static void LeftPyramid()
    {
//        System.out.println("* * * * *");
//        System.out.println("* * * *");
//        System.out.println("* * *");
//        System.out.println("* *");
//        System.out.println("*");

        int rows=0;
        while(rows<5){
            System.out.print("*");
            int i=5;
            while (i>rows){
                System.out.print(" *");
                i--;
            }
            System.out.println();
            rows++;
        }
    }
      public static void RightPyramid()
      {
          System.out.println("         *");
          System.out.println("       * *");
          System.out.println("     * * *");
          System.out.println("   * * * *");
          System.out.println(" * * * * *");
      }
      public static void Pyramid()
      {
          int rows=0;
          while(rows<5){
              System.out.print("*");
              int i=0;
              while (i<rows) {
                  System.out.print(" *");
                  i++;
              }
              System.out.println();
              rows++;
          }


      }
}

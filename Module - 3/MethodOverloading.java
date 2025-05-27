class MethodOverloading {

        public static int add(int a, int b) {
        return a + b;
    }

      public static double add(double a, double b) {
        return a + b;
    }

  
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int sum1 = add(10, 20);
        double sum2 = add(5.5, 4.3);
        int sum3 = add(1, 2, 3);

        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of two doubles: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}

class TypeCastingExample {
    public static void main(String[] args) {
                double myDouble = 345.9;

                int myIntFromDouble = (int) myDouble;

                int myInt = 67;

                double myDoubleFromInt = myInt;

               System.out.println("Original double: " + myDouble);
               System.out.println("Double cast to int: " + myIntFromDouble);
               System.out.println("Original int: " + myInt);
               System.out.println("Int cast to double: " + myDoubleFromInt);
    }
}

// Demonstrate casts.
class Conversion {
    public static void main(String[] args) {
        byte b;
        float f = 179.98f;
        int i = 257;
        double d = 139.23;

        System.out.println("\nConversion of float to byte.");
        b = (byte) f;
        System.out.println("f and b " + f + " " + b);


        System.out.println("\nConversion of double to int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);

        i = 985;

        System.out.println("\nConversion of int to byte.");
        b = (byte) i;
        System.out.println("b and i " + b + " " + i);
    }

}

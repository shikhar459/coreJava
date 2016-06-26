class Scannerip {
    public static void main(String args[]) {
        int num;
        char ch;
        float f;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        System.out.println("Enter a Char");
        ch = sc.next().charAt(0);
        System.out.println("Enter a Float number");
        f = sc.nextFloat();

        System.out.println("Here are the Output");
        System.out.println("Number = " + num);
        System.out.println("Char = " + ch);
        System.out.println("Float = " + f);
    }
}
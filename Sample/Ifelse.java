class Ifelse {
    public static void main(String args[]) {
        int a = 10, b = 2;
        if (a > b) {
            System.out.println("A is Greater");
            if (b == 10) {
                System.out.println("B is = 10");
            } else {
                System.out.println("B is not = 10");
            }
        } else {
            System.out.println("B is Greater");
        }
    }
}
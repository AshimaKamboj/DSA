class print_name {
    static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Ashima");
        printName(n - 1);
    }

    public static void main(String[] args) {
        printName(5);
    }
}

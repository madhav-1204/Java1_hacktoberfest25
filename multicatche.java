class MultiTryDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 5;
            int c = a / b; // Division operation
            int[] d = {0, 1}; // Array with two elements
            System.out.println(d[10]);
            System.out.println(c);
        } 

        System.out.println("After the catch statements");
    }

}

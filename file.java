// Class A with a method that returns area (return type, no parameters)
class A {
    int length = 10;
    int breadth = 5;

    int area() {
        return length * breadth;
    }
}

class MethodDemo2 {
    public static void main(String[] args) {
        A a1 = new A(); // Create object of class A

        int r = a1.area(); // Call area method and store result
        System.out.println("The area is: " + r);
    }
}

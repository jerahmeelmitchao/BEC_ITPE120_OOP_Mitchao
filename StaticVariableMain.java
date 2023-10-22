public class StaticVariableMain {
    public static void main(String[] args) {
        // Create instances of the class
        MyClassWithStaticVariable obj1 = new MyClassWithStaticVariable();
        MyClassWithStaticVariable obj2 = new MyClassWithStaticVariable();
        MyClassWithStaticVariable obj3 = new MyClassWithStaticVariable();
        MyClassWithStaticVariable obj4 = new MyClassWithStaticVariable();
        MyClassWithStaticVariable obj5 = new MyClassWithStaticVariable();

        // Access the static variable to check the number of instances
        System.out.println("Number of instances created: " + MyClassWithStaticVariable.getInstanceCount());
    }
}

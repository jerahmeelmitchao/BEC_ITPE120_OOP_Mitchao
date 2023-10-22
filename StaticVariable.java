public class StaticVariable {
    // Static variable to count the number of instances
    private static int instanceCount = 0;

    public MyClassWithStaticVariable() {
        // Increment the instance count each time an instance is created
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}


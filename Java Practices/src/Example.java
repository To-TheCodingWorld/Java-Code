class Example {
    void modifyReference(int[] array) {
        array[0] = 100; // Modifies the object referred to by the parameter
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Example obj = new Example();
        System.out.println("Before: " + nums[0]); // Output: 1
        obj.modifyReference(nums);
        System.out.println("After: " + nums[0]); // Output: 100 (modified)
    } }
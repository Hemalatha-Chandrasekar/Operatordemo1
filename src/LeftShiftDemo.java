public class LeftShiftDemo {
   int x=2;
    public void leftShift() {
        //int x = 2;
        System.out.println("Original X value " + x);
        System.out.println("Binary repersentation :" + Integer.toBinaryString(x));
        x = x << 1;
        System.out.println("After LeftShift X value " + x);
        System.out.println("Binary repersentation :" + Integer.toBinaryString(x));
        //Step 2: X =9
        int x=9;
        System.out.println("Original X value " + x);
        System.out.println("Binary repersentation :" + Integer.toBinaryString(x));
        x=x<<23;


    }
    public void rightShift() {

    }

}

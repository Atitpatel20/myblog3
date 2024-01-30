package debug_Test;

public class Debug_SampleClass {
    public static int test1() {
        Debug_SampleClass sampleClass= new Debug_SampleClass();
        int otp = sampleClass.returnOtp();
        System.out.println(100);
        System.out.println(200);
        return otp;
    }
    private int returnOtp() {
        return 126398;
    }
}

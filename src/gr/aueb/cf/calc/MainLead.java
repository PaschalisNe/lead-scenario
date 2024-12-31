package gr.aueb.cf.calc;

public class MainLead {
    public static void main(String[] args) {

    }
    public static int add(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int div(int a, int b) { return a / b; }
    public static int mod(int a , int b) {
        if (b == 0) return 0;
        return a % b; }

}

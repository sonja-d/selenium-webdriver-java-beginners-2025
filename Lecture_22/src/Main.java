public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(10, 5);
        System.out.println(sum);
        int difference = calculator.subtrack(10, 5);
        System.out.println(difference);
    }
}
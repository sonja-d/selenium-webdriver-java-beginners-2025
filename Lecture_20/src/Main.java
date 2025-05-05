public class Main {
    public static void main(String[] args){
        String name = "Sonja";
        int age = 38;
        printName(name);
        printAge(age);

    }
    public static void printName(String name1){
        System.out.println("Hello,"+ name1);
    }
    public static void printAge(int age1) {
        System.out.println("You are " + age1 + " years old");
    }
}

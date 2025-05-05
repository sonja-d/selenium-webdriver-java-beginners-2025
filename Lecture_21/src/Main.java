public class Main {
    public static void main(String[] args){
        // getGreeting(); - hteli smo da pozovemo metodu i pozvali smo je ali ta metoda ne radi nista jer se nista ne printa
        //String greeting = getGreeting(); //zato smo napravili varijablu koja koju cemo pozvati da se printa i onda ce da vraca rezultate te metode
        //System.out.println(greeting); //i sada smo rezultate dodelili varijabli i nju smo printali vrednost metode

        //int result = addNumbers(2,3); //
        //System.out.println(result);
        //kada napravimo varijable na ovaj nacin, samo je jednom mozemo iskoristiti. zato se radi na drugi nacin:zato ceo metode direktono pozvati da se printaju
        System.out.println(getGreeting());
        System.out.println(addNumbers(2,3));

    }
    public static void printName(String name1){
        System.out.println("Hello,"+ name1);
    }
    public static void printAge(int age1) {
        System.out.println("You are " + age1 + " years old");
    }

    public static String getGreeting(){
        return "Hello, welcome to Java";
    }

    public static int addNumbers(int number1,int number2){
        return number1 + number2;
    }
}
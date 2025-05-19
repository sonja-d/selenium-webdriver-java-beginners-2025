import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test //kazemo Junitu da je ovaj metod test method. to radimo tako sto dodajemo @test
    public void addTest(){
        Calculator calculator = new Calculator();//napravili istancu
        int result = calculator.add(5,3); //pozvali smo metodu add ali smo je dodelili varijabli result radi lakse manipulacije
        Assertions.assertEquals(8,result); // sada proveravamo da li nam je kalkulacija tacna, prvo ide tacan odgovor, pa rezultat metode
    }

    @Test
    public void subtrackTest(){
        Calculator calculator = new Calculator();
        int results1 = calculator.subtrack(5,3);
        Assertions.assertEquals(2, results1);
    }
}

package cl.praxis.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

   Calculadora cl = new Calculadora();


    @Test
    void sumar() {

        double a = cl.sumar(3,2);
        assertEquals(5,a);
    }

    @Test
    void restar() {
     assertEquals(5,cl.restar(10,5));
    }

    @Test
    void multiplicar() {
     assertEquals(20,cl.multiplicar(4,5));
    }

    @Test
    void dividir() {
     ArithmeticException exception = assertThrows(ArithmeticException.class, () ->
             cl.dividir(1, 0));
     assertEquals("No se puede dividir por cero.", exception.getMessage());
     assertEquals(2,cl.dividir(10,5));
    }

    @Test
    void getValor1() {
     cl.setValor1(5);
     assertEquals(5,cl.getValor1());
    }

    @Test
    void setValor1() {
     cl.setValor1(5);
     assertEquals(5,cl.getValor1());
    }

    @Test
    void getValor2() {
     cl.setValor2(5);
     assertEquals(5,cl.getValor2());
    }

    @Test
    void setValor2() {
     cl.setValor2(5);
     assertEquals(5,cl.getValor2());
    }

    @Test
    public void constructorCalculadora(){
     Calculadora calculadora= new Calculadora(6,8) ;
     assertTrue(calculadora instanceof Calculadora);

    }
}
import dayana.Conversão;
import org.junit.Test;
import static org.junit.Assert.*;


public class ConversãoTest {
    @Test
    public void testTemperatura(){
        int valor1 = 7;
        int resultado = Conversão.temperatura(valor1);
        assertEquals(280, resultado,0.01);

    }
    @Test
    public void testVelocidade(){
        int valor1 = 72;
        double resultado = Conversão.velocidade(valor1);
        assertEquals(20, resultado,0.01);
    }
    @Test
    public void testDistancia(){
        int valor1 = 5;
        double resultado = Conversão.distancia(valor1);
        assertEquals(5000, resultado,0.01);
    }

    @Test
    public void testTempo(){
        int valor1 = 2;
        double resultado = Conversão.tempo(valor1);
        assertEquals(120, resultado,0.01);
    }


}
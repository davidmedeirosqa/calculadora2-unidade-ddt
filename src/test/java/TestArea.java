import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import com.iterasys.Main;

public class TestArea {
    @Test // Teste da área do quadrado
    public void testAreaQuadrado() {
        int valorEsperado = 25;
        int valorAtual = Main.areaQuadrado(5);
        assertEquals(valorEsperado, valorAtual);
    }

    @Test // Teste da área do retângulo
    public void testAreaRetangulo() {
        int valorEsperado = 15;
        int valorAtual = Main.areaRetangulo(5, 3);
        assertEquals(valorEsperado, valorAtual);
    }

    @Test // Teste da área do círculo
    public void testAreaCirculo() {
        float valorEsperado = 78.5f;
        float valorAtual = Main.areaCirculo(5, 3.14f);
        assertEquals(valorEsperado, valorAtual);
    }

    @Test // Teste da área do triângulo
    public void testAreaTriangulo() {
        float valorEsperado = 7.5f;
        float valorAtual = Main.areaTriangulo(5, 3);
        assertEquals(valorEsperado, valorAtual);
    }

    @ParameterizedTest // Teste de Data Driven em valores no próprio script
    @CsvSource(value = {
            "15, 10, 150",
            "25, 5, 125",
            "50, 2, 100",
            "75, 5, 375",
            "97, 4, 388"
    }, delimiter = ',')
    public void test_dd_retangulo(int base, int altura, int valorEsperado) {
        int valorAtual = Main.areaRetangulo(base, altura);
        assertEquals(valorEsperado, valorAtual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/valorestriangulo.csv", numLinesToSkip = 1, delimiter = ',')
    public void test_dd_csv_triangulo(float base, float altura, float valorEsperado) {
        float valorAtual = Main.areaTriangulo(base, altura);
        assertEquals(valorEsperado, valorAtual);
    }
}

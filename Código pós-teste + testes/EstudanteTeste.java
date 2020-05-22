import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

// Classe que implementa o conjunto de casos de teste T(P_)
public class EstudanteTeste {

    // Implementação do caso de teste <10310342,5.0,5.0,5.0, inválido>
    @Test
    public void casoTeste1() {
        // A exceção é lançada a partir do construtor
        assertThrows(IllegalArgumentException.class, () -> {
            new Estudante("10310342", "5.0", "5.0", "5.0");
        });
    }

    // Implementação do caso de teste <103103,5.0,5.0,5.0, inválido>
    @Test
    public void casoTeste2() {
        // A exceção é lançada a partir do construtor
        assertThrows(IllegalArgumentException.class, () -> {
            new Estudante("103103", "5.0", "5.0", "5.0");
        });
    }

    // Implementação do caso de teste <103s103,5.0,5.0,5.0, inválido>
    @Test
    public void casoTeste3() {
        // A exceção é lançada a partir do construtor
        assertThrows(IllegalArgumentException.class, () -> {
            new Estudante("103s103", "5.0", "5.0", "5.0");
        });
    }

    // Implementação do caso de teste <,5.0,5.0,5.0, inválido>
    @Test
    public void casoTeste4() {
        // A exceção é lançada a partir do construtor
        assertThrows(IllegalArgumentException.class, () -> {
            new Estudante("", "5.0", "5.0", "5.0");
        });
    }

    // Implementação do caso de teste <10310342,,5.0,5.0, inválido>
    @Test
    public void casoTeste5() {
        // A exceção é lançada a partir do construtor
        assertThrows(IllegalArgumentException.class, () -> {
            new Estudante("10310342", "", "5.0", "5.0");
        });
    }

    // Implementação do caso de teste <10310342,11,5.0,5.0, inválido>
    @Test
    public void casoTeste6() {
        // A exceção é lançada a partir do construtor
        assertThrows(IllegalArgumentException.class, () -> {
            new Estudante("10310342", "11", "5.0", "5.0");
        });
    }

    // Implementação do caso de teste <10310342,-2,5.0,5.0, inválido>
    @Test
    public void casoTeste7() {
        // A exceção é lançada a partir do construtor
        assertThrows(IllegalArgumentException.class, () -> {
            new Estudante("10310342", "-2", "5.0", "5.0");
        });
    }

    // Implementação do caso de teste <10310342,5,0,5,0,5,0, inválido>
    @Test
    public void casoTeste8() {
        // A exceção é lançada a partir do construtor
        assertThrows(IllegalArgumentException.class, () -> {
            new Estudante("10310342", "5,0", "5,0", "5,0");
        });
    }

    // Implementação do caso de teste <1031030,5.0,5.0,5.0, válido>
    @Test
    public void casoTeste9() {
        Estudante e = new Estudante("1031030", "5.0", "5.0", "5.0");
        assertEquals(1031030, e.getNusp());
    }

    // Implementação do caso de teste <1031030,0,5.0,5.0, válido>
    @Test
    public void casoTeste10() {
        Estudante e = new Estudante("1031030", "0", "5.0", "5.0");
        assertEquals(1031030, e.getNusp());
    }

    // Implementação do caso de teste <1031030, 0,5.0,5.0, válido>
    @Test
    public void casoTeste11() {
        Estudante e = new Estudante("1031030", "10", "5.0", "5.0");
        assertEquals(1031030, e.getNusp());
    }
}
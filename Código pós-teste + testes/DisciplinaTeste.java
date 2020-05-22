import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

// Classe que implementa o conjunto de casos de teste T(P) 
public class DisciplinaTeste {

    // Implementação do caso de teste <  , inválido>
    @Test
    public void casoTeste1() {
      // A exceção é lançada a partir do construtor
      assertThrows(IllegalArgumentException.class, () -> {
      new Disciplina("");
      });
    }


    // Implementação do caso de teste <SCCC0620, inválido>
    @Test
    public void casoTeste2() {
      // A exceção é lançada a partir do construtor
      assertThrows(IllegalArgumentException.class, () -> {
      new Disciplina("SCCC0620");
      });
    }


    // Implementação do caso de teste <SC0620, inválido> 
    @Test
    public void casoTeste3() {
      // A exceção é lançada a partir do construtor
      assertThrows(IllegalArgumentException.class, () -> {
      new Disciplina("SC0620");
      });
    }

    // Implementação do caso de teste <SCCCENG, inválido> 
    @Test
    public void casoTeste4() {
      // A exceção é lançada a partir do construtor
      assertThrows(IllegalArgumentException.class, () -> {
      new Disciplina("SCCCENG");
      });
    }

    // Implementação do caso de teste <3200620, inválido> 
    @Test
    public void casoTeste5() {
      // A exceção é lançada a partir do construtor
      assertThrows(IllegalArgumentException.class, () -> {
      new Disciplina("3200620");
      });
    }

    // Implementação do caso de teste <SCC0620, válido> 
    @Test
    public void casoTeste6(){
      String cod = "SCC0620";
      Disciplina d = new Disciplina(cod);
      assertEquals(cod,d.getCodigo());
    }
} 
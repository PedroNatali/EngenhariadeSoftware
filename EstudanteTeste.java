// import org.junit.Test;
// import static org.junit.Assert.assertEquals;
// import org.junit.Before;

// // Classe que implementa o conjunto de casos de teste T(P_)
// public class EstudanteTeste {
//     Estudante estudante;
//     String valido = "NUSP válido";
//     String invalido = "NUSP inválido";
//     String result; 

//     // Método que é sempre executado antes de executar cada teste
//     @Before
//     public void init(){
//         estudante = new Estudante();
//         result = "";
//     }

//     /* Implementação do caso de teste <1031032, válido> */
//     @Test
//     public void casoTeste1 (){
//     result = estudante.validacaoNUSP("SCC0620,valido");
//     assertEquals(valido, result);
//     }

//     /* Implementação do caso de teste <10310342, inválido> */
//     @Test
//     public void casoTeste2 (){
//     result = estudante.validacaoNUSP("10310342,invalido");
//     assertEquals(invalido, result);
//     }

//      /* Implementação do caso de teste <103103, inválido> */
//     @Test
//     public void casoTeste3 (){
//     result = estudante.validacaoNUSP("103103,invalido");
//     assertEquals(invalido, result);
//     }

//      /* Implementação do caso de teste <103s103, inválido> */
//     @Test
//     public void casoTeste4 (){
//     result = estudante.validacaoNUSP("103s103,invalido");
//     assertEquals(invalido, result);
//     }     
// }
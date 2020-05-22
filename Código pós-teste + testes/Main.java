
import java.util.Scanner;
public class Main{


    private static void menu() {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        Disciplina discip_SCC = null;

        // Criando disciplina
        System.out.println("\n\n### Programa Nota Final ###");
        System.out.println("Crie uma disciplina para acessar o Sistema\n");
        System.out.println("Digite o codigo da disciplina");
        String codigo = ler.next();
        ler.nextLine(); 

        int a = 1;
        while(a == 1){
            try{
                discip_SCC = new Disciplina(codigo);
                a = 0;
            }catch(IllegalArgumentException e){
                System.out.println("Codigo invalido, digite novamente");
                codigo = ler.next();
                ler.nextLine();
            }
        }
        
        //Iteracao do Menu
        do {
            System.out.println("\n\n                                 ### Sistema do Professor ###");
            System.out.println("\n                  =========================================================");
            System.out.println("                  |     1 -  Matricular Aluno                                |");
            System.out.println("                  |     2 -  Consultar quantidade de Alunos                  |");
            System.out.println("                  |     3 -  Consultar quantidade de Alunos APROVADOS        |");
            System.out.println("                  |     4 -  Consultar quantidade de Alunos REPROVADOS       |");
            System.out.println("                  |     5 -  Consultar Informações de um Aluno               |");
            System.out.println("                  |     6 -  Imprimir lista ordenada pelo Nusp               |");
            System.out.println("                  |     7 -  Imprimir lista ordenada pela média final        |");
            System.out.println("                  |     8 -  Imprimir lista de aprovados                     |");
            System.out.println("                  |     9 -  Imprimir lista de reprovados                    |");
            System.out.println("                  ===========================================================\n");

            System.out.println("Opção -> \n");
            
            opcao = ler.nextInt();
            ler.nextLine();

            System.out.print("\n");

            switch (opcao) {

            //Matricula aluno      
            case 1:
                System.out.println("Digite as seguintes informações do aluno");
                System.out.println("Nusp");
                String nusp = ler.next();
                ler.nextLine();

                System.out.println("notaP1 - decimal com .");
                String p1 = ler.next();
                ler.nextLine();
                System.out.println("notaP2 - decimal com .");
                String p2 = ler.next();
                ler.nextLine();
                System.out.println("notaP3 - decimal com .");
                String p3 = ler.next();
                ler.nextLine();

                Estudante estudante = null;

                a = 1;
                while(a == 1){
                    try{
                        estudante = new Estudante(nusp, p1, p2, p3);
                        a = 0;
                    }catch(IllegalArgumentException e){
                        System.out.println("Dados invalidos, digite novamente");
                        System.out.println("Nusp");
                        nusp = ler.next();
                        ler.nextLine();

                        System.out.println("notaP1");
                        p1 = ler.next();
                        ler.nextLine();
                        System.out.println("notaP2");
                        p2 = ler.next();
                        ler.nextLine();
                        System.out.println("notaP3");
                        p3 = ler.next();
                        ler.nextLine();
                    }
                }

                discip_SCC.matriculaEstudante(estudante);
                break;

            //Consulta quantidade de alunos
            case 2:
                int quantidade = discip_SCC.quantidadeAlunos();
                System.out.printf("Há %d alunos nesta Disciplina \n", quantidade);
                break;
                
            //Consulta quantidade de Aprovados    
            case 3:
                int qApr = discip_SCC.quantidadeAprovados();
                System.out.printf("Há %d alunos aprovados nesta Disciplina \n", qApr);
                break;

            //Consulta quantidade de Reprovados    
            case 4:
                int quantidade1 = discip_SCC.quantidadeAlunos();
                int qApr1 = discip_SCC.quantidadeAprovados();
                int qRep = quantidade1 - qApr1;
                
                System.out.printf("Há %d alunos reprovados nesta Disciplina \n", qRep);
                break;

            //Consulta informacoes de um aluno
            case 5:
                System.out.println("Informe o numero USP do aluno em questao \n");
                
                int nuspAux = ler.nextInt();
                ler.nextLine();

                String s = discip_SCC.informacoesAluno(nuspAux);
                if (!s.equals("Válido")){
                    System.out.println("Aluno não existente");
                }
                break;

            //Ordena pelo No.Usp
            case 6:
                discip_SCC.imprime_ord_nusp();
                break;

            //Ordena pela MFP    
            case 7:
                discip_SCC.imprime_ord_med();
                break;  

            //Imprime aprovados
            case 8:
                discip_SCC.imprime_aprovados();
                break;

            //Imprime reprovados
            case 9:
                discip_SCC.imprime_reprovados();
                break;
            
            //Encerra o sistema
            case 0:
                break;

            // Caso default
            default:
                System.out.println("Opção Inválida!");
                break;
            }
        } while (opcao != 0);
        ler.close();
    }

    public static void main(String[] args) {
        menu();
        System.out.println("Programa encerrado.");
        
    }

}
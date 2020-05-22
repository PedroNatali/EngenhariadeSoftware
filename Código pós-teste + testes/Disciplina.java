
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Disciplina {
    final static String codExpected = "SCC";
    // Atributos
    private String codigo;
    static ArrayList<Estudante> estudantes = new ArrayList<Estudante>();

    public static boolean ehInteiro(String s) {
        // cria um array de char
        char[] c = s.toCharArray();
        boolean d = true;

        for (int i = 0; i < c.length; i++) {
            // verifica se o char não é um dígito
            if (!Character.isDigit(c[i])) {
                d = false;
                break;
            }
        }

        return d;
    }

    // Construtor
    public Disciplina(String codigo) throws IllegalArgumentException {
        try {
            validaCodigo(codigo);
            this.codigo = codigo;
        } catch (IllegalArgumentException e) {
            // System.out.println("Código inválido");
            throw e;
        }
    }

    public void validaCodigo(String codigo) throws IllegalArgumentException {
        if (codigo.length() != 7) {
            throw new IllegalArgumentException();
        }

        String cod = codigo.substring(0, 3);

        if (!cod.equals(codExpected)) {
            throw new IllegalArgumentException();
        }

        if (!ehInteiro(codigo.substring(3, 7))) {
            throw new IllegalArgumentException();
        }
    }

    // Métodos
    public String getCodigo() {
        return codigo;
    }

    // A validação do código também deve ser feita aqui
    public void setCodigo(String codigo) {
        validaCodigo(codigo);
        this.codigo = codigo;
    }

    public void matriculaEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public int quantidadeAlunos() {
        return estudantes.size();
    }

    public int quantidadeAprovados() {
        int count = 0;

        Iterator<Estudante> it = estudantes.iterator();

        while (it.hasNext()) {
            Estudante atual = it.next();
            if (atual.getAprovado() == 1) {
                count++;
            }
        }
        return count;
    }

    public String informacoesAluno(int nusp) {
        String v = "Válido";
        String iv = "Inválido";
        Iterator<Estudante> it = estudantes.iterator();
        int a = 0;
        while (it.hasNext()) {
            Estudante atual = it.next();
            if (atual.getNusp() == nusp) {
                System.out.printf("Nusp: %s  |  Nota P1: %.2f  |  Nota P2: %.2f  |  Nota P3: %.2f  |  MFP: %.2f.\n",
                        atual.getNusp(), atual.getNotaP1(), atual.getNotaP2(), atual.getNotaP3(), atual.getMFP());
                a = 1;
            }

        }
        if (a == 1) {
            return v;
        } else {
            return iv;
        }
    }

    public void imprime_ord_nusp() {
        Collections.sort(estudantes);
        Iterator<Estudante> it = estudantes.iterator();
        while (it.hasNext()) {
            Estudante atual = it.next();
            System.out.printf("Nusp: %s  |  Nota P1: %.2f  |  Nota P2: %.2f  |  Nota P3: %.2f  |  MFP: %.2f.\n",
                    atual.getNusp(), atual.getNotaP1(), atual.getNotaP2(), atual.getNotaP3(), atual.getMFP());
        }
    }

    public void imprime_ord_med() {

        int i = estudantes.size();
        Estudante[] est_aux;
        est_aux = new Estudante[i];

        Iterator<Estudante> it2 = estudantes.iterator();

        // Cria um vetor igual a lista que ja temos
        i = 0;
        while (it2.hasNext()) {
            Estudante atual = it2.next();
            est_aux[i] = atual;
            i++;
        }

        // A partir do vetor criado, faz bubble sort nele
        Estudante auxiliar;
        for (i = 0; i < estudantes.size() - 1; i++) {
            if (est_aux[i].getMFP() > est_aux[i + 1].getMFP()) {
                auxiliar = est_aux[i];
                est_aux[i] = est_aux[i + 1];
                est_aux[i + 1] = auxiliar;
            }
        }

        // Imprime descendente
        for (i = estudantes.size() - 1; i >= 0; i--) {
            System.out.printf("Nusp: %s  |  Nota P1: %.2f  |  Nota P2: %.2f  |  Nota P3: %.2f  |  MFP: %.2f.\n",
                    est_aux[i].getNusp(), est_aux[i].getNotaP1(), est_aux[i].getNotaP2(), est_aux[i].getNotaP3(),
                    est_aux[i].getMFP());
        }

    }

    public void imprime_aprovados() {
        Iterator<Estudante> it = estudantes.iterator();
        while (it.hasNext()) {
            Estudante atual = it.next();
            if (atual.getAprovado() == 1) {
                System.out.printf("Nusp: %s  |  Nota P1: %.2f  |  Nota P2: %.2f  |  Nota P3: %.2f  |  MFP: %.2f.\n",
                        atual.getNusp(), atual.getNotaP1(), atual.getNotaP2(), atual.getNotaP3(), atual.getMFP());
            }
        }

    }

    public void imprime_reprovados() {
        Iterator<Estudante> it = estudantes.iterator();
        while (it.hasNext()) {
            Estudante atual = it.next();
            if (atual.getAprovado() == 0) {
                System.out.printf("Nusp: %s  |  Nota P1: %.2f  |  Nota P2: %.2f  |  Nota P3: %.2f  |  MFP: %.2f.\n",
                        atual.getNusp(), atual.getNotaP1(), atual.getNotaP2(), atual.getNotaP3(), atual.getMFP());
            }
        }
    }
}

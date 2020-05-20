

public class Estudante implements Comparable<Estudante> {
    private int nusp;
    private float notaP1;
    private float notaP2;
    private float notaP3;
    private float MFP;
    private int aprovado;

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

    public Estudante(String nusp2, String P1, String P2, String P3) throws IllegalArgumentException{


        int nusp = Integer.parseInt(nusp2);
        Float notaP1 = Float.parseFloat(P1);
        Float notaP2 = Float.parseFloat(P2);
        Float notaP3 = Float.parseFloat(P3);
        
        String v = validaEstudante(nusp, notaP1, notaP2, notaP3);   

        

        if(v.equals("Invalido")){
            throw new IllegalArgumentException("Invalido");
        }

        this.nusp = nusp;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaP3 = notaP3;
        this.MFP = ((notaP1 + notaP2 + notaP3) / 3);

        if(MFP >= 5){
            this.aprovado = 1;
        } else {
            this.aprovado = 0;
        }
    }

    public String validaEstudante(int nusp, float notaP1, float notaP2, float notaP3){
        int a = 0;
        String iv = "Invalido";
        String v = "Valido";
        while(a != 1){
            String nusp_teste = Integer.toString(nusp);
            if(nusp_teste.length() > 7){
                return iv;
            }else{
                if(ehInteiro(nusp_teste)){
                    a = 1;
                    return v;
                }else{
                    return iv;
                }
            }
        }
        return v;
    }

    @Override
    public int compareTo(Estudante e) {
        Integer nusp1 = this.getNusp();
        Integer nusp2 = e.getNusp();
        return - nusp1.compareTo(nusp2);
    }


    // Métodos Set
    public void setNotaP1(float notaP1){
        this.notaP1 = notaP1;
    }

    public void setNotaP2(float notaP2){
        this.notaP2 = notaP2;
    }

    public void setNotaP3(float notaP3){
        this.notaP3 = notaP3;
    }

    public void setNusp(int nusp){
        this.nusp = nusp;
    }

    //Métodos get

    public int getNusp(){
        return nusp;
    }

    public float getNotaP1(){
        return notaP1;
    }
    
    public float getNotaP2(){
        return notaP2;
    }
    
    public float getNotaP3(){
        return notaP3;
    }

    public float getMFP(){
        return MFP;
    }

    public int getAprovado(){
        return aprovado;
    }
}
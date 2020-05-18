public class Estudante implements Comparable<Estudante> {
    private int nusp;
    private float notaP1;
    private float notaP2;
    private float notaP3;
    private float MFP;
    private int aprovado;

    public Estudante(int nusp, float notaP1, float notaP2, float notaP3){
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
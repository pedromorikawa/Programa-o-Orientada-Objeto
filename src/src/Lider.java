public class Lider extends Salario{

    public Lider(double valorhora,int horast){
        this.horast = horast;
        this.valorhora = valorhora;
    }

    public double salariofinal(){
        final double valor = (valorhora*horast) + ((valorhora*horast) * 0.02);
        return valor;
    }
    public double getValorhora(){
        return valorhora;
    }

    public int getHorast(){
        return horast;
    }

}

public class Gerente extends Salario{

    public Gerente(double valorhora,int horast){
        this.horast = horast;
        this.valorhora = valorhora;
    }
    public double salariofinal(){
        final double valor = (valorhora*horast) + ((valorhora*horast) * 0.05);
        return valor;
    }

    public double getValorhora(){
        return valorhora;
    }

    public int getHorast(){
        return horast;
    }

}

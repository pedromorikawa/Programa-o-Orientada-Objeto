public class Funcionario extends Salario {
    public Funcionario(double valorhora,int horast){
        this.horast = horast;
        this.valorhora = valorhora;
    }
    public double salariofinal(){
        final double valor = valorhora*horast;
        return valor;
    }

    public double getValorhora(){
        return valorhora;
    }

    public int getHorast(){
        return horast;
    }
}

package aula05;
/**
 *
 * @author jdhein
 */
public class ContaBanco {
    
    private String nomeTitular;
    private int numero;
    private double saldo;
    private double chequeEspecial;

    public ContaBanco(String nomeTitular, int numero, double saldo, double chequeEspecial) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }
    
    public ContaBanco(){
        
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean transferir(double valorTransferencia, 
            ContaBanco objContaDestino){
        
        if(this.sacar(valorTransferencia)){
            objContaDestino.depositar(valorTransferencia);
            return true;
        }else{
            return false;
        }
        
    }
    
}

package aula05;
/**
 *
 * @author jdhein
 */
public class TestaContaBanco {
    
    public static void main(String[] args) {
        
        ContaBanco objConta1 = new ContaBanco();
        objConta1.setNomeTitular("Pessoa 1");
        objConta1.setNumero(111);
        objConta1.setSaldo(300);
        
        ContaBanco objConta2 = new ContaBanco();
        objConta2.setNomeTitular("Pessoa 2");
        objConta2.setNumero(333);
        objConta2.setSaldo(1000);
        
        System.out.println("SALDO CONTA 1: " + objConta1.getSaldo());
        System.out.println("SALDO CONTA 2: " + objConta2.getSaldo());
        
        System.out.println("Depositar R$ 100 na Conta1");
        objConta1.depositar(100);
        //double novoSaldo = objConta1.getSaldo() + 100;
        //objConta1.setSaldo(novoSaldo);
        
        System.out.println("SALDO CONTA 1: " + objConta1.getSaldo());
        System.out.println("SALDO CONTA 2: " + objConta2.getSaldo());        
        
        System.out.println("Sacar R$ 400 da Conta2");
        objConta2.sacar(400);
        //double novoSaldo = objConta2.getSaldo() - 400;
        //objConta2.setSaldo(novoSaldo);
        
        System.out.println("SALDO CONTA 1: " + objConta1.getSaldo());
        System.out.println("SALDO CONTA 2: " + objConta2.getSaldo());
        
        System.out.println("Transferir R$ 1000 da Conta1 para a Conta2");
        objConta1.transferir(1000, objConta2);
        /*if(objConta1.sacar(1000)){
            objConta2.depositar(1000);
        }*/
        //double novoSaldoConta1 = objConta1.getSaldo() - 100;
        //double novoSaldoConta2 = objConta2.getSaldo() + 100;
        //objConta1.setSaldo(novoSaldoConta1);
        //objConta2.setSaldo(novoSaldoConta2);
        
        System.out.println("SALDO CONTA 1: " + objConta1.getSaldo());
        System.out.println("SALDO CONTA 2: " + objConta2.getSaldo());

        
    }
    
}

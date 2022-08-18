package aula04;

/**
 *
 * @author jdhein
 */
public class TestaPessoa {
    
    public static void main(String[] args){
        
        Pessoa objPessoa1 = new Pessoa(); //instanciar um objeto do tipo Pessoa
        objPessoa1.setNome("Jonas Dhein");
        objPessoa1.setCidade("Teutônia");
        objPessoa1.setIdade(33);
        objPessoa1.setAluno(false);
        
        Pessoa objPessoa2 = new Pessoa("Juca Bala", "Lajeado", 25, true);
        
        System.out.println(objPessoa1);
        
       
    }
    
}

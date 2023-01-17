
package projetopolimorfismo;


public class Canguru extends Mamifero {
    
    // tipos e parametros , aqui não tem tipo  e nem parametro (qauntidade e tipo de parametros), mas
    // a assiantura é igual ambas não tem , porem a resposta é diferente 
    
    @Override
    public void locomover(){
        System.out.println("Saltando"); // alterado para saltando, em mamifero correndo
    }
    
    public void usarBolsa(){
            System.out.println("Usando bolsa");
    }
    
}

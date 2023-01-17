
package projetopolimorfismo;

public class ProjetoPolimorfismo {

   
    public static void main(String[] args) {
        
        //SOBREPOSIÇÃO MANEIRAS DIFERENTES 
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruaga = new Tartaruga();
        Goldfish gold = new Goldfish();
        Arara arara = new Arara();
        
        m.setPeso(35.3f);
        m.setCorPelo("Marron");
        m.setMembros(4);
        m.alimentar();
        m.locomover();
        m.emitirSom();
        //mesmos métodos porem com retorno diferentes 
        a.alimentar();
        p.alimentar();
        r.alimentar();
        
        c.locomover();
        k.locomover();
        k.emitirSom();
        
      
    }
    
}

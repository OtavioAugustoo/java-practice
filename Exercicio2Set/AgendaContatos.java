package Exercicio2Set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atriubutos
    private Set<Contato> contatoSet;

    public AgendaContatos(Set<Contato> contatoSet) {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }
    
    public Set<Contato> pesquisarPorNome (String nome) {
        Set<Contato> contatosporNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)) {
                contatosporNome.add(c);
            }
        }
        return contatosporNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos(new HashSet<>());
        agenda.adicionarContato("Alice", 123456789);
        agenda.adicionarContato("Bob", 987654321);
        
        System.out.println("Contatos na agenda:");
        agenda.exibirContato();
        
        Set<Contato> contatosAlice = agenda.pesquisarPorNome("Alice");
        System.out.println("Contatos encontrados com o nome 'Alice': " + contatosAlice);
        
        Contato contatoAtualizado = agenda.atualizarNumeroContato("Alice", 111222333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
        
        System.out.println("Contatos na agenda após atualização:");
        agenda.exibirContato();
    }
}
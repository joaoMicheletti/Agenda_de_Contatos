import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // atributos do objeto Contato;
    private Set<Contato> contatoset;
     public AgendaContatos(){
         this.contatoset = new HashSet<>();
     };
     //adicionando contato "metodo";
    public void adicionarContatos(String nome, int numero){
        contatoset.add(new Contato(nome, numero));
    };
    //exibindo os contatos;
    public void exibirContatos(){
        System.out.println(contatoset);
    };
    //buscando contato pelo nome ;
    public  Set<Contato> exibirContatoPeloNome(String nome) {
        Set<Contato> contatosPeloNome = new HashSet<>();
        for (Contato c : contatoset) {
            if (c.getNome().startsWith(nome)) {
                contatosPeloNome.add(c);
            }
            ;
        }
        return contatosPeloNome;
    };
    // atualizar o  núm,ero do contato;
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoset){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            };
        };
        return contatoAtualizado;
    };

    public static void main(String[] args) {
        //estânciando os metodos
        AgendaContatos agendaContato = new AgendaContatos();

        //exibindo contatos;
        agendaContato.exibirContatos();

        //adicionando contatos;
        agendaContato.adicionarContatos("João", 11111111);
        agendaContato.adicionarContatos("João Victor", 10101010);
        agendaContato.adicionarContatos("Valenttina", 10101010);
        agendaContato.adicionarContatos("Manoella", 12121212);

        //exibir contatos
        agendaContato.exibirContatos();

        // pesquisando pelo nome do contato;
        System.out.println(agendaContato.exibirContatoPeloNome("João"));

        // editando numero do cintato;
        agendaContato.atualizarNumeroContato("João Victor", 40028922);
        agendaContato.exibirContatos();
    };
}
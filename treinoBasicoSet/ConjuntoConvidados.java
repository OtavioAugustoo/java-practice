package treinoBasicoSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // Atributos
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(null, 0));
    }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    if (!convidadosSet.isEmpty()) {
      for (Convidado c : convidadosSet) {
        if (c.getCodigoConvite() == codigoConvite) {
          convidadoParaRemover = c;
          break;
        }
      }
      convidadosSet.remove(convidadoParaRemover);
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }
    public int contarConvidados(){
        System.out.println("Total de convidados: " + convidadosSet.size());
        return convidadosSet.size();
    }
}

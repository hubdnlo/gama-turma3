package ProjContas.util;

import java.util.ArrayList;

import ProjContas.modelo.Conta;

public class GerenciaConta {
    private ArrayList<Conta> contas;

    public GerenciaConta(){
        contas = new ArrayList<>();
    }

    public void adicionar(Conta c){
        contas.add(c);
    }

    public String exibir(int conta){
        for(int i = 0; i < contas.size(); i++){
            if (contas.get(i).getConta() == conta){
                return contas.get(i).toString();
            }
        }
        return "Não encontrado";
    }

    private int posicao(int conta){
        for (int i = 0; i < contas.size(); i++){
            if (contas.get(i).getConta() == conta){
                return i;
            }
        }
        return -1;
    }    

    public boolean remover(int conta){
        int posicao = posicao(conta);
        if (posicao >= 0){
            if (contas.remove(posicao) != null){
                return true;
            }
        }
        return false;
    }

    public boolean deposita(int conta, double valor){
        for(int i = 0; i < contas.size(); i++){
            if (contas.get(i).getConta() == conta){
                return contas.get(i).deposita(valor);
            }
        }
        return false;
    }

    public boolean saca(int conta, double valor){
        for(int i = 0; i < contas.size(); i++){
            if (contas.get(i).getConta() == conta){
                return contas.get(i).saca(valor);
            }
        }
        return false;
    }


}

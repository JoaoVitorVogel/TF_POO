package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Trem {

    private int id;
    private double capacidadeDeVagoes; // soma da capacidade de vagoes de cada locomotiva
    private List<Carro> listaCarro = new ArrayList<>();


    /** Método construtor do objeto Trem
     * @param id
     */
    protected Trem(int id) {
        this.id = id;
    }

    /** Método de acesso ao Id do trem
     * @return
     */
    public int getId() {
        return id;
    }

    /** Métoco que retorna um ArrayList com os IDS de todos os trens criados
     * @return
     */
    public List<Integer> getTremIds() {
        List<Integer> ids = new ArrayList<>();
        ids.add(id);
        List<Carro> trem = getListaCarro();
        for (Carro carro : trem) {
            ids.add(carro.getId());
        }
        return ids;
    }

    /** Método que calcula a capacidade de vagões que um trem pode levar
     * @return
     */
    public double getCapacidadeDeVagoes() {
        double capacidade = 0.0;
        int cont = 0;
        for (Carro l : listaCarro) {
            if (l instanceof Locomotiva) {
                cont++;
                Locomotiva locomotiva = (Locomotiva) l;
                capacidade += locomotiva.getLimiteVagoes();
            }
        }
        if (cont > 1) {
            double capacidadeTotal = Math.ceil(capacidade * 0.9);
            return capacidadeTotal;
        } else {
            return capacidade;
        }
    }

    /** Metodo que retorna uma lista de carro acopladas ao trem
     * @return
     */
    public List<Carro> getListaCarro() {
        return listaCarro;
    }

    /** Metodo que retorna uma lista de Vagões acopladas ao trem
     * @return
     */
    public List<Vagao> getListaVagao() {
        List<Vagao> listaVagao = new ArrayList<Vagao>();
        for (Carro l : listaCarro) {
            if (l instanceof Vagao) {
                listaVagao.add((Vagao) l);
            }
        }
        return listaVagao;
    }

    /** Metodo que retorna uma lista de Locomotivas acopladas ao trem
     * @return
     */
    public List<Locomotiva> getListaLocomotivas() {
        List<Locomotiva> listaLocomotiva = new ArrayList<Locomotiva>();
        for (Carro l : listaCarro) {
            if (l instanceof Locomotiva) {
                listaLocomotiva.add((Locomotiva) l);
            }
        }
        return listaLocomotiva;
    }

    /** Método que adiciona uma locomotiva ao trem, é utilizado em outros métodos para editar e criar um trem
     * @param locomotiva
     */
    protected void addLocomotiva(Locomotiva locomotiva) {
        listaCarro.add(locomotiva);
        capacidadeDeVagoes = getCapacidadeDeVagoes();
    }

    /** Método que adiciona um Vagão ao trem, é utilizado em outros métodos para editar e criar um trem
     * @param vagao
     * @throws ArrayIndexOutOfBoundsException
     */
    protected void addVagao(Vagao vagao) throws ArrayIndexOutOfBoundsException {
        int cont = 0;
        for (Carro l : listaCarro) {
            if (l instanceof Vagao) {
                cont++;
            }
        }
        if (cont < capacidadeDeVagoes) {
            this.listaCarro.add(vagao);
        } else {
            throw new ArrayIndexOutOfBoundsException("O limite de vagões deste trem já foi atingido");
        }
    }

    /** Método que conta quantas Locomotivas tem em m Trem
     * @return
     */
    public int contaLocomotiva() {
        int cont = 0;
        for (Carro l : listaCarro) {
            if (l instanceof Locomotiva) {
                cont++;
            }
        }
        return cont;
    }

    /** Método que conta quantos Vagões tem em m Trem
     * @return
     */
    public int contaVagao() {
        int cont = 0;
        for (Carro l : listaCarro) {
            if (l instanceof Vagao) {
                cont++;
            }
        }
        return cont;
    }

    /** ToString dos Vagões
     * @return
     */
    public String toStringVagoesHTML(){
        if (getListaVagao().isEmpty()){
            return "<vazia>";
        } else {
            String vagaoList = "";
            int cont = 0;
            for(Vagao v : getListaVagao()){
                cont++;
                vagaoList = vagaoList.concat(v.toString() + " ");
                if(cont == 30){
                    vagaoList = vagaoList.concat("<br>");
                }
            }
            return vagaoList;
        }
    }

    /** ToString das Locomotivas
     * @return
     */
    public String toStringLocomotivasHTML(){
        if (getListaLocomotivas().isEmpty()){
            return "<vazia>";
        } else {
            String locomotivaList = "";
            int cont = 0;
            for(Locomotiva l : getListaLocomotivas()){
                cont++;
                locomotivaList = locomotivaList.concat(l.toString() + " ");
                if( cont == 30){
                    locomotivaList = locomotivaList.concat("<br");
                }
            }
            return locomotivaList;
        }
    }

    /** ToString dos Trens
     * @return
     */
    public String toStringHTML() {
        return "Trem T" + id + " Locomotivas: " + toStringLocomotivasHTML() + " Vagões: " + toStringVagoesHTML();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Trem trem = (Trem) o;
        return id == trem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

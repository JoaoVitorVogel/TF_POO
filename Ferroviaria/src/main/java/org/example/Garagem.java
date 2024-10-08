package org.example;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Garagem {
    private static List<Locomotiva> garagemLocomotivas = new ArrayList<>();
    private static List<Vagao> garagemVagoes = new ArrayList<>();
    private static List<Trem> garagemTrens = new ArrayList<>();

    /*
     * Os seguidos 3 metodos sao responsaveis por adicionar os objetos informados
     * nas respectivas 'garagens' utilizando 'add' do List
     */
    public static void cadastrarLocomotiva(int id, double pesoMaximo) {
        garagemLocomotivas.add(new Locomotiva(id, pesoMaximo));
    }

    public static void cadastrarVagao(int id, double capacidadeCarga) {
        garagemVagoes.add(new Vagao(id, capacidadeCarga));
    }

    public static void cadastrarTrem(int id) throws InvalidParameterException {
        for (Trem t : garagemTrens) {
            if (t.getId() == id) {
                throw new InvalidParameterException("O ID inserido pertence a outro trem já cadastrado");
            }
        }
        garagemTrens.add(new Trem(id));
    }

    /*
     * Checa se o trem entrado como parametro possui algum vagao. Se possuir, lanca
     * uma Exception,
     * pois nao se deve alocar uma locomotiva atras de um vagao
     * Se nao :
     * - aloca o trem na variavel de 'tremAlocado' da locomotiva
     * - em seguida, adiciona a locomotiva na lista de locomotivas do trem
     * - por fim, remove a locomotiva passada como parametro da garagem de
     * locomotivas nao usadas
     */
    public static void alocarLocomotiva(Locomotiva locomotiva, Trem trem) throws InvalidParameterException {
        if (garagemLocomotivas.isEmpty()) {
            throw new InvalidParameterException("A garagem de locomotivas está vazia");
        } else if (!garagemLocomotivas.get(garagemLocomotivas.size() - 1).equals(locomotiva)) {
            throw new InvalidParameterException(
                    "A locomotiva informada não está acessível. Apenas a última unidade da garagem pode ser retirada");
        } else {
            if (trem.contaVagao() != 0) {
                throw new InvalidParameterException(
                        "Nao é possível alocar locomotivas a unidades com vagões já acoplados.");
            }
            locomotiva.setTremAlocado(trem);
            trem.addLocomotiva(locomotiva);
            garagemLocomotivas.remove(locomotiva);
        }
    }

    /*
     * Checa se o trem entrado como parametro possui pelo menos uma locomotiva. Se
     * possuir, lanca uma Exception,
     * pois nao se deve alocar um vagao a um trem sem locomotiva:
     * Se nao :
     * - aloca o trem na variavel de 'tremAlocado' do vagao
     * - em seguida, adiciona o vagao na lista de vagoes do trem
     * - por fim, remove o vagao passada como parametro da garagem de vagoes nao
     * usadas
     */
    public static void alocarVagao(Vagao vagao, Trem trem) throws InvalidParameterException {
        if (garagemVagoes.isEmpty()) {
            throw new InvalidParameterException("A garagem de vagões está vazia");
        } else if (!garagemVagoes.get(garagemVagoes.size() - 1).equals(vagao)) {
            throw new InvalidParameterException(
                    "O vagão informado não está acessível. Apenas a última unidade da garagem pode ser retirada");
        } else {
            if (trem.contaLocomotiva() == 0) {
                throw new InvalidParameterException(
                        "Não é possível alocar vagões a unidades sem locomotivas acopladas.");
            }
            vagao.setTremAlocado(trem);
            trem.addVagao(vagao);
            garagemVagoes.remove(vagao);
        }
    }

    /*
     * Checa se a lista de a lista de vagoes possui algum elemento. Se possuir,
     * lanca uma Exception, pois
     * nao se deve desacoplar locomotivas sem antes desacoplar todos os vagoes
     * Se nao:
     * - adiciona na 'garagemLocomotivas' o ultimo elemento da lisa de locomotivas
     * do trem
     * - em seguida, remove o ultimo elemento da lista de locomotivas do trem;
     */
    public static void desacoplarLocomotiva(Trem trem) throws InvalidParameterException {
        if (trem.contaVagao() != 0) {
            throw new InvalidParameterException(
                    "Não é possível desacoplar locomotivas sem antes desacoplar todos os vagões.");
        }
        garagemLocomotivas.add(trem.getListaLocomotivas().get(trem.getListaLocomotivas().size() - 1));
        trem.getListaCarro().remove(trem.getListaCarro().size() - 1);
    }

    /*
     * - adiciona na 'garagemVagoes' o ultimo elemento da lisa de vagoes do trem
     * - em seguida, remove o ultimo elemento da lista de vagoes do trem;
     */
    public static void desacoplarVagao(Trem trem) {
        garagemVagoes.add(trem.getListaVagao().get(trem.getListaVagao().size() - 1));
        trem.getListaCarro().remove(trem.getListaCarro().size() - 1);
    }

    /*
     * Percorre a lista de locomotivas e retorna o objeto 'Locomotiva' com o mesmo
     * ID,
     * se nao encontrar lanca uma Exception
     */
    public static Locomotiva getLocomotiva(int id) throws InvalidParameterException {
        for (Locomotiva l : garagemLocomotivas) {
            if (l.getId() == id)
                return l;
        }
        throw new InvalidParameterException("Locomotiva não encontrada.");
    }

    /*
     * Percorre a lista de vagoes e retorna o objeto 'Vagao' com o mesmo ID,
     * se nao encontrar lanca uma Exception
     */
    public static Vagao getVagao(int id) throws InvalidParameterException {
        for (Vagao v : garagemVagoes) {
            if (v.getId() == id)
                return v;
        }
        throw new InvalidParameterException("Vagão não encontrado.");
    }

    /*
     * Acessa a lista de vagoes e pega o ultimo da lista
     */
    public static Vagao getUltimoVagao() {
        return garagemVagoes.get(garagemVagoes.size()-1);
    }

    /*
     * Acessa a lista de locomotivas e pega o ultimo da lista
     */
    public static Locomotiva getUltimaLocomotiva() {
        return garagemLocomotivas.get(garagemLocomotivas.size()-1);
    }

    /*
     * Percorre a lista de trens e retorna o objeto 'Trem' com o mesmo ID,
     * se nao encontrar lanca uma Exception
     */
    public static Trem getTrem(int id) throws InvalidParameterException {
        for (Trem t : garagemTrens) {
            if (t.getId() == id)
                return t;
        }
        throw new InvalidParameterException("Trem não encontrado.");
    }

    public static void criaTrem(int IDTrem, int quantiaLocomotiva, int quantiaVagao){
        Garagem.cadastrarTrem(IDTrem);
        for (int i = 0; i < quantiaLocomotiva; i++){
            Garagem.alocarLocomotiva(Garagem.getUltimaLocomotiva(), Garagem.getTrem(IDTrem));
        }
        for (int i = 0; i < quantiaVagao; i++) {
            Garagem.alocarVagao(Garagem.getUltimoVagao(),Garagem.getTrem(IDTrem));
        }
    }

    /*
     * metodo que recebe a aquantia de locomotivas e vagoes juntamente do id do trem
     * responsavel por atualizar o total de objetos vagoes e locomotivas no trem
     * de acordo com s valores recebidos
     */
    public static void atualizaTrem(int idTrem, int quantiaLocomotiva, int quantiaVagao) {

        int diferenca = 0;
        if(Garagem.contaVagaoById(idTrem) > quantiaVagao){
            diferenca = (contaVagaoById(idTrem) - quantiaVagao);
            for(int i=0; i < diferenca; i++){
                Garagem.desacoplarVagao(Garagem.getTrem(idTrem));
            }
        }
        if(Garagem.contaVagaoById(idTrem) < quantiaVagao){
            diferenca = (quantiaVagao - contaVagaoById(idTrem));
            for(int i=0; i < diferenca; i++){
                Garagem.alocarVagao(Garagem.getUltimoVagao(), Garagem.getTrem(idTrem));
            }
        }

        if(Garagem.contaLocomotivaById(idTrem) > quantiaLocomotiva){
            diferenca = (contaLocomotivaById(idTrem) - quantiaLocomotiva);
            for(int i=0; i < diferenca; i++){
                Garagem.desacoplarLocomotiva(Garagem.getTrem(idTrem));
            }
        }
        if(Garagem.contaLocomotivaById(idTrem) < quantiaLocomotiva){
            diferenca = (quantiaLocomotiva - contaLocomotivaById(idTrem));
            for(int i=0; i < diferenca; i++){
                Garagem.alocarLocomotiva(Garagem.getUltimaLocomotiva(), Garagem.getTrem(idTrem));
            }
        }
    }

    /*
     * - adiciona na garagem de vagoes todos os vagoes do trem informado;
     * - adiciona na garagem de locomotivas todas as locomotivas do trem informado;
     * - limpa a lista de vagoes e a lista de locomotivas do trem;
     * - remove o trem da garagem de trens;
     */
    public static void desfazerTrem(Trem trem) throws InvalidParameterException {
        garagemVagoes.addAll(trem.getListaVagao());
        garagemLocomotivas.addAll(trem.getListaLocomotivas());
        trem.getListaVagao().clear();
        trem.getListaLocomotivas().clear();
        garagemTrens.remove(trem);
    }

    /*
     * Busca na lista de trens todos os trens, e armazena seus ids em uma string
     */
    public static String[] getStringIds() {
        String[] lista = new String[Garagem.getQuantiaTrem()];
        int i = 0;
        for (Trem t : Garagem.garagemTrens) {
            lista[i] = String.valueOf(t.getId());
            i++;
        }
        return lista;
    }
    
    public static List<Locomotiva> getGaragemLocomotivas() {
        return garagemLocomotivas;
    }

    public static List<Vagao> getGaragemVagoes() {
        return garagemVagoes;
    }

    public static List<Trem> getGaragemTrens() {
        return garagemTrens;
    }

    public static int getQuantiaLocomotivas() {
        return garagemLocomotivas.size();
    }

    public static int getQuantiaVagao(){
        return garagemVagoes.size();
    }

    public static int getQuantiaTrem(){
        return garagemTrens.size();
    }

    public static int contaLocomotivaById(int idTrem){
        return getTrem(idTrem).contaLocomotiva();
    }

    public static int contaVagaoById(int idTrem){
        return getTrem(idTrem).contaVagao();
    }

    @Override
    public String toString() {
        String text = "    GARAGENS: " +
                "\n Garagem de Locomotivas: " +
                "\n " + garagemLocomotivas +
                "\n " +
                "\n Garagem de Vagoes: " +
                "\n " + garagemVagoes +
                "\n " +
                "\n Garagem de Trens: ";

        if (garagemTrens.isEmpty()) {
            return text + "<vazia>";
        } else {
            String tremList = "\n";
            for (Trem t : garagemTrens) {
                tremList = tremList.concat(t.toString() + "\n");
            }
            return text + tremList;
        }
    }

    public static String toStringLocomotivas() {
        return " " + garagemLocomotivas;
    }

    public static String toStringVagoes() {
        return "" + garagemVagoes;
    }


    public static String toStringTrens() {
        if (garagemTrens.isEmpty()) {
            return "<vazia>";
        } else {
            String tremList = "\n";
            for (Trem t : garagemTrens) {
                tremList = tremList.concat(t.toString() + "    " );
            }
            return tremList;
        }
    }

    public static String toStringTrensHTML(){
        if (garagemTrens.isEmpty()) {
            return "<vazia>";
        } else {
            String tremList = "<html>";
            for (Trem t : garagemTrens) {
                tremList = tremList.concat(t.toStringHTML() + "<br>" );
            }
            tremList = tremList.concat("</html>");
            return tremList;
        }
    }

    public static String toStringVagoesHTML(){
        if (garagemVagoes.isEmpty()){
            return "<vazia>";
        } else {
            String vagaoList = "<html>";
            int cont = 0;
            for(Vagao v : garagemVagoes){
                cont++;
                vagaoList = vagaoList.concat(v.toString() + " ");
                if(cont == 30){
                    vagaoList = vagaoList.concat("<br>");
                }
            }
            vagaoList = vagaoList.concat("</html>");
            return vagaoList;
        }
    }

    public static String toStringLocomotivasHTML(){
        if (garagemLocomotivas.isEmpty()){
            return "<vazia>";
        } else {
            String locomotivaList = "<html>";
            int cont = 0;
            for(Locomotiva l : garagemLocomotivas){
                cont++;
                locomotivaList = locomotivaList.concat(l.toString() + " ");
                if( cont == 30){
                    locomotivaList = locomotivaList.concat("<br");
                }
            }
            locomotivaList = locomotivaList.concat("</html>");
            return locomotivaList;
        }
    }
}

package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

public class IniciaGaragens {
    public static void criaEmpresa() {
        String criaVagaoFile = "Ferroviaria/arquivos/inicialVagao.csv";
        String criaLocomotivaFile = "Ferroviaria/arquivos/inicialLocomotiva.csv";
        String criaComposicaoFile = "Ferroviaria/arquivos/inicialComposicao.csv";

        try {
            FileReader fileReader = new FileReader(criaVagaoFile);
            CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(0).build();
            List<String[]> data = csvReader.readAll();
            

            for (String[] row : data) {
                int id = Integer.parseInt(row[0]);

                Garagem.cadastrarVagao(id, 6.0);
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(criaLocomotivaFile);
            CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(0).build();
            List<String[]> data = csvReader.readAll();

            for (String[] row : data) {
                int id = Integer.parseInt(row[0]);

                Garagem.cadastrarLocomotiva(id, 30.0);
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(criaComposicaoFile);
            CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(0).build();
            List<String[]> data = csvReader.readAll();

            for (String[] row : data) {
                String[] listaRow = row[0].split(",");
                if (listaRow[0] != null) {
                    Garagem.cadastrarTrem(Integer.parseInt(listaRow[0]));
                    for (int i = 1; i < listaRow.length; i++) {
                        if (Integer.parseInt(listaRow[i]) < 100) {
                            Garagem.cadastrarVagao(Integer.parseInt(listaRow[i]), 6.0);
                            Garagem.alocarVagao(Garagem.getVagao(Integer.parseInt(listaRow[i])),
                                    Garagem.getTrem(Integer.parseInt(listaRow[0])));
                        } else {
                            Garagem.cadastrarLocomotiva(Integer.parseInt(listaRow[i]), 30.0);
                            Garagem.alocarLocomotiva(Garagem.getLocomotiva(Integer.parseInt(listaRow[i])),
                                    Garagem.getTrem(Integer.parseInt(listaRow[0])));
                        }
                    }
                }

            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void atualizaArquivos() {
        try {
            String criaLocomotiva = "Ferroviaria/arquivos/inicialLocomotiva.csv";

            FileWriter fileWriter = new FileWriter(criaLocomotiva, true);
            CSVWriter csvWriter = new CSVWriter(fileWriter);

            List<Locomotiva> garagemLocomotivas = Garagem.getGaragemLocomotivas();

            try (FileWriter writer = new FileWriter(criaLocomotiva, false)) {
                writer.write("");

            } catch (IOException e) {
                e.printStackTrace();
            }

            for (Locomotiva locomotiva : garagemLocomotivas) {
                String[] linha = { String.valueOf(locomotiva.getId()) };
                csvWriter.writeNext(linha);

            }

            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String criaVagao = "Ferroviaria/arquivos/inicialVagao.csv";

            FileWriter fileWriter = new FileWriter(criaVagao, true);
            CSVWriter csvWriter = new CSVWriter(fileWriter);

            List<Vagao> garagemVagaos = Garagem.getGaragemVagoes();

            try (FileWriter writer = new FileWriter(criaVagao, false)) {
                writer.write("");
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (Vagao vagao : garagemVagaos) {
                String[] linha = { String.valueOf(vagao.getId()) };
                csvWriter.writeNext(linha);
            }

            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String criaComposicao = "Ferroviaria/arquivos/inicialComposicao.csv";

            FileWriter fileWriter = new FileWriter(criaComposicao, true);
            CSVWriter csvWriter = new CSVWriter(fileWriter);

            List<Trem> garagemCarros = Garagem.getGaragemTrens();

            try (FileWriter writer = new FileWriter(criaComposicao, false)) {
                writer.write("");
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (Trem trem : garagemCarros) {
                String aux = "";
                List<Integer> listaIds = trem.getTremIds();
                for (Integer id : listaIds) {
                    aux = aux.concat(String.valueOf(id) + ",");
                }

                String[] linha = { String.valueOf(aux) };
                csvWriter.writeNext(linha);
            }

            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

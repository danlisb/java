import java.io.*;
import java.util.*;

public class Escalonador {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java Escalonador <arquivo_de_tarefas> <numero_de_processadores>");
            return;
        }

        String nomeArquivo = args[0];
        int numProcessadores = Integer.parseInt(args[1]);
        List<Tarefa> tarefas = lerTarefas(nomeArquivo);

        // Escalonamento SJF (menor tempo primeiro)
        tarefas.sort(Comparator.comparingInt(t -> t.tempo));
        escalonarTarefas(tarefas, numProcessadores);
    }

    private static List<Tarefa> lerTarefas(String nomeArquivo) {
        List<Tarefa> tarefas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(" ");
                String nome = partes[0];
                int tempo = Integer.parseInt(partes[1]);
                tarefas.add(new Tarefa(nome, tempo));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tarefas;
    }

    private static void escalonarTarefas(List<Tarefa> tarefas, int numProcessadores) {
        int[] temposProcessadores = new int[numProcessadores];
        List<List<String>> saidaProcessadores = new ArrayList<>();
        for (int i = 0; i < numProcessadores; i++) {
            saidaProcessadores.add(new ArrayList<>());
        }

        for (Tarefa tarefa : tarefas) {
            int indiceProcessador = encontrarProcessadorDisponivel(temposProcessadores);
            int tempoInicio = temposProcessadores[indiceProcessador];
            int tempoFim = tempoInicio + tarefa.tempo;
            temposProcessadores[indiceProcessador] = tempoFim;
            saidaProcessadores.get(indiceProcessador).add(tarefa.nome + ";" + tempoInicio + ";" + tempoFim);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("saida_SJF.txt"))) {
            for (int i = 0; i < numProcessadores; i++) {
                bw.write("Processador_" + (i + 1) + "\n");
                for (String linha : saidaProcessadores.get(i)) {
                    bw.write(linha + "\n");
                }
                bw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int encontrarProcessadorDisponivel(int[] temposProcessadores) {
        int indiceMin = 0;
        for (int i = 1; i < temposProcessadores.length; i++) {
            if (temposProcessadores[i] < temposProcessadores[indiceMin]) {
                indiceMin = i;
            }
        }
        return indiceMin;
    }

    public static class Tarefa {
        String nome;
        int tempo;

        Tarefa(String nome, int tempo) {
            this.nome = nome;
            this.tempo = tempo;
        }
    }
}

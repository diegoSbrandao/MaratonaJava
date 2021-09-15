package br.com.maratonajava.completablefuture.testes;

import java.util.concurrent.*;

public class FutureTeste {

    private static ExecutorService executorService = Executors.newFixedThreadPool(1);

    public static void main(String[] args) {
        Future<Double> future = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 2000D;
        });
        enrolando();
        try {
            while (!future.isDone()) {
                Double resultado = future.get();
                System.out.println(resultado);
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    private static void enrolando() {
        long soma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}


package br.com.maratonajava.concorrencia.testes;

import java.util.concurrent.*;

public class CallableTeste implements Callable<String> {

    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() +" executando...");
        }
        return "Trabalho finalizado o numero aleatorio eh: "+count;
    }

    public static void main(String[] args) {
        CallableTeste ct = new CallableTeste();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> resultFuture = executorService.submit(ct);
        try {
            String s = resultFuture.get();
            System.out.println(s);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();

    }
}

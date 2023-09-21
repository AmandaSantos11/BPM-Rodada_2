package org.example.desafio_2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class Conversao {
    public String converterNumeroRecebido(long numero){
        long millis = numero * 1000;
        Date data = new Date(millis);

        SimpleDateFormat data_formatada = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        data_formatada.setTimeZone(TimeZone.getTimeZone("UTC"));

        return data_formatada.format(data);
    }
}
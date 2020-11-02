package com.programem.seguradora;

public class Listad {
    String listaDependente(Iterable<Dependente> listad) {
        String html = "";
    
        for(Dependente d : listad){
            html = html +
            "<h1>"+d.getNome()+"</h1>"+
            d.getIdade()+"<br>"+
            d.getCliente()+"<br>"+
            "<br>"
            ;
        }
        return html;
}
}
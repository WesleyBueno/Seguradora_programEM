package com.programem.seguradora;

public class Listac {
    String listaCliente(Iterable<Cliente> listac) {
    String html = "";

    for(Cliente c : listac){
        html = html +
        "<h1>"+c.getNome()+"</h1>"+
        c.getIdade()+"<br>"+
        c.getEndereco()+"<br>"+
        "<br>"
        ;
    }
    return html;
}
}
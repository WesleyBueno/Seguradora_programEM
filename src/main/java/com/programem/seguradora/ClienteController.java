package com.programem.seguradora;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

  @Autowired
  private ClienteRepository clienteRepository;

  private Listac listac = new Listac();

  @GetMapping("/")
  public String clienteForm(){
    return "clienteform";
  }

  @PostMapping(path = "/insere") // Map ONLY POST Requests
  public @ResponseBody String addNewCliente(
    @RequestParam String nome, 
    @RequestParam Integer idade,
    @RequestParam String endereco
      
        ) {

            Cliente c = new Cliente();

            c.setNome(nome);
            c.setIdade(idade);
            c.setEndereco(endereco);

            clienteRepository.save(c);

        
            return nome+" "+idade+" "+endereco;
    }

    @GetMapping(path="/listac")
  public @ResponseBody String getAllCliente() {
    // This returns a JSON or XML with the users
    return listac.listaCliente(clienteRepository.findAll());
  }
}
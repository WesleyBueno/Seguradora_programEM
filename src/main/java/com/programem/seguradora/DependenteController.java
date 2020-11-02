package com.programem.seguradora;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dependente")
public class DependenteController {

  @Autowired
  private DependenteRepository dependenteRepository;

  private Listad listad = new Listad();

  @GetMapping("/")
  public String dependenteForm(){
    return "dependenteForm";
  }

  @PostMapping(path = "/insere") // Map ONLY POST Requests
  public @ResponseBody String addNewCliente(@RequestParam String nome, @RequestParam Integer idade,
      @RequestParam String cliente
      
        ) {

            Dependente d = new Dependente();

            d.setNome(nome);
            d.setIdade(idade);
            d.setCliente(cliente);

            dependenteRepository.save(d);

            return nome+ " "+idade+" "+cliente;
    }

    @GetMapping(path="/listad")
  public @ResponseBody String getAllCliente() {
    // This returns a JSON or XML with the users
    return listad.listaDependente(dependenteRepository.findAll());
  }
}
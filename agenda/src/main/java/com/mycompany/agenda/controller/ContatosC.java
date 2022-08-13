package com.mycompany.agenda.controller;

import com.mycompany.agenda.model.ContatosM;
import com.mycompany.agenda.service.ContatosS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestControllerAdvice

public class ContatosC {
    @Autowired
    private ContatosS contatoService;
    @GetMapping(path = "/contatos")
    public List<ContatosM> exibirContatosCadastrados(){
        return contatoService.exibirContatosCadastrados();
    }
    @GetMapping(path = "/contato/{id}")
    public Optional<ContatosM> exibirContatoPorId(@PathVariable Long id){
        return contatoService.exibirContatoPorId(id);
    }
    @PostMapping(path = "/contato")
    @ResponseStatus(HttpStatus.CREATED)
    public ContatosM cadastrarContato(@RequestBody ContatosM contatoModel){
        return contatoService.cadastrarNovoContato(contatoModel);
    }
    @PutMapping(path = "/contato/{id}")
    public ContatosM editarContato(@RequestBody ContatosM contatoModel){
        return contatoService.editarContato(contatoModel);
    }
    @DeleteMapping(path = "/contato/{id}")
    public void excluirContato(@PathVariable Long id){
        contatoService.excluirContato(id);
    }
    @GetMapping(path = "/contato/search")
    public List<ContatosM> buscarPorNome(@RequestParam(value = "nome", defaultValue = "", required = true) String nome ){
        return contatoService.buscarPorNome(nome);
    }
}

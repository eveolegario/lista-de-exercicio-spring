package com.mycompany.agenda.service;

import com.mycompany.agenda.model.ContatosM;
import com.mycompany.agenda.repository.ContatosR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatosS {
    @Autowired
    private ContatosR contatoRepository;

    public ContatosM cadastrarNovoContato(ContatosM contatoModel){
        contatoModel.getId();
        contatoModel.getNome();
        contatoModel.getTelefone();
        return contatoRepository.save(contatoModel);
    }
    public void excluirContato(Long id){
        contatoRepository.deleteById(id);
    }
    public ContatosM editarContato(ContatosM contatoModel){
        contatoModel.getId();
        contatoModel.getNome();
        contatoModel.getTelefone();
        return contatoRepository.save(contatoModel);
    }
    public List<ContatosM> exibirContatosCadastrados(){
        return contatoRepository.findAll();
    }
    public Optional<ContatosM> exibirContatoPorId(Long id){
        return contatoRepository.findById(id);
    }
    public List<ContatosM> buscarPorNome(String nome){
        return contatoRepository.findByNomeStartsWith(nome);
    }
}

package br.com.gs.reclameali.service;

import br.com.gs.reclameali.model.Endereco;
import br.com.gs.reclameali.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class EnderecoService {

    private final EnderecoRepository repository;

    public EnderecoService(EnderecoRepository repository) {this.repository = repository;}

    public Endereco cadastrar(Endereco endereco){
        return repository.save(endereco);
    }


    public void deletar(Long id){
        Endereco endereco = repository.findById(id).orElseThrow(()->new EntityNotFoundException("id não localizado"));
        repository.delete(endereco);
    }

    public Endereco procurar(Long id){
        return repository.findById(id).orElseThrow(()->new EntityNotFoundException("id não encontrado"));

    }

    public Endereco atualizar(Long id, Endereco enderecoAtualizado){
        Endereco endereco = this.procurar(id);
        enderecoAtualizado.setId(endereco.getId());
        return repository.save(enderecoAtualizado);
    }


}

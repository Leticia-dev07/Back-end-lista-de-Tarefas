package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Tarefa;
import com.example.demo.repository.TarefaRepository;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public List<Tarefa> listar() {
        return repository.findAll();
    }

    public Tarefa salvar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public Tarefa buscarPorId(Long id) {

        Optional<Tarefa> tarefa = repository.findById(id);

        if (tarefa.isPresent()) {
            return tarefa.get();
        }

        return null;
    }

    public Tarefa atualizar(Long id, Tarefa novaTarefa) {
    	
        Tarefa tarefa = repository.findById(id).orElse(null);

        if (tarefa != null) {

            tarefa.setTitulo(novaTarefa.getTitulo());
            tarefa.setDescricao(novaTarefa.getDescricao());
            tarefa.setConcluida(novaTarefa.getConcluida());

            return repository.save(tarefa);
        }

        return null;
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
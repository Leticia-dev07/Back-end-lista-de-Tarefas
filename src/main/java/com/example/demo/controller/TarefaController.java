package com.example.demo.controller;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Tarefa;
import com.example.demo.service.TarefaService;

@RestController
public class TarefaController {

	 @Autowired
	    private TarefaService service;

	    @GetMapping("/tarefas")
	    public List<Tarefa> listar() {
	        return service.listar();
	    }

	    @GetMapping("/tarefas/{id}")
	    public Tarefa buscarPorId(@PathVariable Long id) {
	        return service.buscarPorId(id);
	    }

	    @PostMapping("/tarefas")
	    public Tarefa salvar(@RequestBody Tarefa tarefa) {
	        return service.salvar(tarefa);
	    }

	    @PutMapping("/tarefas/{id}")
	    public Tarefa atualizar(@PathVariable Long id,
	                            @RequestBody Tarefa tarefa) {
	        return service.atualizar(id, tarefa);
	    }

	    @DeleteMapping("/tarefas/{id}")
	    public void excluir(@PathVariable Long id) {
	        service.excluir(id);
	    }
}

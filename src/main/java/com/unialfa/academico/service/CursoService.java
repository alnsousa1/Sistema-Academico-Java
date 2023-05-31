package com.unialfa.academico.service;

import com.unialfa.academico.model.Curso;
import com.unialfa.academico.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;
    public Curso salvar(Curso curso){
        return repository.save(curso);
    }
    public List<Curso> listarTodos(){
        return repository.findAll();
    }

    public Curso buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }
}

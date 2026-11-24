package br.com.etechas.simuladoenem.controller;

import br.com.etechas.simuladoenem.entidades.MetaSimuladoEnem;
import br.com.etechas.simuladoenem.repository.MetaSimuladoEnemRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/metas-enem")
public class MetaSimuladoEnemController {

    private final MetaSimuladoEnemRepository repository;

    public MetaSimuladoEnemController(MetaSimuladoEnemRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<MetaSimuladoEnem>> listar() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MetaSimuladoEnem> buscarPorId(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<MetaSimuladoEnem> cadastrar(
            @RequestBody MetaSimuladoEnem meta) {

        MetaSimuladoEnem novaMeta = repository.save(meta);

        return ResponseEntity.status(HttpStatus.CREATED).body(novaMeta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MetaSimuladoEnem> atualizar(
            @PathVariable Long id,
            @RequestBody MetaSimuladoEnem dados) {

        return repository.findById(id)
                .map(meta -> {
                    meta.setNomeAluno(dados.getNomeAluno());
                    meta.setCursoDesejado(dados.getCursoDesejado());
                    meta.setNotaCorteAlvo(dados.getNotaCorteAlvo());
                    meta.setNotaHumanas(dados.getNotaHumanas());
                    meta.setNotaNatureza(dados.getNotaNatureza());
                    meta.setNotaMatematica(dados.getNotaMatematica());
                    meta.setNotaLinguagens(dados.getNotaLinguagens());
                    meta.setNotaRedacao(dados.getNotaRedacao());
                    meta.setMediaFinal(dados.getMediaFinal());
                    meta.setAtingiuMeta(dados.getAtingiuMeta());

                    return ResponseEntity.ok(repository.save(meta));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {

        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        repository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}

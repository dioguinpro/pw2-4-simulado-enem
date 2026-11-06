package br.com.etechas.simuladoenem.repository;

import br.com.etechas.simuladoenem.entidades.MetaSimuladoEnem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetaSimuladoEnemRepository
        extends JpaRepository<MetaSimuladoEnem, Long> {

}

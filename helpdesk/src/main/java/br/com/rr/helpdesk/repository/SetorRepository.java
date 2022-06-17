package br.com.rr.helpdesk.repository;

import br.com.rr.helpdesk.model.Setor;
import br.com.rr.helpdesk.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetorRepository extends JpaRepository<Setor,Long> {
}

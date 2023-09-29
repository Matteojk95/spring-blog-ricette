package org.ricette.springblogricette.Repository;

import org.ricette.springblogricette.Model.Ricette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RicetteRepository extends JpaRepository<Ricette, Integer> {

}

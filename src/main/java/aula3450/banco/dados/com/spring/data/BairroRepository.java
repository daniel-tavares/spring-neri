package aula3450.banco.dados.com.spring.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends CrudRepository<BeanBairro, Long> {

}

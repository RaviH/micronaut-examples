package micronaut.data.liquibase.example.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.reactive.RxJavaCrudRepository;
import micronaut.data.liquibase.example.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends RxJavaCrudRepository<CustomerEntity, Long> {
}

package micronaut.data.liquibase.example.rest;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.reactivex.Maybe;
import io.reactivex.Single;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import micronaut.data.liquibase.example.entity.CustomerEntity;
import micronaut.data.liquibase.example.repository.CustomerRepository;

@Controller("/customer")
@Slf4j
@AllArgsConstructor
public class CustomerRS {

    private CustomerRepository customerRepository;

    @Get("/{id}")
    public Maybe<CustomerEntity> findById(
            @PathVariable
            final Long id
    ) {

        return customerRepository.findById(id);
    }

    @Post
    public Single<CustomerEntity> create(final CustomerEntity customerEntity) {

        return customerRepository.save(customerEntity);
    }

}

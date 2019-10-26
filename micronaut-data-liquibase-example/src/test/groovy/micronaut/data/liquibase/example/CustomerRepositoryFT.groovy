package micronaut.data.liquibase.example

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import micronaut.data.liquibase.example.repository.CustomerRepository
import spock.lang.Specification

class CustomerRepositoryFT extends Specification {

    ApplicationContext applicationContext
    CustomerRepository customerRepository

    def setup() {
        EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer.class,
                ["micronaut.environments" : "test",
                 "kafka.bootstrap.servers": "localhost:9092"],
                "test")
        applicationContext = embeddedServer.getApplicationContext()
        customerRepository = applicationContext.getBean(CustomerRepository)
        customerRepository != null
    }

    def "happy path"() {
        expect:
        customerRepository.findById(1L).isEmpty().blockingGet()
    }
}

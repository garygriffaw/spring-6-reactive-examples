package guru.springframework.spring6reactiveexamples.repositories;

import guru.springframework.spring6reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {

    Person michael = Person.builder()
            .id(1)
            .firstName("Michael")
            .lastName("Jones")
            .build();

    Person jane = Person.builder()
            .id(2)
            .firstName("Jane")
            .lastName("Johnson")
            .build();

    Person sam = Person.builder()
            .id(3)
            .firstName("Sam")
            .lastName("Brown")
            .build();

    Person sue = Person.builder()
            .id(4)
            .firstName("Sue")
            .lastName("Smith")
            .build();

    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(michael);
    }

    @Override
    public Flux<Person> findAll() {

        return Flux.just(michael, jane, sam, sue);
    }
}

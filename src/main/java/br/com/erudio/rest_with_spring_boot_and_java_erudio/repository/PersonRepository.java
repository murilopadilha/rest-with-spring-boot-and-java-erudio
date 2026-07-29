package br.com.erudio.rest_with_spring_boot_and_java_erudio.repository;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

package com.github.mheinecke.dropwizarddemo.db;

import com.github.mheinecke.dropwizarddemo.core.Person;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import io.dropwizard.hibernate.AbstractDAO;

import java.util.List;
import java.util.Optional;

public class PersonDAO extends AbstractDAO<Person> {
    public PersonDAO(SessionFactory factory) {
        super(factory);
    }

    public Optional<Person> findById(Long id) {
        return Optional.ofNullable(get(id));
    }

    public Person create(Person person) {
        return persist(person);
    }

    @SuppressWarnings("unchecked")
    public List<Person> findAll() {
        return list((Query<Person>) namedQuery("com.github.mheinecke.dropwizarddemo.core.Person.findAll"));
    }

}
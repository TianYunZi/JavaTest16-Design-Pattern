package chapter.filter.pattern.criteria;

import chapter.filter.pattern.entity.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> people);
}

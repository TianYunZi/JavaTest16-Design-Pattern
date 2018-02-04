package chapter.filter.pattern.criteria;

import chapter.filter.pattern.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> criteriaItems = criteria.meetCriteria(people);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(people);
        criteriaItems.addAll(otherCriteriaItems.stream().filter(person -> !criteriaItems.contains(person))
                .collect(Collectors.toList()));
        return criteriaItems;
    }
}

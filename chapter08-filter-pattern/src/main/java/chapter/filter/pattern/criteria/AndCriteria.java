package chapter.filter.pattern.criteria;

import chapter.filter.pattern.entity.Person;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> personList = criteria.meetCriteria(people);
        return otherCriteria.meetCriteria(personList);
    }
}

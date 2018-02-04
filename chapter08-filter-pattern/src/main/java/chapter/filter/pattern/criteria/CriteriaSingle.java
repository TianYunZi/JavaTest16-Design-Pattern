package chapter.filter.pattern.criteria;

import chapter.filter.pattern.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        return people.stream().filter(person -> person.getMaritalStatus().equalsIgnoreCase("SINGLE"))
                .collect(Collectors.toList());
    }
}

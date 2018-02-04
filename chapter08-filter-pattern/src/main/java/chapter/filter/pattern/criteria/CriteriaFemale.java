package chapter.filter.pattern.criteria;

import chapter.filter.pattern.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        return people.stream().filter(person -> person.getGender().equalsIgnoreCase("FEMALE"))
                .collect(Collectors.toList());
    }
}

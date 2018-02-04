package chapter.iterator.pattern;

import chapter.iterator.pattern.container.Iterator;
import chapter.iterator.pattern.container.NameRepository;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository repository = new NameRepository();

        for (Iterator iterator = repository.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }
    }
}

package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //flags that this is a class that should be managed. springboot should create eventRepository instances and then injection them whenever our code asks for them - using Autowired
public interface EventRepository extends CrudRepository<Event, Integer> { //CrudRepository can create classes in memory

}

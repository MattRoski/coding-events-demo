package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//single point of truth for how our event objects are stored
//Everything is static bcuz we dont need EventData objects, just a way to store Events
//ENCAPSULATING THE BEHAVIOR OF EVENT OBJECTS SO NO ONE KNOWS HOW THEY'RE STORED
//Encapsulation in a nutshell: changes in one class makes little to no effect in other classes
public class EventData {

    //place to put events
    //its static so there is only going to be one of these
    //Integers will be the Id and Event objects
    private static final Map<Integer, Event> events = new HashMap<>();
    //we CAN change the dataType of the Map and then change the EventData members, as long as it won't cause issues in other classes
    //DECOUPLES OUR APPLICATION from knowing how things are stored internally
    //get all events
    public static Collection<Event> getAll(){ //Collection is an interface
        return events.values();
    }
    //get a single event
    public static Event getById(int id){
        return events.get(id);
    }
    //add an event
    public static void add(Event event){
        events.put(event.getId(), event);
    }
    //remove an event
    public static void remove(int id){
        events.remove(id);
    }
}

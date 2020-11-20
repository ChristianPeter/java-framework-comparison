package org.acme.getting.started;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public final static List<String> NAMES = Arrays.asList("Aeryn Sun", "John Crichton", "Ka D'Argo", "Dominar Rygel XVI", "Chiana", "Veronica Mars", "Indiana Jones", "Clark Kent", "Lois Lane", "Buffy Summers", "Craig Ferguson");

    public String createGreeting() {
        int whichOne = (int) (Math.random()*NAMES.size() * 2);

        return NAMES.get(whichOne % NAMES.size());
    }
    
}

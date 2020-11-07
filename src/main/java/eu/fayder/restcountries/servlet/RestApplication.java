package eu.fayder.restcountries.servlet;

import eu.fayder.restcountries.v1.rest.CountryRestV1;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/rest")
public class RestApplication extends Application {
    private Set<Object> singletons = new HashSet<>();

    public RestApplication() {
        singletons.add(new CountryRestV1());
        singletons.add(new eu.fayder.restcountries.v2.rest.CountryRest());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}

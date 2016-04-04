package bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ManagedBean
@ApplicationScoped
public class StudentTwo implements Serializable{
    private String firstName;
    private String lastName;
    private String country;

    // List of countries for the drop-down list
    private List<String> countryOptions;

    public StudentTwo() {
        // Populate the list of countries
        countryOptions = new ArrayList<>();
        countryOptions.add("Brazil");
        countryOptions.add("France");
        countryOptions.add("Germany");
        countryOptions.add("India");
        countryOptions.add("Turkey");
        countryOptions.add("United Kingdom");
        countryOptions.add("United States");
        countryOptions.add("Georgia");
        Collections.sort(countryOptions);
    }

    // need to add a getter method for country options
    public List<String> getCountryOptions() {
        return countryOptions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

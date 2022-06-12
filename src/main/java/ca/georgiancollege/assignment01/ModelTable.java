package ca.georgiancollege.assignment01;

public class ModelTable {
    String continent, population, code, name, region;

    public ModelTable(String continent, String population, String code, String name, String region) {
        this.continent = continent;
        this.population = population;
        this.code = code;
        this.name = name;
        this.region = region;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getContinent() {
        return continent;
    }

    public String getPopulation() {
        return population;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }
}

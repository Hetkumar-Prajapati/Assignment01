package ca.georgiancollege.assignment01;

public class ModelTable {
    String id, population;
    String code, name, region;

    public ModelTable(String id, String population, String code, String name, String region) {
        this.id = id;
        this.population = population;
        this.code = code;
        this.name = name;
        this.region = region;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getId() {
        return id;
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

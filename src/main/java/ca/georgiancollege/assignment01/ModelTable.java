package ca.georgiancollege.assignment01;

public class ModelTable {
    int id, population;
    String code, name, region;

    public ModelTable(int id, int population, String code, String name, String region) {
        this.id = id;
        this.population = population;
        this.code = code;
        this.name = name;
        this.region = region;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPopulation(int population) {
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

    public int getId() {
        return id;
    }

    public int getPopulation() {
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

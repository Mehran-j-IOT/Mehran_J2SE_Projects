package gas.markazPayaam.entity;

public class Person7se1 {
    private long id;
    private String name;
    private String family;
    private long salary;

    public long getSalary() {
        return salary;
    }

    public Person7se1 setSalary(long salary) {
        this.salary = salary;
        return this;
    }

    public long getId() {
        return id;
    }

    public Person7se1 setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person7se1 setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Person7se1 setFamily(String family) {
        this.family = family;
        return this;
    }
    @Override
    public String toString() {
        return "Person7se1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", salary=" + salary +
                '}';
    }

}

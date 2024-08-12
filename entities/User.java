package entities;

import java.util.List;

public class User {
    private String name;
    private Integer id;
    private List emprestimos;

    public User(String name, Integer id, List emprestimos) {
        this.name = name;
        this.id = id;
        this.emprestimos = emprestimos;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public List getEmprestimos() {
        return emprestimos;
    }
    public void setEmprestimos(List emprestimos) {
        this.emprestimos = emprestimos;
    }
}
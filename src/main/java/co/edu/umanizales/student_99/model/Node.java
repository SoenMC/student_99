package co.edu.umanizales.student_99.model;


import lombok.Data;

@Data
public class Node {
    private Pet data;
    private Node next;

    public Node(Pet data) {
        this.data = data;
    }

}

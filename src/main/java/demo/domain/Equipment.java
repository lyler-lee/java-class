package demo.domain;

public class Equipment {
    private final Long id;
    private final String name;
    private final int quantity;
    public Equipment(Long id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    public Long getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
}

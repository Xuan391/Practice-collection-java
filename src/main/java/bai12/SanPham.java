package bai12;

import java.util.Date;

public class SanPham {
    private String name;
    private String id;
    private double price;
    private Date date;

    public SanPham(String name, String id, double price, Date date) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}

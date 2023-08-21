package com.comicfiguresshop.restapi.model;

import jakarta.persistence.*; // for Spring Boot 3

import java.util.ArrayList;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "ribbon")
    private String ribbon;

    @Column(name = "price")
    private long price;

    @Column(name = "discount")
    private long discount;

    @Column(name = "salePrice")
    private long salePrice;

    @Column(name = "stock")
    private long stock;

    @Column(name = "sku")
    private String sku;

    @Column(name = "brand")
    private String brand;

    @Column(name = "categories")
    private ArrayList<String> categories;

    public Product() {

    }

    public Product(String title, String description, String ribbon, long price, long discount, long salePrice, long stock, String sku, String brand, ArrayList<String> categories) {
        this.title = title;
        this.description = description;
        this.ribbon = ribbon;
        this.price = price;
        this.discount = discount;
        this.salePrice = salePrice;
        this.stock = stock;
        this.sku = sku;
        this.brand = brand;
        this.categories = categories;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(long salePrice) {
        this.salePrice = salePrice;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", ribbon='" + ribbon + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", salePrice=" + salePrice +
                ", stock=" + stock +
                ", sku=" + sku +
                ", brand='" + brand + '\'' +
                ", categories=" + categories +
                '}';
    }
}
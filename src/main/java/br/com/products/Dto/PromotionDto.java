package br.com.products.Dto;

public class PromotionDto {
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String itemId() {
        return itemId;
    }

    public String type() {
        return type;
    }

    public double value() {
        return value;
    }

    public int quantity() {
        return quantity;
    }

    private String itemId;
    private String type; // DISCOUNT, BOGO (comprar um levar outro)
    private double value; // desconto em centavos
    private int quantity; // quantidade para promoções BOGO

    // getters e setters
}

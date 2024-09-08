package br.com.products.Dto;

    public class ProductDto{
        public String id() {
            return id;
        }

        public String name() {
            return name;
        }

        public double price() {
            return price;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        private String id;
        private String name;
        private double price; // em centavos


        // getters e setters
    }



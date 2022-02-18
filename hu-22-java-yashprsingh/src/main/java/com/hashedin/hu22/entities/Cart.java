//package com.hashedin.hu22.entities;
//
//
//import com.sun.istack.NotNull;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "shopping_cart")
//public class Cart {
//
//    @Id
//        @GeneratedValue(strategy = GenerationType.AUTO)
//        @Column(name = "id")
//        private Long id;
//
//        @ManyToOne(fetch = FetchType.EAGER)
//        @JoinColumn(name = "user_id")
//        private User user;
//
//        @ManyToOne(fetch = FetchType.EAGER)
//        @JoinColumn(name = "product_id")
//        private UdemyCourse product;
//
//        @Column(name = "stock")
//        @NotNull
//        private Integer stock;
//
//        @Column(name = "amount")
//        private Double amount;
//
//        @Column(name = "status")
//        private String status;
//
//        public Long getId() {
//            return id;
//        }
//
//        public void setId(Long id) {
//            this.id = id;
//        }
//
//        public User getUser() {
//            return user;
//        }
//
//        public void setUser(User user) {
//            this.user = user;
//        }
//
//        public UdemyCourse getProduct() {
//            return product;
//        }
//
//        public void setProduct(UdemyCourse product) {
//            this.product = product;
//        }
//
//        public Integer getStock() {
//            return stock;
//        }
//
//        public void setStock(Integer stock) {
//            this.stock = stock;
//        }
//
//        public Double getAmount() {
//            return amount;
//        }
//
//        public void setAmount(Double amount) {
//            this.amount = amount;
//        }
//
//        public String getStatus() {
//            return status;
//        }
//
//        public void setStatus(String status) {
//            this.status = status;
//        }
//
//}

// package com.hashedin.hu22.entities;

// import javax.persistence.*;

// @Entity
// @Table(name = "udemy_course")
// public class UdemyCourse {
//     @Id
//     private int product_id;
//     private String courseName;

//     @OneToOne(cascade = CascadeType.ALL)
//     @JoinColumn(name = "User", referencedColumnName = "id")
//     private int ucUserId;


//     private String domain;
//     private String description;
//     private int price;

//     public int getUcUserId() {
//         return ucUserId;
//     }

//     public void setUcUserId(int ucUserId) {
//         this.ucUserId = ucUserId;
//     }

//     public UdemyCourse(int ucUserId) {
//         this.ucUserId = ucUserId;
//     }

//     @Override
//     public String toString() {
//         return "UdemyCourse{" +
//                 "product_id=" + product_id +
//                 ", courseName='" + courseName + '\'' +
//                 ", domain='" + domain + '\'' +
//                 ", description='" + description + '\'' +
//                 ", price=" + price +
//                 ", ucUserId=" + ucUserId +
//                 '}';
//     }



//     public UdemyCourse() {
//     }

//     public UdemyCourse(int product_id, String courseName, String domain, String description, int price,int ucUserId) {
//         this.product_id = product_id;
//         this.courseName = courseName;
//         this.domain = domain;
//         this.description = description;
//         this.price = price;
//         this.ucUserId = ucUserId;
//     }


//     public int getProduct_id() {
//         return product_id;
//     }

//     public void setProduct_id(int product_id) {
//         this.product_id = product_id;
//     }

//     public String getCourseName() {
//         return courseName;
//     }

//     public void setCourseName(String courseName) {
//         this.courseName = courseName;
//     }

//     public String getDomain() {
//         return domain;
//     }

//     public void setDomain(String domain) {
//         this.domain = domain;
//     }

//     public String getDescription() {
//         return description;
//     }

//     public void setDescription(String description) {
//         this.description = description;
//     }

//     public int getPrice() {
//         return price;
//     }

//     public void setPrice(int price) {
//         this.price = price;
//     }

// }

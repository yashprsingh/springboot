package com.hashedin.hu22.entities;

import javax.persistence.*;

@Entity
@Table(name = "order_table")
public class Orders {


    @Id
    private int orderId;
    private String productName;
    private String productQuantity;

    public Orders() {
    }

    public Orders(int orderId, String productName, String productQuantity) {
        this.orderId = orderId;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", productQuantity='" + productQuantity + '\'' +
                '}';
    }


}

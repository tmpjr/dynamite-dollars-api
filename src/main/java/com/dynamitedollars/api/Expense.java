package com.dynamitedollars.api;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "expenses")
public class Expense {
    private Long id;
    private String purpose;
    private Double amount;
    private Date expensedOn;
    private Date createdAt;

    public Expense(String purpose, Date expensedOn) {
        this.purpose = purpose;
        this.expensedOn = expensedOn;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "purpose", nullable = false)
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Column(name = "amount", nullable = false, scale = 2, precision = 12)
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Column(name = "expensed_on", nullable = false)
    public Date getExpensedOn() {
        return expensedOn;
    }
    public void setExpensedOn(Date expensedOn) {
        this.expensedOn = expensedOn;
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    public Date createdAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}


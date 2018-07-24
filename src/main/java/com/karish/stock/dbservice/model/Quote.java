package com.karish.stock.dbservice.model;

import javax.persistence.*;

@Entity
@Table(name="Quotes", catalog ="ad_2a86801359491c9")
public class Quote {
    public Quote() {

    }

    public Quote(String userName, String quote) {
        this.userName = userName;
        this.quote = quote;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="user_name")
    private String userName;

    @Column(name="Quote")
    private String quote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }


}

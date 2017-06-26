package com.verygood.security.audit.entity;

import com.verygood.security.audit.Trackable;
import com.verygood.security.audit.Tracked;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Trackable
public class Account {
  @Id
  @GeneratedValue
  @Tracked
  private Long id;

  @Tracked
  private Integer amount;

  @JoinColumn(name = "id_client")
  @ManyToOne(fetch = FetchType.LAZY)
  @Tracked
  private Client client;

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
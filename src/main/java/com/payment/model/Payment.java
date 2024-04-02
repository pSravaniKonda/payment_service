package com.payment.model;

import java.security.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="payment")
public class Payment {
	@Id              
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long pid;
    
    private String transactionId;
    
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
   
    @CreationTimestamp
    private Timestamp paymentDate;

    
    private Double amount;

   
    private Long orderId;


	public Long getPid() {
		return pid;
	}


	public void setPid(Long pid) {
		this.pid = pid;
	}


	public String getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}


	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public Timestamp getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public Long getOrderId() {
		return orderId;
	}


	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
    
    

}

package com.nt.entity;

import java.math.BigDecimal;
import java.time.Instant;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "JPA_PAYMENT_TABLE")
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dealer_Id", nullable = false)
    private Long dealerId;

    @Column(name = "payment_Amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "method", nullable = false)
    private String method;

    @Column(name = "payment_Status", nullable = false)
    private String status;

    @Column(name = "createdAt", nullable = false)
    private Instant createdAt;
    
    

    //AllArgsConstructor
	public Payment(Long id, Long dealerId, BigDecimal amount, String method, String status, Instant createdAt) {
		super();
		this.id = id;
		this.dealerId = dealerId;
		this.amount = amount;
		this.method = method;
		this.status = status;
		this.createdAt = createdAt;
	}

	
	//RequiredArgsConstructor
	public Payment(Long dealerId, BigDecimal amount, String method, String status, Instant createdAt) {
		super();
		this.dealerId = dealerId;
		this.amount = amount;
		this.method = method;
		this.status = status;
		this.createdAt = createdAt;
	}


	//NoArgsConstructor
	public Payment() {  } 

	//Getter and Setter methods...
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDealerId() {
		return dealerId;
	}

	public void setDealerId(Long dealerId) {
		this.dealerId = dealerId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}


	//ToString Method.
	@Override
	public String toString() {
		return "Payment [id=" + id + ", dealerId=" + dealerId + ", amount=" + amount + ", method=" + method
				+ ", status=" + status + ", createdAt=" + createdAt + "]";
	}
    
}

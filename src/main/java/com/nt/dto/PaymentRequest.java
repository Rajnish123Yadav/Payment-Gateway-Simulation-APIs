package com.nt.dto;

import java.math.BigDecimal;


public class PaymentRequest {
    private Long dealerId;
    private BigDecimal amount;
    private String method; // UPI / Card / NetBanking
    
    //AllArgsConstructor
    public PaymentRequest(Long dealerId, BigDecimal amount, String method) {
		super();
		this.dealerId = dealerId;
		this.amount = amount;
		this.method = method;
	}
    
    //RequiredArgsConstructor
    public PaymentRequest(BigDecimal amount, String method) {
		super();
		this.amount = amount;
		this.method = method;
	}
    
    //NoArgsConstructor
    public PaymentRequest() {
		
	}
    
    
	//Getter and Setter Methods
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
	
	
	//ToString
	@Override
	public String toString() {
		return "PaymentRequest [dealerId=" + dealerId + ", amount=" + amount + ", method=" + method + "]";
	}
    
}

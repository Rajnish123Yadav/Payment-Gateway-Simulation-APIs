package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}

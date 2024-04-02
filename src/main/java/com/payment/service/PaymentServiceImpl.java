package com.payment.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.model.Payment;
import com.payment.model.PaymentStatus;
import com.payment.repository.PaymentRepository;
@Service
public class PaymentServiceImpl implements PaymentService{

	private PaymentRepository paymentRepository;

    @Autowired
    public void setPaymentRepository(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment makePayment(Payment payment) {
        payment.setTransactionId(UUID.randomUUID().toString());
        payment.setPaymentStatus(new Random().nextBoolean()? PaymentStatus.SUCCESS:PaymentStatus.FAILED);
        return paymentRepository.save(payment);
    }

}

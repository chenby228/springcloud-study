package com.chenby.springcloud.service;

import com.chenby.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @create 2020-02-18 10:40
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

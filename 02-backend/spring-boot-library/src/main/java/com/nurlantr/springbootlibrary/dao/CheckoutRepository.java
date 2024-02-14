package com.nurlantr.springbootlibrary.dao;

import com.nurlantr.springbootlibrary.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {

    Checkout findByUserEmailAndBookId(String userEmail, Long id);

    List<Checkout> findBooksByUserEmail(String userEmail);
}
 
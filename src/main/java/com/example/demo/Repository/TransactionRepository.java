package com.example.demo.Repository;

import com.example.demo.model.Category;
import com.example.demo.model.Transaction;
import com.example.demo.model.User;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByUser(User user);

    List<Transaction> findAllByUserAndDateBetween(User user, LocalDate dateAfter, LocalDate dateBefore);


}

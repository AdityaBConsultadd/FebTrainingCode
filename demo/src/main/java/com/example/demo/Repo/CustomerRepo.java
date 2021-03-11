package com.example.demo.Repo;

import com.example.demo.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {
    @Query(value = "SELECT * FROM customer",nativeQuery = true)
    List<Customer> q1();
    @Query(value = "SELECT * FROM customer WHERE customer_name LIKE %:pattern% ",nativeQuery = true)
    List<Customer> q2(@Param(value = "pattern") String s);
}

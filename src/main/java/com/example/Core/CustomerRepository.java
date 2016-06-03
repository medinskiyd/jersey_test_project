package com.example.Core;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by DMedinskiy on 31.05.2016.
 */

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

}

package com.github.helios.repository;

import com.github.helios.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ReactiveCustomerRepository extends ReactiveMongoRepository<CustomerEntity, String> {

}

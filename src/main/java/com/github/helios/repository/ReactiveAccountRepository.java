package com.github.helios.repository;

import com.github.helios.entity.AccountEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ReactiveAccountRepository extends ReactiveMongoRepository<AccountEntity, String> {

}

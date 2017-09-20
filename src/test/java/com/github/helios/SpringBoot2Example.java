package com.github.helios;

import com.github.helios.entity.AccountEntity;
import com.github.helios.entity.CustomerEntity;
import com.github.helios.repository.ReactiveAccountRepository;
import com.github.helios.repository.ReactiveCustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot2Example {

    @Autowired
    private ReactiveAccountRepository accountRepository;

    @Autowired
    private ReactiveCustomerRepository customerRepository;

    @Test
    public void testMongoDbRef() {

        System.out.println("RUN TEST");

        AccountEntity account = new AccountEntity();
        account.setName("Github");
        account = accountRepository.save(account).block();

        CustomerEntity customer = new CustomerEntity();
        customer.setFirstName("Victor");
        customer.setLastName("Hugo");
        customer.setAccount(account);
        customerRepository.save(customer).block();
    }

}

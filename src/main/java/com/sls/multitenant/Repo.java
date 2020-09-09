package com.sls.multitenant;

import org.springframework.data.repository.CrudRepository;

interface Repo extends CrudRepository<Customer, Integer>{

}

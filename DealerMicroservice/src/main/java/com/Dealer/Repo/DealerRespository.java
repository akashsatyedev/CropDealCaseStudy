package com.Dealer.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Dealer.model.Dealer;
@Repository
public interface DealerRespository extends CrudRepository<Dealer ,String>
//static Dealer findByDealer_email(String dealer_email) 
{
	// TODO Auto-generated method stub
	

}

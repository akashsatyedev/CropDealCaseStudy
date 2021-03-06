package com.Dealer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Dealer.Repo.DealerRespository;
import com.Dealer.model.Dealer;

@Service
@Component
public class DealerService {
	
    @Autowired
	public DealerRespository DealerRepo;
    
   
    
    public List<Dealer> getAllDealers()
	{
		List<Dealer> dealers = new ArrayList<>();
		DealerRepo.findAll().forEach(dealers::add);
		return dealers;
	}
	public void adddealer(Dealer dealer) {
		// TODO Auto-generated method stub
		DealerRepo.save(dealer);
	}
	
	public void updatedealer(String id, Dealer dealer) {
		DealerRepo.save(dealer);//Save can be use to add or update
		// TODO Auto-generated method stub
		
	}
	public void deletedealer(String id) {
		// TODO Auto-generated method stub
		DealerRepo.deleteById(id);
	}
	/*@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Dealer dealer = DealerRespository.findByDealer_email(username);
		if(dealer == null) throw new UsernameNotFoundException(username);
		return null;
	} */
	
	}


package com.wellsfargo.counselor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wellsfargo.counselor.repository.PortfolioRepository;

@Service
public class PortfolioService {
    private final PortfolioRepository portfolioRepository;
    
    @Autowired
    public PortfolioService(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }
    
    // Business methods
}
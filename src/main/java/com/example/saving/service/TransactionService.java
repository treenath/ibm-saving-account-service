package com.example.saving.service;

import com.example.saving.model.TransferRequest;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public boolean transferMoney(TransferRequest request) {
        if (request.getAmount() <= 0) return false;
        // DB logic should be here
        return true;
    }
}
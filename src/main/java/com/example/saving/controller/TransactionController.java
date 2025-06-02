package com.example.saving.controller;

import com.example.saving.model.TransferRequest;
import com.example.saving.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transfer")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<String> transfer(@RequestBody TransferRequest request) {
        boolean success = transactionService.transferMoney(request);
        if (success) {
            return ResponseEntity.ok("Transfer successful");
        } else {
            return ResponseEntity.badRequest().body("Transfer failed");
        }
    }
}
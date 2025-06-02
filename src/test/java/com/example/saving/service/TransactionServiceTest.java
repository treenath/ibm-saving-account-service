package com.example.saving.service;

import com.example.saving.model.TransferRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransactionServiceTest {

    private final TransactionService service = new TransactionService();

    @Test
    void transfer_shouldSucceed_whenAmountIsPositive() {
        TransferRequest req = new TransferRequest();
        req.setFromAccount("1234567");
        req.setToAccount("7654321");
        req.setAmount(100.0);

        assertTrue(service.transferMoney(req));
    }

    @Test
    void transfer_shouldFail_whenAmountIsZero() {
        TransferRequest req = new TransferRequest();
        req.setFromAccount("1234567");
        req.setToAccount("7654321");
        req.setAmount(0.0);

        assertFalse(service.transferMoney(req));
    }

    @Test
    void transfer_shouldFail_whenAmountIsNegative() {
        TransferRequest req = new TransferRequest();
        req.setFromAccount("1234567");
        req.setToAccount("7654321");
        req.setAmount(-100.0);

        assertFalse(service.transferMoney(req));
    }
}
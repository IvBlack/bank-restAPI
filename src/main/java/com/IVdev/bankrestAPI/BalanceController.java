package com.IVdev.bankrestAPI;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController("/balance")
public class BalanceController {

    //check balance through user ID
    @GetMapping("/{accountId}")
    public BigDecimal getBalance(@PathVariable Long accountId) {

        return null;
    }

    @PostMapping("/{accountId}")
    public BigDecimal addMoney(
            @PathVariable Long accountId,
            @RequestBody BigDecimal amount
    ) {

        return null;
    }
}

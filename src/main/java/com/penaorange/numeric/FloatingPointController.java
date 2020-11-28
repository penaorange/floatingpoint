package com.penaorange.numeric;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * FloatingPointController
 */

@RestController
@RequestMapping("floating-point")
public class FloatingPointController {

    @GetMapping
    public String Index(@RequestParam(name = "number") int number) {
        // number 7
        // 1.0 - 0.7 = 0.3
        // double dollar = 1.0;
        // double dime = 0.10;
        // return "1 Dollar Dikurangi " + number + " dime hasilnya adalah " + (dollar -
        // number * dime);

        BigDecimal dollar = new BigDecimal("1.0");
        BigDecimal dime = new BigDecimal("0.10");

        return "1 Dollar dikurangi " + number + " dime hasilnya adalah "
                + (dollar.subtract(new BigDecimal(number).multiply(dime)));
    }
}
package com.ddd.tw.dddworkshop.quote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ddd.tw.dddworkshop.quote.domain.CarDetails;
import com.ddd.tw.dddworkshop.quote.domain.HomeDetails;
import com.ddd.tw.dddworkshop.quote.domain.Quotation;
import com.ddd.tw.dddworkshop.policy.service.QuoteService;

@Service
public class QuoteApplicationService {

    @Autowired
    private QuoteService quoteService;

    public Quotation calculateQuote(HomeDetails homeDetails) {
        return quoteService.calculateQuote(homeDetails);
    }

    public Quotation calculateQuote(CarDetails carDetails) {
        return quoteService.calculateQuote(carDetails);
    }
}
package com.water.demo.ddd.quote.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.water.demo.ddd.quote.model.HomePolicyQuote;

@Repository
public class HomePolicyQuoteRepository {
    private Map<String, HomePolicyQuote> homePolicyQuoteMap = new HashMap<>();

    public void save(HomePolicyQuote homePolicyQuote) {
        homePolicyQuoteMap.put(homePolicyQuote.getQuoteId(), homePolicyQuote);
    }

    public HomePolicyQuote byId(String quoteId) {
        return homePolicyQuoteMap.get(quoteId);
    }
}
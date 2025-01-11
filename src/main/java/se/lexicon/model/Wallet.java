package se.lexicon.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Wallet {

    private final String id;
    private final String walletName;
    private final Map<CryptoCurrency , BigDecimal> cryptoCurrencies;

    public Wallet(String walletName, Map<CryptoCurrency, BigDecimal> cryptoCurrencies) {
        this.id = UUID.randomUUID().toString();
        this.walletName = walletName;
        this.cryptoCurrencies = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getWalletName() {
        return walletName;
    }

    public Map<CryptoCurrency, BigDecimal> getCryptoCurrencies() {
        return cryptoCurrencies;
    }
}

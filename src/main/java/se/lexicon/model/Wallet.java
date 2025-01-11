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

    public BigDecimal getBalance(CryptoCurrency cryptoCurrency) {
        return getCryptoCurrencies().getOrDefault(cryptoCurrency, BigDecimal.ZERO);
    }

    public void deposit(CryptoCurrency cryptoCurrency, BigDecimal amount) {

        // No negative amount
        if (amount.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Deposit amount must be greater then Zero.");

        // add to balance
        BigDecimal balance = getBalance(cryptoCurrency);
        BigDecimal newBalance = balance.add(amount);

        cryptoCurrencies.put(cryptoCurrency, newBalance);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wallet{");
        sb.append("id='").append(id).append('\'');
        sb.append(", walletName='").append(walletName).append('\'');
        sb.append(", cryptoCurrencies=").append(cryptoCurrencies);
        sb.append('}');
        return sb.toString();
    }
}

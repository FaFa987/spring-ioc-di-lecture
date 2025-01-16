package se.lexicon.service;

import se.lexicon.model.Wallet;

public interface WalletManagment {

    Wallet create(String walletName);

    Wallet getById(String id);
}

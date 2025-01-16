package se.lexicon.dao.impl;

import se.lexicon.dao.WalletDao;
import se.lexicon.model.Wallet;

import java.util.Optional;

public class WalletDaoImpl implements WalletDao {

    @Override
    public Wallet createWallet(Wallet wallet) {
        return null;
    }

    @Override
    public Optional<Wallet> findWallet(String id) {
        return Optional.empty();
    }
}

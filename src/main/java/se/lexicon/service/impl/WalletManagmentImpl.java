package se.lexicon.service.impl;

import se.lexicon.dao.WalletDao;
import se.lexicon.exception.WalletValidationException;
import se.lexicon.model.Wallet;
import se.lexicon.service.WalletManagment;

//Service
// Where business logic happens, Connect to other services, Auth, Validation ...

public class WalletManagmentImpl implements WalletManagment {

    private WalletDao walletDao;

    public WalletManagmentImpl(WalletDao walletDao) {
        this.walletDao = walletDao;
    }

    @Override
    public Wallet create(String walletName) {
        // Logics, validation, Connect to other services.
        if(walletName == null) throw new WalletValidationException("Param is not valid", "Wallet Name");
        return null;
    }

    @Override
    public Wallet getById(String id) {
        return null;
    }
}

package com.realEstate.generator;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import java.io.Serializable;
import com.github.f4b6a3.ulid.UlidCreator;

public class UlidGenerator implements IdentifierGenerator{
    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object object) {
        return UlidCreator.getUlid().toString();
    }
}
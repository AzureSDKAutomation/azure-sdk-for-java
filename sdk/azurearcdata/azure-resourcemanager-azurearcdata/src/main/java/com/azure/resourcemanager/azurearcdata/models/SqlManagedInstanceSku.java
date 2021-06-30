// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource model definition representing SKU for Azure Managed Instance - Azure Arc. */
@Fluent
public final class SqlManagedInstanceSku extends CommonSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlManagedInstanceSku.class);

    /*
     * This field is required to be implemented by the Resource Provider if the
     * service has more than one tier.
     */
    @JsonProperty(value = "tier")
    private SqlManagedInstanceSkuTier tier;

    /**
     * Get the tier property: This field is required to be implemented by the Resource Provider if the service has more
     * than one tier.
     *
     * @return the tier value.
     */
    public SqlManagedInstanceSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: This field is required to be implemented by the Resource Provider if the service has more
     * than one tier.
     *
     * @param tier the tier value to set.
     * @return the SqlManagedInstanceSku object itself.
     */
    public SqlManagedInstanceSku withTier(SqlManagedInstanceSkuTier tier) {
        this.tier = tier;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlManagedInstanceSku withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlManagedInstanceSku withDev(Boolean dev) {
        super.withDev(dev);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlManagedInstanceSku withSize(String size) {
        super.withSize(size);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlManagedInstanceSku withFamily(String family) {
        super.withFamily(family);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlManagedInstanceSku withCapacity(Integer capacity) {
        super.withCapacity(capacity);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.blockchain.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Update the payload of the blockchain member properties for a blockchain member. */
@Fluent
public final class BlockchainMemberPropertiesUpdate extends TransactionNodePropertiesUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlockchainMemberPropertiesUpdate.class);

    /*
     * Sets the managed consortium management account password.
     */
    @JsonProperty(value = "consortiumManagementAccountPassword")
    private String consortiumManagementAccountPassword;

    /**
     * Get the consortiumManagementAccountPassword property: Sets the managed consortium management account password.
     *
     * @return the consortiumManagementAccountPassword value.
     */
    public String consortiumManagementAccountPassword() {
        return this.consortiumManagementAccountPassword;
    }

    /**
     * Set the consortiumManagementAccountPassword property: Sets the managed consortium management account password.
     *
     * @param consortiumManagementAccountPassword the consortiumManagementAccountPassword value to set.
     * @return the BlockchainMemberPropertiesUpdate object itself.
     */
    public BlockchainMemberPropertiesUpdate withConsortiumManagementAccountPassword(
        String consortiumManagementAccountPassword) {
        this.consortiumManagementAccountPassword = consortiumManagementAccountPassword;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BlockchainMemberPropertiesUpdate withPassword(String password) {
        super.withPassword(password);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BlockchainMemberPropertiesUpdate withFirewallRules(List<FirewallRule> firewallRules) {
        super.withFirewallRules(firewallRules);
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

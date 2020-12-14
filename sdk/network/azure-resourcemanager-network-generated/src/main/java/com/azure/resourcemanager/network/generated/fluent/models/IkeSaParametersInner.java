// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.IkeSaParametersMainModeSa;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IKE security association parameters for virtual network gateway connection. Response for GetIkeSas API service call.
 */
@Fluent
public final class IkeSaParametersInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IkeSaParametersInner.class);

    /*
     * A list of main mode security associations.
     */
    @JsonProperty(value = "mainModeSa")
    private IkeSaParametersMainModeSa mainModeSa;

    /**
     * Get the mainModeSa property: A list of main mode security associations.
     *
     * @return the mainModeSa value.
     */
    public IkeSaParametersMainModeSa mainModeSa() {
        return this.mainModeSa;
    }

    /**
     * Set the mainModeSa property: A list of main mode security associations.
     *
     * @param mainModeSa the mainModeSa value to set.
     * @return the IkeSaParametersInner object itself.
     */
    public IkeSaParametersInner withMainModeSa(IkeSaParametersMainModeSa mainModeSa) {
        this.mainModeSa = mainModeSa;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (mainModeSa() != null) {
            mainModeSa().validate();
        }
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.AutomaticTuningMode;
import com.azure.resourcemanager.sql.generated.models.AutomaticTuningOptions;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Database-level Automatic Tuning. */
@JsonFlatten
@Fluent
public class DatabaseAutomaticTuningInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseAutomaticTuningInner.class);

    /*
     * Automatic tuning desired state.
     */
    @JsonProperty(value = "properties.desiredState")
    private AutomaticTuningMode desiredState;

    /*
     * Automatic tuning actual state.
     */
    @JsonProperty(value = "properties.actualState", access = JsonProperty.Access.WRITE_ONLY)
    private AutomaticTuningMode actualState;

    /*
     * Automatic tuning options definition.
     */
    @JsonProperty(value = "properties.options")
    private Map<String, AutomaticTuningOptions> options;

    /**
     * Get the desiredState property: Automatic tuning desired state.
     *
     * @return the desiredState value.
     */
    public AutomaticTuningMode desiredState() {
        return this.desiredState;
    }

    /**
     * Set the desiredState property: Automatic tuning desired state.
     *
     * @param desiredState the desiredState value to set.
     * @return the DatabaseAutomaticTuningInner object itself.
     */
    public DatabaseAutomaticTuningInner withDesiredState(AutomaticTuningMode desiredState) {
        this.desiredState = desiredState;
        return this;
    }

    /**
     * Get the actualState property: Automatic tuning actual state.
     *
     * @return the actualState value.
     */
    public AutomaticTuningMode actualState() {
        return this.actualState;
    }

    /**
     * Get the options property: Automatic tuning options definition.
     *
     * @return the options value.
     */
    public Map<String, AutomaticTuningOptions> options() {
        return this.options;
    }

    /**
     * Set the options property: Automatic tuning options definition.
     *
     * @param options the options value to set.
     * @return the DatabaseAutomaticTuningInner object itself.
     */
    public DatabaseAutomaticTuningInner withOptions(Map<String, AutomaticTuningOptions> options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (options() != null) {
            options()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Function App stack runtimes. */
@Immutable
public final class FunctionAppRuntimes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FunctionAppRuntimes.class);

    /*
     * Linux-specific settings associated with the minor version.
     */
    @JsonProperty(value = "linuxRuntimeSettings", access = JsonProperty.Access.WRITE_ONLY)
    private FunctionAppRuntimeSettings linuxRuntimeSettings;

    /*
     * Windows-specific settings associated with the minor version.
     */
    @JsonProperty(value = "windowsRuntimeSettings", access = JsonProperty.Access.WRITE_ONLY)
    private FunctionAppRuntimeSettings windowsRuntimeSettings;

    /**
     * Get the linuxRuntimeSettings property: Linux-specific settings associated with the minor version.
     *
     * @return the linuxRuntimeSettings value.
     */
    public FunctionAppRuntimeSettings linuxRuntimeSettings() {
        return this.linuxRuntimeSettings;
    }

    /**
     * Get the windowsRuntimeSettings property: Windows-specific settings associated with the minor version.
     *
     * @return the windowsRuntimeSettings value.
     */
    public FunctionAppRuntimeSettings windowsRuntimeSettings() {
        return this.windowsRuntimeSettings;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linuxRuntimeSettings() != null) {
            linuxRuntimeSettings().validate();
        }
        if (windowsRuntimeSettings() != null) {
            windowsRuntimeSettings().validate();
        }
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A CNAME record. */
@Fluent
public final class CnameRecord {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CnameRecord.class);

    /*
     * The canonical name for this CNAME record.
     */
    @JsonProperty(value = "cname")
    private String cname;

    /**
     * Get the cname property: The canonical name for this CNAME record.
     *
     * @return the cname value.
     */
    public String cname() {
        return this.cname;
    }

    /**
     * Set the cname property: The canonical name for this CNAME record.
     *
     * @param cname the cname value to set.
     * @return the CnameRecord object itself.
     */
    public CnameRecord withCname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

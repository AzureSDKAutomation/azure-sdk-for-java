// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An A record. */
@Fluent
public final class ARecord {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ARecord.class);

    /*
     * The IPv4 address of this A record.
     */
    @JsonProperty(value = "ipv4Address")
    private String ipv4Address;

    /**
     * Get the ipv4Address property: The IPv4 address of this A record.
     *
     * @return the ipv4Address value.
     */
    public String ipv4Address() {
        return this.ipv4Address;
    }

    /**
     * Set the ipv4Address property: The IPv4 address of this A record.
     *
     * @param ipv4Address the ipv4Address value to set.
     * @return the ARecord object itself.
     */
    public ARecord withIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
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

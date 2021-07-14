// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that define an exchange connection. */
@Fluent
public final class ExchangeConnection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExchangeConnection.class);

    /*
     * The PeeringDB.com ID of the facility at which the connection has to be
     * set up.
     */
    @JsonProperty(value = "peeringDBFacilityId")
    private Integer peeringDBFacilityId;

    /*
     * The state of the connection.
     */
    @JsonProperty(value = "connectionState", access = JsonProperty.Access.WRITE_ONLY)
    private ConnectionState connectionState;

    /*
     * The BGP session associated with the connection.
     */
    @JsonProperty(value = "bgpSession")
    private BgpSession bgpSession;

    /*
     * The unique identifier (GUID) for the connection.
     */
    @JsonProperty(value = "connectionIdentifier")
    private String connectionIdentifier;

    /**
     * Get the peeringDBFacilityId property: The PeeringDB.com ID of the facility at which the connection has to be set
     * up.
     *
     * @return the peeringDBFacilityId value.
     */
    public Integer peeringDBFacilityId() {
        return this.peeringDBFacilityId;
    }

    /**
     * Set the peeringDBFacilityId property: The PeeringDB.com ID of the facility at which the connection has to be set
     * up.
     *
     * @param peeringDBFacilityId the peeringDBFacilityId value to set.
     * @return the ExchangeConnection object itself.
     */
    public ExchangeConnection withPeeringDBFacilityId(Integer peeringDBFacilityId) {
        this.peeringDBFacilityId = peeringDBFacilityId;
        return this;
    }

    /**
     * Get the connectionState property: The state of the connection.
     *
     * @return the connectionState value.
     */
    public ConnectionState connectionState() {
        return this.connectionState;
    }

    /**
     * Get the bgpSession property: The BGP session associated with the connection.
     *
     * @return the bgpSession value.
     */
    public BgpSession bgpSession() {
        return this.bgpSession;
    }

    /**
     * Set the bgpSession property: The BGP session associated with the connection.
     *
     * @param bgpSession the bgpSession value to set.
     * @return the ExchangeConnection object itself.
     */
    public ExchangeConnection withBgpSession(BgpSession bgpSession) {
        this.bgpSession = bgpSession;
        return this;
    }

    /**
     * Get the connectionIdentifier property: The unique identifier (GUID) for the connection.
     *
     * @return the connectionIdentifier value.
     */
    public String connectionIdentifier() {
        return this.connectionIdentifier;
    }

    /**
     * Set the connectionIdentifier property: The unique identifier (GUID) for the connection.
     *
     * @param connectionIdentifier the connectionIdentifier value to set.
     * @return the ExchangeConnection object itself.
     */
    public ExchangeConnection withConnectionIdentifier(String connectionIdentifier) {
        this.connectionIdentifier = connectionIdentifier;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bgpSession() != null) {
            bgpSession().validate();
        }
    }
}

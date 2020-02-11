/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that define an exchange connection.
 */
public class ExchangeConnection {
    /**
     * The PeeringDB.com ID of the facility at which the connection has to be
     * set up.
     */
    @JsonProperty(value = "peeringDBFacilityId")
    private Integer peeringDBFacilityId;

    /**
     * The state of the connection. Possible values include: 'None',
     * 'PendingApproval', 'Approved', 'ProvisioningStarted',
     * 'ProvisioningFailed', 'ProvisioningCompleted', 'Validating', 'Active'.
     */
    @JsonProperty(value = "connectionState", access = JsonProperty.Access.WRITE_ONLY)
    private ConnectionState connectionState;

    /**
     * The BGP session associated with the connection.
     */
    @JsonProperty(value = "bgpSession")
    private BgpSession bgpSession;

    /**
     * The unique identifier (GUID) for the connection.
     */
    @JsonProperty(value = "connectionIdentifier")
    private String connectionIdentifier;

    /**
     * The error message related to the connection state, if any.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /**
     * Get the PeeringDB.com ID of the facility at which the connection has to be set up.
     *
     * @return the peeringDBFacilityId value
     */
    public Integer peeringDBFacilityId() {
        return this.peeringDBFacilityId;
    }

    /**
     * Set the PeeringDB.com ID of the facility at which the connection has to be set up.
     *
     * @param peeringDBFacilityId the peeringDBFacilityId value to set
     * @return the ExchangeConnection object itself.
     */
    public ExchangeConnection withPeeringDBFacilityId(Integer peeringDBFacilityId) {
        this.peeringDBFacilityId = peeringDBFacilityId;
        return this;
    }

    /**
     * Get the state of the connection. Possible values include: 'None', 'PendingApproval', 'Approved', 'ProvisioningStarted', 'ProvisioningFailed', 'ProvisioningCompleted', 'Validating', 'Active'.
     *
     * @return the connectionState value
     */
    public ConnectionState connectionState() {
        return this.connectionState;
    }

    /**
     * Get the BGP session associated with the connection.
     *
     * @return the bgpSession value
     */
    public BgpSession bgpSession() {
        return this.bgpSession;
    }

    /**
     * Set the BGP session associated with the connection.
     *
     * @param bgpSession the bgpSession value to set
     * @return the ExchangeConnection object itself.
     */
    public ExchangeConnection withBgpSession(BgpSession bgpSession) {
        this.bgpSession = bgpSession;
        return this;
    }

    /**
     * Get the unique identifier (GUID) for the connection.
     *
     * @return the connectionIdentifier value
     */
    public String connectionIdentifier() {
        return this.connectionIdentifier;
    }

    /**
     * Set the unique identifier (GUID) for the connection.
     *
     * @param connectionIdentifier the connectionIdentifier value to set
     * @return the ExchangeConnection object itself.
     */
    public ExchangeConnection withConnectionIdentifier(String connectionIdentifier) {
        this.connectionIdentifier = connectionIdentifier;
        return this;
    }

    /**
     * Get the error message related to the connection state, if any.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

}

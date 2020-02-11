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
 * The properties that define a direct connection.
 */
public class DirectConnection {
    /**
     * The bandwidth of the connection.
     */
    @JsonProperty(value = "bandwidthInMbps")
    private Integer bandwidthInMbps;

    /**
     * The bandwidth that is actually provisioned.
     */
    @JsonProperty(value = "provisionedBandwidthInMbps", access = JsonProperty.Access.WRITE_ONLY)
    private Integer provisionedBandwidthInMbps;

    /**
     * The field indicating if Microsoft provides session ip addresses.
     * Possible values include: 'Microsoft', 'Peer'.
     */
    @JsonProperty(value = "sessionAddressProvider")
    private SessionAddressProvider sessionAddressProvider;

    /**
     * The flag that indicates whether or not the connection is used for
     * peering service.
     */
    @JsonProperty(value = "useForPeeringService")
    private Boolean useForPeeringService;

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
     * Get the bandwidth of the connection.
     *
     * @return the bandwidthInMbps value
     */
    public Integer bandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    /**
     * Set the bandwidth of the connection.
     *
     * @param bandwidthInMbps the bandwidthInMbps value to set
     * @return the DirectConnection object itself.
     */
    public DirectConnection withBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    /**
     * Get the bandwidth that is actually provisioned.
     *
     * @return the provisionedBandwidthInMbps value
     */
    public Integer provisionedBandwidthInMbps() {
        return this.provisionedBandwidthInMbps;
    }

    /**
     * Get the field indicating if Microsoft provides session ip addresses. Possible values include: 'Microsoft', 'Peer'.
     *
     * @return the sessionAddressProvider value
     */
    public SessionAddressProvider sessionAddressProvider() {
        return this.sessionAddressProvider;
    }

    /**
     * Set the field indicating if Microsoft provides session ip addresses. Possible values include: 'Microsoft', 'Peer'.
     *
     * @param sessionAddressProvider the sessionAddressProvider value to set
     * @return the DirectConnection object itself.
     */
    public DirectConnection withSessionAddressProvider(SessionAddressProvider sessionAddressProvider) {
        this.sessionAddressProvider = sessionAddressProvider;
        return this;
    }

    /**
     * Get the flag that indicates whether or not the connection is used for peering service.
     *
     * @return the useForPeeringService value
     */
    public Boolean useForPeeringService() {
        return this.useForPeeringService;
    }

    /**
     * Set the flag that indicates whether or not the connection is used for peering service.
     *
     * @param useForPeeringService the useForPeeringService value to set
     * @return the DirectConnection object itself.
     */
    public DirectConnection withUseForPeeringService(Boolean useForPeeringService) {
        this.useForPeeringService = useForPeeringService;
        return this;
    }

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
     * @return the DirectConnection object itself.
     */
    public DirectConnection withPeeringDBFacilityId(Integer peeringDBFacilityId) {
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
     * @return the DirectConnection object itself.
     */
    public DirectConnection withBgpSession(BgpSession bgpSession) {
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
     * @return the DirectConnection object itself.
     */
    public DirectConnection withConnectionIdentifier(String connectionIdentifier) {
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

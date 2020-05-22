/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import java.util.List;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation.PrivateEndpointConnectionInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of Cognitive Services account.
 */
public class CognitiveServicesAccountProperties {
    /**
     * Gets the status of the cognitive services account at the time the
     * operation was called. Possible values include: 'Creating',
     * 'ResolvingDNS', 'Moving', 'Deleting', 'Succeeded', 'Failed'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Endpoint of the created account.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * The internal identifier.
     */
    @JsonProperty(value = "internalId", access = JsonProperty.Access.WRITE_ONLY)
    private String internalId;

    /**
     * Gets the capabilities of the cognitive services account. Each item
     * indicates a specific feature is supported by this account. The value is
     * read only and for reference only.
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> capabilities;

    /**
     * Optional subdomain name used for token-based authentication.
     */
    @JsonProperty(value = "customSubDomainName")
    private String customSubDomainName;

    /**
     * A collection of rules governing the accessibility from specific network
     * locations.
     */
    @JsonProperty(value = "networkAcls")
    private NetworkRuleSet networkAcls;

    /**
     * The encryption properties for this resource.
     */
    @JsonProperty(value = "encryption")
    private Encryption encryption;

    /**
     * The storage accounts for this resource.
     */
    @JsonProperty(value = "userOwnedStorage")
    private List<UserOwnedStorage> userOwnedStorage;

    /**
     * The private endpoint connection associated with the Cognitive Services
     * account.
     */
    @JsonProperty(value = "privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /**
     * Whether or not public endpoint access is allowed for this account. Value
     * is optional but if passed in, must be 'Enabled' or 'Disabled'. Possible
     * values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * The api properties for special APIs.
     */
    @JsonProperty(value = "apiProperties")
    private CognitiveServicesAccountApiProperties apiProperties;

    /**
     * Get gets the status of the cognitive services account at the time the operation was called. Possible values include: 'Creating', 'ResolvingDNS', 'Moving', 'Deleting', 'Succeeded', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get endpoint of the created account.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the internal identifier.
     *
     * @return the internalId value
     */
    public String internalId() {
        return this.internalId;
    }

    /**
     * Get gets the capabilities of the cognitive services account. Each item indicates a specific feature is supported by this account. The value is read only and for reference only.
     *
     * @return the capabilities value
     */
    public List<String> capabilities() {
        return this.capabilities;
    }

    /**
     * Get optional subdomain name used for token-based authentication.
     *
     * @return the customSubDomainName value
     */
    public String customSubDomainName() {
        return this.customSubDomainName;
    }

    /**
     * Set optional subdomain name used for token-based authentication.
     *
     * @param customSubDomainName the customSubDomainName value to set
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withCustomSubDomainName(String customSubDomainName) {
        this.customSubDomainName = customSubDomainName;
        return this;
    }

    /**
     * Get a collection of rules governing the accessibility from specific network locations.
     *
     * @return the networkAcls value
     */
    public NetworkRuleSet networkAcls() {
        return this.networkAcls;
    }

    /**
     * Set a collection of rules governing the accessibility from specific network locations.
     *
     * @param networkAcls the networkAcls value to set
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withNetworkAcls(NetworkRuleSet networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }

    /**
     * Get the encryption properties for this resource.
     *
     * @return the encryption value
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption properties for this resource.
     *
     * @param encryption the encryption value to set
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the storage accounts for this resource.
     *
     * @return the userOwnedStorage value
     */
    public List<UserOwnedStorage> userOwnedStorage() {
        return this.userOwnedStorage;
    }

    /**
     * Set the storage accounts for this resource.
     *
     * @param userOwnedStorage the userOwnedStorage value to set
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withUserOwnedStorage(List<UserOwnedStorage> userOwnedStorage) {
        this.userOwnedStorage = userOwnedStorage;
        return this;
    }

    /**
     * Get the private endpoint connection associated with the Cognitive Services account.
     *
     * @return the privateEndpointConnections value
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the private endpoint connection associated with the Cognitive Services account.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get whether or not public endpoint access is allowed for this account. Value is optional but if passed in, must be 'Enabled' or 'Disabled'. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the publicNetworkAccess value
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set whether or not public endpoint access is allowed for this account. Value is optional but if passed in, must be 'Enabled' or 'Disabled'. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the api properties for special APIs.
     *
     * @return the apiProperties value
     */
    public CognitiveServicesAccountApiProperties apiProperties() {
        return this.apiProperties;
    }

    /**
     * Set the api properties for special APIs.
     *
     * @param apiProperties the apiProperties value to set
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withApiProperties(CognitiveServicesAccountApiProperties apiProperties) {
        this.apiProperties = apiProperties;
        return this;
    }

}

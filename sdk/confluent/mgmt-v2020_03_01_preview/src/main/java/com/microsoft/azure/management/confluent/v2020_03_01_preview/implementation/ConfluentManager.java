/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.confluent.v2020_03_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.confluent.v2020_03_01_preview.MarketplaceAgreements;
import com.microsoft.azure.management.confluent.v2020_03_01_preview.OrganizationOperations;
import com.microsoft.azure.management.confluent.v2020_03_01_preview.Organizations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Confluent resource management.
 */
public final class ConfluentManager extends ManagerCore<ConfluentManager, ConfluentManagementClientImpl> {
    private MarketplaceAgreements marketplaceAgreements;
    private OrganizationOperations organizationOperations;
    private Organizations organizations;
    /**
    * Get a Configurable instance that can be used to create ConfluentManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ConfluentManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ConfluentManager that exposes Confluent resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the ConfluentManager
    */
    public static ConfluentManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new ConfluentManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of ConfluentManager that exposes Confluent resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the ConfluentManager
    */
    public static ConfluentManager authenticate(RestClient restClient, String subscriptionId) {
        return new ConfluentManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ConfluentManager that exposes Confluent management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Confluent management API entry points that work across subscriptions
        */
        ConfluentManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage MarketplaceAgreements.
     */
    public MarketplaceAgreements marketplaceAgreements() {
        if (this.marketplaceAgreements == null) {
            this.marketplaceAgreements = new MarketplaceAgreementsImpl(this);
        }
        return this.marketplaceAgreements;
    }

    /**
     * @return Entry point to manage OrganizationOperations.
     */
    public OrganizationOperations organizationOperations() {
        if (this.organizationOperations == null) {
            this.organizationOperations = new OrganizationOperationsImpl(this);
        }
        return this.organizationOperations;
    }

    /**
     * @return Entry point to manage Organizations.
     */
    public Organizations organizations() {
        if (this.organizations == null) {
            this.organizations = new OrganizationsImpl(this);
        }
        return this.organizations;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ConfluentManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return ConfluentManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private ConfluentManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new ConfluentManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.support.Operations;
import com.microsoft.azure.management.support.Services;
import com.microsoft.azure.management.support.ProblemClassifications;
import com.microsoft.azure.management.support.SupportTickets;
import com.microsoft.azure.management.support.SupportTicketSubscriptions;
import com.microsoft.azure.management.support.Communications;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Support resource management.
 */
public final class SupportManager extends ManagerCore<SupportManager, MicrosoftSupportImpl> {
    private Operations operations;
    private Services services;
    private ProblemClassifications problemClassifications;
    private SupportTickets supportTickets;
    private SupportTicketSubscriptions supportTicketSubscriptions;
    private Communications communications;
    /**
    * Get a Configurable instance that can be used to create SupportManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new SupportManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of SupportManager that exposes Support resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the SupportManager
    */
    public static SupportManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new SupportManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of SupportManager that exposes Support resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the SupportManager
    */
    public static SupportManager authenticate(RestClient restClient, String subscriptionId) {
        return new SupportManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of SupportManager that exposes Support management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Support management API entry points that work across subscriptions
        */
        SupportManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Services.
     */
    public Services services() {
        if (this.services == null) {
            this.services = new ServicesImpl(this);
        }
        return this.services;
    }

    /**
     * @return Entry point to manage ProblemClassifications.
     */
    public ProblemClassifications problemClassifications() {
        if (this.problemClassifications == null) {
            this.problemClassifications = new ProblemClassificationsImpl(this);
        }
        return this.problemClassifications;
    }

    /**
     * @return Entry point to manage SupportTickets.
     */
    public SupportTickets supportTickets() {
        if (this.supportTickets == null) {
            this.supportTickets = new SupportTicketsImpl(this);
        }
        return this.supportTickets;
    }

    /**
     * @return Entry point to manage SupportTicketSubscriptions.
     */
    public SupportTicketSubscriptions supportTicketSubscriptions() {
        if (this.supportTicketSubscriptions == null) {
            this.supportTicketSubscriptions = new SupportTicketSubscriptionsImpl(this);
        }
        return this.supportTicketSubscriptions;
    }

    /**
     * @return Entry point to manage Communications.
     */
    public Communications communications() {
        if (this.communications == null) {
            this.communications = new CommunicationsImpl(this);
        }
        return this.communications;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public SupportManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return SupportManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private SupportManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new MicrosoftSupportImpl(restClient).withSubscriptionId(subscriptionId));
    }
}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.billing.v2020_05_01.BillingAccounts;
import com.microsoft.azure.management.billing.v2020_05_01.Address;
import com.microsoft.azure.management.billing.v2020_05_01.AvailableBalances;
import com.microsoft.azure.management.billing.v2020_05_01.Instructions;
import com.microsoft.azure.management.billing.v2020_05_01.BillingProfiles;
import com.microsoft.azure.management.billing.v2020_05_01.Customers;
import com.microsoft.azure.management.billing.v2020_05_01.InvoiceSections;
import com.microsoft.azure.management.billing.v2020_05_01.BillingPermissions;
import com.microsoft.azure.management.billing.v2020_05_01.BillingSubscriptions;
import com.microsoft.azure.management.billing.v2020_05_01.Products;
import com.microsoft.azure.management.billing.v2020_05_01.Invoices;
import com.microsoft.azure.management.billing.v2020_05_01.Transactions;
import com.microsoft.azure.management.billing.v2020_05_01.Policies;
import com.microsoft.azure.management.billing.v2020_05_01.BillingPropertys;
import com.microsoft.azure.management.billing.v2020_05_01.Operations;
import com.microsoft.azure.management.billing.v2020_05_01.BillingRoleDefinitions;
import com.microsoft.azure.management.billing.v2020_05_01.BillingRoleAssignments;
import com.microsoft.azure.management.billing.v2020_05_01.Agreements;
import com.microsoft.azure.management.billing.v2020_05_01.Transfers;
import com.microsoft.azure.management.billing.v2020_05_01.PartnerTransfers;
import com.microsoft.azure.management.billing.v2020_05_01.RecipientTransfers;
import com.microsoft.azure.management.billing.v2020_05_01.EnrollmentAccounts;
import com.microsoft.azure.management.billing.v2020_05_01.BillingPeriods;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Billing resource management.
 */
public final class BillingManager extends ManagerCore<BillingManager, BillingManagementClientImpl> {
    private BillingAccounts billingAccounts;
    private Address address;
    private AvailableBalances availableBalances;
    private Instructions instructions;
    private BillingProfiles billingProfiles;
    private Customers customers;
    private InvoiceSections invoiceSections;
    private BillingPermissions billingPermissions;
    private BillingSubscriptions billingSubscriptions;
    private Products products;
    private Invoices invoices;
    private Transactions transactions;
    private Policies policies;
    private BillingPropertys billingPropertys;
    private Operations operations;
    private BillingRoleDefinitions billingRoleDefinitions;
    private BillingRoleAssignments billingRoleAssignments;
    private Agreements agreements;
    private Transfers transfers;
    private PartnerTransfers partnerTransfers;
    private RecipientTransfers recipientTransfers;
    private EnrollmentAccounts enrollmentAccounts;
    private BillingPeriods billingPeriods;
    /**
    * Get a Configurable instance that can be used to create BillingManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new BillingManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of BillingManager that exposes Billing resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the BillingManager
    */
    public static BillingManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new BillingManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of BillingManager that exposes Billing resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the BillingManager
    */
    public static BillingManager authenticate(RestClient restClient, String subscriptionId) {
        return new BillingManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of BillingManager that exposes Billing management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Billing management API entry points that work across subscriptions
        */
        BillingManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage BillingAccounts.
     */
    public BillingAccounts billingAccounts() {
        if (this.billingAccounts == null) {
            this.billingAccounts = new BillingAccountsImpl(this);
        }
        return this.billingAccounts;
    }

    /**
     * @return Entry point to manage Address.
     */
    public Address address() {
        if (this.address == null) {
            this.address = new AddressImpl(this);
        }
        return this.address;
    }

    /**
     * @return Entry point to manage AvailableBalances.
     */
    public AvailableBalances availableBalances() {
        if (this.availableBalances == null) {
            this.availableBalances = new AvailableBalancesImpl(this);
        }
        return this.availableBalances;
    }

    /**
     * @return Entry point to manage Instructions.
     */
    public Instructions instructions() {
        if (this.instructions == null) {
            this.instructions = new InstructionsImpl(this);
        }
        return this.instructions;
    }

    /**
     * @return Entry point to manage BillingProfiles.
     */
    public BillingProfiles billingProfiles() {
        if (this.billingProfiles == null) {
            this.billingProfiles = new BillingProfilesImpl(this);
        }
        return this.billingProfiles;
    }

    /**
     * @return Entry point to manage Customers.
     */
    public Customers customers() {
        if (this.customers == null) {
            this.customers = new CustomersImpl(this);
        }
        return this.customers;
    }

    /**
     * @return Entry point to manage InvoiceSections.
     */
    public InvoiceSections invoiceSections() {
        if (this.invoiceSections == null) {
            this.invoiceSections = new InvoiceSectionsImpl(this);
        }
        return this.invoiceSections;
    }

    /**
     * @return Entry point to manage BillingPermissions.
     */
    public BillingPermissions billingPermissions() {
        if (this.billingPermissions == null) {
            this.billingPermissions = new BillingPermissionsImpl(this);
        }
        return this.billingPermissions;
    }

    /**
     * @return Entry point to manage BillingSubscriptions.
     */
    public BillingSubscriptions billingSubscriptions() {
        if (this.billingSubscriptions == null) {
            this.billingSubscriptions = new BillingSubscriptionsImpl(this);
        }
        return this.billingSubscriptions;
    }

    /**
     * @return Entry point to manage Products.
     */
    public Products products() {
        if (this.products == null) {
            this.products = new ProductsImpl(this);
        }
        return this.products;
    }

    /**
     * @return Entry point to manage Invoices.
     */
    public Invoices invoices() {
        if (this.invoices == null) {
            this.invoices = new InvoicesImpl(this);
        }
        return this.invoices;
    }

    /**
     * @return Entry point to manage Transactions.
     */
    public Transactions transactions() {
        if (this.transactions == null) {
            this.transactions = new TransactionsImpl(this);
        }
        return this.transactions;
    }

    /**
     * @return Entry point to manage Policies.
     */
    public Policies policies() {
        if (this.policies == null) {
            this.policies = new PoliciesImpl(this);
        }
        return this.policies;
    }

    /**
     * @return Entry point to manage BillingPropertys.
     */
    public BillingPropertys billingPropertys() {
        if (this.billingPropertys == null) {
            this.billingPropertys = new BillingPropertysImpl(this);
        }
        return this.billingPropertys;
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
     * @return Entry point to manage BillingRoleDefinitions.
     */
    public BillingRoleDefinitions billingRoleDefinitions() {
        if (this.billingRoleDefinitions == null) {
            this.billingRoleDefinitions = new BillingRoleDefinitionsImpl(this);
        }
        return this.billingRoleDefinitions;
    }

    /**
     * @return Entry point to manage BillingRoleAssignments.
     */
    public BillingRoleAssignments billingRoleAssignments() {
        if (this.billingRoleAssignments == null) {
            this.billingRoleAssignments = new BillingRoleAssignmentsImpl(this);
        }
        return this.billingRoleAssignments;
    }

    /**
     * @return Entry point to manage Agreements.
     */
    public Agreements agreements() {
        if (this.agreements == null) {
            this.agreements = new AgreementsImpl(this);
        }
        return this.agreements;
    }

    /**
     * @return Entry point to manage Transfers.
     */
    public Transfers transfers() {
        if (this.transfers == null) {
            this.transfers = new TransfersImpl(this);
        }
        return this.transfers;
    }

    /**
     * @return Entry point to manage PartnerTransfers.
     */
    public PartnerTransfers partnerTransfers() {
        if (this.partnerTransfers == null) {
            this.partnerTransfers = new PartnerTransfersImpl(this);
        }
        return this.partnerTransfers;
    }

    /**
     * @return Entry point to manage RecipientTransfers.
     */
    public RecipientTransfers recipientTransfers() {
        if (this.recipientTransfers == null) {
            this.recipientTransfers = new RecipientTransfersImpl(this);
        }
        return this.recipientTransfers;
    }

    /**
     * @return Entry point to manage EnrollmentAccounts.
     */
    public EnrollmentAccounts enrollmentAccounts() {
        if (this.enrollmentAccounts == null) {
            this.enrollmentAccounts = new EnrollmentAccountsImpl(this);
        }
        return this.enrollmentAccounts;
    }

    /**
     * @return Entry point to manage BillingPeriods.
     */
    public BillingPeriods billingPeriods() {
        if (this.billingPeriods == null) {
            this.billingPeriods = new BillingPeriodsImpl(this);
        }
        return this.billingPeriods;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public BillingManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return BillingManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private BillingManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new BillingManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.FirewallPolicyInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of FirewallPolicy. */
public interface FirewallPolicy {
    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the identity property: The identity of the firewall policy.
     *
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the ruleCollectionGroups property: List of references to FirewallPolicyRuleCollectionGroups.
     *
     * @return the ruleCollectionGroups value.
     */
    List<SubResource> ruleCollectionGroups();

    /**
     * Gets the provisioningState property: The provisioning state of the firewall policy resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the basePolicy property: The parent firewall policy from which rules are inherited.
     *
     * @return the basePolicy value.
     */
    SubResource basePolicy();

    /**
     * Gets the firewalls property: List of references to Azure Firewalls that this Firewall Policy is associated with.
     *
     * @return the firewalls value.
     */
    List<SubResource> firewalls();

    /**
     * Gets the childPolicies property: List of references to Child Firewall Policies.
     *
     * @return the childPolicies value.
     */
    List<SubResource> childPolicies();

    /**
     * Gets the threatIntelMode property: The operation mode for Threat Intelligence.
     *
     * @return the threatIntelMode value.
     */
    AzureFirewallThreatIntelMode threatIntelMode();

    /**
     * Gets the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy.
     *
     * @return the threatIntelWhitelist value.
     */
    FirewallPolicyThreatIntelWhitelist threatIntelWhitelist();

    /**
     * Gets the insights property: Insights on Firewall Policy.
     *
     * @return the insights value.
     */
    FirewallPolicyInsights insights();

    /**
     * Gets the snat property: The private IP addresses/IP ranges to which traffic will not be SNAT.
     *
     * @return the snat value.
     */
    FirewallPolicySnat snat();

    /**
     * Gets the sql property: SQL Settings definition.
     *
     * @return the sql value.
     */
    FirewallPolicySql sql();

    /**
     * Gets the dnsSettings property: DNS Proxy Settings definition.
     *
     * @return the dnsSettings value.
     */
    DnsSettings dnsSettings();

    /**
     * Gets the intrusionDetection property: The configuration for Intrusion detection.
     *
     * @return the intrusionDetection value.
     */
    FirewallPolicyIntrusionDetection intrusionDetection();

    /**
     * Gets the transportSecurity property: TLS Configuration definition.
     *
     * @return the transportSecurity value.
     */
    FirewallPolicyTransportSecurity transportSecurity();

    /**
     * Gets the sku property: The Firewall Policy SKU.
     *
     * @return the sku value.
     */
    FirewallPolicySku sku();

    /**
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.FirewallPolicyInner object.
     *
     * @return the inner object.
     */
    FirewallPolicyInner innerModel();

    /** The entirety of the FirewallPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The FirewallPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the FirewallPolicy definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the FirewallPolicy definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the FirewallPolicy definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the FirewallPolicy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithBasePolicy,
                DefinitionStages.WithThreatIntelMode,
                DefinitionStages.WithThreatIntelWhitelist,
                DefinitionStages.WithInsights,
                DefinitionStages.WithSnat,
                DefinitionStages.WithSql,
                DefinitionStages.WithDnsSettings,
                DefinitionStages.WithIntrusionDetection,
                DefinitionStages.WithTransportSecurity,
                DefinitionStages.WithSku {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            FirewallPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FirewallPolicy create(Context context);
        }
        /** The stage of the FirewallPolicy definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the FirewallPolicy definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the firewall policy..
             *
             * @param identity The identity of the firewall policy.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }
        /** The stage of the FirewallPolicy definition allowing to specify basePolicy. */
        interface WithBasePolicy {
            /**
             * Specifies the basePolicy property: The parent firewall policy from which rules are inherited..
             *
             * @param basePolicy The parent firewall policy from which rules are inherited.
             * @return the next definition stage.
             */
            WithCreate withBasePolicy(SubResource basePolicy);
        }
        /** The stage of the FirewallPolicy definition allowing to specify threatIntelMode. */
        interface WithThreatIntelMode {
            /**
             * Specifies the threatIntelMode property: The operation mode for Threat Intelligence..
             *
             * @param threatIntelMode The operation mode for Threat Intelligence.
             * @return the next definition stage.
             */
            WithCreate withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode);
        }
        /** The stage of the FirewallPolicy definition allowing to specify threatIntelWhitelist. */
        interface WithThreatIntelWhitelist {
            /**
             * Specifies the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy..
             *
             * @param threatIntelWhitelist ThreatIntel Whitelist for Firewall Policy.
             * @return the next definition stage.
             */
            WithCreate withThreatIntelWhitelist(FirewallPolicyThreatIntelWhitelist threatIntelWhitelist);
        }
        /** The stage of the FirewallPolicy definition allowing to specify insights. */
        interface WithInsights {
            /**
             * Specifies the insights property: Insights on Firewall Policy..
             *
             * @param insights Insights on Firewall Policy.
             * @return the next definition stage.
             */
            WithCreate withInsights(FirewallPolicyInsights insights);
        }
        /** The stage of the FirewallPolicy definition allowing to specify snat. */
        interface WithSnat {
            /**
             * Specifies the snat property: The private IP addresses/IP ranges to which traffic will not be SNAT..
             *
             * @param snat The private IP addresses/IP ranges to which traffic will not be SNAT.
             * @return the next definition stage.
             */
            WithCreate withSnat(FirewallPolicySnat snat);
        }
        /** The stage of the FirewallPolicy definition allowing to specify sql. */
        interface WithSql {
            /**
             * Specifies the sql property: SQL Settings definition..
             *
             * @param sql SQL Settings definition.
             * @return the next definition stage.
             */
            WithCreate withSql(FirewallPolicySql sql);
        }
        /** The stage of the FirewallPolicy definition allowing to specify dnsSettings. */
        interface WithDnsSettings {
            /**
             * Specifies the dnsSettings property: DNS Proxy Settings definition..
             *
             * @param dnsSettings DNS Proxy Settings definition.
             * @return the next definition stage.
             */
            WithCreate withDnsSettings(DnsSettings dnsSettings);
        }
        /** The stage of the FirewallPolicy definition allowing to specify intrusionDetection. */
        interface WithIntrusionDetection {
            /**
             * Specifies the intrusionDetection property: The configuration for Intrusion detection..
             *
             * @param intrusionDetection The configuration for Intrusion detection.
             * @return the next definition stage.
             */
            WithCreate withIntrusionDetection(FirewallPolicyIntrusionDetection intrusionDetection);
        }
        /** The stage of the FirewallPolicy definition allowing to specify transportSecurity. */
        interface WithTransportSecurity {
            /**
             * Specifies the transportSecurity property: TLS Configuration definition..
             *
             * @param transportSecurity TLS Configuration definition.
             * @return the next definition stage.
             */
            WithCreate withTransportSecurity(FirewallPolicyTransportSecurity transportSecurity);
        }
        /** The stage of the FirewallPolicy definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The Firewall Policy SKU..
             *
             * @param sku The Firewall Policy SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(FirewallPolicySku sku);
        }
    }
    /**
     * Begins update for the FirewallPolicy resource.
     *
     * @return the stage of resource update.
     */
    FirewallPolicy.Update update();

    /** The template for FirewallPolicy update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithBasePolicy,
            UpdateStages.WithThreatIntelMode,
            UpdateStages.WithThreatIntelWhitelist,
            UpdateStages.WithInsights,
            UpdateStages.WithSnat,
            UpdateStages.WithSql,
            UpdateStages.WithDnsSettings,
            UpdateStages.WithIntrusionDetection,
            UpdateStages.WithTransportSecurity,
            UpdateStages.WithSku {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        FirewallPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        FirewallPolicy apply(Context context);
    }
    /** The FirewallPolicy update stages. */
    interface UpdateStages {
        /** The stage of the FirewallPolicy update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the FirewallPolicy update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the firewall policy..
             *
             * @param identity The identity of the firewall policy.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }
        /** The stage of the FirewallPolicy update allowing to specify basePolicy. */
        interface WithBasePolicy {
            /**
             * Specifies the basePolicy property: The parent firewall policy from which rules are inherited..
             *
             * @param basePolicy The parent firewall policy from which rules are inherited.
             * @return the next definition stage.
             */
            Update withBasePolicy(SubResource basePolicy);
        }
        /** The stage of the FirewallPolicy update allowing to specify threatIntelMode. */
        interface WithThreatIntelMode {
            /**
             * Specifies the threatIntelMode property: The operation mode for Threat Intelligence..
             *
             * @param threatIntelMode The operation mode for Threat Intelligence.
             * @return the next definition stage.
             */
            Update withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode);
        }
        /** The stage of the FirewallPolicy update allowing to specify threatIntelWhitelist. */
        interface WithThreatIntelWhitelist {
            /**
             * Specifies the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy..
             *
             * @param threatIntelWhitelist ThreatIntel Whitelist for Firewall Policy.
             * @return the next definition stage.
             */
            Update withThreatIntelWhitelist(FirewallPolicyThreatIntelWhitelist threatIntelWhitelist);
        }
        /** The stage of the FirewallPolicy update allowing to specify insights. */
        interface WithInsights {
            /**
             * Specifies the insights property: Insights on Firewall Policy..
             *
             * @param insights Insights on Firewall Policy.
             * @return the next definition stage.
             */
            Update withInsights(FirewallPolicyInsights insights);
        }
        /** The stage of the FirewallPolicy update allowing to specify snat. */
        interface WithSnat {
            /**
             * Specifies the snat property: The private IP addresses/IP ranges to which traffic will not be SNAT..
             *
             * @param snat The private IP addresses/IP ranges to which traffic will not be SNAT.
             * @return the next definition stage.
             */
            Update withSnat(FirewallPolicySnat snat);
        }
        /** The stage of the FirewallPolicy update allowing to specify sql. */
        interface WithSql {
            /**
             * Specifies the sql property: SQL Settings definition..
             *
             * @param sql SQL Settings definition.
             * @return the next definition stage.
             */
            Update withSql(FirewallPolicySql sql);
        }
        /** The stage of the FirewallPolicy update allowing to specify dnsSettings. */
        interface WithDnsSettings {
            /**
             * Specifies the dnsSettings property: DNS Proxy Settings definition..
             *
             * @param dnsSettings DNS Proxy Settings definition.
             * @return the next definition stage.
             */
            Update withDnsSettings(DnsSettings dnsSettings);
        }
        /** The stage of the FirewallPolicy update allowing to specify intrusionDetection. */
        interface WithIntrusionDetection {
            /**
             * Specifies the intrusionDetection property: The configuration for Intrusion detection..
             *
             * @param intrusionDetection The configuration for Intrusion detection.
             * @return the next definition stage.
             */
            Update withIntrusionDetection(FirewallPolicyIntrusionDetection intrusionDetection);
        }
        /** The stage of the FirewallPolicy update allowing to specify transportSecurity. */
        interface WithTransportSecurity {
            /**
             * Specifies the transportSecurity property: TLS Configuration definition..
             *
             * @param transportSecurity TLS Configuration definition.
             * @return the next definition stage.
             */
            Update withTransportSecurity(FirewallPolicyTransportSecurity transportSecurity);
        }
        /** The stage of the FirewallPolicy update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The Firewall Policy SKU..
             *
             * @param sku The Firewall Policy SKU.
             * @return the next definition stage.
             */
            Update withSku(FirewallPolicySku sku);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    FirewallPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FirewallPolicy refresh(Context context);
}

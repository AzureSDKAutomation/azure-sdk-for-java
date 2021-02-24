// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NatGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of PublicIpAddress. */
public interface PublicIpAddress {
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
     * Gets the extendedLocation property: The extended location of the public ip address.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the sku property: The public IP address SKU.
     *
     * @return the sku value.
     */
    PublicIpAddressSku sku();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @return the zones value.
     */
    List<String> zones();

    /**
     * Gets the publicIpAllocationMethod property: The public IP address allocation method.
     *
     * @return the publicIpAllocationMethod value.
     */
    IpAllocationMethod publicIpAllocationMethod();

    /**
     * Gets the publicIpAddressVersion property: The public IP address version.
     *
     * @return the publicIpAddressVersion value.
     */
    IpVersion publicIpAddressVersion();

    /**
     * Gets the ipConfiguration property: The IP configuration associated with the public IP address.
     *
     * @return the ipConfiguration value.
     */
    IpConfiguration ipConfiguration();

    /**
     * Gets the dnsSettings property: The FQDN of the DNS record associated with the public IP address.
     *
     * @return the dnsSettings value.
     */
    PublicIpAddressDnsSettings dnsSettings();

    /**
     * Gets the ddosSettings property: The DDoS protection custom policy associated with the public IP address.
     *
     * @return the ddosSettings value.
     */
    DdosSettings ddosSettings();

    /**
     * Gets the ipTags property: The list of tags associated with the public IP address.
     *
     * @return the ipTags value.
     */
    List<IpTag> ipTags();

    /**
     * Gets the ipAddress property: The IP address associated with the public IP address resource.
     *
     * @return the ipAddress value.
     */
    String ipAddress();

    /**
     * Gets the publicIpPrefix property: The Public IP Prefix this Public IP Address should be allocated from.
     *
     * @return the publicIpPrefix value.
     */
    SubResource publicIpPrefix();

    /**
     * Gets the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     *
     * @return the idleTimeoutInMinutes value.
     */
    Integer idleTimeoutInMinutes();

    /**
     * Gets the resourceGuid property: The resource GUID property of the public IP address resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the public IP address resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the servicePublicIpAddress property: The service public IP address of the public IP address resource.
     *
     * @return the servicePublicIpAddress value.
     */
    PublicIpAddress servicePublicIpAddress();

    /**
     * Gets the natGateway property: The NatGateway for the Public IP address.
     *
     * @return the natGateway value.
     */
    NatGateway natGateway();

    /**
     * Gets the migrationPhase property: Migration phase of Public IP Address.
     *
     * @return the migrationPhase value.
     */
    PublicIpAddressMigrationPhase migrationPhase();

    /**
     * Gets the linkedPublicIpAddress property: The source Public IP Address (IPv6) that links to this address (IPv4).
     *
     * @return the linkedPublicIpAddress value.
     */
    PublicIpAddress linkedPublicIpAddress();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner object.
     *
     * @return the inner object.
     */
    PublicIpAddressInner innerModel();

    /** The entirety of the PublicIpAddress definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The PublicIpAddress definition stages. */
    interface DefinitionStages {
        /** The first stage of the PublicIpAddress definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the PublicIpAddress definition allowing to specify location. */
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
        /** The stage of the PublicIpAddress definition allowing to specify parent resource. */
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
         * The stage of the PublicIpAddress definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithExtendedLocation,
                DefinitionStages.WithSku,
                DefinitionStages.WithZones,
                DefinitionStages.WithPublicIpAllocationMethod,
                DefinitionStages.WithPublicIpAddressVersion,
                DefinitionStages.WithDnsSettings,
                DefinitionStages.WithDdosSettings,
                DefinitionStages.WithIpTags,
                DefinitionStages.WithIpAddress,
                DefinitionStages.WithPublicIpPrefix,
                DefinitionStages.WithIdleTimeoutInMinutes,
                DefinitionStages.WithServicePublicIpAddress,
                DefinitionStages.WithNatGateway,
                DefinitionStages.WithMigrationPhase,
                DefinitionStages.WithLinkedPublicIpAddress {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PublicIpAddress create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PublicIpAddress create(Context context);
        }
        /** The stage of the PublicIpAddress definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the PublicIpAddress definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extended location of the public ip address..
             *
             * @param extendedLocation The extended location of the public ip address.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }
        /** The stage of the PublicIpAddress definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The public IP address SKU..
             *
             * @param sku The public IP address SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(PublicIpAddressSku sku);
        }
        /** The stage of the PublicIpAddress definition allowing to specify zones. */
        interface WithZones {
            /**
             * Specifies the zones property: A list of availability zones denoting the IP allocated for the resource
             * needs to come from..
             *
             * @param zones A list of availability zones denoting the IP allocated for the resource needs to come from.
             * @return the next definition stage.
             */
            WithCreate withZones(List<String> zones);
        }
        /** The stage of the PublicIpAddress definition allowing to specify publicIpAllocationMethod. */
        interface WithPublicIpAllocationMethod {
            /**
             * Specifies the publicIpAllocationMethod property: The public IP address allocation method..
             *
             * @param publicIpAllocationMethod The public IP address allocation method.
             * @return the next definition stage.
             */
            WithCreate withPublicIpAllocationMethod(IpAllocationMethod publicIpAllocationMethod);
        }
        /** The stage of the PublicIpAddress definition allowing to specify publicIpAddressVersion. */
        interface WithPublicIpAddressVersion {
            /**
             * Specifies the publicIpAddressVersion property: The public IP address version..
             *
             * @param publicIpAddressVersion The public IP address version.
             * @return the next definition stage.
             */
            WithCreate withPublicIpAddressVersion(IpVersion publicIpAddressVersion);
        }
        /** The stage of the PublicIpAddress definition allowing to specify dnsSettings. */
        interface WithDnsSettings {
            /**
             * Specifies the dnsSettings property: The FQDN of the DNS record associated with the public IP address..
             *
             * @param dnsSettings The FQDN of the DNS record associated with the public IP address.
             * @return the next definition stage.
             */
            WithCreate withDnsSettings(PublicIpAddressDnsSettings dnsSettings);
        }
        /** The stage of the PublicIpAddress definition allowing to specify ddosSettings. */
        interface WithDdosSettings {
            /**
             * Specifies the ddosSettings property: The DDoS protection custom policy associated with the public IP
             * address..
             *
             * @param ddosSettings The DDoS protection custom policy associated with the public IP address.
             * @return the next definition stage.
             */
            WithCreate withDdosSettings(DdosSettings ddosSettings);
        }
        /** The stage of the PublicIpAddress definition allowing to specify ipTags. */
        interface WithIpTags {
            /**
             * Specifies the ipTags property: The list of tags associated with the public IP address..
             *
             * @param ipTags The list of tags associated with the public IP address.
             * @return the next definition stage.
             */
            WithCreate withIpTags(List<IpTag> ipTags);
        }
        /** The stage of the PublicIpAddress definition allowing to specify ipAddress. */
        interface WithIpAddress {
            /**
             * Specifies the ipAddress property: The IP address associated with the public IP address resource..
             *
             * @param ipAddress The IP address associated with the public IP address resource.
             * @return the next definition stage.
             */
            WithCreate withIpAddress(String ipAddress);
        }
        /** The stage of the PublicIpAddress definition allowing to specify publicIpPrefix. */
        interface WithPublicIpPrefix {
            /**
             * Specifies the publicIpPrefix property: The Public IP Prefix this Public IP Address should be allocated
             * from..
             *
             * @param publicIpPrefix The Public IP Prefix this Public IP Address should be allocated from.
             * @return the next definition stage.
             */
            WithCreate withPublicIpPrefix(SubResource publicIpPrefix);
        }
        /** The stage of the PublicIpAddress definition allowing to specify idleTimeoutInMinutes. */
        interface WithIdleTimeoutInMinutes {
            /**
             * Specifies the idleTimeoutInMinutes property: The idle timeout of the public IP address..
             *
             * @param idleTimeoutInMinutes The idle timeout of the public IP address.
             * @return the next definition stage.
             */
            WithCreate withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes);
        }
        /** The stage of the PublicIpAddress definition allowing to specify servicePublicIpAddress. */
        interface WithServicePublicIpAddress {
            /**
             * Specifies the servicePublicIpAddress property: The service public IP address of the public IP address
             * resource..
             *
             * @param servicePublicIpAddress The service public IP address of the public IP address resource.
             * @return the next definition stage.
             */
            WithCreate withServicePublicIpAddress(PublicIpAddressInner servicePublicIpAddress);
        }
        /** The stage of the PublicIpAddress definition allowing to specify natGateway. */
        interface WithNatGateway {
            /**
             * Specifies the natGateway property: The NatGateway for the Public IP address..
             *
             * @param natGateway The NatGateway for the Public IP address.
             * @return the next definition stage.
             */
            WithCreate withNatGateway(NatGatewayInner natGateway);
        }
        /** The stage of the PublicIpAddress definition allowing to specify migrationPhase. */
        interface WithMigrationPhase {
            /**
             * Specifies the migrationPhase property: Migration phase of Public IP Address..
             *
             * @param migrationPhase Migration phase of Public IP Address.
             * @return the next definition stage.
             */
            WithCreate withMigrationPhase(PublicIpAddressMigrationPhase migrationPhase);
        }
        /** The stage of the PublicIpAddress definition allowing to specify linkedPublicIpAddress. */
        interface WithLinkedPublicIpAddress {
            /**
             * Specifies the linkedPublicIpAddress property: The source Public IP Address (IPv6) that links to this
             * address (IPv4)..
             *
             * @param linkedPublicIpAddress The source Public IP Address (IPv6) that links to this address (IPv4).
             * @return the next definition stage.
             */
            WithCreate withLinkedPublicIpAddress(PublicIpAddressInner linkedPublicIpAddress);
        }
    }
    /**
     * Begins update for the PublicIpAddress resource.
     *
     * @return the stage of resource update.
     */
    PublicIpAddress.Update update();

    /** The template for PublicIpAddress update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PublicIpAddress apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PublicIpAddress apply(Context context);
    }
    /** The PublicIpAddress update stages. */
    interface UpdateStages {
        /** The stage of the PublicIpAddress update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PublicIpAddress refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PublicIpAddress refresh(Context context);
}

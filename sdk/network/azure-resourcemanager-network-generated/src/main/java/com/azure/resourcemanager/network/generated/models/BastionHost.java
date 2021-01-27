// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.BastionHostInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of BastionHost. */
public interface BastionHost {
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
     * Gets the ipConfigurations property: IP configuration of the Bastion Host resource.
     *
     * @return the ipConfigurations value.
     */
    List<BastionHostIpConfiguration> ipConfigurations();

    /**
     * Gets the dnsName property: FQDN for the endpoint on which bastion host is accessible.
     *
     * @return the dnsName value.
     */
    String dnsName();

    /**
     * Gets the sku property: The sku of this Bastion Host.
     *
     * @return the sku value.
     */
    BastionHostSkuName sku();

    /**
     * Gets the provisioningState property: The provisioning state of the bastion host resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.BastionHostInner object.
     *
     * @return the inner object.
     */
    BastionHostInner innerModel();

    /** The entirety of the BastionHost definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The BastionHost definition stages. */
    interface DefinitionStages {
        /** The first stage of the BastionHost definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the BastionHost definition allowing to specify location. */
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
        /** The stage of the BastionHost definition allowing to specify parent resource. */
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
         * The stage of the BastionHost definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIpConfigurations,
                DefinitionStages.WithDnsName,
                DefinitionStages.WithSku {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BastionHost create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BastionHost create(Context context);
        }
        /** The stage of the BastionHost definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the BastionHost definition allowing to specify ipConfigurations. */
        interface WithIpConfigurations {
            /**
             * Specifies the ipConfigurations property: IP configuration of the Bastion Host resource..
             *
             * @param ipConfigurations IP configuration of the Bastion Host resource.
             * @return the next definition stage.
             */
            WithCreate withIpConfigurations(List<BastionHostIpConfiguration> ipConfigurations);
        }
        /** The stage of the BastionHost definition allowing to specify dnsName. */
        interface WithDnsName {
            /**
             * Specifies the dnsName property: FQDN for the endpoint on which bastion host is accessible..
             *
             * @param dnsName FQDN for the endpoint on which bastion host is accessible.
             * @return the next definition stage.
             */
            WithCreate withDnsName(String dnsName);
        }
        /** The stage of the BastionHost definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku of this Bastion Host..
             *
             * @param sku The sku of this Bastion Host.
             * @return the next definition stage.
             */
            WithCreate withSku(BastionHostSkuName sku);
        }
    }
    /**
     * Begins update for the BastionHost resource.
     *
     * @return the stage of resource update.
     */
    BastionHost.Update update();

    /** The template for BastionHost update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIpConfigurations,
            UpdateStages.WithDnsName,
            UpdateStages.WithSku {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BastionHost apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BastionHost apply(Context context);
    }
    /** The BastionHost update stages. */
    interface UpdateStages {
        /** The stage of the BastionHost update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the BastionHost update allowing to specify ipConfigurations. */
        interface WithIpConfigurations {
            /**
             * Specifies the ipConfigurations property: IP configuration of the Bastion Host resource..
             *
             * @param ipConfigurations IP configuration of the Bastion Host resource.
             * @return the next definition stage.
             */
            Update withIpConfigurations(List<BastionHostIpConfiguration> ipConfigurations);
        }
        /** The stage of the BastionHost update allowing to specify dnsName. */
        interface WithDnsName {
            /**
             * Specifies the dnsName property: FQDN for the endpoint on which bastion host is accessible..
             *
             * @param dnsName FQDN for the endpoint on which bastion host is accessible.
             * @return the next definition stage.
             */
            Update withDnsName(String dnsName);
        }
        /** The stage of the BastionHost update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku of this Bastion Host..
             *
             * @param sku The sku of this Bastion Host.
             * @return the next definition stage.
             */
            Update withSku(BastionHostSkuName sku);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BastionHost refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BastionHost refresh(Context context);
}

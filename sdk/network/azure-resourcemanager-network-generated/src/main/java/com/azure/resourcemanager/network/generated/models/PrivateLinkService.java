// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateLinkServiceInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateLinkServiceIpConfigurationInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of PrivateLinkService. */
public interface PrivateLinkService {
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
     * Gets the extendedLocation property: The extended location of the load balancer.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the loadBalancerFrontendIpConfigurations property: An array of references to the load balancer IP
     * configurations.
     *
     * @return the loadBalancerFrontendIpConfigurations value.
     */
    List<FrontendIpConfiguration> loadBalancerFrontendIpConfigurations();

    /**
     * Gets the ipConfigurations property: An array of private link service IP configurations.
     *
     * @return the ipConfigurations value.
     */
    List<PrivateLinkServiceIpConfiguration> ipConfigurations();

    /**
     * Gets the networkInterfaces property: An array of references to the network interfaces created for this private
     * link service.
     *
     * @return the networkInterfaces value.
     */
    List<NetworkInterface> networkInterfaces();

    /**
     * Gets the provisioningState property: The provisioning state of the private link service resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the privateEndpointConnections property: An array of list about connections to the private endpoint.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the visibility property: The visibility list of the private link service.
     *
     * @return the visibility value.
     */
    PrivateLinkServicePropertiesVisibility visibility();

    /**
     * Gets the autoApproval property: The auto-approval list of the private link service.
     *
     * @return the autoApproval value.
     */
    PrivateLinkServicePropertiesAutoApproval autoApproval();

    /**
     * Gets the fqdns property: The list of Fqdn.
     *
     * @return the fqdns value.
     */
    List<String> fqdns();

    /**
     * Gets the alias property: The alias of the private link service.
     *
     * @return the alias value.
     */
    String alias();

    /**
     * Gets the enableProxyProtocol property: Whether the private link service is enabled for proxy protocol or not.
     *
     * @return the enableProxyProtocol value.
     */
    Boolean enableProxyProtocol();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.PrivateLinkServiceInner object.
     *
     * @return the inner object.
     */
    PrivateLinkServiceInner innerModel();

    /** The entirety of the PrivateLinkService definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The PrivateLinkService definition stages. */
    interface DefinitionStages {
        /** The first stage of the PrivateLinkService definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the PrivateLinkService definition allowing to specify location. */
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
        /** The stage of the PrivateLinkService definition allowing to specify parent resource. */
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
         * The stage of the PrivateLinkService definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithExtendedLocation,
                DefinitionStages.WithLoadBalancerFrontendIpConfigurations,
                DefinitionStages.WithIpConfigurations,
                DefinitionStages.WithVisibility,
                DefinitionStages.WithAutoApproval,
                DefinitionStages.WithFqdns,
                DefinitionStages.WithEnableProxyProtocol {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PrivateLinkService create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PrivateLinkService create(Context context);
        }
        /** The stage of the PrivateLinkService definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the PrivateLinkService definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extended location of the load balancer..
             *
             * @param extendedLocation The extended location of the load balancer.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }
        /** The stage of the PrivateLinkService definition allowing to specify loadBalancerFrontendIpConfigurations. */
        interface WithLoadBalancerFrontendIpConfigurations {
            /**
             * Specifies the loadBalancerFrontendIpConfigurations property: An array of references to the load balancer
             * IP configurations..
             *
             * @param loadBalancerFrontendIpConfigurations An array of references to the load balancer IP
             *     configurations.
             * @return the next definition stage.
             */
            WithCreate withLoadBalancerFrontendIpConfigurations(
                List<FrontendIpConfigurationInner> loadBalancerFrontendIpConfigurations);
        }
        /** The stage of the PrivateLinkService definition allowing to specify ipConfigurations. */
        interface WithIpConfigurations {
            /**
             * Specifies the ipConfigurations property: An array of private link service IP configurations..
             *
             * @param ipConfigurations An array of private link service IP configurations.
             * @return the next definition stage.
             */
            WithCreate withIpConfigurations(List<PrivateLinkServiceIpConfigurationInner> ipConfigurations);
        }
        /** The stage of the PrivateLinkService definition allowing to specify visibility. */
        interface WithVisibility {
            /**
             * Specifies the visibility property: The visibility list of the private link service..
             *
             * @param visibility The visibility list of the private link service.
             * @return the next definition stage.
             */
            WithCreate withVisibility(PrivateLinkServicePropertiesVisibility visibility);
        }
        /** The stage of the PrivateLinkService definition allowing to specify autoApproval. */
        interface WithAutoApproval {
            /**
             * Specifies the autoApproval property: The auto-approval list of the private link service..
             *
             * @param autoApproval The auto-approval list of the private link service.
             * @return the next definition stage.
             */
            WithCreate withAutoApproval(PrivateLinkServicePropertiesAutoApproval autoApproval);
        }
        /** The stage of the PrivateLinkService definition allowing to specify fqdns. */
        interface WithFqdns {
            /**
             * Specifies the fqdns property: The list of Fqdn..
             *
             * @param fqdns The list of Fqdn.
             * @return the next definition stage.
             */
            WithCreate withFqdns(List<String> fqdns);
        }
        /** The stage of the PrivateLinkService definition allowing to specify enableProxyProtocol. */
        interface WithEnableProxyProtocol {
            /**
             * Specifies the enableProxyProtocol property: Whether the private link service is enabled for proxy
             * protocol or not..
             *
             * @param enableProxyProtocol Whether the private link service is enabled for proxy protocol or not.
             * @return the next definition stage.
             */
            WithCreate withEnableProxyProtocol(Boolean enableProxyProtocol);
        }
    }
    /**
     * Begins update for the PrivateLinkService resource.
     *
     * @return the stage of resource update.
     */
    PrivateLinkService.Update update();

    /** The template for PrivateLinkService update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithExtendedLocation,
            UpdateStages.WithLoadBalancerFrontendIpConfigurations,
            UpdateStages.WithIpConfigurations,
            UpdateStages.WithVisibility,
            UpdateStages.WithAutoApproval,
            UpdateStages.WithFqdns,
            UpdateStages.WithEnableProxyProtocol {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PrivateLinkService apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PrivateLinkService apply(Context context);
    }
    /** The PrivateLinkService update stages. */
    interface UpdateStages {
        /** The stage of the PrivateLinkService update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the PrivateLinkService update allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extended location of the load balancer..
             *
             * @param extendedLocation The extended location of the load balancer.
             * @return the next definition stage.
             */
            Update withExtendedLocation(ExtendedLocation extendedLocation);
        }
        /** The stage of the PrivateLinkService update allowing to specify loadBalancerFrontendIpConfigurations. */
        interface WithLoadBalancerFrontendIpConfigurations {
            /**
             * Specifies the loadBalancerFrontendIpConfigurations property: An array of references to the load balancer
             * IP configurations..
             *
             * @param loadBalancerFrontendIpConfigurations An array of references to the load balancer IP
             *     configurations.
             * @return the next definition stage.
             */
            Update withLoadBalancerFrontendIpConfigurations(
                List<FrontendIpConfigurationInner> loadBalancerFrontendIpConfigurations);
        }
        /** The stage of the PrivateLinkService update allowing to specify ipConfigurations. */
        interface WithIpConfigurations {
            /**
             * Specifies the ipConfigurations property: An array of private link service IP configurations..
             *
             * @param ipConfigurations An array of private link service IP configurations.
             * @return the next definition stage.
             */
            Update withIpConfigurations(List<PrivateLinkServiceIpConfigurationInner> ipConfigurations);
        }
        /** The stage of the PrivateLinkService update allowing to specify visibility. */
        interface WithVisibility {
            /**
             * Specifies the visibility property: The visibility list of the private link service..
             *
             * @param visibility The visibility list of the private link service.
             * @return the next definition stage.
             */
            Update withVisibility(PrivateLinkServicePropertiesVisibility visibility);
        }
        /** The stage of the PrivateLinkService update allowing to specify autoApproval. */
        interface WithAutoApproval {
            /**
             * Specifies the autoApproval property: The auto-approval list of the private link service..
             *
             * @param autoApproval The auto-approval list of the private link service.
             * @return the next definition stage.
             */
            Update withAutoApproval(PrivateLinkServicePropertiesAutoApproval autoApproval);
        }
        /** The stage of the PrivateLinkService update allowing to specify fqdns. */
        interface WithFqdns {
            /**
             * Specifies the fqdns property: The list of Fqdn..
             *
             * @param fqdns The list of Fqdn.
             * @return the next definition stage.
             */
            Update withFqdns(List<String> fqdns);
        }
        /** The stage of the PrivateLinkService update allowing to specify enableProxyProtocol. */
        interface WithEnableProxyProtocol {
            /**
             * Specifies the enableProxyProtocol property: Whether the private link service is enabled for proxy
             * protocol or not..
             *
             * @param enableProxyProtocol Whether the private link service is enabled for proxy protocol or not.
             * @return the next definition stage.
             */
            Update withEnableProxyProtocol(Boolean enableProxyProtocol);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PrivateLinkService refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PrivateLinkService refresh(Context context);
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyDefinitionInner;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ServiceEndpointPolicy. */
public interface ServiceEndpointPolicy {
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
     * Gets the serviceEndpointPolicyDefinitions property: A collection of service endpoint policy definitions of the
     * service endpoint policy.
     *
     * @return the serviceEndpointPolicyDefinitions value.
     */
    List<ServiceEndpointPolicyDefinition> serviceEndpointPolicyDefinitions();

    /**
     * Gets the subnets property: A collection of references to subnets.
     *
     * @return the subnets value.
     */
    List<Subnet> subnets();

    /**
     * Gets the resourceGuid property: The resource GUID property of the service endpoint policy resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the service endpoint policy resource.
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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyInner object.
     *
     * @return the inner object.
     */
    ServiceEndpointPolicyInner innerModel();

    /** The entirety of the ServiceEndpointPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ServiceEndpointPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the ServiceEndpointPolicy definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ServiceEndpointPolicy definition allowing to specify location. */
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
        /** The stage of the ServiceEndpointPolicy definition allowing to specify parent resource. */
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
         * The stage of the ServiceEndpointPolicy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithServiceEndpointPolicyDefinitions {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ServiceEndpointPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServiceEndpointPolicy create(Context context);
        }
        /** The stage of the ServiceEndpointPolicy definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ServiceEndpointPolicy definition allowing to specify serviceEndpointPolicyDefinitions. */
        interface WithServiceEndpointPolicyDefinitions {
            /**
             * Specifies the serviceEndpointPolicyDefinitions property: A collection of service endpoint policy
             * definitions of the service endpoint policy..
             *
             * @param serviceEndpointPolicyDefinitions A collection of service endpoint policy definitions of the
             *     service endpoint policy.
             * @return the next definition stage.
             */
            WithCreate withServiceEndpointPolicyDefinitions(
                List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions);
        }
    }
    /**
     * Begins update for the ServiceEndpointPolicy resource.
     *
     * @return the stage of resource update.
     */
    ServiceEndpointPolicy.Update update();

    /** The template for ServiceEndpointPolicy update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ServiceEndpointPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ServiceEndpointPolicy apply(Context context);
    }
    /** The ServiceEndpointPolicy update stages. */
    interface UpdateStages {
        /** The stage of the ServiceEndpointPolicy update allowing to specify tags. */
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
    ServiceEndpointPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ServiceEndpointPolicy refresh(Context context);
}

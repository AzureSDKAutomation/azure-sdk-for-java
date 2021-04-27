// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.fluent.models.ProfileInner;
import java.util.Map;

/** An immutable client-side representation of Profile. */
public interface Profile {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

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
     * Gets the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the resourceState property: Resource status of the profile.
     *
     * @return the resourceState value.
     */
    ProfileResourceState resourceState();

    /**
     * Gets the provisioningState property: Provisioning status of the profile.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the frontdoorId property: The Id of the frontdoor.
     *
     * @return the frontdoorId value.
     */
    String frontdoorId();

    /**
     * Gets the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the inner com.azure.resourcemanager.cdn.generated.fluent.models.ProfileInner object.
     *
     * @return the inner object.
     */
    ProfileInner innerModel();

    /** The entirety of the Profile definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithSku,
            DefinitionStages.WithCreate {
    }
    /** The Profile definition stages. */
    interface DefinitionStages {
        /** The first stage of the Profile definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Profile definition allowing to specify location. */
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
        /** The stage of the Profile definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @return the next definition stage.
             */
            WithSku withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the Profile definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the CDN
             * profile..
             *
             * @param sku The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /**
         * The stage of the Profile definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Profile create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Profile create(Context context);
        }
        /** The stage of the Profile definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
    }
    /**
     * Begins update for the Profile resource.
     *
     * @return the stage of resource update.
     */
    Profile.Update update();

    /** The template for Profile update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Profile apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Profile apply(Context context);
    }
    /** The Profile update stages. */
    interface UpdateStages {
        /** The stage of the Profile update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Profile tags.
             *
             * @param tags Profile tags.
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
    Profile refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Profile refresh(Context context);

    /**
     * Generates a dynamic SSO URI used to sign in to the CDN supplemental portal. Supplemental portal is used to
     * configure advanced feature capabilities that are not yet available in the Azure portal, such as core reports in a
     * standard profile; rules engine, advanced HTTP reports, and real-time stats and alerts in a premium profile. The
     * SSO URI changes approximately every 10 minutes.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the URI required to login to the supplemental portal from the Azure portal.
     */
    SsoUri generateSsoUri();

    /**
     * Generates a dynamic SSO URI used to sign in to the CDN supplemental portal. Supplemental portal is used to
     * configure advanced feature capabilities that are not yet available in the Azure portal, such as core reports in a
     * standard profile; rules engine, advanced HTTP reports, and real-time stats and alerts in a premium profile. The
     * SSO URI changes approximately every 10 minutes.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the URI required to login to the supplemental portal from the Azure portal.
     */
    Response<SsoUri> generateSsoUriWithResponse(Context context);

    /**
     * Gets the supported optimization types for the current profile. A user can create an endpoint with an optimization
     * type from the listed values.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the supported optimization types for the current profile.
     */
    SupportedOptimizationTypesListResult listSupportedOptimizationTypes();

    /**
     * Gets the supported optimization types for the current profile. A user can create an endpoint with an optimization
     * type from the listed values.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the supported optimization types for the current profile.
     */
    Response<SupportedOptimizationTypesListResult> listSupportedOptimizationTypesWithResponse(Context context);

    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check resource usage API.
     */
    PagedIterable<ResourceUsage> listResourceUsage();

    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check resource usage API.
     */
    PagedIterable<ResourceUsage> listResourceUsage(Context context);
}

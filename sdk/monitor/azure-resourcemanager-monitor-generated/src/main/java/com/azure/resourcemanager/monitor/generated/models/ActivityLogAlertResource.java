// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.ActivityLogAlertResourceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ActivityLogAlertResource. */
public interface ActivityLogAlertResource {
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
     * Gets the scopes property: A list of resourceIds that will be used as prefixes. The alert will only apply to
     * activityLogs with resourceIds that fall under one of these prefixes. This list must include at least one item.
     *
     * @return the scopes value.
     */
    List<String> scopes();

    /**
     * Gets the enabled property: Indicates whether this activity log alert is enabled. If an activity log alert is not
     * enabled, then none of its actions will be activated.
     *
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the condition property: The condition that will cause this alert to activate.
     *
     * @return the condition value.
     */
    ActivityLogAlertAllOfCondition condition();

    /**
     * Gets the actions property: The actions that will activate when the condition is met.
     *
     * @return the actions value.
     */
    ActivityLogAlertActionList actions();

    /**
     * Gets the description property: A description of this activity log alert.
     *
     * @return the description value.
     */
    String description();

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
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.ActivityLogAlertResourceInner object.
     *
     * @return the inner object.
     */
    ActivityLogAlertResourceInner innerModel();

    /** The entirety of the ActivityLogAlertResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ActivityLogAlertResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ActivityLogAlertResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ActivityLogAlertResource definition allowing to specify location. */
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
        /** The stage of the ActivityLogAlertResource definition allowing to specify parent resource. */
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
         * The stage of the ActivityLogAlertResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithScopes,
                DefinitionStages.WithEnabled,
                DefinitionStages.WithCondition,
                DefinitionStages.WithActions,
                DefinitionStages.WithDescription {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ActivityLogAlertResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ActivityLogAlertResource create(Context context);
        }
        /** The stage of the ActivityLogAlertResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ActivityLogAlertResource definition allowing to specify scopes. */
        interface WithScopes {
            /**
             * Specifies the scopes property: A list of resourceIds that will be used as prefixes. The alert will only
             * apply to activityLogs with resourceIds that fall under one of these prefixes. This list must include at
             * least one item..
             *
             * @param scopes A list of resourceIds that will be used as prefixes. The alert will only apply to
             *     activityLogs with resourceIds that fall under one of these prefixes. This list must include at least
             *     one item.
             * @return the next definition stage.
             */
            WithCreate withScopes(List<String> scopes);
        }
        /** The stage of the ActivityLogAlertResource definition allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: Indicates whether this activity log alert is enabled. If an activity log
             * alert is not enabled, then none of its actions will be activated..
             *
             * @param enabled Indicates whether this activity log alert is enabled. If an activity log alert is not
             *     enabled, then none of its actions will be activated.
             * @return the next definition stage.
             */
            WithCreate withEnabled(Boolean enabled);
        }
        /** The stage of the ActivityLogAlertResource definition allowing to specify condition. */
        interface WithCondition {
            /**
             * Specifies the condition property: The condition that will cause this alert to activate..
             *
             * @param condition The condition that will cause this alert to activate.
             * @return the next definition stage.
             */
            WithCreate withCondition(ActivityLogAlertAllOfCondition condition);
        }
        /** The stage of the ActivityLogAlertResource definition allowing to specify actions. */
        interface WithActions {
            /**
             * Specifies the actions property: The actions that will activate when the condition is met..
             *
             * @param actions The actions that will activate when the condition is met.
             * @return the next definition stage.
             */
            WithCreate withActions(ActivityLogAlertActionList actions);
        }
        /** The stage of the ActivityLogAlertResource definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: A description of this activity log alert..
             *
             * @param description A description of this activity log alert.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
    }
    /**
     * Begins update for the ActivityLogAlertResource resource.
     *
     * @return the stage of resource update.
     */
    ActivityLogAlertResource.Update update();

    /** The template for ActivityLogAlertResource update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithEnabled {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ActivityLogAlertResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ActivityLogAlertResource apply(Context context);
    }
    /** The ActivityLogAlertResource update stages. */
    interface UpdateStages {
        /** The stage of the ActivityLogAlertResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ActivityLogAlertResource update allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: Indicates whether this activity log alert is enabled. If an activity log
             * alert is not enabled, then none of its actions will be activated..
             *
             * @param enabled Indicates whether this activity log alert is enabled. If an activity log alert is not
             *     enabled, then none of its actions will be activated.
             * @return the next definition stage.
             */
            Update withEnabled(Boolean enabled);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ActivityLogAlertResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ActivityLogAlertResource refresh(Context context);
}
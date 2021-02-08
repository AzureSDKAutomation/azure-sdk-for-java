// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.LogSearchRuleResourceInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of LogSearchRuleResource. */
public interface LogSearchRuleResource {
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
     * Gets the kind property: Metadata used by portal/tooling/etc to render different UX experiences for resources of
     * the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the resource provider must
     * validate and persist this value.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the etag property: The etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal etag convention. Entity tags are used for comparing two or more entities from
     * the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24),
     * If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the createdWithApiVersion property: The api-version used when creating this alert rule.
     *
     * @return the createdWithApiVersion value.
     */
    String createdWithApiVersion();

    /**
     * Gets the isLegacyLogAnalyticsRule property: True if alert rule is legacy Log Analytic rule.
     *
     * @return the isLegacyLogAnalyticsRule value.
     */
    Boolean isLegacyLogAnalyticsRule();

    /**
     * Gets the description property: The description of the Log Search rule.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the displayName property: The display name of the alert rule.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the enabled property: The flag which indicates whether the Log Search rule is enabled. Value should be true
     * or false.
     *
     * @return the enabled value.
     */
    Enabled enabled();

    /**
     * Gets the lastUpdatedTime property: Last time the rule was updated in IS08601 format.
     *
     * @return the lastUpdatedTime value.
     */
    OffsetDateTime lastUpdatedTime();

    /**
     * Gets the provisioningState property: Provisioning state of the scheduled query rule.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the source property: Data Source against which rule will Query Data.
     *
     * @return the source value.
     */
    Source source();

    /**
     * Gets the schedule property: Schedule (Frequency, Time Window) for rule. Required for action type -
     * AlertingAction.
     *
     * @return the schedule value.
     */
    Schedule schedule();

    /**
     * Gets the action property: Action needs to be taken on rule execution.
     *
     * @return the action value.
     */
    Action action();

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
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.LogSearchRuleResourceInner object.
     *
     * @return the inner object.
     */
    LogSearchRuleResourceInner innerModel();

    /** The entirety of the LogSearchRuleResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithSource,
            DefinitionStages.WithAction,
            DefinitionStages.WithCreate {
    }
    /** The LogSearchRuleResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the LogSearchRuleResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the LogSearchRuleResource definition allowing to specify location. */
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
        /** The stage of the LogSearchRuleResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithSource withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the LogSearchRuleResource definition allowing to specify source. */
        interface WithSource {
            /**
             * Specifies the source property: Data Source against which rule will Query Data.
             *
             * @param source Data Source against which rule will Query Data.
             * @return the next definition stage.
             */
            WithAction withSource(Source source);
        }
        /** The stage of the LogSearchRuleResource definition allowing to specify action. */
        interface WithAction {
            /**
             * Specifies the action property: Action needs to be taken on rule execution..
             *
             * @param action Action needs to be taken on rule execution.
             * @return the next definition stage.
             */
            WithCreate withAction(Action action);
        }
        /**
         * The stage of the LogSearchRuleResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithDescription,
                DefinitionStages.WithDisplayName,
                DefinitionStages.WithEnabled,
                DefinitionStages.WithSchedule {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            LogSearchRuleResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LogSearchRuleResource create(Context context);
        }
        /** The stage of the LogSearchRuleResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the LogSearchRuleResource definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of the Log Search rule..
             *
             * @param description The description of the Log Search rule.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the LogSearchRuleResource definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The display name of the alert rule.
             *
             * @param displayName The display name of the alert rule.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }
        /** The stage of the LogSearchRuleResource definition allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: The flag which indicates whether the Log Search rule is enabled. Value
             * should be true or false.
             *
             * @param enabled The flag which indicates whether the Log Search rule is enabled. Value should be true or
             *     false.
             * @return the next definition stage.
             */
            WithCreate withEnabled(Enabled enabled);
        }
        /** The stage of the LogSearchRuleResource definition allowing to specify schedule. */
        interface WithSchedule {
            /**
             * Specifies the schedule property: Schedule (Frequency, Time Window) for rule. Required for action type -
             * AlertingAction.
             *
             * @param schedule Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction.
             * @return the next definition stage.
             */
            WithCreate withSchedule(Schedule schedule);
        }
    }
    /**
     * Begins update for the LogSearchRuleResource resource.
     *
     * @return the stage of resource update.
     */
    LogSearchRuleResource.Update update();

    /** The template for LogSearchRuleResource update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithEnabled {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        LogSearchRuleResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        LogSearchRuleResource apply(Context context);
    }
    /** The LogSearchRuleResource update stages. */
    interface UpdateStages {
        /** The stage of the LogSearchRuleResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the LogSearchRuleResource update allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: The flag which indicates whether the Log Search rule is enabled. Value
             * should be true or false.
             *
             * @param enabled The flag which indicates whether the Log Search rule is enabled. Value should be true or
             *     false.
             * @return the next definition stage.
             */
            Update withEnabled(Enabled enabled);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    LogSearchRuleResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LogSearchRuleResource refresh(Context context);
}
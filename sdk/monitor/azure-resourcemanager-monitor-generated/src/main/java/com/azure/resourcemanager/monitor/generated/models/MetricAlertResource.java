// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetricAlertResourceInner;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of MetricAlertResource. */
public interface MetricAlertResource {
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
     * Gets the description property: the description of the metric alert that will be included in the alert email.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the severity property: Alert severity {0, 1, 2, 3, 4}.
     *
     * @return the severity value.
     */
    int severity();

    /**
     * Gets the enabled property: the flag that indicates whether the metric alert is enabled.
     *
     * @return the enabled value.
     */
    boolean enabled();

    /**
     * Gets the scopes property: the list of resource id's that this metric alert is scoped to.
     *
     * @return the scopes value.
     */
    List<String> scopes();

    /**
     * Gets the evaluationFrequency property: how often the metric alert is evaluated represented in ISO 8601 duration
     * format.
     *
     * @return the evaluationFrequency value.
     */
    Duration evaluationFrequency();

    /**
     * Gets the windowSize property: the period of time (in ISO 8601 duration format) that is used to monitor alert
     * activity based on the threshold.
     *
     * @return the windowSize value.
     */
    Duration windowSize();

    /**
     * Gets the targetResourceType property: the resource type of the target resource(s) on which the alert is
     * created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     *
     * @return the targetResourceType value.
     */
    String targetResourceType();

    /**
     * Gets the targetResourceRegion property: the region of the target resource(s) on which the alert is
     * created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     *
     * @return the targetResourceRegion value.
     */
    String targetResourceRegion();

    /**
     * Gets the criteria property: defines the specific alert criteria information.
     *
     * @return the criteria value.
     */
    MetricAlertCriteria criteria();

    /**
     * Gets the autoMitigate property: the flag that indicates whether the alert should be auto resolved or not. The
     * default is true.
     *
     * @return the autoMitigate value.
     */
    Boolean autoMitigate();

    /**
     * Gets the actions property: the array of actions that are performed when the alert rule becomes active, and when
     * an alert condition is resolved.
     *
     * @return the actions value.
     */
    List<MetricAlertAction> actions();

    /**
     * Gets the lastUpdatedTime property: Last time the rule was updated in ISO8601 format.
     *
     * @return the lastUpdatedTime value.
     */
    OffsetDateTime lastUpdatedTime();

    /**
     * Gets the isMigrated property: the value indicating whether this alert rule is migrated.
     *
     * @return the isMigrated value.
     */
    Boolean isMigrated();

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
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.MetricAlertResourceInner object.
     *
     * @return the inner object.
     */
    MetricAlertResourceInner innerModel();

    /** The entirety of the MetricAlertResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithSeverity,
            DefinitionStages.WithEnabled,
            DefinitionStages.WithScopes,
            DefinitionStages.WithEvaluationFrequency,
            DefinitionStages.WithWindowSize,
            DefinitionStages.WithCriteria,
            DefinitionStages.WithCreate {
    }
    /** The MetricAlertResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the MetricAlertResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the MetricAlertResource definition allowing to specify location. */
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
        /** The stage of the MetricAlertResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithSeverity withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the MetricAlertResource definition allowing to specify severity. */
        interface WithSeverity {
            /**
             * Specifies the severity property: Alert severity {0, 1, 2, 3, 4}.
             *
             * @param severity Alert severity {0, 1, 2, 3, 4}.
             * @return the next definition stage.
             */
            WithEnabled withSeverity(int severity);
        }
        /** The stage of the MetricAlertResource definition allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: the flag that indicates whether the metric alert is enabled..
             *
             * @param enabled the flag that indicates whether the metric alert is enabled.
             * @return the next definition stage.
             */
            WithScopes withEnabled(boolean enabled);
        }
        /** The stage of the MetricAlertResource definition allowing to specify scopes. */
        interface WithScopes {
            /**
             * Specifies the scopes property: the list of resource id's that this metric alert is scoped to..
             *
             * @param scopes the list of resource id's that this metric alert is scoped to.
             * @return the next definition stage.
             */
            WithEvaluationFrequency withScopes(List<String> scopes);
        }
        /** The stage of the MetricAlertResource definition allowing to specify evaluationFrequency. */
        interface WithEvaluationFrequency {
            /**
             * Specifies the evaluationFrequency property: how often the metric alert is evaluated represented in ISO
             * 8601 duration format..
             *
             * @param evaluationFrequency how often the metric alert is evaluated represented in ISO 8601 duration
             *     format.
             * @return the next definition stage.
             */
            WithWindowSize withEvaluationFrequency(Duration evaluationFrequency);
        }
        /** The stage of the MetricAlertResource definition allowing to specify windowSize. */
        interface WithWindowSize {
            /**
             * Specifies the windowSize property: the period of time (in ISO 8601 duration format) that is used to
             * monitor alert activity based on the threshold..
             *
             * @param windowSize the period of time (in ISO 8601 duration format) that is used to monitor alert activity
             *     based on the threshold.
             * @return the next definition stage.
             */
            WithCriteria withWindowSize(Duration windowSize);
        }
        /** The stage of the MetricAlertResource definition allowing to specify criteria. */
        interface WithCriteria {
            /**
             * Specifies the criteria property: defines the specific alert criteria information..
             *
             * @param criteria defines the specific alert criteria information.
             * @return the next definition stage.
             */
            WithCreate withCriteria(MetricAlertCriteria criteria);
        }
        /**
         * The stage of the MetricAlertResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithDescription,
                DefinitionStages.WithTargetResourceType,
                DefinitionStages.WithTargetResourceRegion,
                DefinitionStages.WithAutoMitigate,
                DefinitionStages.WithActions {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            MetricAlertResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MetricAlertResource create(Context context);
        }
        /** The stage of the MetricAlertResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the MetricAlertResource definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: the description of the metric alert that will be included in the
             * alert email..
             *
             * @param description the description of the metric alert that will be included in the alert email.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the MetricAlertResource definition allowing to specify targetResourceType. */
        interface WithTargetResourceType {
            /**
             * Specifies the targetResourceType property: the resource type of the target resource(s) on which the alert
             * is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one
             * resource..
             *
             * @param targetResourceType the resource type of the target resource(s) on which the alert is
             *     created/updated. Mandatory if the scope contains a subscription, resource group, or more than one
             *     resource.
             * @return the next definition stage.
             */
            WithCreate withTargetResourceType(String targetResourceType);
        }
        /** The stage of the MetricAlertResource definition allowing to specify targetResourceRegion. */
        interface WithTargetResourceRegion {
            /**
             * Specifies the targetResourceRegion property: the region of the target resource(s) on which the alert is
             * created/updated. Mandatory if the scope contains a subscription, resource group, or more than one
             * resource..
             *
             * @param targetResourceRegion the region of the target resource(s) on which the alert is created/updated.
             *     Mandatory if the scope contains a subscription, resource group, or more than one resource.
             * @return the next definition stage.
             */
            WithCreate withTargetResourceRegion(String targetResourceRegion);
        }
        /** The stage of the MetricAlertResource definition allowing to specify autoMitigate. */
        interface WithAutoMitigate {
            /**
             * Specifies the autoMitigate property: the flag that indicates whether the alert should be auto resolved or
             * not. The default is true..
             *
             * @param autoMitigate the flag that indicates whether the alert should be auto resolved or not. The default
             *     is true.
             * @return the next definition stage.
             */
            WithCreate withAutoMitigate(Boolean autoMitigate);
        }
        /** The stage of the MetricAlertResource definition allowing to specify actions. */
        interface WithActions {
            /**
             * Specifies the actions property: the array of actions that are performed when the alert rule becomes
             * active, and when an alert condition is resolved..
             *
             * @param actions the array of actions that are performed when the alert rule becomes active, and when an
             *     alert condition is resolved.
             * @return the next definition stage.
             */
            WithCreate withActions(List<MetricAlertAction> actions);
        }
    }
    /**
     * Begins update for the MetricAlertResource resource.
     *
     * @return the stage of resource update.
     */
    MetricAlertResource.Update update();

    /** The template for MetricAlertResource update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithDescription,
            UpdateStages.WithSeverity,
            UpdateStages.WithEnabled,
            UpdateStages.WithScopes,
            UpdateStages.WithEvaluationFrequency,
            UpdateStages.WithWindowSize,
            UpdateStages.WithTargetResourceType,
            UpdateStages.WithTargetResourceRegion,
            UpdateStages.WithCriteria,
            UpdateStages.WithAutoMitigate,
            UpdateStages.WithActions {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        MetricAlertResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MetricAlertResource apply(Context context);
    }
    /** The MetricAlertResource update stages. */
    interface UpdateStages {
        /** The stage of the MetricAlertResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the MetricAlertResource update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: the description of the metric alert that will be included in the
             * alert email..
             *
             * @param description the description of the metric alert that will be included in the alert email.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the MetricAlertResource update allowing to specify severity. */
        interface WithSeverity {
            /**
             * Specifies the severity property: Alert severity {0, 1, 2, 3, 4}.
             *
             * @param severity Alert severity {0, 1, 2, 3, 4}.
             * @return the next definition stage.
             */
            Update withSeverity(Integer severity);
        }
        /** The stage of the MetricAlertResource update allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: the flag that indicates whether the metric alert is enabled..
             *
             * @param enabled the flag that indicates whether the metric alert is enabled.
             * @return the next definition stage.
             */
            Update withEnabled(Boolean enabled);
        }
        /** The stage of the MetricAlertResource update allowing to specify scopes. */
        interface WithScopes {
            /**
             * Specifies the scopes property: the list of resource id's that this metric alert is scoped to..
             *
             * @param scopes the list of resource id's that this metric alert is scoped to.
             * @return the next definition stage.
             */
            Update withScopes(List<String> scopes);
        }
        /** The stage of the MetricAlertResource update allowing to specify evaluationFrequency. */
        interface WithEvaluationFrequency {
            /**
             * Specifies the evaluationFrequency property: how often the metric alert is evaluated represented in ISO
             * 8601 duration format..
             *
             * @param evaluationFrequency how often the metric alert is evaluated represented in ISO 8601 duration
             *     format.
             * @return the next definition stage.
             */
            Update withEvaluationFrequency(Duration evaluationFrequency);
        }
        /** The stage of the MetricAlertResource update allowing to specify windowSize. */
        interface WithWindowSize {
            /**
             * Specifies the windowSize property: the period of time (in ISO 8601 duration format) that is used to
             * monitor alert activity based on the threshold..
             *
             * @param windowSize the period of time (in ISO 8601 duration format) that is used to monitor alert activity
             *     based on the threshold.
             * @return the next definition stage.
             */
            Update withWindowSize(Duration windowSize);
        }
        /** The stage of the MetricAlertResource update allowing to specify targetResourceType. */
        interface WithTargetResourceType {
            /**
             * Specifies the targetResourceType property: the resource type of the target resource(s) on which the alert
             * is created/updated. Mandatory for MultipleResourceMultipleMetricCriteria..
             *
             * @param targetResourceType the resource type of the target resource(s) on which the alert is
             *     created/updated. Mandatory for MultipleResourceMultipleMetricCriteria.
             * @return the next definition stage.
             */
            Update withTargetResourceType(String targetResourceType);
        }
        /** The stage of the MetricAlertResource update allowing to specify targetResourceRegion. */
        interface WithTargetResourceRegion {
            /**
             * Specifies the targetResourceRegion property: the region of the target resource(s) on which the alert is
             * created/updated. Mandatory for MultipleResourceMultipleMetricCriteria..
             *
             * @param targetResourceRegion the region of the target resource(s) on which the alert is created/updated.
             *     Mandatory for MultipleResourceMultipleMetricCriteria.
             * @return the next definition stage.
             */
            Update withTargetResourceRegion(String targetResourceRegion);
        }
        /** The stage of the MetricAlertResource update allowing to specify criteria. */
        interface WithCriteria {
            /**
             * Specifies the criteria property: defines the specific alert criteria information..
             *
             * @param criteria defines the specific alert criteria information.
             * @return the next definition stage.
             */
            Update withCriteria(MetricAlertCriteria criteria);
        }
        /** The stage of the MetricAlertResource update allowing to specify autoMitigate. */
        interface WithAutoMitigate {
            /**
             * Specifies the autoMitigate property: the flag that indicates whether the alert should be auto resolved or
             * not. The default is true..
             *
             * @param autoMitigate the flag that indicates whether the alert should be auto resolved or not. The default
             *     is true.
             * @return the next definition stage.
             */
            Update withAutoMitigate(Boolean autoMitigate);
        }
        /** The stage of the MetricAlertResource update allowing to specify actions. */
        interface WithActions {
            /**
             * Specifies the actions property: the array of actions that are performed when the alert rule becomes
             * active, and when an alert condition is resolved..
             *
             * @param actions the array of actions that are performed when the alert rule becomes active, and when an
             *     alert condition is resolved.
             * @return the next definition stage.
             */
            Update withActions(List<MetricAlertAction> actions);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    MetricAlertResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MetricAlertResource refresh(Context context);
}

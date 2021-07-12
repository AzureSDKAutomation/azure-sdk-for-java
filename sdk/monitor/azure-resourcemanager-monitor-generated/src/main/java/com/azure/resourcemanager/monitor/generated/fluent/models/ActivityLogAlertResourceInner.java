// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.models.ActionList;
import com.azure.resourcemanager.monitor.generated.models.AlertRuleAllOfCondition;
import com.azure.resourcemanager.monitor.generated.models.AzureResourceAutoGenerated;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An Activity Log Alert rule resource. */
@JsonFlatten
@Fluent
public class ActivityLogAlertResourceInner extends AzureResourceAutoGenerated {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActivityLogAlertResourceInner.class);

    /*
     * A list of resource IDs that will be used as prefixes. The alert will
     * only apply to Activity Log events with resource IDs that fall under one
     * of these prefixes. This list must include at least one item.
     */
    @JsonProperty(value = "properties.scopes")
    private List<String> scopes;

    /*
     * The condition that will cause this alert to activate.
     */
    @JsonProperty(value = "properties.condition")
    private AlertRuleAllOfCondition condition;

    /*
     * The actions that will activate when the condition is met.
     */
    @JsonProperty(value = "properties.actions")
    private ActionList actions;

    /*
     * Indicates whether this Activity Log Alert rule is enabled. If an
     * Activity Log Alert rule is not enabled, then none of its actions will be
     * activated.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * A description of this Activity Log Alert rule.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get the scopes property: A list of resource IDs that will be used as prefixes. The alert will only apply to
     * Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one
     * item.
     *
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: A list of resource IDs that will be used as prefixes. The alert will only apply to
     * Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one
     * item.
     *
     * @param scopes the scopes value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Get the condition property: The condition that will cause this alert to activate.
     *
     * @return the condition value.
     */
    public AlertRuleAllOfCondition condition() {
        return this.condition;
    }

    /**
     * Set the condition property: The condition that will cause this alert to activate.
     *
     * @param condition the condition value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withCondition(AlertRuleAllOfCondition condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the actions property: The actions that will activate when the condition is met.
     *
     * @return the actions value.
     */
    public ActionList actions() {
        return this.actions;
    }

    /**
     * Set the actions property: The actions that will activate when the condition is met.
     *
     * @param actions the actions value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withActions(ActionList actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert
     * rule is not enabled, then none of its actions will be activated.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert
     * rule is not enabled, then none of its actions will be activated.
     *
     * @param enabled the enabled value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the description property: A description of this Activity Log Alert rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description of this Activity Log Alert rule.
     *
     * @param description the description value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ActivityLogAlertResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ActivityLogAlertResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (condition() != null) {
            condition().validate();
        }
        if (actions() != null) {
            actions().validate();
        }
    }
}

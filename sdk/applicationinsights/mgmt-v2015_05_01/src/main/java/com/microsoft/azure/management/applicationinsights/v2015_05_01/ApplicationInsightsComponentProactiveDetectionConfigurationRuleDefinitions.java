/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Static definitions of the ProactiveDetection configuration rule (same values
 * for all components).
 */
public class ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions {
    /**
     * The rule name.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * The rule name as it is displayed in UI.
     */
    @JsonProperty(value = "DisplayName")
    private String displayName;

    /**
     * The rule description.
     */
    @JsonProperty(value = "Description")
    private String description;

    /**
     * URL which displays additional info about the proactive detection rule.
     */
    @JsonProperty(value = "HelpUrl")
    private String helpUrl;

    /**
     * A flag indicating whether the rule is hidden (from the UI).
     */
    @JsonProperty(value = "IsHidden")
    private Boolean isHidden;

    /**
     * A flag indicating whether the rule is enabled by default.
     */
    @JsonProperty(value = "IsEnabledByDefault")
    private Boolean isEnabledByDefault;

    /**
     * A flag indicating whether the rule is in preview.
     */
    @JsonProperty(value = "IsInPreview")
    private Boolean isInPreview;

    /**
     * A flag indicating whether email notifications are supported for
     * detections for this rule.
     */
    @JsonProperty(value = "SupportsEmailNotifications")
    private Boolean supportsEmailNotifications;

    /**
     * Get the rule name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the rule name.
     *
     * @param name the name value to set
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the rule name as it is displayed in UI.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the rule name as it is displayed in UI.
     *
     * @param displayName the displayName value to set
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the rule description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the rule description.
     *
     * @param description the description value to set
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get uRL which displays additional info about the proactive detection rule.
     *
     * @return the helpUrl value
     */
    public String helpUrl() {
        return this.helpUrl;
    }

    /**
     * Set uRL which displays additional info about the proactive detection rule.
     *
     * @param helpUrl the helpUrl value to set
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions withHelpUrl(String helpUrl) {
        this.helpUrl = helpUrl;
        return this;
    }

    /**
     * Get a flag indicating whether the rule is hidden (from the UI).
     *
     * @return the isHidden value
     */
    public Boolean isHidden() {
        return this.isHidden;
    }

    /**
     * Set a flag indicating whether the rule is hidden (from the UI).
     *
     * @param isHidden the isHidden value to set
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions withIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
        return this;
    }

    /**
     * Get a flag indicating whether the rule is enabled by default.
     *
     * @return the isEnabledByDefault value
     */
    public Boolean isEnabledByDefault() {
        return this.isEnabledByDefault;
    }

    /**
     * Set a flag indicating whether the rule is enabled by default.
     *
     * @param isEnabledByDefault the isEnabledByDefault value to set
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions withIsEnabledByDefault(Boolean isEnabledByDefault) {
        this.isEnabledByDefault = isEnabledByDefault;
        return this;
    }

    /**
     * Get a flag indicating whether the rule is in preview.
     *
     * @return the isInPreview value
     */
    public Boolean isInPreview() {
        return this.isInPreview;
    }

    /**
     * Set a flag indicating whether the rule is in preview.
     *
     * @param isInPreview the isInPreview value to set
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions withIsInPreview(Boolean isInPreview) {
        this.isInPreview = isInPreview;
        return this;
    }

    /**
     * Get a flag indicating whether email notifications are supported for detections for this rule.
     *
     * @return the supportsEmailNotifications value
     */
    public Boolean supportsEmailNotifications() {
        return this.supportsEmailNotifications;
    }

    /**
     * Set a flag indicating whether email notifications are supported for detections for this rule.
     *
     * @param supportsEmailNotifications the supportsEmailNotifications value to set
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions withSupportsEmailNotifications(Boolean supportsEmailNotifications) {
        this.supportsEmailNotifications = supportsEmailNotifications;
        return this;
    }

}

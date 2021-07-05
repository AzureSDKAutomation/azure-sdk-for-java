// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hanaonazure.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hanaonazure.models.HanaProvisioningStatesEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** SAP monitor info on Azure (ARM properties and SAP monitor properties). */
@JsonFlatten
@Fluent
public class SapMonitorInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SapMonitorInner.class);

    /*
     * State of provisioning of the HanaInstance
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private HanaProvisioningStatesEnum provisioningState;

    /*
     * The name of the resource group the SAP Monitor resources get deployed
     * into.
     */
    @JsonProperty(value = "properties.managedResourceGroupName", access = JsonProperty.Access.WRITE_ONLY)
    private String managedResourceGroupName;

    /*
     * The ARM ID of the Log Analytics Workspace that is used for monitoring
     */
    @JsonProperty(value = "properties.logAnalyticsWorkspaceArmId")
    private String logAnalyticsWorkspaceArmId;

    /*
     * The value indicating whether to send analytics to Microsoft
     */
    @JsonProperty(value = "properties.enableCustomerAnalytics")
    private Boolean enableCustomerAnalytics;

    /*
     * The workspace ID of the log analytics workspace to be used for
     * monitoring
     */
    @JsonProperty(value = "properties.logAnalyticsWorkspaceId")
    private String logAnalyticsWorkspaceId;

    /*
     * The shared key of the log analytics workspace that is used for
     * monitoring
     */
    @JsonProperty(value = "properties.logAnalyticsWorkspaceSharedKey")
    private String logAnalyticsWorkspaceSharedKey;

    /*
     * The version of the payload running in the Collector VM
     */
    @JsonProperty(value = "properties.sapMonitorCollectorVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sapMonitorCollectorVersion;

    /*
     * The subnet which the SAP monitor will be deployed in
     */
    @JsonProperty(value = "properties.monitorSubnet")
    private String monitorSubnet;

    /**
     * Get the provisioningState property: State of provisioning of the HanaInstance.
     *
     * @return the provisioningState value.
     */
    public HanaProvisioningStatesEnum provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the managedResourceGroupName property: The name of the resource group the SAP Monitor resources get deployed
     * into.
     *
     * @return the managedResourceGroupName value.
     */
    public String managedResourceGroupName() {
        return this.managedResourceGroupName;
    }

    /**
     * Get the logAnalyticsWorkspaceArmId property: The ARM ID of the Log Analytics Workspace that is used for
     * monitoring.
     *
     * @return the logAnalyticsWorkspaceArmId value.
     */
    public String logAnalyticsWorkspaceArmId() {
        return this.logAnalyticsWorkspaceArmId;
    }

    /**
     * Set the logAnalyticsWorkspaceArmId property: The ARM ID of the Log Analytics Workspace that is used for
     * monitoring.
     *
     * @param logAnalyticsWorkspaceArmId the logAnalyticsWorkspaceArmId value to set.
     * @return the SapMonitorInner object itself.
     */
    public SapMonitorInner withLogAnalyticsWorkspaceArmId(String logAnalyticsWorkspaceArmId) {
        this.logAnalyticsWorkspaceArmId = logAnalyticsWorkspaceArmId;
        return this;
    }

    /**
     * Get the enableCustomerAnalytics property: The value indicating whether to send analytics to Microsoft.
     *
     * @return the enableCustomerAnalytics value.
     */
    public Boolean enableCustomerAnalytics() {
        return this.enableCustomerAnalytics;
    }

    /**
     * Set the enableCustomerAnalytics property: The value indicating whether to send analytics to Microsoft.
     *
     * @param enableCustomerAnalytics the enableCustomerAnalytics value to set.
     * @return the SapMonitorInner object itself.
     */
    public SapMonitorInner withEnableCustomerAnalytics(Boolean enableCustomerAnalytics) {
        this.enableCustomerAnalytics = enableCustomerAnalytics;
        return this;
    }

    /**
     * Get the logAnalyticsWorkspaceId property: The workspace ID of the log analytics workspace to be used for
     * monitoring.
     *
     * @return the logAnalyticsWorkspaceId value.
     */
    public String logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }

    /**
     * Set the logAnalyticsWorkspaceId property: The workspace ID of the log analytics workspace to be used for
     * monitoring.
     *
     * @param logAnalyticsWorkspaceId the logAnalyticsWorkspaceId value to set.
     * @return the SapMonitorInner object itself.
     */
    public SapMonitorInner withLogAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
        this.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
        return this;
    }

    /**
     * Get the logAnalyticsWorkspaceSharedKey property: The shared key of the log analytics workspace that is used for
     * monitoring.
     *
     * @return the logAnalyticsWorkspaceSharedKey value.
     */
    public String logAnalyticsWorkspaceSharedKey() {
        return this.logAnalyticsWorkspaceSharedKey;
    }

    /**
     * Set the logAnalyticsWorkspaceSharedKey property: The shared key of the log analytics workspace that is used for
     * monitoring.
     *
     * @param logAnalyticsWorkspaceSharedKey the logAnalyticsWorkspaceSharedKey value to set.
     * @return the SapMonitorInner object itself.
     */
    public SapMonitorInner withLogAnalyticsWorkspaceSharedKey(String logAnalyticsWorkspaceSharedKey) {
        this.logAnalyticsWorkspaceSharedKey = logAnalyticsWorkspaceSharedKey;
        return this;
    }

    /**
     * Get the sapMonitorCollectorVersion property: The version of the payload running in the Collector VM.
     *
     * @return the sapMonitorCollectorVersion value.
     */
    public String sapMonitorCollectorVersion() {
        return this.sapMonitorCollectorVersion;
    }

    /**
     * Get the monitorSubnet property: The subnet which the SAP monitor will be deployed in.
     *
     * @return the monitorSubnet value.
     */
    public String monitorSubnet() {
        return this.monitorSubnet;
    }

    /**
     * Set the monitorSubnet property: The subnet which the SAP monitor will be deployed in.
     *
     * @param monitorSubnet the monitorSubnet value to set.
     * @return the SapMonitorInner object itself.
     */
    public SapMonitorInner withMonitorSubnet(String monitorSubnet) {
        this.monitorSubnet = monitorSubnet;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapMonitorInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapMonitorInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

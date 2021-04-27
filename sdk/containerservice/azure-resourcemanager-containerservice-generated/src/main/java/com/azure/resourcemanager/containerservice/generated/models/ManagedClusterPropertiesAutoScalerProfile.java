// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters to be applied to the cluster-autoscaler when enabled. */
@Fluent
public final class ManagedClusterPropertiesAutoScalerProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterPropertiesAutoScalerProfile.class);

    /*
     * The balance-similar-node-groups property.
     */
    @JsonProperty(value = "balance-similar-node-groups")
    private String balanceSimilarNodeGroups;

    /*
     * The expander property.
     */
    @JsonProperty(value = "expander")
    private Expander expander;

    /*
     * The max-empty-bulk-delete property.
     */
    @JsonProperty(value = "max-empty-bulk-delete")
    private String maxEmptyBulkDelete;

    /*
     * The max-graceful-termination-sec property.
     */
    @JsonProperty(value = "max-graceful-termination-sec")
    private String maxGracefulTerminationSec;

    /*
     * The max-node-provision-time property.
     */
    @JsonProperty(value = "max-node-provision-time")
    private String maxNodeProvisionTime;

    /*
     * The max-total-unready-percentage property.
     */
    @JsonProperty(value = "max-total-unready-percentage")
    private String maxTotalUnreadyPercentage;

    /*
     * The new-pod-scale-up-delay property.
     */
    @JsonProperty(value = "new-pod-scale-up-delay")
    private String newPodScaleUpDelay;

    /*
     * The ok-total-unready-count property.
     */
    @JsonProperty(value = "ok-total-unready-count")
    private String okTotalUnreadyCount;

    /*
     * The scan-interval property.
     */
    @JsonProperty(value = "scan-interval")
    private String scanInterval;

    /*
     * The scale-down-delay-after-add property.
     */
    @JsonProperty(value = "scale-down-delay-after-add")
    private String scaleDownDelayAfterAdd;

    /*
     * The scale-down-delay-after-delete property.
     */
    @JsonProperty(value = "scale-down-delay-after-delete")
    private String scaleDownDelayAfterDelete;

    /*
     * The scale-down-delay-after-failure property.
     */
    @JsonProperty(value = "scale-down-delay-after-failure")
    private String scaleDownDelayAfterFailure;

    /*
     * The scale-down-unneeded-time property.
     */
    @JsonProperty(value = "scale-down-unneeded-time")
    private String scaleDownUnneededTime;

    /*
     * The scale-down-unready-time property.
     */
    @JsonProperty(value = "scale-down-unready-time")
    private String scaleDownUnreadyTime;

    /*
     * The scale-down-utilization-threshold property.
     */
    @JsonProperty(value = "scale-down-utilization-threshold")
    private String scaleDownUtilizationThreshold;

    /*
     * The skip-nodes-with-local-storage property.
     */
    @JsonProperty(value = "skip-nodes-with-local-storage")
    private String skipNodesWithLocalStorage;

    /*
     * The skip-nodes-with-system-pods property.
     */
    @JsonProperty(value = "skip-nodes-with-system-pods")
    private String skipNodesWithSystemPods;

    /**
     * Get the balanceSimilarNodeGroups property: The balance-similar-node-groups property.
     *
     * @return the balanceSimilarNodeGroups value.
     */
    public String balanceSimilarNodeGroups() {
        return this.balanceSimilarNodeGroups;
    }

    /**
     * Set the balanceSimilarNodeGroups property: The balance-similar-node-groups property.
     *
     * @param balanceSimilarNodeGroups the balanceSimilarNodeGroups value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withBalanceSimilarNodeGroups(String balanceSimilarNodeGroups) {
        this.balanceSimilarNodeGroups = balanceSimilarNodeGroups;
        return this;
    }

    /**
     * Get the expander property: The expander property.
     *
     * @return the expander value.
     */
    public Expander expander() {
        return this.expander;
    }

    /**
     * Set the expander property: The expander property.
     *
     * @param expander the expander value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withExpander(Expander expander) {
        this.expander = expander;
        return this;
    }

    /**
     * Get the maxEmptyBulkDelete property: The max-empty-bulk-delete property.
     *
     * @return the maxEmptyBulkDelete value.
     */
    public String maxEmptyBulkDelete() {
        return this.maxEmptyBulkDelete;
    }

    /**
     * Set the maxEmptyBulkDelete property: The max-empty-bulk-delete property.
     *
     * @param maxEmptyBulkDelete the maxEmptyBulkDelete value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxEmptyBulkDelete(String maxEmptyBulkDelete) {
        this.maxEmptyBulkDelete = maxEmptyBulkDelete;
        return this;
    }

    /**
     * Get the maxGracefulTerminationSec property: The max-graceful-termination-sec property.
     *
     * @return the maxGracefulTerminationSec value.
     */
    public String maxGracefulTerminationSec() {
        return this.maxGracefulTerminationSec;
    }

    /**
     * Set the maxGracefulTerminationSec property: The max-graceful-termination-sec property.
     *
     * @param maxGracefulTerminationSec the maxGracefulTerminationSec value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxGracefulTerminationSec(String maxGracefulTerminationSec) {
        this.maxGracefulTerminationSec = maxGracefulTerminationSec;
        return this;
    }

    /**
     * Get the maxNodeProvisionTime property: The max-node-provision-time property.
     *
     * @return the maxNodeProvisionTime value.
     */
    public String maxNodeProvisionTime() {
        return this.maxNodeProvisionTime;
    }

    /**
     * Set the maxNodeProvisionTime property: The max-node-provision-time property.
     *
     * @param maxNodeProvisionTime the maxNodeProvisionTime value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxNodeProvisionTime(String maxNodeProvisionTime) {
        this.maxNodeProvisionTime = maxNodeProvisionTime;
        return this;
    }

    /**
     * Get the maxTotalUnreadyPercentage property: The max-total-unready-percentage property.
     *
     * @return the maxTotalUnreadyPercentage value.
     */
    public String maxTotalUnreadyPercentage() {
        return this.maxTotalUnreadyPercentage;
    }

    /**
     * Set the maxTotalUnreadyPercentage property: The max-total-unready-percentage property.
     *
     * @param maxTotalUnreadyPercentage the maxTotalUnreadyPercentage value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxTotalUnreadyPercentage(String maxTotalUnreadyPercentage) {
        this.maxTotalUnreadyPercentage = maxTotalUnreadyPercentage;
        return this;
    }

    /**
     * Get the newPodScaleUpDelay property: The new-pod-scale-up-delay property.
     *
     * @return the newPodScaleUpDelay value.
     */
    public String newPodScaleUpDelay() {
        return this.newPodScaleUpDelay;
    }

    /**
     * Set the newPodScaleUpDelay property: The new-pod-scale-up-delay property.
     *
     * @param newPodScaleUpDelay the newPodScaleUpDelay value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withNewPodScaleUpDelay(String newPodScaleUpDelay) {
        this.newPodScaleUpDelay = newPodScaleUpDelay;
        return this;
    }

    /**
     * Get the okTotalUnreadyCount property: The ok-total-unready-count property.
     *
     * @return the okTotalUnreadyCount value.
     */
    public String okTotalUnreadyCount() {
        return this.okTotalUnreadyCount;
    }

    /**
     * Set the okTotalUnreadyCount property: The ok-total-unready-count property.
     *
     * @param okTotalUnreadyCount the okTotalUnreadyCount value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withOkTotalUnreadyCount(String okTotalUnreadyCount) {
        this.okTotalUnreadyCount = okTotalUnreadyCount;
        return this;
    }

    /**
     * Get the scanInterval property: The scan-interval property.
     *
     * @return the scanInterval value.
     */
    public String scanInterval() {
        return this.scanInterval;
    }

    /**
     * Set the scanInterval property: The scan-interval property.
     *
     * @param scanInterval the scanInterval value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScanInterval(String scanInterval) {
        this.scanInterval = scanInterval;
        return this;
    }

    /**
     * Get the scaleDownDelayAfterAdd property: The scale-down-delay-after-add property.
     *
     * @return the scaleDownDelayAfterAdd value.
     */
    public String scaleDownDelayAfterAdd() {
        return this.scaleDownDelayAfterAdd;
    }

    /**
     * Set the scaleDownDelayAfterAdd property: The scale-down-delay-after-add property.
     *
     * @param scaleDownDelayAfterAdd the scaleDownDelayAfterAdd value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownDelayAfterAdd(String scaleDownDelayAfterAdd) {
        this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
        return this;
    }

    /**
     * Get the scaleDownDelayAfterDelete property: The scale-down-delay-after-delete property.
     *
     * @return the scaleDownDelayAfterDelete value.
     */
    public String scaleDownDelayAfterDelete() {
        return this.scaleDownDelayAfterDelete;
    }

    /**
     * Set the scaleDownDelayAfterDelete property: The scale-down-delay-after-delete property.
     *
     * @param scaleDownDelayAfterDelete the scaleDownDelayAfterDelete value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownDelayAfterDelete(String scaleDownDelayAfterDelete) {
        this.scaleDownDelayAfterDelete = scaleDownDelayAfterDelete;
        return this;
    }

    /**
     * Get the scaleDownDelayAfterFailure property: The scale-down-delay-after-failure property.
     *
     * @return the scaleDownDelayAfterFailure value.
     */
    public String scaleDownDelayAfterFailure() {
        return this.scaleDownDelayAfterFailure;
    }

    /**
     * Set the scaleDownDelayAfterFailure property: The scale-down-delay-after-failure property.
     *
     * @param scaleDownDelayAfterFailure the scaleDownDelayAfterFailure value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownDelayAfterFailure(String scaleDownDelayAfterFailure) {
        this.scaleDownDelayAfterFailure = scaleDownDelayAfterFailure;
        return this;
    }

    /**
     * Get the scaleDownUnneededTime property: The scale-down-unneeded-time property.
     *
     * @return the scaleDownUnneededTime value.
     */
    public String scaleDownUnneededTime() {
        return this.scaleDownUnneededTime;
    }

    /**
     * Set the scaleDownUnneededTime property: The scale-down-unneeded-time property.
     *
     * @param scaleDownUnneededTime the scaleDownUnneededTime value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownUnneededTime(String scaleDownUnneededTime) {
        this.scaleDownUnneededTime = scaleDownUnneededTime;
        return this;
    }

    /**
     * Get the scaleDownUnreadyTime property: The scale-down-unready-time property.
     *
     * @return the scaleDownUnreadyTime value.
     */
    public String scaleDownUnreadyTime() {
        return this.scaleDownUnreadyTime;
    }

    /**
     * Set the scaleDownUnreadyTime property: The scale-down-unready-time property.
     *
     * @param scaleDownUnreadyTime the scaleDownUnreadyTime value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownUnreadyTime(String scaleDownUnreadyTime) {
        this.scaleDownUnreadyTime = scaleDownUnreadyTime;
        return this;
    }

    /**
     * Get the scaleDownUtilizationThreshold property: The scale-down-utilization-threshold property.
     *
     * @return the scaleDownUtilizationThreshold value.
     */
    public String scaleDownUtilizationThreshold() {
        return this.scaleDownUtilizationThreshold;
    }

    /**
     * Set the scaleDownUtilizationThreshold property: The scale-down-utilization-threshold property.
     *
     * @param scaleDownUtilizationThreshold the scaleDownUtilizationThreshold value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownUtilizationThreshold(
        String scaleDownUtilizationThreshold) {
        this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
        return this;
    }

    /**
     * Get the skipNodesWithLocalStorage property: The skip-nodes-with-local-storage property.
     *
     * @return the skipNodesWithLocalStorage value.
     */
    public String skipNodesWithLocalStorage() {
        return this.skipNodesWithLocalStorage;
    }

    /**
     * Set the skipNodesWithLocalStorage property: The skip-nodes-with-local-storage property.
     *
     * @param skipNodesWithLocalStorage the skipNodesWithLocalStorage value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withSkipNodesWithLocalStorage(String skipNodesWithLocalStorage) {
        this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
        return this;
    }

    /**
     * Get the skipNodesWithSystemPods property: The skip-nodes-with-system-pods property.
     *
     * @return the skipNodesWithSystemPods value.
     */
    public String skipNodesWithSystemPods() {
        return this.skipNodesWithSystemPods;
    }

    /**
     * Set the skipNodesWithSystemPods property: The skip-nodes-with-system-pods property.
     *
     * @param skipNodesWithSystemPods the skipNodesWithSystemPods value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withSkipNodesWithSystemPods(String skipNodesWithSystemPods) {
        this.skipNodesWithSystemPods = skipNodesWithSystemPods;
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

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
     * Valid values are 'true' and 'false'
     */
    @JsonProperty(value = "balance-similar-node-groups")
    private String balanceSimilarNodeGroups;

    /*
     * If not specified, the default is 'random'. See
     * [expanders](https://github.com/kubernetes/autoscaler/blob/master/cluster-autoscaler/FAQ.md#what-are-expanders)
     * for more information.
     */
    @JsonProperty(value = "expander")
    private Expander expander;

    /*
     * The default is 10.
     */
    @JsonProperty(value = "max-empty-bulk-delete")
    private String maxEmptyBulkDelete;

    /*
     * The default is 600.
     */
    @JsonProperty(value = "max-graceful-termination-sec")
    private String maxGracefulTerminationSec;

    /*
     * The default is '15m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     */
    @JsonProperty(value = "max-node-provision-time")
    private String maxNodeProvisionTime;

    /*
     * The default is 45. The maximum is 100 and the minimum is 0.
     */
    @JsonProperty(value = "max-total-unready-percentage")
    private String maxTotalUnreadyPercentage;

    /*
     * For scenarios like burst/batch scale where you don't want CA to act
     * before the kubernetes scheduler could schedule all the pods, you can
     * tell CA to ignore unscheduled pods before they're a certain age. The
     * default is '0s'. Values must be an integer followed by a unit ('s' for
     * seconds, 'm' for minutes, 'h' for hours, etc).
     */
    @JsonProperty(value = "new-pod-scale-up-delay")
    private String newPodScaleUpDelay;

    /*
     * This must be an integer. The default is 3.
     */
    @JsonProperty(value = "ok-total-unready-count")
    private String okTotalUnreadyCount;

    /*
     * The default is '10'. Values must be an integer number of seconds.
     */
    @JsonProperty(value = "scan-interval")
    private String scanInterval;

    /*
     * The default is '10m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     */
    @JsonProperty(value = "scale-down-delay-after-add")
    private String scaleDownDelayAfterAdd;

    /*
     * The default is the scan-interval. Values must be an integer followed by
     * an 'm'. No unit of time other than minutes (m) is supported.
     */
    @JsonProperty(value = "scale-down-delay-after-delete")
    private String scaleDownDelayAfterDelete;

    /*
     * The default is '3m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     */
    @JsonProperty(value = "scale-down-delay-after-failure")
    private String scaleDownDelayAfterFailure;

    /*
     * The default is '10m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     */
    @JsonProperty(value = "scale-down-unneeded-time")
    private String scaleDownUnneededTime;

    /*
     * The default is '20m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     */
    @JsonProperty(value = "scale-down-unready-time")
    private String scaleDownUnreadyTime;

    /*
     * The default is '0.5'.
     */
    @JsonProperty(value = "scale-down-utilization-threshold")
    private String scaleDownUtilizationThreshold;

    /*
     * The default is true.
     */
    @JsonProperty(value = "skip-nodes-with-local-storage")
    private String skipNodesWithLocalStorage;

    /*
     * The default is true.
     */
    @JsonProperty(value = "skip-nodes-with-system-pods")
    private String skipNodesWithSystemPods;

    /**
     * Get the balanceSimilarNodeGroups property: Valid values are 'true' and 'false'.
     *
     * @return the balanceSimilarNodeGroups value.
     */
    public String balanceSimilarNodeGroups() {
        return this.balanceSimilarNodeGroups;
    }

    /**
     * Set the balanceSimilarNodeGroups property: Valid values are 'true' and 'false'.
     *
     * @param balanceSimilarNodeGroups the balanceSimilarNodeGroups value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withBalanceSimilarNodeGroups(String balanceSimilarNodeGroups) {
        this.balanceSimilarNodeGroups = balanceSimilarNodeGroups;
        return this;
    }

    /**
     * Get the expander property: If not specified, the default is 'random'. See
     * [expanders](https://github.com/kubernetes/autoscaler/blob/master/cluster-autoscaler/FAQ.md#what-are-expanders)
     * for more information.
     *
     * @return the expander value.
     */
    public Expander expander() {
        return this.expander;
    }

    /**
     * Set the expander property: If not specified, the default is 'random'. See
     * [expanders](https://github.com/kubernetes/autoscaler/blob/master/cluster-autoscaler/FAQ.md#what-are-expanders)
     * for more information.
     *
     * @param expander the expander value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withExpander(Expander expander) {
        this.expander = expander;
        return this;
    }

    /**
     * Get the maxEmptyBulkDelete property: The default is 10.
     *
     * @return the maxEmptyBulkDelete value.
     */
    public String maxEmptyBulkDelete() {
        return this.maxEmptyBulkDelete;
    }

    /**
     * Set the maxEmptyBulkDelete property: The default is 10.
     *
     * @param maxEmptyBulkDelete the maxEmptyBulkDelete value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxEmptyBulkDelete(String maxEmptyBulkDelete) {
        this.maxEmptyBulkDelete = maxEmptyBulkDelete;
        return this;
    }

    /**
     * Get the maxGracefulTerminationSec property: The default is 600.
     *
     * @return the maxGracefulTerminationSec value.
     */
    public String maxGracefulTerminationSec() {
        return this.maxGracefulTerminationSec;
    }

    /**
     * Set the maxGracefulTerminationSec property: The default is 600.
     *
     * @param maxGracefulTerminationSec the maxGracefulTerminationSec value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxGracefulTerminationSec(String maxGracefulTerminationSec) {
        this.maxGracefulTerminationSec = maxGracefulTerminationSec;
        return this;
    }

    /**
     * Get the maxNodeProvisionTime property: The default is '15m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     *
     * @return the maxNodeProvisionTime value.
     */
    public String maxNodeProvisionTime() {
        return this.maxNodeProvisionTime;
    }

    /**
     * Set the maxNodeProvisionTime property: The default is '15m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     *
     * @param maxNodeProvisionTime the maxNodeProvisionTime value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxNodeProvisionTime(String maxNodeProvisionTime) {
        this.maxNodeProvisionTime = maxNodeProvisionTime;
        return this;
    }

    /**
     * Get the maxTotalUnreadyPercentage property: The default is 45. The maximum is 100 and the minimum is 0.
     *
     * @return the maxTotalUnreadyPercentage value.
     */
    public String maxTotalUnreadyPercentage() {
        return this.maxTotalUnreadyPercentage;
    }

    /**
     * Set the maxTotalUnreadyPercentage property: The default is 45. The maximum is 100 and the minimum is 0.
     *
     * @param maxTotalUnreadyPercentage the maxTotalUnreadyPercentage value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxTotalUnreadyPercentage(String maxTotalUnreadyPercentage) {
        this.maxTotalUnreadyPercentage = maxTotalUnreadyPercentage;
        return this;
    }

    /**
     * Get the newPodScaleUpDelay property: For scenarios like burst/batch scale where you don't want CA to act before
     * the kubernetes scheduler could schedule all the pods, you can tell CA to ignore unscheduled pods before they're a
     * certain age. The default is '0s'. Values must be an integer followed by a unit ('s' for seconds, 'm' for minutes,
     * 'h' for hours, etc).
     *
     * @return the newPodScaleUpDelay value.
     */
    public String newPodScaleUpDelay() {
        return this.newPodScaleUpDelay;
    }

    /**
     * Set the newPodScaleUpDelay property: For scenarios like burst/batch scale where you don't want CA to act before
     * the kubernetes scheduler could schedule all the pods, you can tell CA to ignore unscheduled pods before they're a
     * certain age. The default is '0s'. Values must be an integer followed by a unit ('s' for seconds, 'm' for minutes,
     * 'h' for hours, etc).
     *
     * @param newPodScaleUpDelay the newPodScaleUpDelay value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withNewPodScaleUpDelay(String newPodScaleUpDelay) {
        this.newPodScaleUpDelay = newPodScaleUpDelay;
        return this;
    }

    /**
     * Get the okTotalUnreadyCount property: This must be an integer. The default is 3.
     *
     * @return the okTotalUnreadyCount value.
     */
    public String okTotalUnreadyCount() {
        return this.okTotalUnreadyCount;
    }

    /**
     * Set the okTotalUnreadyCount property: This must be an integer. The default is 3.
     *
     * @param okTotalUnreadyCount the okTotalUnreadyCount value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withOkTotalUnreadyCount(String okTotalUnreadyCount) {
        this.okTotalUnreadyCount = okTotalUnreadyCount;
        return this;
    }

    /**
     * Get the scanInterval property: The default is '10'. Values must be an integer number of seconds.
     *
     * @return the scanInterval value.
     */
    public String scanInterval() {
        return this.scanInterval;
    }

    /**
     * Set the scanInterval property: The default is '10'. Values must be an integer number of seconds.
     *
     * @param scanInterval the scanInterval value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScanInterval(String scanInterval) {
        this.scanInterval = scanInterval;
        return this;
    }

    /**
     * Get the scaleDownDelayAfterAdd property: The default is '10m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     *
     * @return the scaleDownDelayAfterAdd value.
     */
    public String scaleDownDelayAfterAdd() {
        return this.scaleDownDelayAfterAdd;
    }

    /**
     * Set the scaleDownDelayAfterAdd property: The default is '10m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     *
     * @param scaleDownDelayAfterAdd the scaleDownDelayAfterAdd value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownDelayAfterAdd(String scaleDownDelayAfterAdd) {
        this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
        return this;
    }

    /**
     * Get the scaleDownDelayAfterDelete property: The default is the scan-interval. Values must be an integer followed
     * by an 'm'. No unit of time other than minutes (m) is supported.
     *
     * @return the scaleDownDelayAfterDelete value.
     */
    public String scaleDownDelayAfterDelete() {
        return this.scaleDownDelayAfterDelete;
    }

    /**
     * Set the scaleDownDelayAfterDelete property: The default is the scan-interval. Values must be an integer followed
     * by an 'm'. No unit of time other than minutes (m) is supported.
     *
     * @param scaleDownDelayAfterDelete the scaleDownDelayAfterDelete value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownDelayAfterDelete(String scaleDownDelayAfterDelete) {
        this.scaleDownDelayAfterDelete = scaleDownDelayAfterDelete;
        return this;
    }

    /**
     * Get the scaleDownDelayAfterFailure property: The default is '3m'. Values must be an integer followed by an 'm'.
     * No unit of time other than minutes (m) is supported.
     *
     * @return the scaleDownDelayAfterFailure value.
     */
    public String scaleDownDelayAfterFailure() {
        return this.scaleDownDelayAfterFailure;
    }

    /**
     * Set the scaleDownDelayAfterFailure property: The default is '3m'. Values must be an integer followed by an 'm'.
     * No unit of time other than minutes (m) is supported.
     *
     * @param scaleDownDelayAfterFailure the scaleDownDelayAfterFailure value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownDelayAfterFailure(String scaleDownDelayAfterFailure) {
        this.scaleDownDelayAfterFailure = scaleDownDelayAfterFailure;
        return this;
    }

    /**
     * Get the scaleDownUnneededTime property: The default is '10m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     *
     * @return the scaleDownUnneededTime value.
     */
    public String scaleDownUnneededTime() {
        return this.scaleDownUnneededTime;
    }

    /**
     * Set the scaleDownUnneededTime property: The default is '10m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     *
     * @param scaleDownUnneededTime the scaleDownUnneededTime value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownUnneededTime(String scaleDownUnneededTime) {
        this.scaleDownUnneededTime = scaleDownUnneededTime;
        return this;
    }

    /**
     * Get the scaleDownUnreadyTime property: The default is '20m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     *
     * @return the scaleDownUnreadyTime value.
     */
    public String scaleDownUnreadyTime() {
        return this.scaleDownUnreadyTime;
    }

    /**
     * Set the scaleDownUnreadyTime property: The default is '20m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     *
     * @param scaleDownUnreadyTime the scaleDownUnreadyTime value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownUnreadyTime(String scaleDownUnreadyTime) {
        this.scaleDownUnreadyTime = scaleDownUnreadyTime;
        return this;
    }

    /**
     * Get the scaleDownUtilizationThreshold property: The default is '0.5'.
     *
     * @return the scaleDownUtilizationThreshold value.
     */
    public String scaleDownUtilizationThreshold() {
        return this.scaleDownUtilizationThreshold;
    }

    /**
     * Set the scaleDownUtilizationThreshold property: The default is '0.5'.
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
     * Get the skipNodesWithLocalStorage property: The default is true.
     *
     * @return the skipNodesWithLocalStorage value.
     */
    public String skipNodesWithLocalStorage() {
        return this.skipNodesWithLocalStorage;
    }

    /**
     * Set the skipNodesWithLocalStorage property: The default is true.
     *
     * @param skipNodesWithLocalStorage the skipNodesWithLocalStorage value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withSkipNodesWithLocalStorage(String skipNodesWithLocalStorage) {
        this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
        return this;
    }

    /**
     * Get the skipNodesWithSystemPods property: The default is true.
     *
     * @return the skipNodesWithSystemPods value.
     */
    public String skipNodesWithSystemPods() {
        return this.skipNodesWithSystemPods;
    }

    /**
     * Set the skipNodesWithSystemPods property: The default is true.
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

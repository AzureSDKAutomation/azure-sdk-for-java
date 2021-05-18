// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SkuSetting model. */
@Fluent
public final class SkuSetting {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuSetting.class);

    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The tier property.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * The size property.
     */
    @JsonProperty(value = "size")
    private String size;

    /*
     * The family property.
     */
    @JsonProperty(value = "family")
    private String family;

    /*
     * The kind property.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * The locations property.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /*
     * The locationInfo property.
     */
    @JsonProperty(value = "locationInfo")
    private List<SkuLocationInfo> locationInfo;

    /*
     * The requiredQuotaIds property.
     */
    @JsonProperty(value = "requiredQuotaIds")
    private List<String> requiredQuotaIds;

    /*
     * The requiredFeatures property.
     */
    @JsonProperty(value = "requiredFeatures")
    private List<String> requiredFeatures;

    /*
     * The capacity property.
     */
    @JsonProperty(value = "capacity")
    private SkuSettingCapacity capacity;

    /*
     * The costs property.
     */
    @JsonProperty(value = "costs")
    private List<SkuCost> costs;

    /*
     * The capabilities property.
     */
    @JsonProperty(value = "capabilities")
    private List<SkuCapability> capabilities;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The tier property.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier property.
     *
     * @param tier the tier value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the size property: The size property.
     *
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: The size property.
     *
     * @param size the size value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the family property: The family property.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: The family property.
     *
     * @param family the family value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the kind property: The kind property.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind property.
     *
     * @param kind the kind value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the locations property: The locations property.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: The locations property.
     *
     * @param locations the locations value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the locationInfo property: The locationInfo property.
     *
     * @return the locationInfo value.
     */
    public List<SkuLocationInfo> locationInfo() {
        return this.locationInfo;
    }

    /**
     * Set the locationInfo property: The locationInfo property.
     *
     * @param locationInfo the locationInfo value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withLocationInfo(List<SkuLocationInfo> locationInfo) {
        this.locationInfo = locationInfo;
        return this;
    }

    /**
     * Get the requiredQuotaIds property: The requiredQuotaIds property.
     *
     * @return the requiredQuotaIds value.
     */
    public List<String> requiredQuotaIds() {
        return this.requiredQuotaIds;
    }

    /**
     * Set the requiredQuotaIds property: The requiredQuotaIds property.
     *
     * @param requiredQuotaIds the requiredQuotaIds value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withRequiredQuotaIds(List<String> requiredQuotaIds) {
        this.requiredQuotaIds = requiredQuotaIds;
        return this;
    }

    /**
     * Get the requiredFeatures property: The requiredFeatures property.
     *
     * @return the requiredFeatures value.
     */
    public List<String> requiredFeatures() {
        return this.requiredFeatures;
    }

    /**
     * Set the requiredFeatures property: The requiredFeatures property.
     *
     * @param requiredFeatures the requiredFeatures value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withRequiredFeatures(List<String> requiredFeatures) {
        this.requiredFeatures = requiredFeatures;
        return this;
    }

    /**
     * Get the capacity property: The capacity property.
     *
     * @return the capacity value.
     */
    public SkuSettingCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The capacity property.
     *
     * @param capacity the capacity value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withCapacity(SkuSettingCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the costs property: The costs property.
     *
     * @return the costs value.
     */
    public List<SkuCost> costs() {
        return this.costs;
    }

    /**
     * Set the costs property: The costs property.
     *
     * @param costs the costs value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withCosts(List<SkuCost> costs) {
        this.costs = costs;
        return this;
    }

    /**
     * Get the capabilities property: The capabilities property.
     *
     * @return the capabilities value.
     */
    public List<SkuCapability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: The capabilities property.
     *
     * @param capabilities the capabilities value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withCapabilities(List<SkuCapability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model SkuSetting"));
        }
        if (locationInfo() != null) {
            locationInfo().forEach(e -> e.validate());
        }
        if (capacity() != null) {
            capacity().validate();
        }
        if (costs() != null) {
            costs().forEach(e -> e.validate());
        }
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
    }
}

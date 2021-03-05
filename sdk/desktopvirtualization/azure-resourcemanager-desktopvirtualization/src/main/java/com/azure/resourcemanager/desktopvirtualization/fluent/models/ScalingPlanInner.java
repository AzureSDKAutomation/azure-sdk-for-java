// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolType;
import com.azure.resourcemanager.desktopvirtualization.models.Identity;
import com.azure.resourcemanager.desktopvirtualization.models.Plan;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySet;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingHostPoolReference;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingSchedule;
import com.azure.resourcemanager.desktopvirtualization.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Represents a scaling plan definition. */
@JsonFlatten
@Fluent
public class ScalingPlanInner extends ResourceModelWithAllowedPropertySet {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScalingPlanInner.class);

    /*
     * ObjectId of scaling plan. (internal use)
     */
    @JsonProperty(value = "properties.objectId", access = JsonProperty.Access.WRITE_ONLY)
    private String objectId;

    /*
     * The ring number of scaling plan.
     */
    @JsonProperty(value = "properties.ring")
    private Integer ring;

    /*
     * Description of scaling plan.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * User friendly name of scaling plan.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /*
     * Timezone of the scaling plan.
     */
    @JsonProperty(value = "properties.timeZone")
    private String timeZone;

    /*
     * HostPool type for desktop.
     */
    @JsonProperty(value = "properties.hostPoolType")
    private HostPoolType hostPoolType;

    /*
     * Exclusion tag for scaling plan.
     */
    @JsonProperty(value = "properties.exclusionTag")
    private String exclusionTag;

    /*
     * List of ScalingSchedule definitions.
     */
    @JsonProperty(value = "properties.schedules")
    private List<ScalingSchedule> schedules;

    /*
     * List of ScalingHostPoolReference definitions.
     */
    @JsonProperty(value = "properties.hostPoolReferences")
    private List<ScalingHostPoolReference> hostPoolReferences;

    /**
     * Get the objectId property: ObjectId of scaling plan. (internal use).
     *
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Get the ring property: The ring number of scaling plan.
     *
     * @return the ring value.
     */
    public Integer ring() {
        return this.ring;
    }

    /**
     * Set the ring property: The ring number of scaling plan.
     *
     * @param ring the ring value to set.
     * @return the ScalingPlanInner object itself.
     */
    public ScalingPlanInner withRing(Integer ring) {
        this.ring = ring;
        return this;
    }

    /**
     * Get the description property: Description of scaling plan.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of scaling plan.
     *
     * @param description the description value to set.
     * @return the ScalingPlanInner object itself.
     */
    public ScalingPlanInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the friendlyName property: User friendly name of scaling plan.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: User friendly name of scaling plan.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the ScalingPlanInner object itself.
     */
    public ScalingPlanInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the timeZone property: Timezone of the scaling plan.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: Timezone of the scaling plan.
     *
     * @param timeZone the timeZone value to set.
     * @return the ScalingPlanInner object itself.
     */
    public ScalingPlanInner withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the hostPoolType property: HostPool type for desktop.
     *
     * @return the hostPoolType value.
     */
    public HostPoolType hostPoolType() {
        return this.hostPoolType;
    }

    /**
     * Set the hostPoolType property: HostPool type for desktop.
     *
     * @param hostPoolType the hostPoolType value to set.
     * @return the ScalingPlanInner object itself.
     */
    public ScalingPlanInner withHostPoolType(HostPoolType hostPoolType) {
        this.hostPoolType = hostPoolType;
        return this;
    }

    /**
     * Get the exclusionTag property: Exclusion tag for scaling plan.
     *
     * @return the exclusionTag value.
     */
    public String exclusionTag() {
        return this.exclusionTag;
    }

    /**
     * Set the exclusionTag property: Exclusion tag for scaling plan.
     *
     * @param exclusionTag the exclusionTag value to set.
     * @return the ScalingPlanInner object itself.
     */
    public ScalingPlanInner withExclusionTag(String exclusionTag) {
        this.exclusionTag = exclusionTag;
        return this;
    }

    /**
     * Get the schedules property: List of ScalingSchedule definitions.
     *
     * @return the schedules value.
     */
    public List<ScalingSchedule> schedules() {
        return this.schedules;
    }

    /**
     * Set the schedules property: List of ScalingSchedule definitions.
     *
     * @param schedules the schedules value to set.
     * @return the ScalingPlanInner object itself.
     */
    public ScalingPlanInner withSchedules(List<ScalingSchedule> schedules) {
        this.schedules = schedules;
        return this;
    }

    /**
     * Get the hostPoolReferences property: List of ScalingHostPoolReference definitions.
     *
     * @return the hostPoolReferences value.
     */
    public List<ScalingHostPoolReference> hostPoolReferences() {
        return this.hostPoolReferences;
    }

    /**
     * Set the hostPoolReferences property: List of ScalingHostPoolReference definitions.
     *
     * @param hostPoolReferences the hostPoolReferences value to set.
     * @return the ScalingPlanInner object itself.
     */
    public ScalingPlanInner withHostPoolReferences(List<ScalingHostPoolReference> hostPoolReferences) {
        this.hostPoolReferences = hostPoolReferences;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScalingPlanInner withManagedBy(String managedBy) {
        super.withManagedBy(managedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScalingPlanInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScalingPlanInner withIdentity(Identity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScalingPlanInner withSku(Sku sku) {
        super.withSku(sku);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScalingPlanInner withPlan(Plan plan) {
        super.withPlan(plan);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScalingPlanInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScalingPlanInner withTags(Map<String, String> tags) {
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
        if (schedules() != null) {
            schedules().forEach(e -> e.validate());
        }
        if (hostPoolReferences() != null) {
            hostPoolReferences().forEach(e -> e.validate());
        }
    }
}

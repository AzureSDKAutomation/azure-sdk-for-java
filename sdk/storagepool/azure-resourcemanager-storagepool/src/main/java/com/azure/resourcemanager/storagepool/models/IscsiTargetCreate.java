// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Payload for iSCSI Target create or update requests. */
@JsonFlatten
@Fluent
public class IscsiTargetCreate extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IscsiTargetCreate.class);

    /*
     * List of iSCSI target portal groups.
     */
    @JsonProperty(value = "properties.tpgs", required = true)
    private List<TargetPortalGroupCreate> tpgs;

    /*
     * iSCSI target IQN (iSCSI Qualified Name); example:
     * "iqn.2005-03.org.iscsi:server".
     */
    @JsonProperty(value = "properties.targetIqn", required = true)
    private String targetIqn;

    /**
     * Get the tpgs property: List of iSCSI target portal groups.
     *
     * @return the tpgs value.
     */
    public List<TargetPortalGroupCreate> tpgs() {
        return this.tpgs;
    }

    /**
     * Set the tpgs property: List of iSCSI target portal groups.
     *
     * @param tpgs the tpgs value to set.
     * @return the IscsiTargetCreate object itself.
     */
    public IscsiTargetCreate withTpgs(List<TargetPortalGroupCreate> tpgs) {
        this.tpgs = tpgs;
        return this;
    }

    /**
     * Get the targetIqn property: iSCSI target IQN (iSCSI Qualified Name); example: "iqn.2005-03.org.iscsi:server".
     *
     * @return the targetIqn value.
     */
    public String targetIqn() {
        return this.targetIqn;
    }

    /**
     * Set the targetIqn property: iSCSI target IQN (iSCSI Qualified Name); example: "iqn.2005-03.org.iscsi:server".
     *
     * @param targetIqn the targetIqn value to set.
     * @return the IscsiTargetCreate object itself.
     */
    public IscsiTargetCreate withTargetIqn(String targetIqn) {
        this.targetIqn = targetIqn;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tpgs() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property tpgs in model IscsiTargetCreate"));
        } else {
            tpgs().forEach(e -> e.validate());
        }
        if (targetIqn() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property targetIqn in model IscsiTargetCreate"));
        }
    }
}

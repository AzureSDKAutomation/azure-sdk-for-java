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

/** Payload for iSCSI Target update requests. */
@JsonFlatten
@Fluent
public class IscsiTargetUpdate extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IscsiTargetUpdate.class);

    /*
     * Access Control List (ACL) for an iSCSI Target; defines LUN masking
     * policy
     */
    @JsonProperty(value = "properties.staticAcls")
    private List<Acl> staticAcls;

    /*
     * List of LUNs to be exposed through iSCSI Target.
     */
    @JsonProperty(value = "properties.luns")
    private List<IscsiLun> luns;

    /**
     * Get the staticAcls property: Access Control List (ACL) for an iSCSI Target; defines LUN masking policy.
     *
     * @return the staticAcls value.
     */
    public List<Acl> staticAcls() {
        return this.staticAcls;
    }

    /**
     * Set the staticAcls property: Access Control List (ACL) for an iSCSI Target; defines LUN masking policy.
     *
     * @param staticAcls the staticAcls value to set.
     * @return the IscsiTargetUpdate object itself.
     */
    public IscsiTargetUpdate withStaticAcls(List<Acl> staticAcls) {
        this.staticAcls = staticAcls;
        return this;
    }

    /**
     * Get the luns property: List of LUNs to be exposed through iSCSI Target.
     *
     * @return the luns value.
     */
    public List<IscsiLun> luns() {
        return this.luns;
    }

    /**
     * Set the luns property: List of LUNs to be exposed through iSCSI Target.
     *
     * @param luns the luns value to set.
     * @return the IscsiTargetUpdate object itself.
     */
    public IscsiTargetUpdate withLuns(List<IscsiLun> luns) {
        this.luns = luns;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (staticAcls() != null) {
            staticAcls().forEach(e -> e.validate());
        }
        if (luns() != null) {
            luns().forEach(e -> e.validate());
        }
    }
}

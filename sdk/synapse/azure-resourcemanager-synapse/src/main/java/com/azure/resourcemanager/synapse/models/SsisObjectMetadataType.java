// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SsisObjectMetadataType. */
public final class SsisObjectMetadataType extends ExpandableStringEnum<SsisObjectMetadataType> {
    /** Static value Folder for SsisObjectMetadataType. */
    public static final SsisObjectMetadataType FOLDER = fromString("Folder");

    /** Static value Project for SsisObjectMetadataType. */
    public static final SsisObjectMetadataType PROJECT = fromString("Project");

    /** Static value Package for SsisObjectMetadataType. */
    public static final SsisObjectMetadataType PACKAGE = fromString("Package");

    /** Static value Environment for SsisObjectMetadataType. */
    public static final SsisObjectMetadataType ENVIRONMENT = fromString("Environment");

    /**
     * Creates or finds a SsisObjectMetadataType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SsisObjectMetadataType.
     */
    @JsonCreator
    public static SsisObjectMetadataType fromString(String name) {
        return fromString(name, SsisObjectMetadataType.class);
    }

    /** @return known SsisObjectMetadataType values. */
    public static Collection<SsisObjectMetadataType> values() {
        return values(SsisObjectMetadataType.class);
    }
}

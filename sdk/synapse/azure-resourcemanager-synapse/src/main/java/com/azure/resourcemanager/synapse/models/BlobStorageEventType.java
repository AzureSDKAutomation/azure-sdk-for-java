// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BlobStorageEventType. */
public final class BlobStorageEventType extends ExpandableStringEnum<BlobStorageEventType> {
    /** Static value Microsoft.Storage.BlobCreated for BlobStorageEventType. */
    public static final BlobStorageEventType MICROSOFT_STORAGE_BLOB_CREATED =
        fromString("Microsoft.Storage.BlobCreated");

    /** Static value Microsoft.Storage.BlobRenamed for BlobStorageEventType. */
    public static final BlobStorageEventType MICROSOFT_STORAGE_BLOB_RENAMED =
        fromString("Microsoft.Storage.BlobRenamed");

    /**
     * Creates or finds a BlobStorageEventType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlobStorageEventType.
     */
    @JsonCreator
    public static BlobStorageEventType fromString(String name) {
        return fromString(name, BlobStorageEventType.class);
    }

    /** @return known BlobStorageEventType values. */
    public static Collection<BlobStorageEventType> values() {
        return values(BlobStorageEventType.class);
    }
}

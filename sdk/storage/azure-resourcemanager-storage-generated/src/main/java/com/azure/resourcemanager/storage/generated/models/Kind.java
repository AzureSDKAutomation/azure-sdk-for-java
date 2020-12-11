// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Kind. */
public final class Kind extends ExpandableStringEnum<Kind> {
    /** Static value Storage for Kind. */
    public static final Kind STORAGE = fromString("Storage");

    /** Static value StorageV2 for Kind. */
    public static final Kind STORAGE_V2 = fromString("StorageV2");

    /** Static value BlobStorage for Kind. */
    public static final Kind BLOB_STORAGE = fromString("BlobStorage");

    /** Static value FileStorage for Kind. */
    public static final Kind FILE_STORAGE = fromString("FileStorage");

    /** Static value BlockBlobStorage for Kind. */
    public static final Kind BLOCK_BLOB_STORAGE = fromString("BlockBlobStorage");

    /**
     * Creates or finds a Kind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Kind.
     */
    @JsonCreator
    public static Kind fromString(String name) {
        return fromString(name, Kind.class);
    }

    /** @return known Kind values. */
    public static Collection<Kind> values() {
        return values(Kind.class);
    }
}

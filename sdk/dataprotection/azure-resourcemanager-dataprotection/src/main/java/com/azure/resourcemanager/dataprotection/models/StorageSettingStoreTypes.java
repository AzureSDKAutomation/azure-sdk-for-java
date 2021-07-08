// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StorageSettingStoreTypes. */
public final class StorageSettingStoreTypes extends ExpandableStringEnum<StorageSettingStoreTypes> {
    /** Static value ArchiveStore for StorageSettingStoreTypes. */
    public static final StorageSettingStoreTypes ARCHIVE_STORE = fromString("ArchiveStore");

    /** Static value SnapshotStore for StorageSettingStoreTypes. */
    public static final StorageSettingStoreTypes SNAPSHOT_STORE = fromString("SnapshotStore");

    /** Static value VaultStore for StorageSettingStoreTypes. */
    public static final StorageSettingStoreTypes VAULT_STORE = fromString("VaultStore");

    /**
     * Creates or finds a StorageSettingStoreTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageSettingStoreTypes.
     */
    @JsonCreator
    public static StorageSettingStoreTypes fromString(String name) {
        return fromString(name, StorageSettingStoreTypes.class);
    }

    /** @return known StorageSettingStoreTypes values. */
    public static Collection<StorageSettingStoreTypes> values() {
        return values(StorageSettingStoreTypes.class);
    }
}

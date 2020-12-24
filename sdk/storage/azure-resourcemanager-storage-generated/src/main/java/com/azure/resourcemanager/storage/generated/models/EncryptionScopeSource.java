// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EncryptionScopeSource. */
public final class EncryptionScopeSource extends ExpandableStringEnum<EncryptionScopeSource> {
    /** Static value Microsoft.Storage for EncryptionScopeSource. */
    public static final EncryptionScopeSource MICROSOFT_STORAGE = fromString("Microsoft.Storage");

    /** Static value Microsoft.KeyVault for EncryptionScopeSource. */
    public static final EncryptionScopeSource MICROSOFT_KEY_VAULT = fromString("Microsoft.KeyVault");

    /**
     * Creates or finds a EncryptionScopeSource from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EncryptionScopeSource.
     */
    @JsonCreator
    public static EncryptionScopeSource fromString(String name) {
        return fromString(name, EncryptionScopeSource.class);
    }

    /** @return known EncryptionScopeSource values. */
    public static Collection<EncryptionScopeSource> values() {
        return values(EncryptionScopeSource.class);
    }
}

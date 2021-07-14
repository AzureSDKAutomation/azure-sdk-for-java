// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub;

import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /**
     * Sample code: Operations_List.
     *
     * @param webPubSubManager Entry point to WebPubSubManager. REST API for Azure WebPubSub Service.
     */
    public static void operationsList(com.azure.resourcemanager.webpubsub.WebPubSubManager webPubSubManager) {
        webPubSubManager.operations().list(Context.NONE);
    }
}

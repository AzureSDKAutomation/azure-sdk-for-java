/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.Webhooks;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.EventInfo;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.CallbackConfig;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.Event;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.Webhook;

class WebhooksImpl extends WrapperImpl<WebhooksInner> implements Webhooks {
    private final ContainerRegistryManager manager;

    WebhooksImpl(ContainerRegistryManager manager) {
        super(manager.inner().webhooks());
        this.manager = manager;
    }

    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public WebhookImpl define(String name) {
        return wrapModel(name);
    }

    private WebhookImpl wrapModel(WebhookInner inner) {
        return  new WebhookImpl(inner, manager());
    }

    private WebhookImpl wrapModel(String name) {
        return new WebhookImpl(name, this.manager());
    }

    @Override
    public Observable<EventInfo> pingAsync(String resourceGroupName, String registryName, String webhookName) {
        WebhooksInner client = this.inner();
        return client.pingAsync(resourceGroupName, registryName, webhookName)
        .map(new Func1<EventInfoInner, EventInfo>() {
            @Override
            public EventInfo call(EventInfoInner inner) {
                return new EventInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CallbackConfig> getCallbackConfigAsync(String resourceGroupName, String registryName, String webhookName) {
        WebhooksInner client = this.inner();
        return client.getCallbackConfigAsync(resourceGroupName, registryName, webhookName)
        .map(new Func1<CallbackConfigInner, CallbackConfig>() {
            @Override
            public CallbackConfig call(CallbackConfigInner inner) {
                return new CallbackConfigImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Event> listEventsAsync(final String resourceGroupName, final String registryName, final String webhookName) {
        WebhooksInner client = this.inner();
        return client.listEventsAsync(resourceGroupName, registryName, webhookName)
        .flatMapIterable(new Func1<Page<EventInner>, Iterable<EventInner>>() {
            @Override
            public Iterable<EventInner> call(Page<EventInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventInner, Event>() {
            @Override
            public Event call(EventInner inner) {
                return new EventImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Webhook> listAsync(final String resourceGroupName, final String registryName) {
        WebhooksInner client = this.inner();
        return client.listAsync(resourceGroupName, registryName)
        .flatMapIterable(new Func1<Page<WebhookInner>, Iterable<WebhookInner>>() {
            @Override
            public Iterable<WebhookInner> call(Page<WebhookInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WebhookInner, Webhook>() {
            @Override
            public Webhook call(WebhookInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Webhook> getAsync(String resourceGroupName, String registryName, String webhookName) {
        WebhooksInner client = this.inner();
        return client.getAsync(resourceGroupName, registryName, webhookName)
        .flatMap(new Func1<WebhookInner, Observable<Webhook>>() {
            @Override
            public Observable<Webhook> call(WebhookInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Webhook)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String registryName, String webhookName) {
        WebhooksInner client = this.inner();
        return client.deleteAsync(resourceGroupName, registryName, webhookName).toCompletable();
    }

}

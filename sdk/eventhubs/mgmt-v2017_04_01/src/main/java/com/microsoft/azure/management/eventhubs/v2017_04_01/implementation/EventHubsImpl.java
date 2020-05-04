/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.eventhubs.v2017_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventhubs.v2017_04_01.EventHubs;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.eventhubs.v2017_04_01.Eventhub;
import com.microsoft.azure.management.eventhubs.v2017_04_01.EventhubNamespaceAuthorizationRule;
import com.microsoft.azure.management.eventhubs.v2017_04_01.AccessKeys;
import com.microsoft.azure.management.eventhubs.v2017_04_01.RegenerateAccessKeyParameters;

class EventHubsImpl extends WrapperImpl<EventHubsInner> implements EventHubs {
    private final EventHubsManager manager;

    EventHubsImpl(EventHubsManager manager) {
        super(manager.inner().eventHubs());
        this.manager = manager;
    }

    public EventHubsManager manager() {
        return this.manager;
    }

    @Override
    public EventhubImpl define(String name) {
        return wrapModel(name);
    }

    private EventhubImpl wrapModel(EventhubInner inner) {
        return  new EventhubImpl(inner, manager());
    }

    private EventhubImpl wrapModel(String name) {
        return new EventhubImpl(name, this.manager());
    }

    @Override
    public Observable<Eventhub> listByNamespaceAsync(final String resourceGroupName, final String namespaceName) {
        EventHubsInner client = this.inner();
        return client.listByNamespaceAsync(resourceGroupName, namespaceName)
        .flatMapIterable(new Func1<Page<EventhubInner>, Iterable<EventhubInner>>() {
            @Override
            public Iterable<EventhubInner> call(Page<EventhubInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventhubInner, Eventhub>() {
            @Override
            public Eventhub call(EventhubInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Eventhub> getAsync(String resourceGroupName, String namespaceName, String eventHubName) {
        EventHubsInner client = this.inner();
        return client.getAsync(resourceGroupName, namespaceName, eventHubName)
        .flatMap(new Func1<EventhubInner, Observable<Eventhub>>() {
            @Override
            public Observable<Eventhub> call(EventhubInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Eventhub)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String namespaceName, String eventHubName) {
        EventHubsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, namespaceName, eventHubName).toCompletable();
    }

    @Override
    public EventhubNamespaceAuthorizationRuleImpl defineAuthorizationRule(String name) {
        return wrapAuthorizationRuleModel(name);
    }

    private EventhubNamespaceAuthorizationRuleImpl wrapAuthorizationRuleModel(String name) {
        return new EventhubNamespaceAuthorizationRuleImpl(name, this.manager());
    }

    private EventhubNamespaceAuthorizationRuleImpl wrapEventhubNamespaceAuthorizationRuleModel(AuthorizationRuleInner inner) {
        return  new EventhubNamespaceAuthorizationRuleImpl(inner, manager());
    }

    private Observable<AuthorizationRuleInner> getAuthorizationRuleInnerUsingEventHubsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String namespaceName = IdParsingUtils.getValueFromIdByName(id, "namespaces");
        String eventHubName = IdParsingUtils.getValueFromIdByName(id, "eventhubs");
        String authorizationRuleName = IdParsingUtils.getValueFromIdByName(id, "authorizationRules");
        EventHubsInner client = this.inner();
        return client.getAuthorizationRuleAsync(resourceGroupName, namespaceName, eventHubName, authorizationRuleName);
    }

    @Override
    public Observable<EventhubNamespaceAuthorizationRule> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName) {
        EventHubsInner client = this.inner();
        return client.getAuthorizationRuleAsync(resourceGroupName, namespaceName, eventHubName, authorizationRuleName)
        .flatMap(new Func1<AuthorizationRuleInner, Observable<EventhubNamespaceAuthorizationRule>>() {
            @Override
            public Observable<EventhubNamespaceAuthorizationRule> call(AuthorizationRuleInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((EventhubNamespaceAuthorizationRule)wrapEventhubNamespaceAuthorizationRuleModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<EventhubNamespaceAuthorizationRule> listAuthorizationRulesAsync(final String resourceGroupName, final String namespaceName, final String eventHubName) {
        EventHubsInner client = this.inner();
        return client.listAuthorizationRulesAsync(resourceGroupName, namespaceName, eventHubName)
        .flatMapIterable(new Func1<Page<AuthorizationRuleInner>, Iterable<AuthorizationRuleInner>>() {
            @Override
            public Iterable<AuthorizationRuleInner> call(Page<AuthorizationRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AuthorizationRuleInner, EventhubNamespaceAuthorizationRule>() {
            @Override
            public EventhubNamespaceAuthorizationRule call(AuthorizationRuleInner inner) {
                return wrapEventhubNamespaceAuthorizationRuleModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName) {
        EventHubsInner client = this.inner();
        return client.deleteAuthorizationRuleAsync(resourceGroupName, namespaceName, eventHubName, authorizationRuleName).toCompletable();
    }

    @Override
    public Observable<AccessKeys> listKeysAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName) {
        EventHubsInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, namespaceName, eventHubName, authorizationRuleName)
        .map(new Func1<AccessKeysInner, AccessKeys>() {
            @Override
            public AccessKeys call(AccessKeysInner inner) {
                return new AccessKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AccessKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, RegenerateAccessKeyParameters parameters) {
        EventHubsInner client = this.inner();
        return client.regenerateKeysAsync(resourceGroupName, namespaceName, eventHubName, authorizationRuleName, parameters)
        .map(new Func1<AccessKeysInner, AccessKeys>() {
            @Override
            public AccessKeys call(AccessKeysInner inner) {
                return new AccessKeysImpl(inner, manager());
            }
        });
    }

}

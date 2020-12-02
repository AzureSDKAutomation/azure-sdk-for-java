/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2015_05_01_preview.FirewallRules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v2015_05_01_preview.FirewallRule;

class FirewallRulesImpl extends WrapperImpl<FirewallRulesInner> implements FirewallRules {
    private final SqlManager manager;

    FirewallRulesImpl(SqlManager manager) {
        super(manager.inner().firewallRules());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public FirewallRuleImpl define(String name) {
        return wrapModel(name);
    }

    private FirewallRuleImpl wrapModel(FirewallRuleInner inner) {
        return  new FirewallRuleImpl(inner, manager());
    }

    private FirewallRuleImpl wrapModel(String name) {
        return new FirewallRuleImpl(name, this.manager());
    }

    @Override
    public Observable<FirewallRule> replaceAsync(String resourceGroupName, String serverName) {
        FirewallRulesInner client = this.inner();
        return client.replaceAsync(resourceGroupName, serverName)
        .map(new Func1<FirewallRuleInner, FirewallRule>() {
            @Override
            public FirewallRule call(FirewallRuleInner inner) {
                return new FirewallRuleImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<FirewallRule> listByServerAsync(final String resourceGroupName, final String serverName) {
        FirewallRulesInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMapIterable(new Func1<Page<FirewallRuleInner>, Iterable<FirewallRuleInner>>() {
            @Override
            public Iterable<FirewallRuleInner> call(Page<FirewallRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FirewallRuleInner, FirewallRule>() {
            @Override
            public FirewallRule call(FirewallRuleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<FirewallRule> getAsync(String resourceGroupName, String serverName, String firewallRuleName) {
        FirewallRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, firewallRuleName)
        .flatMap(new Func1<FirewallRuleInner, Observable<FirewallRule>>() {
            @Override
            public Observable<FirewallRule> call(FirewallRuleInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((FirewallRule)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String firewallRuleName) {
        FirewallRulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, firewallRuleName).toCompletable();
    }

}

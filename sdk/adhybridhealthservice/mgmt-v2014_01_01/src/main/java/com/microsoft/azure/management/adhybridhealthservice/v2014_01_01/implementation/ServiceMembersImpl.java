/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServiceMembers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServiceServiceMember;
import com.microsoft.azure.Page;
import rx.Completable;
import java.util.List;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.GlobalConfiguration;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServiceConfiguration;
import java.util.UUID;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.AddsserviceServiceMember;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServicememberServiceAlert;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.Connector;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServiceCredential;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServicememberServiceItem;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServicememberServiceExportStatus;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServicememberServiceMetricSets;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ConnectorMetadata;

class ServiceMembersImpl extends WrapperImpl<ServiceMembersInner> implements ServiceMembers {
    private final ADHybridHealthServiceManager manager;

    ServiceMembersImpl(ADHybridHealthServiceManager manager) {
        super(manager.inner().serviceMembers());
        this.manager = manager;
    }

    public ADHybridHealthServiceManager manager() {
        return this.manager;
    }

    private ServiceServiceMemberImpl wrapServiceServiceMemberModel(ServiceMemberInner inner) {
        return  new ServiceServiceMemberImpl(inner, manager());
    }

    private ServicememberServiceAlertImpl wrapServicememberServiceAlertModel(AlertInner inner) {
        return  new ServicememberServiceAlertImpl(inner, manager());
    }

    private ConnectorImpl wrapConnectorModel(ConnectorInner inner) {
        return  new ConnectorImpl(inner, manager());
    }

    private ServiceCredentialImpl wrapServiceCredentialModel(CredentialInner inner) {
        return  new ServiceCredentialImpl(inner, manager());
    }

    private ServicememberServiceItemImpl wrapServicememberServiceItemModel(ItemInner inner) {
        return  new ServicememberServiceItemImpl(inner, manager());
    }

    private ServicememberServiceExportStatusImpl wrapServicememberServiceExportStatusModel(ExportStatusInner inner) {
        return  new ServicememberServiceExportStatusImpl(inner, manager());
    }

    private ServicememberServiceMetricSetsImpl wrapServicememberServiceMetricSetsModel(MetricSetsInner inner) {
        return  new ServicememberServiceMetricSetsImpl(inner, manager());
    }

    private ConnectorMetadataImpl wrapConnectorMetadataModel(ConnectorMetadataInner inner) {
        return  new ConnectorMetadataImpl(inner, manager());
    }

    private Observable<ServiceMemberInner> getServiceMemberInnerUsingServiceMembersInnerAsync(String id) {
        String serviceName = IdParsingUtils.getValueFromIdByName(id, "services");
        String serviceMemberId = UUID.fromString(IdParsingUtils.getValueFromIdByName(id, "servicemembers"));
        ServiceMembersInner client = this.inner();
        return client.getAsync(serviceName, serviceMemberId);
    }

    private Observable<MetricSetsInner> getMetricSetsInnerUsingServiceMembersInnerAsync(String id) {
        String serviceName = IdParsingUtils.getValueFromIdByName(id, "services");
        String serviceMemberId = UUID.fromString(IdParsingUtils.getValueFromIdByName(id, "servicemembers"));
        String metricName = IdParsingUtils.getValueFromIdByName(id, "metrics");
        String groupName = IdParsingUtils.getValueFromIdByName(id, "groups");
        ServiceMembersInner client = this.inner();
        return client.getMetricsAsync(serviceName, metricName, groupName, serviceMemberId);
    }

    private Observable<ConnectorMetadataInner> getConnectorMetadataInnerUsingServiceMembersInnerAsync(String id) {
        String serviceName = IdParsingUtils.getValueFromIdByName(id, "services");
        String serviceMemberId = UUID.fromString(IdParsingUtils.getValueFromIdByName(id, "servicemembers"));
        String metricName = IdParsingUtils.getValueFromIdByName(id, "metrics");
        ServiceMembersInner client = this.inner();
        return client.getConnectorMetadataAsync(serviceName, serviceMemberId, metricName);
    }

    @Override
    public Observable<ServiceServiceMember> getAsync(String serviceName, UUID serviceMemberId) {
        ServiceMembersInner client = this.inner();
        return client.getAsync(serviceName, serviceMemberId)
        .flatMap(new Func1<ServiceMemberInner, Observable<ServiceServiceMember>>() {
            @Override
            public Observable<ServiceServiceMember> call(ServiceMemberInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ServiceServiceMember)wrapServiceServiceMemberModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<ServiceServiceMember> listAsync(final String serviceName) {
        ServiceMembersInner client = this.inner();
        return client.listAsync(serviceName)
        .flatMapIterable(new Func1<Page<ServiceMemberInner>, Iterable<ServiceMemberInner>>() {
            @Override
            public Iterable<ServiceMemberInner> call(Page<ServiceMemberInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServiceMemberInner, ServiceServiceMember>() {
            @Override
            public ServiceServiceMember call(ServiceMemberInner inner) {
                return wrapServiceServiceMemberModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String serviceName, UUID serviceMemberId) {
        ServiceMembersInner client = this.inner();
        return client.deleteAsync(serviceName, serviceMemberId).toCompletable();
    }

    @Override
    public Completable deleteDataAsync(String serviceName, UUID serviceMemberId) {
        ServiceMembersInner client = this.inner();
        return client.deleteDataAsync(serviceName, serviceMemberId).toCompletable();
    }

    @Override
    public Observable<GlobalConfiguration> listGlobalConfigurationAsync(String serviceName, String serviceMemberId) {
        ServiceMembersInner client = this.inner();
        return client.listGlobalConfigurationAsync(serviceName, serviceMemberId)
        .flatMap(new Func1<List<GlobalConfigurationInner>, Observable<GlobalConfigurationInner>>() {
            @Override
            public Observable<GlobalConfigurationInner> call(List<GlobalConfigurationInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<GlobalConfigurationInner, GlobalConfiguration>() {
            @Override
            public GlobalConfiguration call(GlobalConfigurationInner inner) {
                return new GlobalConfigurationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServiceConfiguration> getServiceConfigurationAsync(String serviceName, String serviceMemberId) {
        ServiceMembersInner client = this.inner();
        return client.getServiceConfigurationAsync(serviceName, serviceMemberId)
        .map(new Func1<ServiceConfigurationInner, ServiceConfiguration>() {
            @Override
            public ServiceConfiguration call(ServiceConfigurationInner inner) {
                return new ServiceConfigurationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AddsserviceServiceMember> addAsync(String serviceName, ServiceMemberInner serviceMember) {
        ServiceMembersInner client = this.inner();
        return client.addAsync(serviceName, serviceMember)
        .map(new Func1<ServiceMemberInner, AddsserviceServiceMember>() {
            @Override
            public AddsserviceServiceMember call(ServiceMemberInner inner) {
                return new AddsserviceServiceMemberImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServicememberServiceAlert> listAlertsAsync(final UUID serviceMemberId, final String serviceName) {
        ServiceMembersInner client = this.inner();
        return client.listAlertsAsync(serviceMemberId, serviceName)
        .flatMapIterable(new Func1<Page<AlertInner>, Iterable<AlertInner>>() {
            @Override
            public Iterable<AlertInner> call(Page<AlertInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AlertInner, ServicememberServiceAlert>() {
            @Override
            public ServicememberServiceAlert call(AlertInner inner) {
                return wrapServicememberServiceAlertModel(inner);
            }
        });
    }

    @Override
    public Observable<Connector> listConnectorsAsync(String serviceName, UUID serviceMemberId) {
        ServiceMembersInner client = this.inner();
        return client.listConnectorsAsync(serviceName, serviceMemberId)
        .flatMap(new Func1<List<ConnectorInner>, Observable<ConnectorInner>>() {
            @Override
            public Observable<ConnectorInner> call(List<ConnectorInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ConnectorInner, Connector>() {
            @Override
            public Connector call(ConnectorInner inner) {
                return wrapConnectorModel(inner);
            }
        });
    }

    @Override
    public Observable<ServiceCredential> listCredentialsAsync(String serviceName, UUID serviceMemberId) {
        ServiceMembersInner client = this.inner();
        return client.listCredentialsAsync(serviceName, serviceMemberId)
        .flatMap(new Func1<List<CredentialInner>, Observable<CredentialInner>>() {
            @Override
            public Observable<CredentialInner> call(List<CredentialInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<CredentialInner, ServiceCredential>() {
            @Override
            public ServiceCredential call(CredentialInner inner) {
                return wrapServiceCredentialModel(inner);
            }
        });
    }

    @Override
    public Observable<ServicememberServiceItem> listDataFreshnessAsync(String serviceName, UUID serviceMemberId) {
        ServiceMembersInner client = this.inner();
        return client.listDataFreshnessAsync(serviceName, serviceMemberId)
        .flatMap(new Func1<List<ItemInner>, Observable<ItemInner>>() {
            @Override
            public Observable<ItemInner> call(List<ItemInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ItemInner, ServicememberServiceItem>() {
            @Override
            public ServicememberServiceItem call(ItemInner inner) {
                return wrapServicememberServiceItemModel(inner);
            }
        });
    }

    @Override
    public Observable<ServicememberServiceExportStatus> listExportStatusAsync(final String serviceName, final UUID serviceMemberId) {
        ServiceMembersInner client = this.inner();
        return client.listExportStatusAsync(serviceName, serviceMemberId)
        .flatMapIterable(new Func1<Page<ExportStatusInner>, Iterable<ExportStatusInner>>() {
            @Override
            public Iterable<ExportStatusInner> call(Page<ExportStatusInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExportStatusInner, ServicememberServiceExportStatus>() {
            @Override
            public ServicememberServiceExportStatus call(ExportStatusInner inner) {
                return wrapServicememberServiceExportStatusModel(inner);
            }
        });
    }

    @Override
    public Observable<ServicememberServiceMetricSets> getMetricsAsync(String serviceName, String metricName, String groupName, UUID serviceMemberId) {
        ServiceMembersInner client = this.inner();
        return client.getMetricsAsync(serviceName, metricName, groupName, serviceMemberId)
        .flatMap(new Func1<MetricSetsInner, Observable<ServicememberServiceMetricSets>>() {
            @Override
            public Observable<ServicememberServiceMetricSets> call(MetricSetsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ServicememberServiceMetricSets)wrapServicememberServiceMetricSetsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<ConnectorMetadata> getConnectorMetadataAsync(String serviceName, UUID serviceMemberId, String metricName) {
        ServiceMembersInner client = this.inner();
        return client.getConnectorMetadataAsync(serviceName, serviceMemberId, metricName)
        .flatMap(new Func1<ConnectorMetadataInner, Observable<ConnectorMetadata>>() {
            @Override
            public Observable<ConnectorMetadata> call(ConnectorMetadataInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ConnectorMetadata)wrapConnectorMetadataModel(inner));
                }
            }
       });
    }

}

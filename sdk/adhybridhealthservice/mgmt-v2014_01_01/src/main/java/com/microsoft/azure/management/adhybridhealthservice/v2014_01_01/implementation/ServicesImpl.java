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
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.Services;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServiceItem;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServiceExportStatus;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServiceAlert;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.AlertFeedback;
import rx.Completable;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServiceProperties;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.Result;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.MetricMetadata;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ErrorCount;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.MergedExportError;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.MetricServiceMetricSets;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.AddsserviceMetricSets;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ErrorReportUsersEntry;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.RiskyIPBlobUri;

class ServicesImpl extends WrapperImpl<ServicesInner> implements Services {
    private final ADHybridHealthServiceManager manager;

    ServicesImpl(ADHybridHealthServiceManager manager) {
        super(manager.inner().services());
        this.manager = manager;
    }

    public ADHybridHealthServiceManager manager() {
        return this.manager;
    }

    private ServiceItemImpl wrapServiceItemModel(ItemInner inner) {
        return  new ServiceItemImpl(inner, manager());
    }

    private ServiceExportStatusImpl wrapServiceExportStatusModel(ExportStatusInner inner) {
        return  new ServiceExportStatusImpl(inner, manager());
    }

    private ServiceAlertImpl wrapServiceAlertModel(AlertInner inner) {
        return  new ServiceAlertImpl(inner, manager());
    }

    private MetricServiceMetricSetsImpl wrapMetricServiceMetricSetsModel(MetricSetsInner inner) {
        return  new MetricServiceMetricSetsImpl(inner, manager());
    }

    private Observable<MetricSetsInner> getMetricSetsInnerUsingServicesInnerAsync(String id) {
        String serviceName = IdParsingUtils.getValueFromIdByName(id, "services");
        String metricName = IdParsingUtils.getValueFromIdByName(id, "metrics");
        String groupName = IdParsingUtils.getValueFromIdByName(id, "groups");
        ServicesInner client = this.inner();
        return client.getMetricsAsync(serviceName, metricName, groupName);
    }

    @Override
    public Observable<ServiceItem> listMonitoringConfigurationsAsync(String serviceName) {
        ServicesInner client = this.inner();
        return client.listMonitoringConfigurationsAsync(serviceName)
        .flatMap(new Func1<List<ItemInner>, Observable<ItemInner>>() {
            @Override
            public Observable<ItemInner> call(List<ItemInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ItemInner, ServiceItem>() {
            @Override
            public ServiceItem call(ItemInner inner) {
                return wrapServiceItemModel(inner);
            }
        });
    }

    @Override
    public Observable<ServiceExportStatus> listExportStatusAsync(final String serviceName) {
        ServicesInner client = this.inner();
        return client.listExportStatusAsync(serviceName)
        .flatMapIterable(new Func1<Page<ExportStatusInner>, Iterable<ExportStatusInner>>() {
            @Override
            public Iterable<ExportStatusInner> call(Page<ExportStatusInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExportStatusInner, ServiceExportStatus>() {
            @Override
            public ServiceExportStatus call(ExportStatusInner inner) {
                return wrapServiceExportStatusModel(inner);
            }
        });
    }

    @Override
    public Observable<ServiceAlert> listAlertsAsync(final String serviceName) {
        ServicesInner client = this.inner();
        return client.listAlertsAsync(serviceName)
        .flatMapIterable(new Func1<Page<AlertInner>, Iterable<AlertInner>>() {
            @Override
            public Iterable<AlertInner> call(Page<AlertInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AlertInner, ServiceAlert>() {
            @Override
            public ServiceAlert call(AlertInner inner) {
                return wrapServiceAlertModel(inner);
            }
        });
    }

    @Override
    public Observable<AlertFeedback> addAlertFeedbackAsync(String serviceName, AlertFeedbackInner alertFeedback) {
        ServicesInner client = this.inner();
        return client.addAlertFeedbackAsync(serviceName, alertFeedback)
        .map(new Func1<AlertFeedbackInner, AlertFeedback>() {
            @Override
            public AlertFeedback call(AlertFeedbackInner inner) {
                return new AlertFeedbackImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AlertFeedback> listAlertFeedbackAsync(String serviceName, String shortName) {
        ServicesInner client = this.inner();
        return client.listAlertFeedbackAsync(serviceName, shortName)
        .flatMap(new Func1<List<AlertFeedbackInner>, Observable<AlertFeedbackInner>>() {
            @Override
            public Observable<AlertFeedbackInner> call(List<AlertFeedbackInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<AlertFeedbackInner, AlertFeedback>() {
            @Override
            public AlertFeedback call(AlertFeedbackInner inner) {
                return new AlertFeedbackImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServiceProperties> listPremiumAsync() {
        ServicesInner client = this.inner();
        return client.listPremiumAsync()
        .flatMapIterable(new Func1<Page<ServicePropertiesInner>, Iterable<ServicePropertiesInner>>() {
            @Override
            public Iterable<ServicePropertiesInner> call(Page<ServicePropertiesInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServicePropertiesInner, ServiceProperties>() {
            @Override
            public ServiceProperties call(ServicePropertiesInner inner) {
                return new ServicePropertiesImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServiceProperties> getAsync(String serviceName) {
        ServicesInner client = this.inner();
        return client.getAsync(serviceName)
        .map(new Func1<ServicePropertiesInner, ServiceProperties>() {
            @Override
            public ServiceProperties call(ServicePropertiesInner inner) {
                return new ServicePropertiesImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String serviceName) {
        ServicesInner client = this.inner();
        return client.deleteAsync(serviceName).toCompletable();
    }

    @Override
    public Observable<ServiceProperties> updateAsync(String serviceName, ServicePropertiesInner service) {
        ServicesInner client = this.inner();
        return client.updateAsync(serviceName, service)
        .map(new Func1<ServicePropertiesInner, ServiceProperties>() {
            @Override
            public ServiceProperties call(ServicePropertiesInner inner) {
                return new ServicePropertiesImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Result> getFeatureAvailibilityAsync(String serviceName, String featureName) {
        ServicesInner client = this.inner();
        return client.getFeatureAvailibilityAsync(serviceName, featureName)
        .map(new Func1<ResultInner, Result>() {
            @Override
            public Result call(ResultInner inner) {
                return new ResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<MetricMetadata> listMetricMetadataAsync(final String serviceName) {
        ServicesInner client = this.inner();
        return client.listMetricMetadataAsync(serviceName)
        .flatMapIterable(new Func1<Page<MetricMetadataInner>, Iterable<MetricMetadataInner>>() {
            @Override
            public Iterable<MetricMetadataInner> call(Page<MetricMetadataInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MetricMetadataInner, MetricMetadata>() {
            @Override
            public MetricMetadata call(MetricMetadataInner inner) {
                return new MetricMetadataImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<MetricMetadata> getMetricMetadataAsync(String serviceName, String metricName) {
        ServicesInner client = this.inner();
        return client.getMetricMetadataAsync(serviceName, metricName)
        .map(new Func1<MetricMetadataInner, MetricMetadata>() {
            @Override
            public MetricMetadata call(MetricMetadataInner inner) {
                return new MetricMetadataImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable updateMonitoringConfigurationAsync(String serviceName, ItemInner configurationSetting) {
        ServicesInner client = this.inner();
        return client.updateMonitoringConfigurationAsync(serviceName, configurationSetting).toCompletable();
    }

    @Override
    public Observable<Result> getTenantWhitelistingAsync(String serviceName, String featureName) {
        ServicesInner client = this.inner();
        return client.getTenantWhitelistingAsync(serviceName, featureName)
        .map(new Func1<ResultInner, Result>() {
            @Override
            public Result call(ResultInner inner) {
                return new ResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServiceProperties> listAsync() {
        ServicesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ServicePropertiesInner>, Iterable<ServicePropertiesInner>>() {
            @Override
            public Iterable<ServicePropertiesInner> call(Page<ServicePropertiesInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServicePropertiesInner, ServiceProperties>() {
            @Override
            public ServiceProperties call(ServicePropertiesInner inner) {
                return new ServicePropertiesImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServiceProperties> addAsync(ServicePropertiesInner service) {
        ServicesInner client = this.inner();
        return client.addAsync(service)
        .map(new Func1<ServicePropertiesInner, ServiceProperties>() {
            @Override
            public ServiceProperties call(ServicePropertiesInner inner) {
                return new ServicePropertiesImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ErrorCount> listExportErrorsAsync(String serviceName) {
        ServicesInner client = this.inner();
        return client.listExportErrorsAsync(serviceName)
        .flatMap(new Func1<List<ErrorCountInner>, Observable<ErrorCountInner>>() {
            @Override
            public Observable<ErrorCountInner> call(List<ErrorCountInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ErrorCountInner, ErrorCount>() {
            @Override
            public ErrorCount call(ErrorCountInner inner) {
                return new ErrorCountImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<MergedExportError> listExportErrorsV2Async(String serviceName, String errorBucket) {
        ServicesInner client = this.inner();
        return client.listExportErrorsV2Async(serviceName, errorBucket)
        .flatMap(new Func1<List<MergedExportErrorInner>, Observable<MergedExportErrorInner>>() {
            @Override
            public Observable<MergedExportErrorInner> call(List<MergedExportErrorInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MergedExportErrorInner, MergedExportError>() {
            @Override
            public MergedExportError call(MergedExportErrorInner inner) {
                return new MergedExportErrorImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<MetricServiceMetricSets> getMetricsAsync(String serviceName, String metricName, String groupName) {
        ServicesInner client = this.inner();
        return client.getMetricsAsync(serviceName, metricName, groupName)
        .flatMap(new Func1<MetricSetsInner, Observable<MetricServiceMetricSets>>() {
            @Override
            public Observable<MetricServiceMetricSets> call(MetricSetsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((MetricServiceMetricSets)wrapMetricServiceMetricSetsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<ServiceItem> listMetricsAverageAsync(final String serviceName, final String metricName, final String groupName) {
        ServicesInner client = this.inner();
        return client.listMetricsAverageAsync(serviceName, metricName, groupName)
        .flatMapIterable(new Func1<Page<ItemInner>, Iterable<ItemInner>>() {
            @Override
            public Iterable<ItemInner> call(Page<ItemInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ItemInner, ServiceItem>() {
            @Override
            public ServiceItem call(ItemInner inner) {
                return new ServiceItemImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServiceItem> listMetricsSumAsync(final String serviceName, final String metricName, final String groupName) {
        ServicesInner client = this.inner();
        return client.listMetricsSumAsync(serviceName, metricName, groupName)
        .flatMapIterable(new Func1<Page<ItemInner>, Iterable<ItemInner>>() {
            @Override
            public Iterable<ItemInner> call(Page<ItemInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ItemInner, ServiceItem>() {
            @Override
            public ServiceItem call(ItemInner inner) {
                return new ServiceItemImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AddsserviceMetricSets> getMetricMetadataForGroupAsync(String serviceName, String metricName, String groupName) {
        ServicesInner client = this.inner();
        return client.getMetricMetadataForGroupAsync(serviceName, metricName, groupName)
        .map(new Func1<MetricSetsInner, AddsserviceMetricSets>() {
            @Override
            public AddsserviceMetricSets call(MetricSetsInner inner) {
                return new AddsserviceMetricSetsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ErrorReportUsersEntry> listUserBadPasswordReportAsync(String serviceName) {
        ServicesInner client = this.inner();
        return client.listUserBadPasswordReportAsync(serviceName)
        .flatMap(new Func1<List<ErrorReportUsersEntryInner>, Observable<ErrorReportUsersEntryInner>>() {
            @Override
            public Observable<ErrorReportUsersEntryInner> call(List<ErrorReportUsersEntryInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ErrorReportUsersEntryInner, ErrorReportUsersEntry>() {
            @Override
            public ErrorReportUsersEntry call(ErrorReportUsersEntryInner inner) {
                return new ErrorReportUsersEntryImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RiskyIPBlobUri> listAllRiskyIpDownloadReportAsync(String serviceName) {
        ServicesInner client = this.inner();
        return client.listAllRiskyIpDownloadReportAsync(serviceName)
        .flatMap(new Func1<List<RiskyIPBlobUriInner>, Observable<RiskyIPBlobUriInner>>() {
            @Override
            public Observable<RiskyIPBlobUriInner> call(List<RiskyIPBlobUriInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<RiskyIPBlobUriInner, RiskyIPBlobUri>() {
            @Override
            public RiskyIPBlobUri call(RiskyIPBlobUriInner inner) {
                return new RiskyIPBlobUriImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RiskyIPBlobUri> listCurrentRiskyIpDownloadReportAsync(String serviceName) {
        ServicesInner client = this.inner();
        return client.listCurrentRiskyIpDownloadReportAsync(serviceName)
        .flatMap(new Func1<List<RiskyIPBlobUriInner>, Observable<RiskyIPBlobUriInner>>() {
            @Override
            public Observable<RiskyIPBlobUriInner> call(List<RiskyIPBlobUriInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<RiskyIPBlobUriInner, RiskyIPBlobUri>() {
            @Override
            public RiskyIPBlobUri call(RiskyIPBlobUriInner inner) {
                return new RiskyIPBlobUriImpl(inner, manager());
            }
        });
    }

}

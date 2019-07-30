(ns com.amazonaws.services.kinesisanalyticsv2.AbstractAmazonKinesisAnalyticsV2
  "Abstract implementation of AmazonKinesisAnalyticsV2. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisanalyticsv2 AbstractAmazonKinesisAnalyticsV2]))

(defn stop-application
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationRequest`

  returns: Result of the StopApplication operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationRequest request]
    (-> this (.stopApplication request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-application
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationRequest`

  returns: Result of the DescribeApplication operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationRequest request]
    (-> this (.describeApplication request))))

(defn untag-resource
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn delete-application-output
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputRequest`

  returns: Result of the DeleteApplicationOutput operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputRequest request]
    (-> this (.deleteApplicationOutput request))))

(defn add-application-input
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputRequest`

  returns: Result of the AddApplicationInput operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputRequest request]
    (-> this (.addApplicationInput request))))

(defn delete-application
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationRequest request]
    (-> this (.deleteApplication request))))

(defn list-applications
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsRequest`

  returns: Result of the ListApplications operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsRequest request]
    (-> this (.listApplications request))))

(defn delete-application-snapshot
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotRequest`

  returns: Result of the DeleteApplicationSnapshot operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotRequest request]
    (-> this (.deleteApplicationSnapshot request))))

(defn create-application-snapshot
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotRequest`

  returns: Result of the CreateApplicationSnapshot operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotRequest request]
    (-> this (.createApplicationSnapshot request))))

(defn shutdown
  "Description copied from interface: AmazonKinesisAnalyticsV2"
  ([^AbstractAmazonKinesisAnalyticsV2 this]
    (-> this (.shutdown))))

(defn discover-input-schema
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaRequest`

  returns: Result of the DiscoverInputSchema operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaRequest request]
    (-> this (.discoverInputSchema request))))

(defn delete-application-reference-data-source
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceRequest`

  returns: Result of the DeleteApplicationReferenceDataSource operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceRequest request]
    (-> this (.deleteApplicationReferenceDataSource request))))

(defn update-application
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationRequest request]
    (-> this (.updateApplication request))))

(defn add-application-output
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputRequest`

  returns: Result of the AddApplicationOutput operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputRequest request]
    (-> this (.addApplicationOutput request))))

(defn add-application-input-processing-configuration
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationRequest`

  returns: Result of the AddApplicationInputProcessingConfiguration operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationRequest request]
    (-> this (.addApplicationInputProcessingConfiguration request))))

(defn start-application
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationRequest`

  returns: Result of the StartApplication operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationRequest request]
    (-> this (.startApplication request))))

(defn create-application
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn delete-application-cloud-watch-logging-option
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionRequest`

  returns: Result of the DeleteApplicationCloudWatchLoggingOption operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionRequest request]
    (-> this (.deleteApplicationCloudWatchLoggingOption request))))

(defn describe-application-snapshot
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotRequest`

  returns: Result of the DescribeApplicationSnapshot operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotRequest request]
    (-> this (.describeApplicationSnapshot request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn add-application-reference-data-source
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceRequest`

  returns: Result of the AddApplicationReferenceDataSource operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceRequest request]
    (-> this (.addApplicationReferenceDataSource request))))

(defn list-application-snapshots
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsRequest`

  returns: Result of the ListApplicationSnapshots operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsRequest request]
    (-> this (.listApplicationSnapshots request))))

(defn add-application-cloud-watch-logging-option
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionRequest`

  returns: Result of the AddApplicationCloudWatchLoggingOption operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionRequest request]
    (-> this (.addApplicationCloudWatchLoggingOption request))))

(defn tag-resource
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.TagResourceResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.TagResourceResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-application-input-processing-configuration
  "Description copied from interface: AmazonKinesisAnalyticsV2

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationRequest`

  returns: Result of the DeleteApplicationInputProcessingConfiguration operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationResult`"
  (^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationResult [^AbstractAmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationRequest request]
    (-> this (.deleteApplicationInputProcessingConfiguration request))))


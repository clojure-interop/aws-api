(ns com.amazonaws.services.kinesisanalyticsv2.AmazonKinesisAnalyticsV2AsyncClient
  "Client for accessing Kinesis Analytics V2 asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Amazon Kinesis Data Analytics is a fully managed service that you can use to process and analyze streaming data using
  SQL or Java. The service enables you to quickly author and run SQL or Java code against streaming sources to perform
  time series analytics, feed real-time dashboards, and create real-time metrics."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisanalyticsv2 AmazonKinesisAnalyticsV2AsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.kinesisanalyticsv2.AmazonKinesisAnalyticsV2AsyncClientBuilder`"
  (^com.amazonaws.services.kinesisanalyticsv2.AmazonKinesisAnalyticsV2AsyncClientBuilder []
    (AmazonKinesisAnalyticsV2AsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn add-application-input-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationInputAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputRequest request]
    (-> this (.addApplicationInputAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonKinesisAnalyticsV2AsyncClient this]
    (-> this (.getExecutorService))))

(defn update-application-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationRequest request]
    (-> this (.updateApplicationAsync request))))

(defn start-application-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationRequest request]
    (-> this (.startApplicationAsync request))))

(defn create-application-snapshot-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplicationSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotRequest request]
    (-> this (.createApplicationSnapshotAsync request))))

(defn stop-application-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationRequest request]
    (-> this (.stopApplicationAsync request))))

(defn list-applications-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsRequest request]
    (-> this (.listApplicationsAsync request))))

(defn add-application-cloud-watch-logging-option-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationCloudWatchLoggingOption operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationCloudWatchLoggingOptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionRequest request]
    (-> this (.addApplicationCloudWatchLoggingOptionAsync request))))

(defn create-application-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationRequest request]
    (-> this (.createApplicationAsync request))))

(defn delete-application-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationRequest request]
    (-> this (.deleteApplicationAsync request))))

(defn delete-application-snapshot-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotRequest request]
    (-> this (.deleteApplicationSnapshotAsync request))))

(defn describe-application-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationRequest request]
    (-> this (.describeApplicationAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonKinesisAnalyticsV2AsyncClient this]
    (-> this (.shutdown))))

(defn discover-input-schema-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DiscoverInputSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.discoverInputSchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaRequest request]
    (-> this (.discoverInputSchemaAsync request))))

(defn delete-application-input-processing-configuration-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationInputProcessingConfiguration operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationInputProcessingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationRequest request]
    (-> this (.deleteApplicationInputProcessingConfigurationAsync request))))

(defn delete-application-cloud-watch-logging-option-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationCloudWatchLoggingOption operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationCloudWatchLoggingOptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionRequest request]
    (-> this (.deleteApplicationCloudWatchLoggingOptionAsync request))))

(defn list-application-snapshots-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplicationSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsRequest request]
    (-> this (.listApplicationSnapshotsAsync request))))

(defn add-application-reference-data-source-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationReferenceDataSource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationReferenceDataSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceRequest request]
    (-> this (.addApplicationReferenceDataSourceAsync request))))

(defn delete-application-output-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationOutputAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputRequest request]
    (-> this (.deleteApplicationOutputAsync request))))

(defn add-application-output-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationOutputAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputRequest request]
    (-> this (.addApplicationOutputAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn delete-application-reference-data-source-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationReferenceDataSource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationReferenceDataSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceRequest request]
    (-> this (.deleteApplicationReferenceDataSourceAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn add-application-input-processing-configuration-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationInputProcessingConfiguration operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationInputProcessingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationRequest request]
    (-> this (.addApplicationInputProcessingConfigurationAsync request))))

(defn describe-application-snapshot-async
  "Description copied from interface: AmazonKinesisAnalyticsV2Async

  request - `com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplicationSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2AsyncClient this ^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotRequest request]
    (-> this (.describeApplicationSnapshotAsync request))))


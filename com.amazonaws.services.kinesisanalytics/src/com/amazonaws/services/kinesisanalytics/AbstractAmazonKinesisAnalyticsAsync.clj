(ns com.amazonaws.services.kinesisanalytics.AbstractAmazonKinesisAnalyticsAsync
  "Abstract implementation of AmazonKinesisAnalyticsAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisanalytics AbstractAmazonKinesisAnalyticsAsync]))

(defn untag-resource-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn add-application-input-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.AddApplicationInputResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationInputAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest request]
    (-> this (.addApplicationInputAsync request))))

(defn update-application-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest request]
    (-> this (.updateApplicationAsync request))))

(defn start-application-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.StartApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest request]
    (-> this (.startApplicationAsync request))))

(defn stop-application-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.StopApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest request]
    (-> this (.stopApplicationAsync request))))

(defn list-applications-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.ListApplicationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest request]
    (-> this (.listApplicationsAsync request))))

(defn add-application-cloud-watch-logging-option-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationCloudWatchLoggingOption operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationCloudWatchLoggingOptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest request]
    (-> this (.addApplicationCloudWatchLoggingOptionAsync request))))

(defn create-application-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - TBD - `com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest request]
    (-> this (.createApplicationAsync request))))

(defn delete-application-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest request]
    (-> this (.deleteApplicationAsync request))))

(defn describe-application-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DescribeApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest request]
    (-> this (.describeApplicationAsync request))))

(defn discover-input-schema-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DiscoverInputSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.discoverInputSchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest request]
    (-> this (.discoverInputSchemaAsync request))))

(defn delete-application-input-processing-configuration-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationInputProcessingConfiguration operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationInputProcessingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest request]
    (-> this (.deleteApplicationInputProcessingConfigurationAsync request))))

(defn delete-application-cloud-watch-logging-option-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationCloudWatchLoggingOption operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationCloudWatchLoggingOptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest request]
    (-> this (.deleteApplicationCloudWatchLoggingOptionAsync request))))

(defn add-application-reference-data-source-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationReferenceDataSource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationReferenceDataSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest request]
    (-> this (.addApplicationReferenceDataSourceAsync request))))

(defn delete-application-output-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationOutputAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest request]
    (-> this (.deleteApplicationOutputAsync request))))

(defn add-application-output-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationOutputAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest request]
    (-> this (.addApplicationOutputAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn delete-application-reference-data-source-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationReferenceDataSource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationReferenceDataSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest request]
    (-> this (.deleteApplicationReferenceDataSourceAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn add-application-input-processing-configuration-async
  "Description copied from interface: AmazonKinesisAnalyticsAsync

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationInputProcessingConfiguration operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationInputProcessingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest request]
    (-> this (.addApplicationInputProcessingConfigurationAsync request))))


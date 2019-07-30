(ns com.amazonaws.services.kinesisanalyticsv2.AmazonKinesisAnalyticsV2Async
  "Interface for accessing Kinesis Analytics V2 asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonKinesisAnalyticsV2Async instead.



  Amazon Kinesis Data Analytics is a fully managed service that you can use to process and analyze streaming data using
  SQL or Java. The service enables you to quickly author and run SQL or Java code against streaming sources to perform
  time series analytics, feed real-time dashboards, and create real-time metrics."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisanalyticsv2 AmazonKinesisAnalyticsV2Async]))

(defn untag-resource-async
  "Removes one or more tags from a Kinesis Analytics application.

  untag-resource-request - `com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn add-application-input-async
  "Adds a streaming source to your SQL-based Amazon Kinesis Data Analytics application.


   You can add a streaming source when you create an application, or you can use this operation to add a streaming
   source after you create an application. For more information, see CreateApplication.


   Any configuration update, including adding a streaming source using this operation, results in a new version of
   the application. You can use the DescribeApplication operation to find the current application version.

  add-application-input-request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputRequest add-application-input-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationInputAsync add-application-input-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputRequest add-application-input-request]
    (-> this (.addApplicationInputAsync add-application-input-request))))

(defn update-application-async
  "Updates an existing Amazon Kinesis Data Analytics application. Using this operation, you can update application
   code, input configuration, and output configuration.


   Kinesis Data Analytics updates the ApplicationVersionId each time you update your application.

  update-application-request - `com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationRequest update-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync update-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationRequest update-application-request]
    (-> this (.updateApplicationAsync update-application-request))))

(defn start-application-async
  "Starts the specified Amazon Kinesis Data Analytics application. After creating an application, you must
   exclusively call this operation to start your application.

  start-application-request - `com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationRequest start-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startApplicationAsync start-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationRequest start-application-request]
    (-> this (.startApplicationAsync start-application-request))))

(defn create-application-snapshot-async
  "Creates a snapshot of the application's state data.

  create-application-snapshot-request - `com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplicationSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotRequest create-application-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationSnapshotAsync create-application-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotRequest create-application-snapshot-request]
    (-> this (.createApplicationSnapshotAsync create-application-snapshot-request))))

(defn stop-application-async
  "Stops the application from processing data. You can stop an application only if it is in the running state. You
   can use the DescribeApplication operation to find the application state.

  stop-application-request - `com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationRequest stop-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopApplicationAsync stop-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationRequest stop-application-request]
    (-> this (.stopApplicationAsync stop-application-request))))

(defn list-applications-async
  "Returns a list of Amazon Kinesis Data Analytics applications in your account. For each application, the response
   includes the application name, Amazon Resource Name (ARN), and status.


   If you want detailed information about a specific application, use DescribeApplication.

  list-applications-request - `com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsRequest list-applications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationsAsync list-applications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsRequest list-applications-request]
    (-> this (.listApplicationsAsync list-applications-request))))

(defn add-application-cloud-watch-logging-option-async
  "Adds an Amazon CloudWatch log stream to monitor application configuration errors.

  add-application-cloud-watch-logging-option-request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationCloudWatchLoggingOption operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionRequest add-application-cloud-watch-logging-option-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationCloudWatchLoggingOptionAsync add-application-cloud-watch-logging-option-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionRequest add-application-cloud-watch-logging-option-request]
    (-> this (.addApplicationCloudWatchLoggingOptionAsync add-application-cloud-watch-logging-option-request))))

(defn create-application-async
  "Creates an Amazon Kinesis Data Analytics application. For information about creating a Kinesis Data Analytics
   application, see Creating
   an Application.

  create-application-request - `com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationRequest create-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync create-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationRequest create-application-request]
    (-> this (.createApplicationAsync create-application-request))))

(defn delete-application-async
  "Deletes the specified application. Kinesis Data Analytics halts application execution and deletes the
   application.

  delete-application-request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationRequest delete-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync delete-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationRequest delete-application-request]
    (-> this (.deleteApplicationAsync delete-application-request))))

(defn delete-application-snapshot-async
  "Deletes a snapshot of application state.

  delete-application-snapshot-request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotRequest delete-application-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationSnapshotAsync delete-application-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotRequest delete-application-snapshot-request]
    (-> this (.deleteApplicationSnapshotAsync delete-application-snapshot-request))))

(defn describe-application-async
  "Returns information about a specific Amazon Kinesis Data Analytics application.


   If you want to retrieve a list of all applications in your account, use the ListApplications operation.

  describe-application-request - `com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationRequest describe-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationAsync describe-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationRequest describe-application-request]
    (-> this (.describeApplicationAsync describe-application-request))))

(defn discover-input-schema-async
  "Infers a schema for an SQL-based Amazon Kinesis Data Analytics application by evaluating sample records on the
   specified streaming source (Kinesis data stream or Kinesis Data Firehose delivery stream) or Amazon S3 object. In
   the response, the operation returns the inferred schema and also the sample records that the operation used to
   infer the schema.


   You can use the inferred schema when configuring a streaming source for your application. When you create an
   application using the Kinesis Data Analytics console, the console uses this operation to infer a schema and show
   it in the console user interface.

  discover-input-schema-request - `com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DiscoverInputSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaRequest discover-input-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.discoverInputSchemaAsync discover-input-schema-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaRequest discover-input-schema-request]
    (-> this (.discoverInputSchemaAsync discover-input-schema-request))))

(defn delete-application-input-processing-configuration-async
  "Deletes an InputProcessingConfiguration from an input.

  delete-application-input-processing-configuration-request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationInputProcessingConfiguration operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationRequest delete-application-input-processing-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationInputProcessingConfigurationAsync delete-application-input-processing-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationRequest delete-application-input-processing-configuration-request]
    (-> this (.deleteApplicationInputProcessingConfigurationAsync delete-application-input-processing-configuration-request))))

(defn delete-application-cloud-watch-logging-option-async
  "Deletes an Amazon CloudWatch log stream from an Amazon Kinesis Data Analytics application.

  delete-application-cloud-watch-logging-option-request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationCloudWatchLoggingOption operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionRequest delete-application-cloud-watch-logging-option-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationCloudWatchLoggingOptionAsync delete-application-cloud-watch-logging-option-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionRequest delete-application-cloud-watch-logging-option-request]
    (-> this (.deleteApplicationCloudWatchLoggingOptionAsync delete-application-cloud-watch-logging-option-request))))

(defn list-application-snapshots-async
  "Lists information about the current application snapshots.

  list-application-snapshots-request - `com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplicationSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsRequest list-application-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationSnapshotsAsync list-application-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsRequest list-application-snapshots-request]
    (-> this (.listApplicationSnapshotsAsync list-application-snapshots-request))))

(defn add-application-reference-data-source-async
  "Adds a reference data source to an existing SQL-based Amazon Kinesis Data Analytics application.


   Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table
   within your application. In the request, you provide the source (S3 bucket name and object key name), name of the
   in-application table to create, and the necessary mapping information that describes how data in an Amazon S3
   object maps to columns in the resulting in-application table.

  add-application-reference-data-source-request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationReferenceDataSource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceRequest add-application-reference-data-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationReferenceDataSourceAsync add-application-reference-data-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceRequest add-application-reference-data-source-request]
    (-> this (.addApplicationReferenceDataSourceAsync add-application-reference-data-source-request))))

(defn delete-application-output-async
  "Deletes the output destination configuration from your SQL-based Amazon Kinesis Data Analytics application's
   configuration. Kinesis Data Analytics will no longer write data from the corresponding in-application stream to
   the external output destination.

  delete-application-output-request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputRequest delete-application-output-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationOutputAsync delete-application-output-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputRequest delete-application-output-request]
    (-> this (.deleteApplicationOutputAsync delete-application-output-request))))

(defn add-application-output-async
  "Adds an external destination to your SQL-based Amazon Kinesis Data Analytics application.


   If you want Kinesis Data Analytics to deliver data from an in-application stream within your application to an
   external destination (such as an Kinesis data stream, a Kinesis Data Firehose delivery stream, or an AWS Lambda
   function), you add the relevant configuration to your application using this operation. You can configure one or
   more outputs for your application. Each output configuration maps an in-application stream and an external
   destination.


   You can use one of the output configurations to deliver data from your in-application error stream to an external
   destination so that you can analyze the errors.


   Any configuration update, including adding a streaming source using this operation, results in a new version of
   the application. You can use the DescribeApplication operation to find the current application version.

  add-application-output-request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputRequest add-application-output-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationOutputAsync add-application-output-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputRequest add-application-output-request]
    (-> this (.addApplicationOutputAsync add-application-output-request))))

(defn list-tags-for-resource-async
  "Retrieves the list of key-value tags assigned to the application.

  list-tags-for-resource-request - `com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn delete-application-reference-data-source-async
  "Deletes a reference data source configuration from the specified SQL-based Amazon Kinesis Data Analytics
   application's configuration.


   If the application is running, Kinesis Data Analytics immediately removes the in-application table that you
   created using the AddApplicationReferenceDataSource operation.

  delete-application-reference-data-source-request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationReferenceDataSource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceRequest delete-application-reference-data-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationReferenceDataSourceAsync delete-application-reference-data-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceRequest delete-application-reference-data-source-request]
    (-> this (.deleteApplicationReferenceDataSourceAsync delete-application-reference-data-source-request))))

(defn tag-resource-async
  "Adds one or more key-value tags to a Kinesis Analytics application. Note that the maximum number of application
   tags includes system tags. The maximum number of user-defined application tags is 50.

  tag-resource-request - `com.amazonaws.services.kinesisanalyticsv2.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn add-application-input-processing-configuration-async
  "Adds an InputProcessingConfiguration to an SQL-based Kinesis Data Analytics application. An input
   processor pre-processes records on the input stream before the application's SQL code executes. Currently, the
   only input processor available is AWS Lambda.

  add-application-input-processing-configuration-request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationInputProcessingConfiguration operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationRequest add-application-input-processing-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationInputProcessingConfigurationAsync add-application-input-processing-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationRequest add-application-input-processing-configuration-request]
    (-> this (.addApplicationInputProcessingConfigurationAsync add-application-input-processing-configuration-request))))

(defn describe-application-snapshot-async
  "Returns information about a snapshot of application state data.

  describe-application-snapshot-request - `com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplicationSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotRequest describe-application-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationSnapshotAsync describe-application-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsV2Async this ^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotRequest describe-application-snapshot-request]
    (-> this (.describeApplicationSnapshotAsync describe-application-snapshot-request))))


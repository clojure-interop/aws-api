(ns com.amazonaws.services.kinesisanalyticsv2.AmazonKinesisAnalyticsV2
  "Interface for accessing Kinesis Analytics V2.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonKinesisAnalyticsV2 instead.



  Amazon Kinesis Data Analytics is a fully managed service that you can use to process and analyze streaming data using
  SQL or Java. The service enables you to quickly author and run SQL or Java code against streaming sources to perform
  time series analytics, feed real-time dashboards, and create real-time metrics."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisanalyticsv2 AmazonKinesisAnalyticsV2]))

(defn stop-application
  "Stops the application from processing data. You can stop an application only if it is in the running state. You
   can use the DescribeApplication operation to find the application state.

  stop-application-request - `com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationRequest`

  returns: Result of the StopApplication operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.StopApplicationRequest stop-application-request]
    (-> this (.stopApplication stop-application-request))))

(defn list-tags-for-resource
  "Retrieves the list of key-value tags assigned to the application.

  list-tags-for-resource-request - `com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn describe-application
  "Returns information about a specific Amazon Kinesis Data Analytics application.


   If you want to retrieve a list of all applications in your account, use the ListApplications operation.

  describe-application-request - `com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationRequest`

  returns: Result of the DescribeApplication operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationRequest describe-application-request]
    (-> this (.describeApplication describe-application-request))))

(defn untag-resource
  "Removes one or more tags from a Kinesis Analytics application.

  untag-resource-request - `com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn delete-application-output
  "Deletes the output destination configuration from your SQL-based Amazon Kinesis Data Analytics application's
   configuration. Kinesis Data Analytics will no longer write data from the corresponding in-application stream to
   the external output destination.

  delete-application-output-request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputRequest`

  returns: Result of the DeleteApplicationOutput operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationOutputRequest delete-application-output-request]
    (-> this (.deleteApplicationOutput delete-application-output-request))))

(defn add-application-input
  "Adds a streaming source to your SQL-based Amazon Kinesis Data Analytics application.


   You can add a streaming source when you create an application, or you can use this operation to add a streaming
   source after you create an application. For more information, see CreateApplication.


   Any configuration update, including adding a streaming source using this operation, results in a new version of
   the application. You can use the DescribeApplication operation to find the current application version.

  add-application-input-request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputRequest`

  returns: Result of the AddApplicationInput operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputRequest add-application-input-request]
    (-> this (.addApplicationInput add-application-input-request))))

(defn delete-application
  "Deletes the specified application. Kinesis Data Analytics halts application execution and deletes the
   application.

  delete-application-request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ConcurrentModificationException - Exception thrown as a result of concurrent modifications to an application. This error can be the result of attempting to modify an application without using the current application ID."
  (^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationRequest delete-application-request]
    (-> this (.deleteApplication delete-application-request))))

(defn list-applications
  "Returns a list of Amazon Kinesis Data Analytics applications in your account. For each application, the response
   includes the application name, Amazon Resource Name (ARN), and status.


   If you want detailed information about a specific application, use DescribeApplication.

  list-applications-request - `com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsRequest`

  returns: Result of the ListApplications operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.InvalidRequestException - The request JSON is not valid for the operation."
  (^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationsRequest list-applications-request]
    (-> this (.listApplications list-applications-request))))

(defn delete-application-snapshot
  "Deletes a snapshot of application state.

  delete-application-snapshot-request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotRequest`

  returns: Result of the DeleteApplicationSnapshot operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceInUseException - The application is not available for this operation."
  (^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationSnapshotRequest delete-application-snapshot-request]
    (-> this (.deleteApplicationSnapshot delete-application-snapshot-request))))

(defn create-application-snapshot
  "Creates a snapshot of the application's state data.

  create-application-snapshot-request - `com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotRequest`

  returns: Result of the CreateApplicationSnapshot operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceInUseException - The application is not available for this operation."
  (^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationSnapshotRequest create-application-snapshot-request]
    (-> this (.createApplicationSnapshot create-application-snapshot-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonKinesisAnalyticsV2 this]
    (-> this (.shutdown))))

(defn discover-input-schema
  "Infers a schema for an SQL-based Amazon Kinesis Data Analytics application by evaluating sample records on the
   specified streaming source (Kinesis data stream or Kinesis Data Firehose delivery stream) or Amazon S3 object. In
   the response, the operation returns the inferred schema and also the sample records that the operation used to
   infer the schema.


   You can use the inferred schema when configuring a streaming source for your application. When you create an
   application using the Kinesis Data Analytics console, the console uses this operation to infer a schema and show
   it in the console user interface.

  discover-input-schema-request - `com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaRequest`

  returns: Result of the DiscoverInputSchema operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.InvalidArgumentException - The specified input parameter value is not valid."
  (^com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DiscoverInputSchemaRequest discover-input-schema-request]
    (-> this (.discoverInputSchema discover-input-schema-request))))

(defn delete-application-reference-data-source
  "Deletes a reference data source configuration from the specified SQL-based Amazon Kinesis Data Analytics
   application's configuration.


   If the application is running, Kinesis Data Analytics immediately removes the in-application table that you
   created using the AddApplicationReferenceDataSource operation.

  delete-application-reference-data-source-request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceRequest`

  returns: Result of the DeleteApplicationReferenceDataSource operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationReferenceDataSourceRequest delete-application-reference-data-source-request]
    (-> this (.deleteApplicationReferenceDataSource delete-application-reference-data-source-request))))

(defn update-application
  "Updates an existing Amazon Kinesis Data Analytics application. Using this operation, you can update application
   code, input configuration, and output configuration.


   Kinesis Data Analytics updates the ApplicationVersionId each time you update your application.

  update-application-request - `com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.CodeValidationException - The user-provided application code (query) is not valid. This can be a simple syntax error."
  (^com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.UpdateApplicationRequest update-application-request]
    (-> this (.updateApplication update-application-request))))

(defn add-application-output
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

  returns: Result of the AddApplicationOutput operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationOutputRequest add-application-output-request]
    (-> this (.addApplicationOutput add-application-output-request))))

(defn add-application-input-processing-configuration
  "Adds an InputProcessingConfiguration to an SQL-based Kinesis Data Analytics application. An input
   processor pre-processes records on the input stream before the application's SQL code executes. Currently, the
   only input processor available is AWS Lambda.

  add-application-input-processing-configuration-request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationRequest`

  returns: Result of the AddApplicationInputProcessingConfiguration operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationInputProcessingConfigurationRequest add-application-input-processing-configuration-request]
    (-> this (.addApplicationInputProcessingConfiguration add-application-input-processing-configuration-request))))

(defn start-application
  "Starts the specified Amazon Kinesis Data Analytics application. After creating an application, you must
   exclusively call this operation to start your application.

  start-application-request - `com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationRequest`

  returns: Result of the StartApplication operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.StartApplicationRequest start-application-request]
    (-> this (.startApplication start-application-request))))

(defn create-application
  "Creates an Amazon Kinesis Data Analytics application. For information about creating a Kinesis Data Analytics
   application, see Creating
   an Application.

  create-application-request - `com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.CodeValidationException - The user-provided application code (query) is not valid. This can be a simple syntax error."
  (^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.CreateApplicationRequest create-application-request]
    (-> this (.createApplication create-application-request))))

(defn delete-application-cloud-watch-logging-option
  "Deletes an Amazon CloudWatch log stream from an Amazon Kinesis Data Analytics application.

  delete-application-cloud-watch-logging-option-request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionRequest`

  returns: Result of the DeleteApplicationCloudWatchLoggingOption operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationCloudWatchLoggingOptionRequest delete-application-cloud-watch-logging-option-request]
    (-> this (.deleteApplicationCloudWatchLoggingOption delete-application-cloud-watch-logging-option-request))))

(defn describe-application-snapshot
  "Returns information about a snapshot of application state data.

  describe-application-snapshot-request - `com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotRequest`

  returns: Result of the DescribeApplicationSnapshot operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DescribeApplicationSnapshotRequest describe-application-snapshot-request]
    (-> this (.describeApplicationSnapshot describe-application-snapshot-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn add-application-reference-data-source
  "Adds a reference data source to an existing SQL-based Amazon Kinesis Data Analytics application.


   Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table
   within your application. In the request, you provide the source (S3 bucket name and object key name), name of the
   in-application table to create, and the necessary mapping information that describes how data in an Amazon S3
   object maps to columns in the resulting in-application table.

  add-application-reference-data-source-request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceRequest`

  returns: Result of the AddApplicationReferenceDataSource operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationReferenceDataSourceRequest add-application-reference-data-source-request]
    (-> this (.addApplicationReferenceDataSource add-application-reference-data-source-request))))

(defn list-application-snapshots
  "Lists information about the current application snapshots.

  list-application-snapshots-request - `com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsRequest`

  returns: Result of the ListApplicationSnapshots operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.InvalidArgumentException - The specified input parameter value is not valid."
  (^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.ListApplicationSnapshotsRequest list-application-snapshots-request]
    (-> this (.listApplicationSnapshots list-application-snapshots-request))))

(defn add-application-cloud-watch-logging-option
  "Adds an Amazon CloudWatch log stream to monitor application configuration errors.

  add-application-cloud-watch-logging-option-request - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionRequest`

  returns: Result of the AddApplicationCloudWatchLoggingOption operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.AddApplicationCloudWatchLoggingOptionRequest add-application-cloud-watch-logging-option-request]
    (-> this (.addApplicationCloudWatchLoggingOption add-application-cloud-watch-logging-option-request))))

(defn tag-resource
  "Adds one or more key-value tags to a Kinesis Analytics application. Note that the maximum number of application
   tags includes system tags. The maximum number of user-defined application tags is 50.

  tag-resource-request - `com.amazonaws.services.kinesisanalyticsv2.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.TagResourceResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.TagResourceResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn delete-application-input-processing-configuration
  "Deletes an InputProcessingConfiguration from an input.

  delete-application-input-processing-configuration-request - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationRequest`

  returns: Result of the DeleteApplicationInputProcessingConfiguration operation returned by the service. - `com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationResult`

  throws: com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationResult [^AmazonKinesisAnalyticsV2 this ^com.amazonaws.services.kinesisanalyticsv2.model.DeleteApplicationInputProcessingConfigurationRequest delete-application-input-processing-configuration-request]
    (-> this (.deleteApplicationInputProcessingConfiguration delete-application-input-processing-configuration-request))))


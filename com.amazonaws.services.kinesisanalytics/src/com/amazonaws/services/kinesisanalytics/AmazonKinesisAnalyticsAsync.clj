(ns com.amazonaws.services.kinesisanalytics.AmazonKinesisAnalyticsAsync
  "Interface for accessing Kinesis Analytics asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonKinesisAnalyticsAsync instead.


  Amazon Kinesis Analytics

  Overview



  This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL applications.
  Version 2 of the API supports SQL and Java applications. For more information about version 2, see Amazon Kinesis Data Analytics API V2 Documentation.



  This is the Amazon Kinesis Analytics v1 API Reference. The Amazon Kinesis Analytics Developer Guide provides
  additional information."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisanalytics AmazonKinesisAnalyticsAsync]))

(defn untag-resource-async
  "Removes one or more tags from a Kinesis Analytics application.

  untag-resource-request - `com.amazonaws.services.kinesisanalytics.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn add-application-input-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Adds a streaming source to your Amazon Kinesis application. For conceptual information, see Configuring Application
   Input.


   You can add a streaming source either when you create an application or you can use this operation to add a
   streaming source after you create an application. For more information, see CreateApplication.


   Any configuration update, including adding a streaming source using this operation, results in a new version of
   the application. You can use the DescribeApplication operation to find the current application version.


   This operation requires permissions to perform the kinesisanalytics:AddApplicationInput action.

  add-application-input-request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.AddApplicationInputResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest add-application-input-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationInputAsync add-application-input-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest add-application-input-request]
    (-> this (.addApplicationInputAsync add-application-input-request))))

(defn update-application-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Updates an existing Amazon Kinesis Analytics application. Using this API, you can update application code, input
   configuration, and output configuration.


   Note that Amazon Kinesis Analytics updates the CurrentApplicationVersionId each time you update your
   application.


   This operation requires permission for the kinesisanalytics:UpdateApplication action.

  update-application-request - `com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest update-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync update-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest update-application-request]
    (-> this (.updateApplicationAsync update-application-request))))

(defn start-application-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Starts the specified Amazon Kinesis Analytics application. After creating an application, you must exclusively
   call this operation to start your application.


   After the application starts, it begins consuming the input data, processes it, and writes the output to the
   configured destination.


   The application status must be READY for you to start an application. You can get the application
   status in the console or using the DescribeApplication operation.


   After you start the application, you can stop the application from processing the input by calling the StopApplication
   operation.


   This operation requires permissions to perform the kinesisanalytics:StartApplication action.

  start-application-request - `com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.StartApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest start-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startApplicationAsync start-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest start-application-request]
    (-> this (.startApplicationAsync start-application-request))))

(defn stop-application-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Stops the application from processing input data. You can stop an application only if it is in the running state.
   You can use the DescribeApplication
    operation to find the application state. After the application is stopped, Amazon Kinesis Analytics stops
   reading data from the input, the application stops processing data, and there is no output written to the
   destination.


   This operation requires permissions to perform the kinesisanalytics:StopApplication action.

  stop-application-request - `com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.StopApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest stop-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopApplicationAsync stop-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest stop-application-request]
    (-> this (.stopApplicationAsync stop-application-request))))

(defn list-applications-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Returns a list of Amazon Kinesis Analytics applications in your account. For each application, the response
   includes the application name, Amazon Resource Name (ARN), and status. If the response returns the
   HasMoreApplications value as true, you can send another request by adding the
   ExclusiveStartApplicationName in the request body, and set the value of this to the last application
   name from the previous response.


   If you want detailed information about a specific application, use DescribeApplication.


   This operation requires permissions to perform the kinesisanalytics:ListApplications action.

  list-applications-request - `com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.ListApplicationsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest list-applications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationsAsync list-applications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest list-applications-request]
    (-> this (.listApplicationsAsync list-applications-request))))

(defn add-application-cloud-watch-logging-option-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Adds a CloudWatch log stream to monitor application configuration errors. For more information about using
   CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon
   CloudWatch Logs.

  add-application-cloud-watch-logging-option-request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationCloudWatchLoggingOption operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest add-application-cloud-watch-logging-option-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationCloudWatchLoggingOptionAsync add-application-cloud-watch-logging-option-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest add-application-cloud-watch-logging-option-request]
    (-> this (.addApplicationCloudWatchLoggingOptionAsync add-application-cloud-watch-logging-option-request))))

(defn create-application-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Creates an Amazon Kinesis Analytics application. You can configure each application with one streaming source as
   input, application code to process the input, and up to three destinations where you want Amazon Kinesis
   Analytics to write the output data from your application. For an overview, see How it Works.


   In the input configuration, you map the streaming source to an in-application stream, which you can think of as a
   constantly updating table. In the mapping, you must provide a schema for the in-application stream and map each
   data column in the in-application stream to a data element in the streaming source.


   Your application code is one or more SQL statements that read input data, transform it, and generate output. Your
   application code can create one or more SQL artifacts like SQL streams or pumps.


   In the output configuration, you can configure the application to write data from in-application streams created
   in your applications to up to three destinations.


   To read data from your source stream or write data to destination streams, Amazon Kinesis Analytics needs your
   permissions. You grant these permissions by creating IAM roles. This operation requires permissions to perform
   the kinesisanalytics:CreateApplication action.


   For introductory exercises to create an Amazon Kinesis Analytics application, see Getting Started.

  create-application-request - TBD - `com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest create-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync create-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest create-application-request]
    (-> this (.createApplicationAsync create-application-request))))

(defn delete-application-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Deletes the specified application. Amazon Kinesis Analytics halts application execution and deletes the
   application, including any application artifacts (such as in-application streams, reference table, and
   application code).


   This operation requires permissions to perform the kinesisanalytics:DeleteApplication action.

  delete-application-request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest delete-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync delete-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest delete-application-request]
    (-> this (.deleteApplicationAsync delete-application-request))))

(defn describe-application-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Returns information about a specific Amazon Kinesis Analytics application.


   If you want to retrieve a list of all applications in your account, use the ListApplications
   operation.


   This operation requires permissions to perform the kinesisanalytics:DescribeApplication action. You
   can use DescribeApplication to get the current application versionId, which you need to call other
   operations such as Update.

  describe-application-request - `com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DescribeApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest describe-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationAsync describe-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest describe-application-request]
    (-> this (.describeApplicationAsync describe-application-request))))

(defn discover-input-schema-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Infers a schema by evaluating sample records on the specified streaming source (Amazon Kinesis stream or Amazon
   Kinesis Firehose delivery stream) or S3 object. In the response, the operation returns the inferred schema and
   also the sample records that the operation used to infer the schema.


   You can use the inferred schema when configuring a streaming source for your application. For conceptual
   information, see Configuring Application
   Input. Note that when you create an application using the Amazon Kinesis Analytics console, the console uses
   this operation to infer a schema and show it in the console user interface.


   This operation requires permissions to perform the kinesisanalytics:DiscoverInputSchema action.

  discover-input-schema-request - `com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DiscoverInputSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest discover-input-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.discoverInputSchemaAsync discover-input-schema-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest discover-input-schema-request]
    (-> this (.discoverInputSchemaAsync discover-input-schema-request))))

(defn delete-application-input-processing-configuration-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Deletes an InputProcessingConfiguration from an input.

  delete-application-input-processing-configuration-request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationInputProcessingConfiguration operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest delete-application-input-processing-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationInputProcessingConfigurationAsync delete-application-input-processing-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest delete-application-input-processing-configuration-request]
    (-> this (.deleteApplicationInputProcessingConfigurationAsync delete-application-input-processing-configuration-request))))

(defn delete-application-cloud-watch-logging-option-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Deletes a CloudWatch log stream from an application. For more information about using CloudWatch log streams with
   Amazon Kinesis Analytics applications, see Working with Amazon
   CloudWatch Logs.

  delete-application-cloud-watch-logging-option-request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationCloudWatchLoggingOption operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest delete-application-cloud-watch-logging-option-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationCloudWatchLoggingOptionAsync delete-application-cloud-watch-logging-option-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest delete-application-cloud-watch-logging-option-request]
    (-> this (.deleteApplicationCloudWatchLoggingOptionAsync delete-application-cloud-watch-logging-option-request))))

(defn add-application-reference-data-source-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Adds a reference data source to an existing application.


   Amazon Kinesis Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table
   within your application. In the request, you provide the source (S3 bucket name and object key name), name of the
   in-application table to create, and the necessary mapping information that describes how data in Amazon S3 object
   maps to columns in the resulting in-application table.


   For conceptual information, see Configuring Application
   Input. For the limits on data sources you can add to your application, see Limits.


   This operation requires permissions to perform the kinesisanalytics:AddApplicationOutput action.

  add-application-reference-data-source-request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationReferenceDataSource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest add-application-reference-data-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationReferenceDataSourceAsync add-application-reference-data-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest add-application-reference-data-source-request]
    (-> this (.addApplicationReferenceDataSourceAsync add-application-reference-data-source-request))))

(defn delete-application-output-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Deletes output destination configuration from your application configuration. Amazon Kinesis Analytics will no
   longer write data from the corresponding in-application stream to the external output destination.


   This operation requires permissions to perform the kinesisanalytics:DeleteApplicationOutput action.

  delete-application-output-request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest delete-application-output-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationOutputAsync delete-application-output-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest delete-application-output-request]
    (-> this (.deleteApplicationOutputAsync delete-application-output-request))))

(defn add-application-output-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Adds an external destination to your Amazon Kinesis Analytics application.


   If you want Amazon Kinesis Analytics to deliver data from an in-application stream within your application to an
   external destination (such as an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS
   Lambda function), you add the relevant configuration to your application using this operation. You can configure
   one or more outputs for your application. Each output configuration maps an in-application stream and an external
   destination.


   You can use one of the output configurations to deliver data from your in-application error stream to an external
   destination so that you can analyze the errors. For more information, see Understanding Application
   Output (Destination).


   Any configuration update, including adding a streaming source using this operation, results in a new version of
   the application. You can use the DescribeApplication operation to find the current application version.


   For the limits on the number of application inputs and outputs you can configure, see Limits.


   This operation requires permissions to perform the kinesisanalytics:AddApplicationOutput action.

  add-application-output-request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest add-application-output-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationOutputAsync add-application-output-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest add-application-output-request]
    (-> this (.addApplicationOutputAsync add-application-output-request))))

(defn list-tags-for-resource-async
  "Retrieves the list of key-value tags assigned to the application.

  list-tags-for-resource-request - `com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn delete-application-reference-data-source-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Deletes a reference data source configuration from the specified application configuration.


   If the application is running, Amazon Kinesis Analytics immediately removes the in-application table that you
   created using the AddApplicationReferenceDataSource operation.


   This operation requires permissions to perform the
   kinesisanalytics.DeleteApplicationReferenceDataSource action.

  delete-application-reference-data-source-request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationReferenceDataSource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest delete-application-reference-data-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationReferenceDataSourceAsync delete-application-reference-data-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest delete-application-reference-data-source-request]
    (-> this (.deleteApplicationReferenceDataSourceAsync delete-application-reference-data-source-request))))

(defn tag-resource-async
  "Adds one or more key-value tags to a Kinesis Analytics application. Note that the maximum number of application
   tags includes system tags. The maximum number of user-defined application tags is 50.

  tag-resource-request - `com.amazonaws.services.kinesisanalytics.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn add-application-input-processing-configuration-async
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Adds an
   InputProcessingConfiguration to an application. An input processor preprocesses records on the input stream
   before the application's SQL code executes. Currently, the only input processor available is AWS Lambda.

  add-application-input-processing-configuration-request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddApplicationInputProcessingConfiguration operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest add-application-input-processing-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addApplicationInputProcessingConfigurationAsync add-application-input-processing-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAnalyticsAsync this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest add-application-input-processing-configuration-request]
    (-> this (.addApplicationInputProcessingConfigurationAsync add-application-input-processing-configuration-request))))


(ns com.amazonaws.services.kinesisanalytics.AmazonKinesisAnalyticsClient
  "Client for accessing Kinesis Analytics. All service calls made using this client are blocking, and will not return
  until the service call completes.

  Amazon Kinesis Analytics

  Overview



  This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL applications.
  Version 2 of the API supports SQL and Java applications. For more information about version 2, see Amazon Kinesis Data Analytics API V2 Documentation.



  This is the Amazon Kinesis Analytics v1 API Reference. The Amazon Kinesis Analytics Developer Guide provides
  additional information."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisanalytics AmazonKinesisAnalyticsClient]))

(defn ->amazon-kinesis-analytics-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Kinesis Analytics (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonKinesisAnalyticsClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonKinesisAnalyticsClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonKinesisAnalyticsClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonKinesisAnalyticsClient aws-credentials client-configuration))
  (^AmazonKinesisAnalyticsClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonKinesisAnalyticsClient client-configuration))
  (^AmazonKinesisAnalyticsClient []
    (new AmazonKinesisAnalyticsClient )))

(defn *builder
  "returns: `com.amazonaws.services.kinesisanalytics.AmazonKinesisAnalyticsClientBuilder`"
  (^com.amazonaws.services.kinesisanalytics.AmazonKinesisAnalyticsClientBuilder []
    (AmazonKinesisAnalyticsClient/builder )))

(defn stop-application
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Stops the application from processing input data. You can stop an application only if it is in the running state.
   You can use the DescribeApplication
    operation to find the application state. After the application is stopped, Amazon Kinesis Analytics stops
   reading data from the input, the application stops processing data, and there is no output written to the
   destination.


   This operation requires permissions to perform the kinesisanalytics:StopApplication action.

  request - `com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest`

  returns: Result of the StopApplication operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.StopApplicationResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.StopApplicationResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest request]
    (-> this (.stopApplication request))))

(defn list-tags-for-resource
  "Retrieves the list of key-value tags assigned to the application.

  request - `com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-application
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Returns information about a specific Amazon Kinesis Analytics application.


   If you want to retrieve a list of all applications in your account, use the ListApplications
   operation.


   This operation requires permissions to perform the kinesisanalytics:DescribeApplication action. You
   can use DescribeApplication to get the current application versionId, which you need to call other
   operations such as Update.

  request - `com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest`

  returns: Result of the DescribeApplication operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DescribeApplicationResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.DescribeApplicationResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest request]
    (-> this (.describeApplication request))))

(defn untag-resource
  "Removes one or more tags from a Kinesis Analytics application.

  request - `com.amazonaws.services.kinesisanalytics.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.UntagResourceResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.UntagResourceResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn delete-application-output
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Deletes output destination configuration from your application configuration. Amazon Kinesis Analytics will no
   longer write data from the corresponding in-application stream to the external output destination.


   This operation requires permissions to perform the kinesisanalytics:DeleteApplicationOutput action.

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest`

  returns: Result of the DeleteApplicationOutput operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest request]
    (-> this (.deleteApplicationOutput request))))

(defn add-application-input
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

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest`

  returns: Result of the AddApplicationInput operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.AddApplicationInputResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest request]
    (-> this (.addApplicationInput request))))

(defn delete-application
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Deletes the specified application. Amazon Kinesis Analytics halts application execution and deletes the
   application, including any application artifacts (such as in-application streams, reference table, and
   application code).


   This operation requires permissions to perform the kinesisanalytics:DeleteApplication action.

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ConcurrentModificationException - Exception thrown as a result of concurrent modification to an application. For example, two individuals attempting to edit the same application at the same time."
  (^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest request]
    (-> this (.deleteApplication request))))

(defn list-applications
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

  request - `com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest`

  returns: Result of the ListApplications operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.ListApplicationsResult`"
  (^com.amazonaws.services.kinesisanalytics.model.ListApplicationsResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest request]
    (-> this (.listApplications request))))

(defn discover-input-schema
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

  request - `com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest`

  returns: Result of the DiscoverInputSchema operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaResult`

  throws: com.amazonaws.services.kinesisanalytics.model.InvalidArgumentException - Specified input parameter value is invalid."
  (^com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest request]
    (-> this (.discoverInputSchema request))))

(defn delete-application-reference-data-source
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Deletes a reference data source configuration from the specified application configuration.


   If the application is running, Amazon Kinesis Analytics immediately removes the in-application table that you
   created using the AddApplicationReferenceDataSource operation.


   This operation requires permissions to perform the
   kinesisanalytics.DeleteApplicationReferenceDataSource action.

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest`

  returns: Result of the DeleteApplicationReferenceDataSource operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest request]
    (-> this (.deleteApplicationReferenceDataSource request))))

(defn update-application
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Updates an existing Amazon Kinesis Analytics application. Using this API, you can update application code, input
   configuration, and output configuration.


   Note that Amazon Kinesis Analytics updates the CurrentApplicationVersionId each time you update your
   application.


   This operation requires permission for the kinesisanalytics:UpdateApplication action.

  request - `com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.UpdateApplicationResult`

  throws: com.amazonaws.services.kinesisanalytics.model.CodeValidationException - User-provided application code (query) is invalid. This can be a simple syntax error."
  (^com.amazonaws.services.kinesisanalytics.model.UpdateApplicationResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest request]
    (-> this (.updateApplication request))))

(defn add-application-output
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

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest`

  returns: Result of the AddApplicationOutput operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest request]
    (-> this (.addApplicationOutput request))))

(defn add-application-input-processing-configuration
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Adds an
   InputProcessingConfiguration to an application. An input processor preprocesses records on the input stream
   before the application's SQL code executes. Currently, the only input processor available is AWS Lambda.

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest`

  returns: Result of the AddApplicationInputProcessingConfiguration operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest request]
    (-> this (.addApplicationInputProcessingConfiguration request))))

(defn start-application
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

  request - `com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest`

  returns: Result of the StartApplication operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.StartApplicationResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.StartApplicationResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest request]
    (-> this (.startApplication request))))

(defn create-application
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

  request - `com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.CreateApplicationResult`

  throws: com.amazonaws.services.kinesisanalytics.model.CodeValidationException - User-provided application code (query) is invalid. This can be a simple syntax error."
  (^com.amazonaws.services.kinesisanalytics.model.CreateApplicationResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn delete-application-cloud-watch-logging-option
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Deletes a CloudWatch log stream from an application. For more information about using CloudWatch log streams with
   Amazon Kinesis Analytics applications, see Working with Amazon
   CloudWatch Logs.

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest`

  returns: Result of the DeleteApplicationCloudWatchLoggingOption operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest request]
    (-> this (.deleteApplicationCloudWatchLoggingOption request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonKinesisAnalyticsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn add-application-reference-data-source
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

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest`

  returns: Result of the AddApplicationReferenceDataSource operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest request]
    (-> this (.addApplicationReferenceDataSource request))))

(defn add-application-cloud-watch-logging-option
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Adds a CloudWatch log stream to monitor application configuration errors. For more information about using
   CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon
   CloudWatch Logs.

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest`

  returns: Result of the AddApplicationCloudWatchLoggingOption operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest request]
    (-> this (.addApplicationCloudWatchLoggingOption request))))

(defn tag-resource
  "Adds one or more key-value tags to a Kinesis Analytics application. Note that the maximum number of application
   tags includes system tags. The maximum number of user-defined application tags is 50.

  request - `com.amazonaws.services.kinesisanalytics.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.TagResourceResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.TagResourceResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-application-input-processing-configuration
  "This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL
   applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see
   Amazon Kinesis Data Analytics API V2 Documentation.



   Deletes an InputProcessingConfiguration from an input.

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest`

  returns: Result of the DeleteApplicationInputProcessingConfiguration operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationResult`

  throws: com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException - Specified application can't be found."
  (^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationResult [^AmazonKinesisAnalyticsClient this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest request]
    (-> this (.deleteApplicationInputProcessingConfiguration request))))


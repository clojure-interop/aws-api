(ns com.amazonaws.services.importexport.AmazonImportExportAsyncClient
  "Client for accessing AWS Import/Export asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS Import/Export Service AWS Import/Export accelerates transferring large amounts of data
  between the AWS cloud and portable storage devices that you mail to us. AWS Import/Export transfers data directly
  onto and off of your storage devices using Amazon's high-speed internal network and bypassing the Internet. For large
  data sets, AWS Import/Export is often faster than Internet transfer and more cost effective than upgrading your
  connectivity."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.importexport AmazonImportExportAsyncClient]))

(defn ->amazon-import-export-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonImportExportAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonImportExportAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonImportExportAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonImportExportAsyncClient aws-credentials executor-service))
  (^AmazonImportExportAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonImportExportAsyncClient client-configuration))
  (^AmazonImportExportAsyncClient []
    (new AmazonImportExportAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.importexport.AmazonImportExportAsyncClientBuilder`"
  (^com.amazonaws.services.importexport.AmazonImportExportAsyncClientBuilder []
    (AmazonImportExportAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonImportExportAsyncClient this]
    (-> this (.getExecutorService))))

(defn cancel-job-async
  "Description copied from interface: AmazonImportExportAsync

  request - Input structure for the CancelJob operation. - `com.amazonaws.services.importexport.model.CancelJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this ^com.amazonaws.services.importexport.model.CancelJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this ^com.amazonaws.services.importexport.model.CancelJobRequest request]
    (-> this (.cancelJobAsync request))))

(defn create-job-async
  "Description copied from interface: AmazonImportExportAsync

  request - Input structure for the CreateJob operation. - `com.amazonaws.services.importexport.model.CreateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this ^com.amazonaws.services.importexport.model.CreateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this ^com.amazonaws.services.importexport.model.CreateJobRequest request]
    (-> this (.createJobAsync request))))

(defn get-shipping-label-async
  "Description copied from interface: AmazonImportExportAsync

  request - `com.amazonaws.services.importexport.model.GetShippingLabelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetShippingLabel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.GetShippingLabelResult>`"
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this ^com.amazonaws.services.importexport.model.GetShippingLabelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getShippingLabelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this ^com.amazonaws.services.importexport.model.GetShippingLabelRequest request]
    (-> this (.getShippingLabelAsync request))))

(defn get-status-async
  "Description copied from interface: AmazonImportExportAsync

  request - Input structure for the GetStatus operation. - `com.amazonaws.services.importexport.model.GetStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.GetStatusResult>`"
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this ^com.amazonaws.services.importexport.model.GetStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this ^com.amazonaws.services.importexport.model.GetStatusRequest request]
    (-> this (.getStatusAsync request))))

(defn list-jobs-async
  "Description copied from interface: AmazonImportExportAsync

  request - Input structure for the ListJobs operation. - `com.amazonaws.services.importexport.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this ^com.amazonaws.services.importexport.model.ListJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this ^com.amazonaws.services.importexport.model.ListJobsRequest request]
    (-> this (.listJobsAsync request)))
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this]
    (-> this (.listJobsAsync))))

(defn update-job-async
  "Description copied from interface: AmazonImportExportAsync

  request - Input structure for the UpateJob operation. - `com.amazonaws.services.importexport.model.UpdateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.UpdateJobResult>`"
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this ^com.amazonaws.services.importexport.model.UpdateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonImportExportAsyncClient this ^com.amazonaws.services.importexport.model.UpdateJobRequest request]
    (-> this (.updateJobAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonImportExportAsyncClient this]
    (-> this (.shutdown))))


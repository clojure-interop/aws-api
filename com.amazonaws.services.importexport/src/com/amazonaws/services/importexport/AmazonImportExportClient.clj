(ns com.amazonaws.services.importexport.AmazonImportExportClient
  "Client for accessing AWS Import/Export. All service calls made using this client are blocking, and will not return
  until the service call completes.

  AWS Import/Export Service AWS Import/Export accelerates transferring large amounts of data
  between the AWS cloud and portable storage devices that you mail to us. AWS Import/Export transfers data directly
  onto and off of your storage devices using Amazon's high-speed internal network and bypassing the Internet. For large
  data sets, AWS Import/Export is often faster than Internet transfer and more cost effective than upgrading your
  connectivity."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.importexport AmazonImportExportClient]))

(defn ->amazon-import-export-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS Import/Export (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonImportExportClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonImportExportClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonImportExportClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonImportExportClient aws-credentials client-configuration))
  (^AmazonImportExportClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonImportExportClient client-configuration))
  (^AmazonImportExportClient []
    (new AmazonImportExportClient )))

(defn *builder
  "returns: `com.amazonaws.services.importexport.AmazonImportExportClientBuilder`"
  (^com.amazonaws.services.importexport.AmazonImportExportClientBuilder []
    (AmazonImportExportClient/builder )))

(defn cancel-job
  "This operation cancels a specified job. Only the job owner can cancel it. The operation fails if the job has
   already started or is complete.

  request - `com.amazonaws.services.importexport.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.importexport.model.CancelJobResult`

  throws: com.amazonaws.services.importexport.model.InvalidJobIdException - The JOBID was missing, not found, or not associated with the AWS account."
  (^com.amazonaws.services.importexport.model.CancelJobResult [^AmazonImportExportClient this ^com.amazonaws.services.importexport.model.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn create-job
  "This operation initiates the process of scheduling an upload or download of your data. You include in the request
   a manifest that describes the data transfer specifics. The response to the request includes a job ID, which you
   can use in other operations, a signature that you use to identify your storage device, and the address where you
   should ship your storage device.

  request - `com.amazonaws.services.importexport.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.importexport.model.CreateJobResult`

  throws: com.amazonaws.services.importexport.model.CreateJobQuotaExceededException - Each account can create only a certain number of jobs per day. If you need to create more than this, please contact awsimportexport@amazon.com to explain your particular use case."
  (^com.amazonaws.services.importexport.model.CreateJobResult [^AmazonImportExportClient this ^com.amazonaws.services.importexport.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn get-shipping-label
  "This operation generates a pre-paid UPS shipping label that you will use to ship your device to AWS for
   processing.

  request - `com.amazonaws.services.importexport.model.GetShippingLabelRequest`

  returns: Result of the GetShippingLabel operation returned by the service. - `com.amazonaws.services.importexport.model.GetShippingLabelResult`

  throws: com.amazonaws.services.importexport.model.InvalidJobIdException - The JOBID was missing, not found, or not associated with the AWS account."
  (^com.amazonaws.services.importexport.model.GetShippingLabelResult [^AmazonImportExportClient this ^com.amazonaws.services.importexport.model.GetShippingLabelRequest request]
    (-> this (.getShippingLabel request))))

(defn get-status
  "This operation returns information about a job, including where the job is in the processing pipeline, the status
   of the results, and the signature value associated with the job. You can only return information about jobs you
   own.

  request - `com.amazonaws.services.importexport.model.GetStatusRequest`

  returns: Result of the GetStatus operation returned by the service. - `com.amazonaws.services.importexport.model.GetStatusResult`

  throws: com.amazonaws.services.importexport.model.InvalidJobIdException - The JOBID was missing, not found, or not associated with the AWS account."
  (^com.amazonaws.services.importexport.model.GetStatusResult [^AmazonImportExportClient this ^com.amazonaws.services.importexport.model.GetStatusRequest request]
    (-> this (.getStatus request))))

(defn list-jobs
  "This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse
   chronological order based on the date of creation. For example if Job Test1 was created 2009Dec30 and Test2 was
   created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.

  request - `com.amazonaws.services.importexport.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.importexport.model.ListJobsResult`

  throws: com.amazonaws.services.importexport.model.InvalidParameterException - One or more parameters had an invalid value."
  (^com.amazonaws.services.importexport.model.ListJobsResult [^AmazonImportExportClient this ^com.amazonaws.services.importexport.model.ListJobsRequest request]
    (-> this (.listJobs request)))
  (^com.amazonaws.services.importexport.model.ListJobsResult [^AmazonImportExportClient this]
    (-> this (.listJobs))))

(defn update-job
  "You use this operation to change the parameters specified in the original manifest file by supplying a new
   manifest file. The manifest file attached to this request replaces the original manifest file. You can only use
   the operation after a CreateJob request but before the data transfer starts and you can only use it on jobs you
   own.

  request - `com.amazonaws.services.importexport.model.UpdateJobRequest`

  returns: Result of the UpdateJob operation returned by the service. - `com.amazonaws.services.importexport.model.UpdateJobResult`

  throws: com.amazonaws.services.importexport.model.InvalidFileSystemException - File system specified in export manifest is invalid."
  (^com.amazonaws.services.importexport.model.UpdateJobResult [^AmazonImportExportClient this ^com.amazonaws.services.importexport.model.UpdateJobRequest request]
    (-> this (.updateJob request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonImportExportClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))


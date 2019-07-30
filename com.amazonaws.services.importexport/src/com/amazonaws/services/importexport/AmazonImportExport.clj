(ns com.amazonaws.services.importexport.AmazonImportExport
  "Interface for accessing AWS Import/Export.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonImportExport instead.


  AWS Import/Export Service AWS Import/Export accelerates transferring large amounts of data
  between the AWS cloud and portable storage devices that you mail to us. AWS Import/Export transfers data directly
  onto and off of your storage devices using Amazon's high-speed internal network and bypassing the Internet. For large
  data sets, AWS Import/Export is often faster than Internet transfer and more cost effective than upgrading your
  connectivity."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.importexport AmazonImportExport]))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonImportExport this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-status
  "This operation returns information about a job, including where the job is in the processing pipeline, the status
   of the results, and the signature value associated with the job. You can only return information about jobs you
   own.

  get-status-request - Input structure for the GetStatus operation. - `com.amazonaws.services.importexport.model.GetStatusRequest`

  returns: Result of the GetStatus operation returned by the service. - `com.amazonaws.services.importexport.model.GetStatusResult`

  throws: com.amazonaws.services.importexport.model.InvalidJobIdException - The JOBID was missing, not found, or not associated with the AWS account."
  (^com.amazonaws.services.importexport.model.GetStatusResult [^AmazonImportExport this ^com.amazonaws.services.importexport.model.GetStatusRequest get-status-request]
    (-> this (.getStatus get-status-request))))

(defn update-job
  "You use this operation to change the parameters specified in the original manifest file by supplying a new
   manifest file. The manifest file attached to this request replaces the original manifest file. You can only use
   the operation after a CreateJob request but before the data transfer starts and you can only use it on jobs you
   own.

  update-job-request - Input structure for the UpateJob operation. - `com.amazonaws.services.importexport.model.UpdateJobRequest`

  returns: Result of the UpdateJob operation returned by the service. - `com.amazonaws.services.importexport.model.UpdateJobResult`

  throws: com.amazonaws.services.importexport.model.InvalidFileSystemException - File system specified in export manifest is invalid."
  (^com.amazonaws.services.importexport.model.UpdateJobResult [^AmazonImportExport this ^com.amazonaws.services.importexport.model.UpdateJobRequest update-job-request]
    (-> this (.updateJob update-job-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonImportExport this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"importexport.amazonaws.com\") or a full URL, including the protocol (ex: \"https://importexport.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonImportExport this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn cancel-job
  "This operation cancels a specified job. Only the job owner can cancel it. The operation fails if the job has
   already started or is complete.

  cancel-job-request - Input structure for the CancelJob operation. - `com.amazonaws.services.importexport.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.importexport.model.CancelJobResult`

  throws: com.amazonaws.services.importexport.model.InvalidJobIdException - The JOBID was missing, not found, or not associated with the AWS account."
  (^com.amazonaws.services.importexport.model.CancelJobResult [^AmazonImportExport this ^com.amazonaws.services.importexport.model.CancelJobRequest cancel-job-request]
    (-> this (.cancelJob cancel-job-request))))

(defn list-jobs
  "This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse
   chronological order based on the date of creation. For example if Job Test1 was created 2009Dec30 and Test2 was
   created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.

  list-jobs-request - Input structure for the ListJobs operation. - `com.amazonaws.services.importexport.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.importexport.model.ListJobsResult`

  throws: com.amazonaws.services.importexport.model.InvalidParameterException - One or more parameters had an invalid value."
  (^com.amazonaws.services.importexport.model.ListJobsResult [^AmazonImportExport this ^com.amazonaws.services.importexport.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobs list-jobs-request)))
  (^com.amazonaws.services.importexport.model.ListJobsResult [^AmazonImportExport this]
    (-> this (.listJobs))))

(defn get-shipping-label
  "This operation generates a pre-paid UPS shipping label that you will use to ship your device to AWS for
   processing.

  get-shipping-label-request - `com.amazonaws.services.importexport.model.GetShippingLabelRequest`

  returns: Result of the GetShippingLabel operation returned by the service. - `com.amazonaws.services.importexport.model.GetShippingLabelResult`

  throws: com.amazonaws.services.importexport.model.InvalidJobIdException - The JOBID was missing, not found, or not associated with the AWS account."
  (^com.amazonaws.services.importexport.model.GetShippingLabelResult [^AmazonImportExport this ^com.amazonaws.services.importexport.model.GetShippingLabelRequest get-shipping-label-request]
    (-> this (.getShippingLabel get-shipping-label-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonImportExport this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job
  "This operation initiates the process of scheduling an upload or download of your data. You include in the request
   a manifest that describes the data transfer specifics. The response to the request includes a job ID, which you
   can use in other operations, a signature that you use to identify your storage device, and the address where you
   should ship your storage device.

  create-job-request - Input structure for the CreateJob operation. - `com.amazonaws.services.importexport.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.importexport.model.CreateJobResult`

  throws: com.amazonaws.services.importexport.model.CreateJobQuotaExceededException - Each account can create only a certain number of jobs per day. If you need to create more than this, please contact awsimportexport@amazon.com to explain your particular use case."
  (^com.amazonaws.services.importexport.model.CreateJobResult [^AmazonImportExport this ^com.amazonaws.services.importexport.model.CreateJobRequest create-job-request]
    (-> this (.createJob create-job-request))))


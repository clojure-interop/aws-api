(ns com.amazonaws.services.importexport.AmazonImportExportAsync
  "Interface for accessing AWS Import/Export asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonImportExportAsync instead.


  AWS Import/Export Service AWS Import/Export accelerates transferring large amounts of data
  between the AWS cloud and portable storage devices that you mail to us. AWS Import/Export transfers data directly
  onto and off of your storage devices using Amazon's high-speed internal network and bypassing the Internet. For large
  data sets, AWS Import/Export is often faster than Internet transfer and more cost effective than upgrading your
  connectivity."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.importexport AmazonImportExportAsync]))

(defn cancel-job-async
  "This operation cancels a specified job. Only the job owner can cancel it. The operation fails if the job has
   already started or is complete.

  cancel-job-request - Input structure for the CancelJob operation. - `com.amazonaws.services.importexport.model.CancelJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AmazonImportExportAsync this ^com.amazonaws.services.importexport.model.CancelJobRequest cancel-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync cancel-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonImportExportAsync this ^com.amazonaws.services.importexport.model.CancelJobRequest cancel-job-request]
    (-> this (.cancelJobAsync cancel-job-request))))

(defn create-job-async
  "This operation initiates the process of scheduling an upload or download of your data. You include in the request
   a manifest that describes the data transfer specifics. The response to the request includes a job ID, which you
   can use in other operations, a signature that you use to identify your storage device, and the address where you
   should ship your storage device.

  create-job-request - Input structure for the CreateJob operation. - `com.amazonaws.services.importexport.model.CreateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AmazonImportExportAsync this ^com.amazonaws.services.importexport.model.CreateJobRequest create-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync create-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonImportExportAsync this ^com.amazonaws.services.importexport.model.CreateJobRequest create-job-request]
    (-> this (.createJobAsync create-job-request))))

(defn get-shipping-label-async
  "This operation generates a pre-paid UPS shipping label that you will use to ship your device to AWS for
   processing.

  get-shipping-label-request - `com.amazonaws.services.importexport.model.GetShippingLabelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetShippingLabel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.GetShippingLabelResult>`"
  (^java.util.concurrent.Future [^AmazonImportExportAsync this ^com.amazonaws.services.importexport.model.GetShippingLabelRequest get-shipping-label-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getShippingLabelAsync get-shipping-label-request async-handler)))
  (^java.util.concurrent.Future [^AmazonImportExportAsync this ^com.amazonaws.services.importexport.model.GetShippingLabelRequest get-shipping-label-request]
    (-> this (.getShippingLabelAsync get-shipping-label-request))))

(defn get-status-async
  "This operation returns information about a job, including where the job is in the processing pipeline, the status
   of the results, and the signature value associated with the job. You can only return information about jobs you
   own.

  get-status-request - Input structure for the GetStatus operation. - `com.amazonaws.services.importexport.model.GetStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.GetStatusResult>`"
  (^java.util.concurrent.Future [^AmazonImportExportAsync this ^com.amazonaws.services.importexport.model.GetStatusRequest get-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStatusAsync get-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonImportExportAsync this ^com.amazonaws.services.importexport.model.GetStatusRequest get-status-request]
    (-> this (.getStatusAsync get-status-request))))

(defn list-jobs-async
  "This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse
   chronological order based on the date of creation. For example if Job Test1 was created 2009Dec30 and Test2 was
   created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.

  list-jobs-request - Input structure for the ListJobs operation. - `com.amazonaws.services.importexport.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AmazonImportExportAsync this ^com.amazonaws.services.importexport.model.ListJobsRequest list-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync list-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonImportExportAsync this ^com.amazonaws.services.importexport.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobsAsync list-jobs-request)))
  (^java.util.concurrent.Future [^AmazonImportExportAsync this]
    (-> this (.listJobsAsync))))

(defn update-job-async
  "You use this operation to change the parameters specified in the original manifest file by supplying a new
   manifest file. The manifest file attached to this request replaces the original manifest file. You can only use
   the operation after a CreateJob request but before the data transfer starts and you can only use it on jobs you
   own.

  update-job-request - Input structure for the UpateJob operation. - `com.amazonaws.services.importexport.model.UpdateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.UpdateJobResult>`"
  (^java.util.concurrent.Future [^AmazonImportExportAsync this ^com.amazonaws.services.importexport.model.UpdateJobRequest update-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobAsync update-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonImportExportAsync this ^com.amazonaws.services.importexport.model.UpdateJobRequest update-job-request]
    (-> this (.updateJobAsync update-job-request))))


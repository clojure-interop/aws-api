(ns com.amazonaws.services.importexport.AbstractAmazonImportExportAsync
  "Abstract implementation of AmazonImportExportAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.importexport AbstractAmazonImportExportAsync]))

(defn cancel-job-async
  "Description copied from interface: AmazonImportExportAsync

  request - Input structure for the CancelJob operation. - `com.amazonaws.services.importexport.model.CancelJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this ^com.amazonaws.services.importexport.model.CancelJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this ^com.amazonaws.services.importexport.model.CancelJobRequest request]
    (-> this (.cancelJobAsync request))))

(defn create-job-async
  "Description copied from interface: AmazonImportExportAsync

  request - Input structure for the CreateJob operation. - `com.amazonaws.services.importexport.model.CreateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this ^com.amazonaws.services.importexport.model.CreateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this ^com.amazonaws.services.importexport.model.CreateJobRequest request]
    (-> this (.createJobAsync request))))

(defn get-shipping-label-async
  "Description copied from interface: AmazonImportExportAsync

  request - `com.amazonaws.services.importexport.model.GetShippingLabelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetShippingLabel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.GetShippingLabelResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this ^com.amazonaws.services.importexport.model.GetShippingLabelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getShippingLabelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this ^com.amazonaws.services.importexport.model.GetShippingLabelRequest request]
    (-> this (.getShippingLabelAsync request))))

(defn get-status-async
  "Description copied from interface: AmazonImportExportAsync

  request - Input structure for the GetStatus operation. - `com.amazonaws.services.importexport.model.GetStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.GetStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this ^com.amazonaws.services.importexport.model.GetStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this ^com.amazonaws.services.importexport.model.GetStatusRequest request]
    (-> this (.getStatusAsync request))))

(defn list-jobs-async
  "Description copied from interface: AmazonImportExportAsync

  request - Input structure for the ListJobs operation. - `com.amazonaws.services.importexport.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this ^com.amazonaws.services.importexport.model.ListJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this ^com.amazonaws.services.importexport.model.ListJobsRequest request]
    (-> this (.listJobsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this]
    (-> this (.listJobsAsync))))

(defn update-job-async
  "Description copied from interface: AmazonImportExportAsync

  request - Input structure for the UpateJob operation. - `com.amazonaws.services.importexport.model.UpdateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.importexport.model.UpdateJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this ^com.amazonaws.services.importexport.model.UpdateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonImportExportAsync this ^com.amazonaws.services.importexport.model.UpdateJobRequest request]
    (-> this (.updateJobAsync request))))


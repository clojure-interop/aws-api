(ns com.amazonaws.services.mediaconvert.AbstractAWSMediaConvertAsync
  "Abstract implementation of AWSMediaConvertAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediaconvert AbstractAWSMediaConvertAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn list-job-templates-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobTemplatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest request]
    (-> this (.listJobTemplatesAsync request))))

(defn delete-job-template-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJobTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest request]
    (-> this (.deleteJobTemplateAsync request))))

(defn create-job-template-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJobTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest request]
    (-> this (.createJobTemplateAsync request))))

(defn create-preset-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.CreatePresetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.CreatePresetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreatePresetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPresetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreatePresetRequest request]
    (-> this (.createPresetAsync request))))

(defn list-jobs-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.ListJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListJobsRequest request]
    (-> this (.listJobsAsync request))))

(defn delete-preset-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.DeletePresetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.DeletePresetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DeletePresetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePresetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DeletePresetRequest request]
    (-> this (.deletePresetAsync request))))

(defn update-job-template-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJobTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest request]
    (-> this (.updateJobTemplateAsync request))))

(defn update-preset-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.UpdatePresetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.UpdatePresetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UpdatePresetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePresetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UpdatePresetRequest request]
    (-> this (.updatePresetAsync request))))

(defn list-presets-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.ListPresetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPresets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.ListPresetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListPresetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPresetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListPresetsRequest request]
    (-> this (.listPresetsAsync request))))

(defn update-queue-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.UpdateQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.UpdateQueueResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UpdateQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UpdateQueueRequest request]
    (-> this (.updateQueueAsync request))))

(defn create-queue-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.CreateQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.CreateQueueResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreateQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreateQueueRequest request]
    (-> this (.createQueueAsync request))))

(defn describe-endpoints-async
  "Description copied from interface: AWSMediaConvertAsync

  request - DescribeEndpointsRequest - `com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest request]
    (-> this (.describeEndpointsAsync request))))

(defn associate-certificate-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.AssociateCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.AssociateCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.AssociateCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.AssociateCertificateRequest request]
    (-> this (.associateCertificateAsync request))))

(defn cancel-job-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.CancelJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CancelJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CancelJobRequest request]
    (-> this (.cancelJobAsync request))))

(defn get-job-template-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.GetJobTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest request]
    (-> this (.getJobTemplateAsync request))))

(defn create-job-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.CreateJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreateJobRequest request]
    (-> this (.createJobAsync request))))

(defn disassociate-certificate-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.DisassociateCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.DisassociateCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DisassociateCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DisassociateCertificateRequest request]
    (-> this (.disassociateCertificateAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn get-preset-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.GetPresetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.GetPresetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetPresetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPresetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetPresetRequest request]
    (-> this (.getPresetAsync request))))

(defn list-queues-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.ListQueuesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListQueues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.ListQueuesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListQueuesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listQueuesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListQueuesRequest request]
    (-> this (.listQueuesAsync request))))

(defn delete-queue-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.DeleteQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.DeleteQueueResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DeleteQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DeleteQueueRequest request]
    (-> this (.deleteQueueAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn get-job-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.GetJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.GetJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetJobRequest request]
    (-> this (.getJobAsync request))))

(defn get-queue-async
  "Description copied from interface: AWSMediaConvertAsync

  request - `com.amazonaws.services.mediaconvert.model.GetQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.GetQueueResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetQueueRequest request]
    (-> this (.getQueueAsync request))))


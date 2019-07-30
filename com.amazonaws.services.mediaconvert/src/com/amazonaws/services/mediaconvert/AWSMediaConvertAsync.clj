(ns com.amazonaws.services.mediaconvert.AWSMediaConvertAsync
  "Interface for accessing MediaConvert asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaConvertAsync instead.


  AWS Elemental MediaConvert"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediaconvert AWSMediaConvertAsync]))

(defn untag-resource-async
  "Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide
   at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html

  untag-resource-request - `com.amazonaws.services.mediaconvert.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn list-job-templates-async
  "Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just
   a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array

  list-job-templates-request - `com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest list-job-templates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobTemplatesAsync list-job-templates-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest list-job-templates-request]
    (-> this (.listJobTemplatesAsync list-job-templates-request))))

(defn delete-job-template-async
  "Permanently delete a job template you have created.

  delete-job-template-request - `com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJobTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest delete-job-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobTemplateAsync delete-job-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest delete-job-template-request]
    (-> this (.deleteJobTemplateAsync delete-job-template-request))))

(defn create-job-template-async
  "Create a new job template. For information about job templates see the User Guide at
   http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

  create-job-template-request - `com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJobTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest create-job-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobTemplateAsync create-job-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest create-job-template-request]
    (-> this (.createJobTemplateAsync create-job-template-request))))

(defn create-preset-async
  "Create a new preset. For information about job templates see the User Guide at
   http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

  create-preset-request - `com.amazonaws.services.mediaconvert.model.CreatePresetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.CreatePresetResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreatePresetRequest create-preset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPresetAsync create-preset-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreatePresetRequest create-preset-request]
    (-> this (.createPresetAsync create-preset-request))))

(defn list-jobs-async
  "Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process,
   completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the
   twenty next most recent jobs, use the nextToken string returned with the array.

  list-jobs-request - `com.amazonaws.services.mediaconvert.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListJobsRequest list-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync list-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobsAsync list-jobs-request))))

(defn delete-preset-async
  "Permanently delete a preset you have created.

  delete-preset-request - `com.amazonaws.services.mediaconvert.model.DeletePresetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.DeletePresetResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DeletePresetRequest delete-preset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePresetAsync delete-preset-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DeletePresetRequest delete-preset-request]
    (-> this (.deletePresetAsync delete-preset-request))))

(defn update-job-template-async
  "Modify one of your existing job templates.

  update-job-template-request - `com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJobTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest update-job-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobTemplateAsync update-job-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest update-job-template-request]
    (-> this (.updateJobTemplateAsync update-job-template-request))))

(defn update-preset-async
  "Modify one of your existing presets.

  update-preset-request - `com.amazonaws.services.mediaconvert.model.UpdatePresetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.UpdatePresetResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UpdatePresetRequest update-preset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePresetAsync update-preset-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UpdatePresetRequest update-preset-request]
    (-> this (.updatePresetAsync update-preset-request))))

(defn list-presets-async
  "Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list
   of them. To retrieve the next twenty presets, use the nextToken string returned with the array.

  list-presets-request - `com.amazonaws.services.mediaconvert.model.ListPresetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPresets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.ListPresetsResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListPresetsRequest list-presets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPresetsAsync list-presets-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListPresetsRequest list-presets-request]
    (-> this (.listPresetsAsync list-presets-request))))

(defn update-queue-async
  "Modify one of your existing queues.

  update-queue-request - `com.amazonaws.services.mediaconvert.model.UpdateQueueRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.UpdateQueueResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UpdateQueueRequest update-queue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateQueueAsync update-queue-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.UpdateQueueRequest update-queue-request]
    (-> this (.updateQueueAsync update-queue-request))))

(defn create-queue-async
  "Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at
   https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html

  create-queue-request - `com.amazonaws.services.mediaconvert.model.CreateQueueRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.CreateQueueResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreateQueueRequest create-queue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createQueueAsync create-queue-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreateQueueRequest create-queue-request]
    (-> this (.createQueueAsync create-queue-request))))

(defn describe-endpoints-async
  "Send an request with an empty body to the regional API endpoint to get your account API endpoint.

  describe-endpoints-request - DescribeEndpointsRequest - `com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest describe-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointsAsync describe-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest describe-endpoints-request]
    (-> this (.describeEndpointsAsync describe-endpoints-request))))

(defn associate-certificate-async
  "Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.

  associate-certificate-request - `com.amazonaws.services.mediaconvert.model.AssociateCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.AssociateCertificateResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.AssociateCertificateRequest associate-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateCertificateAsync associate-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.AssociateCertificateRequest associate-certificate-request]
    (-> this (.associateCertificateAsync associate-certificate-request))))

(defn cancel-job-async
  "Permanently cancel a job. Once you have canceled a job, you can't start it again.

  cancel-job-request - `com.amazonaws.services.mediaconvert.model.CancelJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CancelJobRequest cancel-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync cancel-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CancelJobRequest cancel-job-request]
    (-> this (.cancelJobAsync cancel-job-request))))

(defn get-job-template-async
  "Retrieve the JSON for a specific job template.

  get-job-template-request - `com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.GetJobTemplateResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest get-job-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobTemplateAsync get-job-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest get-job-template-request]
    (-> this (.getJobTemplateAsync get-job-template-request))))

(defn create-job-async
  "Create a new transcoding job. For information about jobs and job settings, see the User Guide at
   http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

  create-job-request - `com.amazonaws.services.mediaconvert.model.CreateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreateJobRequest create-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync create-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.CreateJobRequest create-job-request]
    (-> this (.createJobAsync create-job-request))))

(defn disassociate-certificate-async
  "Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and
   an AWS Elemental MediaConvert resource.

  disassociate-certificate-request - `com.amazonaws.services.mediaconvert.model.DisassociateCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.DisassociateCertificateResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DisassociateCertificateRequest disassociate-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateCertificateAsync disassociate-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DisassociateCertificateRequest disassociate-certificate-request]
    (-> this (.disassociateCertificateAsync disassociate-certificate-request))))

(defn list-tags-for-resource-async
  "Retrieve the tags for a MediaConvert resource.

  list-tags-for-resource-request - `com.amazonaws.services.mediaconvert.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn get-preset-async
  "Retrieve the JSON for a specific preset.

  get-preset-request - `com.amazonaws.services.mediaconvert.model.GetPresetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.GetPresetResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetPresetRequest get-preset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPresetAsync get-preset-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetPresetRequest get-preset-request]
    (-> this (.getPresetAsync get-preset-request))))

(defn list-queues-async
  "Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of
   them. To retrieve the next twenty queues, use the nextToken string returned with the array.

  list-queues-request - `com.amazonaws.services.mediaconvert.model.ListQueuesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListQueues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.ListQueuesResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListQueuesRequest list-queues-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listQueuesAsync list-queues-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.ListQueuesRequest list-queues-request]
    (-> this (.listQueuesAsync list-queues-request))))

(defn delete-queue-async
  "Permanently delete a queue you have created.

  delete-queue-request - `com.amazonaws.services.mediaconvert.model.DeleteQueueRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.DeleteQueueResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DeleteQueueRequest delete-queue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteQueueAsync delete-queue-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.DeleteQueueRequest delete-queue-request]
    (-> this (.deleteQueueAsync delete-queue-request))))

(defn tag-resource-async
  "Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at
   https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html

  tag-resource-request - `com.amazonaws.services.mediaconvert.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn get-job-async
  "Retrieve the JSON for a specific completed transcoding job.

  get-job-request - `com.amazonaws.services.mediaconvert.model.GetJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.GetJobResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetJobRequest get-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobAsync get-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetJobRequest get-job-request]
    (-> this (.getJobAsync get-job-request))))

(defn get-queue-async
  "Retrieve the JSON for a specific queue.

  get-queue-request - `com.amazonaws.services.mediaconvert.model.GetQueueRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediaconvert.model.GetQueueResult>`"
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetQueueRequest get-queue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueueAsync get-queue-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaConvertAsync this ^com.amazonaws.services.mediaconvert.model.GetQueueRequest get-queue-request]
    (-> this (.getQueueAsync get-queue-request))))


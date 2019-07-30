(ns com.amazonaws.services.mediaconvert.AbstractAWSMediaConvert
  "Abstract implementation of AWSMediaConvert. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediaconvert AbstractAWSMediaConvert]))

(defn update-job-template
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest`

  returns: Result of the UpdateJobTemplate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult`"
  (^com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest request]
    (-> this (.updateJobTemplate request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.mediaconvert.model.ListTagsForResourceResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-job
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.GetJobRequest`

  returns: Result of the GetJob operation returned by the service. - `com.amazonaws.services.mediaconvert.model.GetJobResult`"
  (^com.amazonaws.services.mediaconvert.model.GetJobResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.GetJobRequest request]
    (-> this (.getJob request))))

(defn delete-job-template
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest`

  returns: Result of the DeleteJobTemplate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult`"
  (^com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest request]
    (-> this (.deleteJobTemplate request))))

(defn update-preset
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.UpdatePresetRequest`

  returns: Result of the UpdatePreset operation returned by the service. - `com.amazonaws.services.mediaconvert.model.UpdatePresetResult`"
  (^com.amazonaws.services.mediaconvert.model.UpdatePresetResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.UpdatePresetRequest request]
    (-> this (.updatePreset request))))

(defn list-queues
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.ListQueuesRequest`

  returns: Result of the ListQueues operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListQueuesResult`"
  (^com.amazonaws.services.mediaconvert.model.ListQueuesResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.ListQueuesRequest request]
    (-> this (.listQueues request))))

(defn untag-resource
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediaconvert.model.UntagResourceResult`"
  (^com.amazonaws.services.mediaconvert.model.UntagResourceResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-job-template
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest`

  returns: Result of the GetJobTemplate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.GetJobTemplateResult`"
  (^com.amazonaws.services.mediaconvert.model.GetJobTemplateResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest request]
    (-> this (.getJobTemplate request))))

(defn list-presets
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.ListPresetsRequest`

  returns: Result of the ListPresets operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListPresetsResult`"
  (^com.amazonaws.services.mediaconvert.model.ListPresetsResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.ListPresetsRequest request]
    (-> this (.listPresets request))))

(defn update-queue
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.UpdateQueueRequest`

  returns: Result of the UpdateQueue operation returned by the service. - `com.amazonaws.services.mediaconvert.model.UpdateQueueResult`"
  (^com.amazonaws.services.mediaconvert.model.UpdateQueueResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.UpdateQueueRequest request]
    (-> this (.updateQueue request))))

(defn associate-certificate
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.AssociateCertificateRequest`

  returns: Result of the AssociateCertificate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.AssociateCertificateResult`"
  (^com.amazonaws.services.mediaconvert.model.AssociateCertificateResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.AssociateCertificateRequest request]
    (-> this (.associateCertificate request))))

(defn create-queue
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.CreateQueueRequest`

  returns: Result of the CreateQueue operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CreateQueueResult`"
  (^com.amazonaws.services.mediaconvert.model.CreateQueueResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.CreateQueueRequest request]
    (-> this (.createQueue request))))

(defn shutdown
  "Description copied from interface: AWSMediaConvert"
  ([^AbstractAWSMediaConvert this]
    (-> this (.shutdown))))

(defn disassociate-certificate
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.DisassociateCertificateRequest`

  returns: Result of the DisassociateCertificate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DisassociateCertificateResult`"
  (^com.amazonaws.services.mediaconvert.model.DisassociateCertificateResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.DisassociateCertificateRequest request]
    (-> this (.disassociateCertificate request))))

(defn delete-queue
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.DeleteQueueRequest`

  returns: Result of the DeleteQueue operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DeleteQueueResult`"
  (^com.amazonaws.services.mediaconvert.model.DeleteQueueResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.DeleteQueueRequest request]
    (-> this (.deleteQueue request))))

(defn list-job-templates
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest`

  returns: Result of the ListJobTemplates operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult`"
  (^com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest request]
    (-> this (.listJobTemplates request))))

(defn cancel-job
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CancelJobResult`"
  (^com.amazonaws.services.mediaconvert.model.CancelJobResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn create-job-template
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest`

  returns: Result of the CreateJobTemplate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult`"
  (^com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest request]
    (-> this (.createJobTemplate request))))

(defn list-jobs
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListJobsResult`"
  (^com.amazonaws.services.mediaconvert.model.ListJobsResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn create-preset
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.CreatePresetRequest`

  returns: Result of the CreatePreset operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CreatePresetResult`"
  (^com.amazonaws.services.mediaconvert.model.CreatePresetResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.CreatePresetRequest request]
    (-> this (.createPreset request))))

(defn get-preset
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.GetPresetRequest`

  returns: Result of the GetPreset operation returned by the service. - `com.amazonaws.services.mediaconvert.model.GetPresetResult`"
  (^com.amazonaws.services.mediaconvert.model.GetPresetResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.GetPresetRequest request]
    (-> this (.getPreset request))))

(defn delete-preset
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.DeletePresetRequest`

  returns: Result of the DeletePreset operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DeletePresetResult`"
  (^com.amazonaws.services.mediaconvert.model.DeletePresetResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.DeletePresetRequest request]
    (-> this (.deletePreset request))))

(defn get-queue
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.GetQueueRequest`

  returns: Result of the GetQueue operation returned by the service. - `com.amazonaws.services.mediaconvert.model.GetQueueResult`"
  (^com.amazonaws.services.mediaconvert.model.GetQueueResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.GetQueueRequest request]
    (-> this (.getQueue request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMediaConvert

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMediaConvert this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CreateJobResult`"
  (^com.amazonaws.services.mediaconvert.model.CreateJobResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn describe-endpoints
  "Description copied from interface: AWSMediaConvert

  request - DescribeEndpointsRequest - `com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest`

  returns: Result of the DescribeEndpoints operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult`"
  (^com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest request]
    (-> this (.describeEndpoints request))))

(defn tag-resource
  "Description copied from interface: AWSMediaConvert

  request - `com.amazonaws.services.mediaconvert.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediaconvert.model.TagResourceResult`"
  (^com.amazonaws.services.mediaconvert.model.TagResourceResult [^AbstractAWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.TagResourceRequest request]
    (-> this (.tagResource request))))


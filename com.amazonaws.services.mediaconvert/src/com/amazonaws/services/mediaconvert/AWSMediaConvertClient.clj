(ns com.amazonaws.services.mediaconvert.AWSMediaConvertClient
  "Client for accessing MediaConvert. All service calls made using this client are blocking, and will not return until
  the service call completes.

  AWS Elemental MediaConvert"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediaconvert AWSMediaConvertClient]))

(defn *builder
  "returns: `com.amazonaws.services.mediaconvert.AWSMediaConvertClientBuilder`"
  (^com.amazonaws.services.mediaconvert.AWSMediaConvertClientBuilder []
    (AWSMediaConvertClient/builder )))

(defn update-job-template
  "Modify one of your existing job templates.

  request - `com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest`

  returns: Result of the UpdateJobTemplate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest request]
    (-> this (.updateJobTemplate request))))

(defn list-tags-for-resource
  "Retrieve the tags for a MediaConvert resource.

  request - `com.amazonaws.services.mediaconvert.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.ListTagsForResourceResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-job
  "Retrieve the JSON for a specific completed transcoding job.

  request - `com.amazonaws.services.mediaconvert.model.GetJobRequest`

  returns: Result of the GetJob operation returned by the service. - `com.amazonaws.services.mediaconvert.model.GetJobResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.GetJobResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.GetJobRequest request]
    (-> this (.getJob request))))

(defn delete-job-template
  "Permanently delete a job template you have created.

  request - `com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest`

  returns: Result of the DeleteJobTemplate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest request]
    (-> this (.deleteJobTemplate request))))

(defn update-preset
  "Modify one of your existing presets.

  request - `com.amazonaws.services.mediaconvert.model.UpdatePresetRequest`

  returns: Result of the UpdatePreset operation returned by the service. - `com.amazonaws.services.mediaconvert.model.UpdatePresetResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.UpdatePresetResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.UpdatePresetRequest request]
    (-> this (.updatePreset request))))

(defn list-queues
  "Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of
   them. To retrieve the next twenty queues, use the nextToken string returned with the array.

  request - `com.amazonaws.services.mediaconvert.model.ListQueuesRequest`

  returns: Result of the ListQueues operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListQueuesResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.ListQueuesResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.ListQueuesRequest request]
    (-> this (.listQueues request))))

(defn untag-resource
  "Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide
   at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html

  request - `com.amazonaws.services.mediaconvert.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediaconvert.model.UntagResourceResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.UntagResourceResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-job-template
  "Retrieve the JSON for a specific job template.

  request - `com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest`

  returns: Result of the GetJobTemplate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.GetJobTemplateResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.GetJobTemplateResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest request]
    (-> this (.getJobTemplate request))))

(defn list-presets
  "Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list
   of them. To retrieve the next twenty presets, use the nextToken string returned with the array.

  request - `com.amazonaws.services.mediaconvert.model.ListPresetsRequest`

  returns: Result of the ListPresets operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListPresetsResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.ListPresetsResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.ListPresetsRequest request]
    (-> this (.listPresets request))))

(defn update-queue
  "Modify one of your existing queues.

  request - `com.amazonaws.services.mediaconvert.model.UpdateQueueRequest`

  returns: Result of the UpdateQueue operation returned by the service. - `com.amazonaws.services.mediaconvert.model.UpdateQueueResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.UpdateQueueResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.UpdateQueueRequest request]
    (-> this (.updateQueue request))))

(defn associate-certificate
  "Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.

  request - `com.amazonaws.services.mediaconvert.model.AssociateCertificateRequest`

  returns: Result of the AssociateCertificate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.AssociateCertificateResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.AssociateCertificateResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.AssociateCertificateRequest request]
    (-> this (.associateCertificate request))))

(defn create-queue
  "Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at
   https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html

  request - `com.amazonaws.services.mediaconvert.model.CreateQueueRequest`

  returns: Result of the CreateQueue operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CreateQueueResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.CreateQueueResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.CreateQueueRequest request]
    (-> this (.createQueue request))))

(defn disassociate-certificate
  "Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and
   an AWS Elemental MediaConvert resource.

  request - `com.amazonaws.services.mediaconvert.model.DisassociateCertificateRequest`

  returns: Result of the DisassociateCertificate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DisassociateCertificateResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.DisassociateCertificateResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.DisassociateCertificateRequest request]
    (-> this (.disassociateCertificate request))))

(defn delete-queue
  "Permanently delete a queue you have created.

  request - `com.amazonaws.services.mediaconvert.model.DeleteQueueRequest`

  returns: Result of the DeleteQueue operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DeleteQueueResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.DeleteQueueResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.DeleteQueueRequest request]
    (-> this (.deleteQueue request))))

(defn list-job-templates
  "Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just
   a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array

  request - `com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest`

  returns: Result of the ListJobTemplates operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest request]
    (-> this (.listJobTemplates request))))

(defn cancel-job
  "Permanently cancel a job. Once you have canceled a job, you can't start it again.

  request - `com.amazonaws.services.mediaconvert.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CancelJobResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.CancelJobResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn create-job-template
  "Create a new job template. For information about job templates see the User Guide at
   http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

  request - `com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest`

  returns: Result of the CreateJobTemplate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest request]
    (-> this (.createJobTemplate request))))

(defn list-jobs
  "Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process,
   completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the
   twenty next most recent jobs, use the nextToken string returned with the array.

  request - `com.amazonaws.services.mediaconvert.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListJobsResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.ListJobsResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn create-preset
  "Create a new preset. For information about job templates see the User Guide at
   http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

  request - `com.amazonaws.services.mediaconvert.model.CreatePresetRequest`

  returns: Result of the CreatePreset operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CreatePresetResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.CreatePresetResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.CreatePresetRequest request]
    (-> this (.createPreset request))))

(defn get-preset
  "Retrieve the JSON for a specific preset.

  request - `com.amazonaws.services.mediaconvert.model.GetPresetRequest`

  returns: Result of the GetPreset operation returned by the service. - `com.amazonaws.services.mediaconvert.model.GetPresetResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.GetPresetResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.GetPresetRequest request]
    (-> this (.getPreset request))))

(defn delete-preset
  "Permanently delete a preset you have created.

  request - `com.amazonaws.services.mediaconvert.model.DeletePresetRequest`

  returns: Result of the DeletePreset operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DeletePresetResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.DeletePresetResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.DeletePresetRequest request]
    (-> this (.deletePreset request))))

(defn get-queue
  "Retrieve the JSON for a specific queue.

  request - `com.amazonaws.services.mediaconvert.model.GetQueueRequest`

  returns: Result of the GetQueue operation returned by the service. - `com.amazonaws.services.mediaconvert.model.GetQueueResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.GetQueueResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.GetQueueRequest request]
    (-> this (.getQueue request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaConvertClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job
  "Create a new transcoding job. For information about jobs and job settings, see the User Guide at
   http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

  request - `com.amazonaws.services.mediaconvert.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CreateJobResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.CreateJobResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn describe-endpoints
  "Send an request with an empty body to the regional API endpoint to get your account API endpoint.

  request - `com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest`

  returns: Result of the DescribeEndpoints operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - BadRequestException"
  (^com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest request]
    (-> this (.describeEndpoints request))))

(defn tag-resource
  "Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at
   https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html

  request - `com.amazonaws.services.mediaconvert.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediaconvert.model.TagResourceResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.TagResourceResult [^AWSMediaConvertClient this ^com.amazonaws.services.mediaconvert.model.TagResourceRequest request]
    (-> this (.tagResource request))))


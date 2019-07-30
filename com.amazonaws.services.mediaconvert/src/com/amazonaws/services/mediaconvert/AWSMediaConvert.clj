(ns com.amazonaws.services.mediaconvert.AWSMediaConvert
  "Interface for accessing MediaConvert.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaConvert instead.


  AWS Elemental MediaConvert"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediaconvert AWSMediaConvert]))

(defn update-job-template
  "Modify one of your existing job templates.

  update-job-template-request - `com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest`

  returns: Result of the UpdateJobTemplate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest update-job-template-request]
    (-> this (.updateJobTemplate update-job-template-request))))

(defn list-tags-for-resource
  "Retrieve the tags for a MediaConvert resource.

  list-tags-for-resource-request - `com.amazonaws.services.mediaconvert.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.ListTagsForResourceResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn get-job
  "Retrieve the JSON for a specific completed transcoding job.

  get-job-request - `com.amazonaws.services.mediaconvert.model.GetJobRequest`

  returns: Result of the GetJob operation returned by the service. - `com.amazonaws.services.mediaconvert.model.GetJobResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.GetJobResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.GetJobRequest get-job-request]
    (-> this (.getJob get-job-request))))

(defn delete-job-template
  "Permanently delete a job template you have created.

  delete-job-template-request - `com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest`

  returns: Result of the DeleteJobTemplate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest delete-job-template-request]
    (-> this (.deleteJobTemplate delete-job-template-request))))

(defn update-preset
  "Modify one of your existing presets.

  update-preset-request - `com.amazonaws.services.mediaconvert.model.UpdatePresetRequest`

  returns: Result of the UpdatePreset operation returned by the service. - `com.amazonaws.services.mediaconvert.model.UpdatePresetResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.UpdatePresetResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.UpdatePresetRequest update-preset-request]
    (-> this (.updatePreset update-preset-request))))

(defn list-queues
  "Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of
   them. To retrieve the next twenty queues, use the nextToken string returned with the array.

  list-queues-request - `com.amazonaws.services.mediaconvert.model.ListQueuesRequest`

  returns: Result of the ListQueues operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListQueuesResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.ListQueuesResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.ListQueuesRequest list-queues-request]
    (-> this (.listQueues list-queues-request))))

(defn untag-resource
  "Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide
   at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html

  untag-resource-request - `com.amazonaws.services.mediaconvert.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediaconvert.model.UntagResourceResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.UntagResourceResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn get-job-template
  "Retrieve the JSON for a specific job template.

  get-job-template-request - `com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest`

  returns: Result of the GetJobTemplate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.GetJobTemplateResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.GetJobTemplateResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest get-job-template-request]
    (-> this (.getJobTemplate get-job-template-request))))

(defn list-presets
  "Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list
   of them. To retrieve the next twenty presets, use the nextToken string returned with the array.

  list-presets-request - `com.amazonaws.services.mediaconvert.model.ListPresetsRequest`

  returns: Result of the ListPresets operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListPresetsResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.ListPresetsResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.ListPresetsRequest list-presets-request]
    (-> this (.listPresets list-presets-request))))

(defn update-queue
  "Modify one of your existing queues.

  update-queue-request - `com.amazonaws.services.mediaconvert.model.UpdateQueueRequest`

  returns: Result of the UpdateQueue operation returned by the service. - `com.amazonaws.services.mediaconvert.model.UpdateQueueResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.UpdateQueueResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.UpdateQueueRequest update-queue-request]
    (-> this (.updateQueue update-queue-request))))

(defn associate-certificate
  "Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.

  associate-certificate-request - `com.amazonaws.services.mediaconvert.model.AssociateCertificateRequest`

  returns: Result of the AssociateCertificate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.AssociateCertificateResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.AssociateCertificateResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.AssociateCertificateRequest associate-certificate-request]
    (-> this (.associateCertificate associate-certificate-request))))

(defn create-queue
  "Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at
   https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html

  create-queue-request - `com.amazonaws.services.mediaconvert.model.CreateQueueRequest`

  returns: Result of the CreateQueue operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CreateQueueResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.CreateQueueResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.CreateQueueRequest create-queue-request]
    (-> this (.createQueue create-queue-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSMediaConvert this]
    (-> this (.shutdown))))

(defn disassociate-certificate
  "Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and
   an AWS Elemental MediaConvert resource.

  disassociate-certificate-request - `com.amazonaws.services.mediaconvert.model.DisassociateCertificateRequest`

  returns: Result of the DisassociateCertificate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DisassociateCertificateResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.DisassociateCertificateResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.DisassociateCertificateRequest disassociate-certificate-request]
    (-> this (.disassociateCertificate disassociate-certificate-request))))

(defn delete-queue
  "Permanently delete a queue you have created.

  delete-queue-request - `com.amazonaws.services.mediaconvert.model.DeleteQueueRequest`

  returns: Result of the DeleteQueue operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DeleteQueueResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.DeleteQueueResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.DeleteQueueRequest delete-queue-request]
    (-> this (.deleteQueue delete-queue-request))))

(defn list-job-templates
  "Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just
   a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array

  list-job-templates-request - `com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest`

  returns: Result of the ListJobTemplates operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest list-job-templates-request]
    (-> this (.listJobTemplates list-job-templates-request))))

(defn cancel-job
  "Permanently cancel a job. Once you have canceled a job, you can't start it again.

  cancel-job-request - `com.amazonaws.services.mediaconvert.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CancelJobResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.CancelJobResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.CancelJobRequest cancel-job-request]
    (-> this (.cancelJob cancel-job-request))))

(defn create-job-template
  "Create a new job template. For information about job templates see the User Guide at
   http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

  create-job-template-request - `com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest`

  returns: Result of the CreateJobTemplate operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest create-job-template-request]
    (-> this (.createJobTemplate create-job-template-request))))

(defn list-jobs
  "Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process,
   completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the
   twenty next most recent jobs, use the nextToken string returned with the array.

  list-jobs-request - `com.amazonaws.services.mediaconvert.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.mediaconvert.model.ListJobsResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.ListJobsResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobs list-jobs-request))))

(defn create-preset
  "Create a new preset. For information about job templates see the User Guide at
   http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

  create-preset-request - `com.amazonaws.services.mediaconvert.model.CreatePresetRequest`

  returns: Result of the CreatePreset operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CreatePresetResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.CreatePresetResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.CreatePresetRequest create-preset-request]
    (-> this (.createPreset create-preset-request))))

(defn get-preset
  "Retrieve the JSON for a specific preset.

  get-preset-request - `com.amazonaws.services.mediaconvert.model.GetPresetRequest`

  returns: Result of the GetPreset operation returned by the service. - `com.amazonaws.services.mediaconvert.model.GetPresetResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.GetPresetResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.GetPresetRequest get-preset-request]
    (-> this (.getPreset get-preset-request))))

(defn delete-preset
  "Permanently delete a preset you have created.

  delete-preset-request - `com.amazonaws.services.mediaconvert.model.DeletePresetRequest`

  returns: Result of the DeletePreset operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DeletePresetResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.DeletePresetResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.DeletePresetRequest delete-preset-request]
    (-> this (.deletePreset delete-preset-request))))

(defn get-queue
  "Retrieve the JSON for a specific queue.

  get-queue-request - `com.amazonaws.services.mediaconvert.model.GetQueueRequest`

  returns: Result of the GetQueue operation returned by the service. - `com.amazonaws.services.mediaconvert.model.GetQueueResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.GetQueueResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.GetQueueRequest get-queue-request]
    (-> this (.getQueue get-queue-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaConvert this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job
  "Create a new transcoding job. For information about jobs and job settings, see the User Guide at
   http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

  create-job-request - `com.amazonaws.services.mediaconvert.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.mediaconvert.model.CreateJobResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.CreateJobResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.CreateJobRequest create-job-request]
    (-> this (.createJob create-job-request))))

(defn describe-endpoints
  "Send an request with an empty body to the regional API endpoint to get your account API endpoint.

  describe-endpoints-request - DescribeEndpointsRequest - `com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest`

  returns: Result of the DescribeEndpoints operation returned by the service. - `com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - BadRequestException"
  (^com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest describe-endpoints-request]
    (-> this (.describeEndpoints describe-endpoints-request))))

(defn tag-resource
  "Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at
   https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html

  tag-resource-request - `com.amazonaws.services.mediaconvert.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediaconvert.model.TagResourceResult`

  throws: com.amazonaws.services.mediaconvert.model.BadRequestException - The service can't process your request because of a problem in the request. Please check your request form and syntax."
  (^com.amazonaws.services.mediaconvert.model.TagResourceResult [^AWSMediaConvert this ^com.amazonaws.services.mediaconvert.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))


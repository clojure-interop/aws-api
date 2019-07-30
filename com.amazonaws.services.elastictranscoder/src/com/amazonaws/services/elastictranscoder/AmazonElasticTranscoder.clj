(ns com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder
  "Interface for accessing Amazon Elastic Transcoder.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonElasticTranscoder instead.


  AWS Elastic Transcoder Service

  The AWS Elastic Transcoder Service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elastictranscoder AmazonElasticTranscoder]))

(defn list-jobs-by-status
  "The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one
   element for each job that satisfies the search criteria.

  list-jobs-by-status-request - The ListJobsByStatusRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest`

  returns: Result of the ListJobsByStatus operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest list-jobs-by-status-request]
    (-> this (.listJobsByStatus list-jobs-by-status-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonElasticTranscoder this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn update-pipeline
  "Use the UpdatePipeline operation to update settings for a pipeline.



   When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and
   that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you
   change settings.

  update-pipeline-request - The UpdatePipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest`

  returns: Result of the UpdatePipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest update-pipeline-request]
    (-> this (.updatePipeline update-pipeline-request))))

(defn waiters
  "returns: `com.amazonaws.services.elastictranscoder.waiters.AmazonElasticTranscoderWaiters`"
  (^com.amazonaws.services.elastictranscoder.waiters.AmazonElasticTranscoderWaiters [^AmazonElasticTranscoder this]
    (-> this (.waiters))))

(defn list-pipelines
  "The ListPipelines operation gets a list of the pipelines associated with the current AWS account.

  list-pipelines-request - The ListPipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest`

  returns: Result of the ListPipelines operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ListPipelinesResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ListPipelinesResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest list-pipelines-request]
    (-> this (.listPipelines list-pipelines-request)))
  (^com.amazonaws.services.elastictranscoder.model.ListPipelinesResult [^AmazonElasticTranscoder this]
    (-> this (.listPipelines))))

(defn read-pipeline
  "The ReadPipeline operation gets detailed information about a pipeline.

  read-pipeline-request - The ReadPipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest`

  returns: Result of the ReadPipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ReadPipelineResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ReadPipelineResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest read-pipeline-request]
    (-> this (.readPipeline read-pipeline-request))))

(defn list-jobs-by-pipeline
  "The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline.


   Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one
   element for each job that satisfies the search criteria.

  list-jobs-by-pipeline-request - The ListJobsByPipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest`

  returns: Result of the ListJobsByPipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest list-jobs-by-pipeline-request]
    (-> this (.listJobsByPipeline list-jobs-by-pipeline-request))))

(defn list-presets
  "The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets
   that you've added in an AWS region.

  list-presets-request - The ListPresetsRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListPresetsRequest`

  returns: Result of the ListPresets operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ListPresetsResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ListPresetsResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ListPresetsRequest list-presets-request]
    (-> this (.listPresets list-presets-request)))
  (^com.amazonaws.services.elastictranscoder.model.ListPresetsResult [^AmazonElasticTranscoder this]
    (-> this (.listPresets))))

(defn test-role
  "Deprecated.

  test-role-request - The TestRoleRequest structure. - `com.amazonaws.services.elastictranscoder.model.TestRoleRequest`

  returns: Result of the TestRole operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.TestRoleResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.TestRoleResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.TestRoleRequest test-role-request]
    (-> this (.testRole test-role-request))))

(defn create-pipeline
  "The CreatePipeline operation creates a pipeline with settings that you specify.

  create-pipeline-request - The CreatePipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest`

  returns: Result of the CreatePipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.CreatePipelineResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.CreatePipelineResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest create-pipeline-request]
    (-> this (.createPipeline create-pipeline-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonElasticTranscoder this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"elastictranscoder.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"elastictranscoder.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonElasticTranscoder this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn cancel-job
  "The CancelJob operation cancels an unfinished job.



   You can only cancel a job that has a status of Submitted. To prevent a pipeline from starting to
   process a job while you're getting the job identifier, use UpdatePipelineStatus to temporarily pause the
   pipeline.

  cancel-job-request - The CancelJobRequest structure. - `com.amazonaws.services.elastictranscoder.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.CancelJobResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.CancelJobResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.CancelJobRequest cancel-job-request]
    (-> this (.cancelJob cancel-job-request))))

(defn read-preset
  "The ReadPreset operation gets detailed information about a preset.

  read-preset-request - The ReadPresetRequest structure. - `com.amazonaws.services.elastictranscoder.model.ReadPresetRequest`

  returns: Result of the ReadPreset operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ReadPresetResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ReadPresetResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ReadPresetRequest read-preset-request]
    (-> this (.readPreset read-preset-request))))

(defn create-preset
  "The CreatePreset operation creates a preset with settings that you specify.



   Elastic Transcoder checks the CreatePreset settings to ensure that they meet Elastic Transcoder requirements and
   to determine whether they comply with H.264 standards. If your settings are not valid for Elastic Transcoder,
   Elastic Transcoder returns an HTTP 400 response (ValidationException) and does not create the
   preset. If the settings are valid for Elastic Transcoder but aren't strictly compliant with the H.264 standard,
   Elastic Transcoder creates the preset and returns a warning message in the response. This helps you determine
   whether your settings comply with the H.264 standard while giving you greater flexibility with respect to the
   video that Elastic Transcoder produces.



   Elastic Transcoder uses the H.264 video-compression format. For more information, see the International
   Telecommunication Union publication Recommendation ITU-T H.264: Advanced video coding for generic audiovisual
   services.

  create-preset-request - The CreatePresetRequest structure. - `com.amazonaws.services.elastictranscoder.model.CreatePresetRequest`

  returns: Result of the CreatePreset operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.CreatePresetResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.CreatePresetResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.CreatePresetRequest create-preset-request]
    (-> this (.createPreset create-preset-request))))

(defn read-job
  "The ReadJob operation returns detailed information about a job.

  read-job-request - The ReadJobRequest structure. - `com.amazonaws.services.elastictranscoder.model.ReadJobRequest`

  returns: Result of the ReadJob operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ReadJobResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ReadJobResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ReadJobRequest read-job-request]
    (-> this (.readJob read-job-request))))

(defn delete-preset
  "The DeletePreset operation removes a preset that you've added in an AWS region.



   You can't delete the default presets that are included with Elastic Transcoder.

  delete-preset-request - The DeletePresetRequest structure. - `com.amazonaws.services.elastictranscoder.model.DeletePresetRequest`

  returns: Result of the DeletePreset operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.DeletePresetResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.DeletePresetResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.DeletePresetRequest delete-preset-request]
    (-> this (.deletePreset delete-preset-request))))

(defn update-pipeline-status
  "The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the
   processing of jobs.


   Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after
   Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you
   have more time to get the job IDs for the jobs that you want to cancel, and to send a CancelJob request.

  update-pipeline-status-request - The UpdatePipelineStatusRequest structure. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest`

  returns: Result of the UpdatePipelineStatus operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest update-pipeline-status-request]
    (-> this (.updatePipelineStatus update-pipeline-status-request))))

(defn delete-pipeline
  "The DeletePipeline operation removes a pipeline.


   You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any
   active jobs). If the pipeline is currently in use, DeletePipeline returns an error.

  delete-pipeline-request - The DeletePipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest`

  returns: Result of the DeletePipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.DeletePipelineResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.DeletePipelineResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest delete-pipeline-request]
    (-> this (.deletePipeline delete-pipeline-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonElasticTranscoder this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job
  "When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus
   information about the job that is created.


   If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another
   output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed
   to the AWS Console).

  create-job-request - The CreateJobRequest structure. - `com.amazonaws.services.elastictranscoder.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.CreateJobResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.CreateJobResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.CreateJobRequest create-job-request]
    (-> this (.createJob create-job-request))))

(defn update-pipeline-notifications
  "With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS)
   notifications for a pipeline.


   When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the
   request.

  update-pipeline-notifications-request - The UpdatePipelineNotificationsRequest structure. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest`

  returns: Result of the UpdatePipelineNotifications operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult [^AmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest update-pipeline-notifications-request]
    (-> this (.updatePipelineNotifications update-pipeline-notifications-request))))


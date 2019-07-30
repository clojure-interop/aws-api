(ns com.amazonaws.services.elastictranscoder.AmazonElasticTranscoderClient
  "Client for accessing Amazon Elastic Transcoder. All service calls made using this client are blocking, and will not
  return until the service call completes.

  AWS Elastic Transcoder Service

  The AWS Elastic Transcoder Service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elastictranscoder AmazonElasticTranscoderClient]))

(defn ->amazon-elastic-transcoder-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon Elastic Transcoder (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonElasticTranscoderClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonElasticTranscoderClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonElasticTranscoderClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonElasticTranscoderClient aws-credentials client-configuration))
  (^AmazonElasticTranscoderClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonElasticTranscoderClient client-configuration))
  (^AmazonElasticTranscoderClient []
    (new AmazonElasticTranscoderClient )))

(defn *builder
  "returns: `com.amazonaws.services.elastictranscoder.AmazonElasticTranscoderClientBuilder`"
  (^com.amazonaws.services.elastictranscoder.AmazonElasticTranscoderClientBuilder []
    (AmazonElasticTranscoderClient/builder )))

(defn list-jobs-by-status
  "The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one
   element for each job that satisfies the search criteria.

  request - `com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest`

  returns: Result of the ListJobsByStatus operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest request]
    (-> this (.listJobsByStatus request))))

(defn update-pipeline
  "Use the UpdatePipeline operation to update settings for a pipeline.



   When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and
   that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you
   change settings.

  request - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest`

  returns: Result of the UpdatePipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest request]
    (-> this (.updatePipeline request))))

(defn waiters
  "returns: `com.amazonaws.services.elastictranscoder.waiters.AmazonElasticTranscoderWaiters`"
  (^com.amazonaws.services.elastictranscoder.waiters.AmazonElasticTranscoderWaiters [^AmazonElasticTranscoderClient this]
    (-> this (.waiters))))

(defn list-pipelines
  "The ListPipelines operation gets a list of the pipelines associated with the current AWS account.

  request - `com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest`

  returns: Result of the ListPipelines operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ListPipelinesResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ListPipelinesResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest request]
    (-> this (.listPipelines request)))
  (^com.amazonaws.services.elastictranscoder.model.ListPipelinesResult [^AmazonElasticTranscoderClient this]
    (-> this (.listPipelines))))

(defn read-pipeline
  "The ReadPipeline operation gets detailed information about a pipeline.

  request - `com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest`

  returns: Result of the ReadPipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ReadPipelineResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ReadPipelineResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest request]
    (-> this (.readPipeline request))))

(defn list-jobs-by-pipeline
  "The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline.


   Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one
   element for each job that satisfies the search criteria.

  request - `com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest`

  returns: Result of the ListJobsByPipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest request]
    (-> this (.listJobsByPipeline request))))

(defn list-presets
  "The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets
   that you've added in an AWS region.

  request - `com.amazonaws.services.elastictranscoder.model.ListPresetsRequest`

  returns: Result of the ListPresets operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ListPresetsResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ListPresetsResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.ListPresetsRequest request]
    (-> this (.listPresets request)))
  (^com.amazonaws.services.elastictranscoder.model.ListPresetsResult [^AmazonElasticTranscoderClient this]
    (-> this (.listPresets))))

(defn test-role
  "Deprecated.

  request - `com.amazonaws.services.elastictranscoder.model.TestRoleRequest`

  returns: Result of the TestRole operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.TestRoleResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.TestRoleResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.TestRoleRequest request]
    (-> this (.testRole request))))

(defn create-pipeline
  "The CreatePipeline operation creates a pipeline with settings that you specify.

  request - `com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest`

  returns: Result of the CreatePipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.CreatePipelineResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.CreatePipelineResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest request]
    (-> this (.createPipeline request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonElasticTranscoderClient this]
    (-> this (.shutdown))))

(defn cancel-job
  "The CancelJob operation cancels an unfinished job.



   You can only cancel a job that has a status of Submitted. To prevent a pipeline from starting to
   process a job while you're getting the job identifier, use UpdatePipelineStatus to temporarily pause the
   pipeline.

  request - `com.amazonaws.services.elastictranscoder.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.CancelJobResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.CancelJobResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn read-preset
  "The ReadPreset operation gets detailed information about a preset.

  request - `com.amazonaws.services.elastictranscoder.model.ReadPresetRequest`

  returns: Result of the ReadPreset operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ReadPresetResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ReadPresetResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.ReadPresetRequest request]
    (-> this (.readPreset request))))

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

  request - `com.amazonaws.services.elastictranscoder.model.CreatePresetRequest`

  returns: Result of the CreatePreset operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.CreatePresetResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.CreatePresetResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.CreatePresetRequest request]
    (-> this (.createPreset request))))

(defn read-job
  "The ReadJob operation returns detailed information about a job.

  request - `com.amazonaws.services.elastictranscoder.model.ReadJobRequest`

  returns: Result of the ReadJob operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ReadJobResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.ReadJobResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.ReadJobRequest request]
    (-> this (.readJob request))))

(defn delete-preset
  "The DeletePreset operation removes a preset that you've added in an AWS region.



   You can't delete the default presets that are included with Elastic Transcoder.

  request - `com.amazonaws.services.elastictranscoder.model.DeletePresetRequest`

  returns: Result of the DeletePreset operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.DeletePresetResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.DeletePresetResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.DeletePresetRequest request]
    (-> this (.deletePreset request))))

(defn update-pipeline-status
  "The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the
   processing of jobs.


   Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after
   Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you
   have more time to get the job IDs for the jobs that you want to cancel, and to send a CancelJob request.

  request - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest`

  returns: Result of the UpdatePipelineStatus operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest request]
    (-> this (.updatePipelineStatus request))))

(defn delete-pipeline
  "The DeletePipeline operation removes a pipeline.


   You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any
   active jobs). If the pipeline is currently in use, DeletePipeline returns an error.

  request - `com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest`

  returns: Result of the DeletePipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.DeletePipelineResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.DeletePipelineResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest request]
    (-> this (.deletePipeline request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonElasticTranscoderClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job
  "When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus
   information about the job that is created.


   If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another
   output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed
   to the AWS Console).

  request - `com.amazonaws.services.elastictranscoder.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.CreateJobResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.CreateJobResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn update-pipeline-notifications
  "With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS)
   notifications for a pipeline.


   When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the
   request.

  request - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest`

  returns: Result of the UpdatePipelineNotifications operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult`

  throws: com.amazonaws.services.elastictranscoder.model.ValidationException - One or more required parameter values were not provided in the request."
  (^com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult [^AmazonElasticTranscoderClient this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest request]
    (-> this (.updatePipelineNotifications request))))


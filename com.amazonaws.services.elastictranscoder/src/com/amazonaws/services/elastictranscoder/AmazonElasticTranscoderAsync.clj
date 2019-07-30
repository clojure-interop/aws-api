(ns com.amazonaws.services.elastictranscoder.AmazonElasticTranscoderAsync
  "Interface for accessing Amazon Elastic Transcoder asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonElasticTranscoderAsync instead.


  AWS Elastic Transcoder Service

  The AWS Elastic Transcoder Service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elastictranscoder AmazonElasticTranscoderAsync]))

(defn create-preset-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.CreatePresetResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.CreatePresetRequest create-preset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPresetAsync create-preset-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.CreatePresetRequest create-preset-request]
    (-> this (.createPresetAsync create-preset-request))))

(defn delete-preset-async
  "The DeletePreset operation removes a preset that you've added in an AWS region.



   You can't delete the default presets that are included with Elastic Transcoder.

  delete-preset-request - The DeletePresetRequest structure. - `com.amazonaws.services.elastictranscoder.model.DeletePresetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.DeletePresetResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.DeletePresetRequest delete-preset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePresetAsync delete-preset-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.DeletePresetRequest delete-preset-request]
    (-> this (.deletePresetAsync delete-preset-request))))

(defn list-jobs-by-status-async
  "The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one
   element for each job that satisfies the search criteria.

  list-jobs-by-status-request - The ListJobsByStatusRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobsByStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest list-jobs-by-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsByStatusAsync list-jobs-by-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest list-jobs-by-status-request]
    (-> this (.listJobsByStatusAsync list-jobs-by-status-request))))

(defn update-pipeline-async
  "Use the UpdatePipeline operation to update settings for a pipeline.



   When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and
   that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you
   change settings.

  update-pipeline-request - The UpdatePipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest update-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePipelineAsync update-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest update-pipeline-request]
    (-> this (.updatePipelineAsync update-pipeline-request))))

(defn test-role-async
  "Deprecated.

  test-role-request - The TestRoleRequest structure. - `com.amazonaws.services.elastictranscoder.model.TestRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.TestRoleResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.TestRoleRequest test-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testRoleAsync test-role-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.TestRoleRequest test-role-request]
    (-> this (.testRoleAsync test-role-request))))

(defn list-presets-async
  "The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets
   that you've added in an AWS region.

  list-presets-request - The ListPresetsRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListPresetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPresets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ListPresetsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ListPresetsRequest list-presets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPresetsAsync list-presets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ListPresetsRequest list-presets-request]
    (-> this (.listPresetsAsync list-presets-request)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this]
    (-> this (.listPresetsAsync))))

(defn update-pipeline-status-async
  "The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the
   processing of jobs.


   Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after
   Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you
   have more time to get the job IDs for the jobs that you want to cancel, and to send a CancelJob request.

  update-pipeline-status-request - The UpdatePipelineStatusRequest structure. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePipelineStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest update-pipeline-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePipelineStatusAsync update-pipeline-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest update-pipeline-status-request]
    (-> this (.updatePipelineStatusAsync update-pipeline-status-request))))

(defn list-pipelines-async
  "The ListPipelines operation gets a list of the pipelines associated with the current AWS account.

  list-pipelines-request - The ListPipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPipelines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ListPipelinesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest list-pipelines-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPipelinesAsync list-pipelines-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest list-pipelines-request]
    (-> this (.listPipelinesAsync list-pipelines-request)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this]
    (-> this (.listPipelinesAsync))))

(defn update-pipeline-notifications-async
  "With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS)
   notifications for a pipeline.


   When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the
   request.

  update-pipeline-notifications-request - The UpdatePipelineNotificationsRequest structure. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePipelineNotifications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest update-pipeline-notifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePipelineNotificationsAsync update-pipeline-notifications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest update-pipeline-notifications-request]
    (-> this (.updatePipelineNotificationsAsync update-pipeline-notifications-request))))

(defn read-job-async
  "The ReadJob operation returns detailed information about a job.

  read-job-request - The ReadJobRequest structure. - `com.amazonaws.services.elastictranscoder.model.ReadJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReadJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ReadJobResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ReadJobRequest read-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.readJobAsync read-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ReadJobRequest read-job-request]
    (-> this (.readJobAsync read-job-request))))

(defn delete-pipeline-async
  "The DeletePipeline operation removes a pipeline.


   You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any
   active jobs). If the pipeline is currently in use, DeletePipeline returns an error.

  delete-pipeline-request - The DeletePipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.DeletePipelineResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest delete-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePipelineAsync delete-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest delete-pipeline-request]
    (-> this (.deletePipelineAsync delete-pipeline-request))))

(defn cancel-job-async
  "The CancelJob operation cancels an unfinished job.



   You can only cancel a job that has a status of Submitted. To prevent a pipeline from starting to
   process a job while you're getting the job identifier, use UpdatePipelineStatus to temporarily pause the
   pipeline.

  cancel-job-request - The CancelJobRequest structure. - `com.amazonaws.services.elastictranscoder.model.CancelJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.CancelJobRequest cancel-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync cancel-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.CancelJobRequest cancel-job-request]
    (-> this (.cancelJobAsync cancel-job-request))))

(defn read-pipeline-async
  "The ReadPipeline operation gets detailed information about a pipeline.

  read-pipeline-request - The ReadPipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReadPipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ReadPipelineResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest read-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.readPipelineAsync read-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest read-pipeline-request]
    (-> this (.readPipelineAsync read-pipeline-request))))

(defn list-jobs-by-pipeline-async
  "The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline.


   Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one
   element for each job that satisfies the search criteria.

  list-jobs-by-pipeline-request - The ListJobsByPipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobsByPipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest list-jobs-by-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsByPipelineAsync list-jobs-by-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest list-jobs-by-pipeline-request]
    (-> this (.listJobsByPipelineAsync list-jobs-by-pipeline-request))))

(defn create-job-async
  "When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus
   information about the job that is created.


   If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another
   output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed
   to the AWS Console).

  create-job-request - The CreateJobRequest structure. - `com.amazonaws.services.elastictranscoder.model.CreateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.CreateJobRequest create-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync create-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.CreateJobRequest create-job-request]
    (-> this (.createJobAsync create-job-request))))

(defn create-pipeline-async
  "The CreatePipeline operation creates a pipeline with settings that you specify.

  create-pipeline-request - The CreatePipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.CreatePipelineResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest create-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPipelineAsync create-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest create-pipeline-request]
    (-> this (.createPipelineAsync create-pipeline-request))))

(defn read-preset-async
  "The ReadPreset operation gets detailed information about a preset.

  read-preset-request - The ReadPresetRequest structure. - `com.amazonaws.services.elastictranscoder.model.ReadPresetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReadPreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ReadPresetResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ReadPresetRequest read-preset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.readPresetAsync read-preset-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsync this ^com.amazonaws.services.elastictranscoder.model.ReadPresetRequest read-preset-request]
    (-> this (.readPresetAsync read-preset-request))))


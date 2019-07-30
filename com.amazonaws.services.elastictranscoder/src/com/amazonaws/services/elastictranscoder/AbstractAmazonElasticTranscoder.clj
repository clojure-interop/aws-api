(ns com.amazonaws.services.elastictranscoder.AbstractAmazonElasticTranscoder
  "Abstract implementation of AmazonElasticTranscoder. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elastictranscoder AbstractAmazonElasticTranscoder]))

(defn list-jobs-by-status
  "Description copied from interface: AmazonElasticTranscoder

  request - The ListJobsByStatusRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest`

  returns: Result of the ListJobsByStatus operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult`"
  (^com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest request]
    (-> this (.listJobsByStatus request))))

(defn set-region
  "Description copied from interface: AmazonElasticTranscoder

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonElasticTranscoder this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn update-pipeline
  "Description copied from interface: AmazonElasticTranscoder

  request - The UpdatePipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest`

  returns: Result of the UpdatePipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult`"
  (^com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest request]
    (-> this (.updatePipeline request))))

(defn waiters
  "returns: `com.amazonaws.services.elastictranscoder.waiters.AmazonElasticTranscoderWaiters`"
  (^com.amazonaws.services.elastictranscoder.waiters.AmazonElasticTranscoderWaiters [^AbstractAmazonElasticTranscoder this]
    (-> this (.waiters))))

(defn list-pipelines
  "Description copied from interface: AmazonElasticTranscoder

  request - The ListPipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest`

  returns: Result of the ListPipelines operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ListPipelinesResult`"
  (^com.amazonaws.services.elastictranscoder.model.ListPipelinesResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest request]
    (-> this (.listPipelines request)))
  (^com.amazonaws.services.elastictranscoder.model.ListPipelinesResult [^AbstractAmazonElasticTranscoder this]
    (-> this (.listPipelines))))

(defn read-pipeline
  "Description copied from interface: AmazonElasticTranscoder

  request - The ReadPipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest`

  returns: Result of the ReadPipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ReadPipelineResult`"
  (^com.amazonaws.services.elastictranscoder.model.ReadPipelineResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest request]
    (-> this (.readPipeline request))))

(defn list-jobs-by-pipeline
  "Description copied from interface: AmazonElasticTranscoder

  request - The ListJobsByPipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest`

  returns: Result of the ListJobsByPipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult`"
  (^com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest request]
    (-> this (.listJobsByPipeline request))))

(defn list-presets
  "Description copied from interface: AmazonElasticTranscoder

  request - The ListPresetsRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListPresetsRequest`

  returns: Result of the ListPresets operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ListPresetsResult`"
  (^com.amazonaws.services.elastictranscoder.model.ListPresetsResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ListPresetsRequest request]
    (-> this (.listPresets request)))
  (^com.amazonaws.services.elastictranscoder.model.ListPresetsResult [^AbstractAmazonElasticTranscoder this]
    (-> this (.listPresets))))

(defn test-role
  "Deprecated.

  request - The TestRoleRequest structure. - `com.amazonaws.services.elastictranscoder.model.TestRoleRequest`

  returns: Result of the TestRole operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.TestRoleResult`"
  (^com.amazonaws.services.elastictranscoder.model.TestRoleResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.TestRoleRequest request]
    (-> this (.testRole request))))

(defn create-pipeline
  "Description copied from interface: AmazonElasticTranscoder

  request - The CreatePipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest`

  returns: Result of the CreatePipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.CreatePipelineResult`"
  (^com.amazonaws.services.elastictranscoder.model.CreatePipelineResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest request]
    (-> this (.createPipeline request))))

(defn shutdown
  "Description copied from interface: AmazonElasticTranscoder"
  ([^AbstractAmazonElasticTranscoder this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Description copied from interface: AmazonElasticTranscoder

  endpoint - The endpoint (ex: \"elastictranscoder.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"elastictranscoder.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonElasticTranscoder this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn cancel-job
  "Description copied from interface: AmazonElasticTranscoder

  request - The CancelJobRequest structure. - `com.amazonaws.services.elastictranscoder.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.CancelJobResult`"
  (^com.amazonaws.services.elastictranscoder.model.CancelJobResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn read-preset
  "Description copied from interface: AmazonElasticTranscoder

  request - The ReadPresetRequest structure. - `com.amazonaws.services.elastictranscoder.model.ReadPresetRequest`

  returns: Result of the ReadPreset operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ReadPresetResult`"
  (^com.amazonaws.services.elastictranscoder.model.ReadPresetResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ReadPresetRequest request]
    (-> this (.readPreset request))))

(defn create-preset
  "Description copied from interface: AmazonElasticTranscoder

  request - The CreatePresetRequest structure. - `com.amazonaws.services.elastictranscoder.model.CreatePresetRequest`

  returns: Result of the CreatePreset operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.CreatePresetResult`"
  (^com.amazonaws.services.elastictranscoder.model.CreatePresetResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.CreatePresetRequest request]
    (-> this (.createPreset request))))

(defn read-job
  "Description copied from interface: AmazonElasticTranscoder

  request - The ReadJobRequest structure. - `com.amazonaws.services.elastictranscoder.model.ReadJobRequest`

  returns: Result of the ReadJob operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.ReadJobResult`"
  (^com.amazonaws.services.elastictranscoder.model.ReadJobResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.ReadJobRequest request]
    (-> this (.readJob request))))

(defn delete-preset
  "Description copied from interface: AmazonElasticTranscoder

  request - The DeletePresetRequest structure. - `com.amazonaws.services.elastictranscoder.model.DeletePresetRequest`

  returns: Result of the DeletePreset operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.DeletePresetResult`"
  (^com.amazonaws.services.elastictranscoder.model.DeletePresetResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.DeletePresetRequest request]
    (-> this (.deletePreset request))))

(defn update-pipeline-status
  "Description copied from interface: AmazonElasticTranscoder

  request - The UpdatePipelineStatusRequest structure. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest`

  returns: Result of the UpdatePipelineStatus operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult`"
  (^com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest request]
    (-> this (.updatePipelineStatus request))))

(defn delete-pipeline
  "Description copied from interface: AmazonElasticTranscoder

  request - The DeletePipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest`

  returns: Result of the DeletePipeline operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.DeletePipelineResult`"
  (^com.amazonaws.services.elastictranscoder.model.DeletePipelineResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest request]
    (-> this (.deletePipeline request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonElasticTranscoder

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonElasticTranscoder this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job
  "Description copied from interface: AmazonElasticTranscoder

  request - The CreateJobRequest structure. - `com.amazonaws.services.elastictranscoder.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.CreateJobResult`"
  (^com.amazonaws.services.elastictranscoder.model.CreateJobResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn update-pipeline-notifications
  "Description copied from interface: AmazonElasticTranscoder

  request - The UpdatePipelineNotificationsRequest structure. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest`

  returns: Result of the UpdatePipelineNotifications operation returned by the service. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult`"
  (^com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult [^AbstractAmazonElasticTranscoder this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest request]
    (-> this (.updatePipelineNotifications request))))


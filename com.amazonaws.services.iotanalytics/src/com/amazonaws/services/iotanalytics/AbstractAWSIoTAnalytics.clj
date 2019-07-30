(ns com.amazonaws.services.iotanalytics.AbstractAWSIoTAnalytics
  "Abstract implementation of AWSIoTAnalytics. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotanalytics AbstractAWSIoTAnalytics]))

(defn update-dataset
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.UpdateDatasetRequest`

  returns: Result of the UpdateDataset operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UpdateDatasetResult`"
  (^com.amazonaws.services.iotanalytics.model.UpdateDatasetResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.UpdateDatasetRequest request]
    (-> this (.updateDataset request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.iotanalytics.model.ListTagsForResourceResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-datastores
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.ListDatastoresRequest`

  returns: Result of the ListDatastores operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListDatastoresResult`"
  (^com.amazonaws.services.iotanalytics.model.ListDatastoresResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.ListDatastoresRequest request]
    (-> this (.listDatastores request))))

(defn get-dataset-content
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.GetDatasetContentRequest`

  returns: Result of the GetDatasetContent operation returned by the service. - `com.amazonaws.services.iotanalytics.model.GetDatasetContentResult`"
  (^com.amazonaws.services.iotanalytics.model.GetDatasetContentResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.GetDatasetContentRequest request]
    (-> this (.getDatasetContent request))))

(defn update-pipeline
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.UpdatePipelineRequest`

  returns: Result of the UpdatePipeline operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UpdatePipelineResult`"
  (^com.amazonaws.services.iotanalytics.model.UpdatePipelineResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.UpdatePipelineRequest request]
    (-> this (.updatePipeline request))))

(defn describe-pipeline
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.DescribePipelineRequest`

  returns: Result of the DescribePipeline operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribePipelineResult`"
  (^com.amazonaws.services.iotanalytics.model.DescribePipelineResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DescribePipelineRequest request]
    (-> this (.describePipeline request))))

(defn create-datastore
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.CreateDatastoreRequest`

  returns: Result of the CreateDatastore operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreateDatastoreResult`"
  (^com.amazonaws.services.iotanalytics.model.CreateDatastoreResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.CreateDatastoreRequest request]
    (-> this (.createDatastore request))))

(defn create-dataset
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.CreateDatasetRequest`

  returns: Result of the CreateDataset operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreateDatasetResult`"
  (^com.amazonaws.services.iotanalytics.model.CreateDatasetResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.CreateDatasetRequest request]
    (-> this (.createDataset request))))

(defn list-channels
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.ListChannelsRequest`

  returns: Result of the ListChannels operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListChannelsResult`"
  (^com.amazonaws.services.iotanalytics.model.ListChannelsResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.ListChannelsRequest request]
    (-> this (.listChannels request))))

(defn list-pipelines
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.ListPipelinesRequest`

  returns: Result of the ListPipelines operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListPipelinesResult`"
  (^com.amazonaws.services.iotanalytics.model.ListPipelinesResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.ListPipelinesRequest request]
    (-> this (.listPipelines request))))

(defn untag-resource
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UntagResourceResult`"
  (^com.amazonaws.services.iotanalytics.model.UntagResourceResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-dataset-content
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.CreateDatasetContentRequest`

  returns: Result of the CreateDatasetContent operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreateDatasetContentResult`"
  (^com.amazonaws.services.iotanalytics.model.CreateDatasetContentResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.CreateDatasetContentRequest request]
    (-> this (.createDatasetContent request))))

(defn update-channel
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.UpdateChannelRequest`

  returns: Result of the UpdateChannel operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UpdateChannelResult`"
  (^com.amazonaws.services.iotanalytics.model.UpdateChannelResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.UpdateChannelRequest request]
    (-> this (.updateChannel request))))

(defn cancel-pipeline-reprocessing
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingRequest`

  returns: Result of the CancelPipelineReprocessing operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingResult`"
  (^com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingRequest request]
    (-> this (.cancelPipelineReprocessing request))))

(defn describe-logging-options
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsRequest`

  returns: Result of the DescribeLoggingOptions operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsResult`"
  (^com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsRequest request]
    (-> this (.describeLoggingOptions request))))

(defn describe-dataset
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.DescribeDatasetRequest`

  returns: Result of the DescribeDataset operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribeDatasetResult`"
  (^com.amazonaws.services.iotanalytics.model.DescribeDatasetResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DescribeDatasetRequest request]
    (-> this (.describeDataset request))))

(defn delete-dataset-content
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.DeleteDatasetContentRequest`

  returns: Result of the DeleteDatasetContent operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeleteDatasetContentResult`"
  (^com.amazonaws.services.iotanalytics.model.DeleteDatasetContentResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetContentRequest request]
    (-> this (.deleteDatasetContent request))))

(defn delete-datastore
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.DeleteDatastoreRequest`

  returns: Result of the DeleteDatastore operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeleteDatastoreResult`"
  (^com.amazonaws.services.iotanalytics.model.DeleteDatastoreResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DeleteDatastoreRequest request]
    (-> this (.deleteDatastore request))))

(defn list-datasets
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.ListDatasetsRequest`

  returns: Result of the ListDatasets operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListDatasetsResult`"
  (^com.amazonaws.services.iotanalytics.model.ListDatasetsResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.ListDatasetsRequest request]
    (-> this (.listDatasets request))))

(defn batch-put-message
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.BatchPutMessageRequest`

  returns: Result of the BatchPutMessage operation returned by the service. - `com.amazonaws.services.iotanalytics.model.BatchPutMessageResult`"
  (^com.amazonaws.services.iotanalytics.model.BatchPutMessageResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.BatchPutMessageRequest request]
    (-> this (.batchPutMessage request))))

(defn create-pipeline
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.CreatePipelineRequest`

  returns: Result of the CreatePipeline operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreatePipelineResult`"
  (^com.amazonaws.services.iotanalytics.model.CreatePipelineResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.CreatePipelineRequest request]
    (-> this (.createPipeline request))))

(defn create-channel
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.CreateChannelRequest`

  returns: Result of the CreateChannel operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreateChannelResult`"
  (^com.amazonaws.services.iotanalytics.model.CreateChannelResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.CreateChannelRequest request]
    (-> this (.createChannel request))))

(defn shutdown
  "Description copied from interface: AWSIoTAnalytics"
  ([^AbstractAWSIoTAnalytics this]
    (-> this (.shutdown))))

(defn sample-channel-data
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.SampleChannelDataRequest`

  returns: Result of the SampleChannelData operation returned by the service. - `com.amazonaws.services.iotanalytics.model.SampleChannelDataResult`"
  (^com.amazonaws.services.iotanalytics.model.SampleChannelDataResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.SampleChannelDataRequest request]
    (-> this (.sampleChannelData request))))

(defn list-dataset-contents
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.ListDatasetContentsRequest`

  returns: Result of the ListDatasetContents operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListDatasetContentsResult`"
  (^com.amazonaws.services.iotanalytics.model.ListDatasetContentsResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.ListDatasetContentsRequest request]
    (-> this (.listDatasetContents request))))

(defn put-logging-options
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.PutLoggingOptionsRequest`

  returns: Result of the PutLoggingOptions operation returned by the service. - `com.amazonaws.services.iotanalytics.model.PutLoggingOptionsResult`"
  (^com.amazonaws.services.iotanalytics.model.PutLoggingOptionsResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.PutLoggingOptionsRequest request]
    (-> this (.putLoggingOptions request))))

(defn describe-datastore
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.DescribeDatastoreRequest`

  returns: Result of the DescribeDatastore operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribeDatastoreResult`"
  (^com.amazonaws.services.iotanalytics.model.DescribeDatastoreResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DescribeDatastoreRequest request]
    (-> this (.describeDatastore request))))

(defn update-datastore
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.UpdateDatastoreRequest`

  returns: Result of the UpdateDatastore operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UpdateDatastoreResult`"
  (^com.amazonaws.services.iotanalytics.model.UpdateDatastoreResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.UpdateDatastoreRequest request]
    (-> this (.updateDatastore request))))

(defn delete-pipeline
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.DeletePipelineRequest`

  returns: Result of the DeletePipeline operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeletePipelineResult`"
  (^com.amazonaws.services.iotanalytics.model.DeletePipelineResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DeletePipelineRequest request]
    (-> this (.deletePipeline request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSIoTAnalytics

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSIoTAnalytics this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-pipeline-reprocessing
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingRequest`

  returns: Result of the StartPipelineReprocessing operation returned by the service. - `com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingResult`"
  (^com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingRequest request]
    (-> this (.startPipelineReprocessing request))))

(defn delete-dataset
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.DeleteDatasetRequest`

  returns: Result of the DeleteDataset operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeleteDatasetResult`"
  (^com.amazonaws.services.iotanalytics.model.DeleteDatasetResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetRequest request]
    (-> this (.deleteDataset request))))

(defn tag-resource
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iotanalytics.model.TagResourceResult`"
  (^com.amazonaws.services.iotanalytics.model.TagResourceResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-channel
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.DeleteChannelRequest`

  returns: Result of the DeleteChannel operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeleteChannelResult`"
  (^com.amazonaws.services.iotanalytics.model.DeleteChannelResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DeleteChannelRequest request]
    (-> this (.deleteChannel request))))

(defn run-pipeline-activity
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.RunPipelineActivityRequest`

  returns: Result of the RunPipelineActivity operation returned by the service. - `com.amazonaws.services.iotanalytics.model.RunPipelineActivityResult`"
  (^com.amazonaws.services.iotanalytics.model.RunPipelineActivityResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.RunPipelineActivityRequest request]
    (-> this (.runPipelineActivity request))))

(defn describe-channel
  "Description copied from interface: AWSIoTAnalytics

  request - `com.amazonaws.services.iotanalytics.model.DescribeChannelRequest`

  returns: Result of the DescribeChannel operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribeChannelResult`"
  (^com.amazonaws.services.iotanalytics.model.DescribeChannelResult [^AbstractAWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DescribeChannelRequest request]
    (-> this (.describeChannel request))))


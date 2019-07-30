(ns com.amazonaws.services.machinelearning.AbstractAmazonMachineLearning
  "Abstract implementation of AmazonMachineLearning. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.machinelearning AbstractAmazonMachineLearning]))

(defn delete-tags
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteTagsResult`"
  (^com.amazonaws.services.machinelearning.model.DeleteTagsResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn add-tags
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.machinelearning.model.AddTagsResult`"
  (^com.amazonaws.services.machinelearning.model.AddTagsResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.AddTagsRequest request]
    (-> this (.addTags request))))

(defn update-ml-model
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.UpdateMLModelRequest`

  returns: Result of the UpdateMLModel operation returned by the service. - `com.amazonaws.services.machinelearning.model.UpdateMLModelResult`"
  (^com.amazonaws.services.machinelearning.model.UpdateMLModelResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.UpdateMLModelRequest request]
    (-> this (.updateMLModel request))))

(defn describe-data-sources
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest`

  returns: Result of the DescribeDataSources operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult`"
  (^com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest request]
    (-> this (.describeDataSources request)))
  (^com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult [^AbstractAmazonMachineLearning this]
    (-> this (.describeDataSources))))

(defn describe-evaluations
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest`

  returns: Result of the DescribeEvaluations operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult`"
  (^com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest request]
    (-> this (.describeEvaluations request)))
  (^com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult [^AbstractAmazonMachineLearning this]
    (-> this (.describeEvaluations))))

(defn describe-tags
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeTagsResult`"
  (^com.amazonaws.services.machinelearning.model.DescribeTagsResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DescribeTagsRequest request]
    (-> this (.describeTags request))))

(defn create-data-source-from-rds
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest`

  returns: Result of the CreateDataSourceFromRDS operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult`"
  (^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest request]
    (-> this (.createDataSourceFromRDS request))))

(defn set-region
  "Description copied from interface: AmazonMachineLearning

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonMachineLearning this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn delete-realtime-endpoint
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest`

  returns: Result of the DeleteRealtimeEndpoint operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult`"
  (^com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest request]
    (-> this (.deleteRealtimeEndpoint request))))

(defn predict
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.PredictRequest`

  returns: Result of the Predict operation returned by the service. - `com.amazonaws.services.machinelearning.model.PredictResult`"
  (^com.amazonaws.services.machinelearning.model.PredictResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.PredictRequest request]
    (-> this (.predict request))))

(defn waiters
  "returns: `com.amazonaws.services.machinelearning.waiters.AmazonMachineLearningWaiters`"
  (^com.amazonaws.services.machinelearning.waiters.AmazonMachineLearningWaiters [^AbstractAmazonMachineLearning this]
    (-> this (.waiters))))

(defn create-ml-model
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.CreateMLModelRequest`

  returns: Result of the CreateMLModel operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateMLModelResult`"
  (^com.amazonaws.services.machinelearning.model.CreateMLModelResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateMLModelRequest request]
    (-> this (.createMLModel request))))

(defn delete-evaluation
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest`

  returns: Result of the DeleteEvaluation operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteEvaluationResult`"
  (^com.amazonaws.services.machinelearning.model.DeleteEvaluationResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest request]
    (-> this (.deleteEvaluation request))))

(defn delete-batch-prediction
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest`

  returns: Result of the DeleteBatchPrediction operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult`"
  (^com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest request]
    (-> this (.deleteBatchPrediction request))))

(defn update-batch-prediction
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest`

  returns: Result of the UpdateBatchPrediction operation returned by the service. - `com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult`"
  (^com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest request]
    (-> this (.updateBatchPrediction request))))

(defn create-data-source-from-redshift
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest`

  returns: Result of the CreateDataSourceFromRedshift operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult`"
  (^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest request]
    (-> this (.createDataSourceFromRedshift request))))

(defn get-ml-model
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.GetMLModelRequest`

  returns: Result of the GetMLModel operation returned by the service. - `com.amazonaws.services.machinelearning.model.GetMLModelResult`"
  (^com.amazonaws.services.machinelearning.model.GetMLModelResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.GetMLModelRequest request]
    (-> this (.getMLModel request))))

(defn create-realtime-endpoint
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest`

  returns: Result of the CreateRealtimeEndpoint operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult`"
  (^com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest request]
    (-> this (.createRealtimeEndpoint request))))

(defn get-evaluation
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.GetEvaluationRequest`

  returns: Result of the GetEvaluation operation returned by the service. - `com.amazonaws.services.machinelearning.model.GetEvaluationResult`"
  (^com.amazonaws.services.machinelearning.model.GetEvaluationResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.GetEvaluationRequest request]
    (-> this (.getEvaluation request))))

(defn describe-ml-models
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest`

  returns: Result of the DescribeMLModels operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeMLModelsResult`"
  (^com.amazonaws.services.machinelearning.model.DescribeMLModelsResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest request]
    (-> this (.describeMLModels request)))
  (^com.amazonaws.services.machinelearning.model.DescribeMLModelsResult [^AbstractAmazonMachineLearning this]
    (-> this (.describeMLModels))))

(defn update-evaluation
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest`

  returns: Result of the UpdateEvaluation operation returned by the service. - `com.amazonaws.services.machinelearning.model.UpdateEvaluationResult`"
  (^com.amazonaws.services.machinelearning.model.UpdateEvaluationResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest request]
    (-> this (.updateEvaluation request))))

(defn shutdown
  "Description copied from interface: AmazonMachineLearning"
  ([^AbstractAmazonMachineLearning this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Description copied from interface: AmazonMachineLearning

  endpoint - The endpoint (ex: \"machinelearning.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://machinelearning.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonMachineLearning this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-ml-model
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.DeleteMLModelRequest`

  returns: Result of the DeleteMLModel operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteMLModelResult`"
  (^com.amazonaws.services.machinelearning.model.DeleteMLModelResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DeleteMLModelRequest request]
    (-> this (.deleteMLModel request))))

(defn delete-data-source
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest`

  returns: Result of the DeleteDataSource operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteDataSourceResult`"
  (^com.amazonaws.services.machinelearning.model.DeleteDataSourceResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest request]
    (-> this (.deleteDataSource request))))

(defn create-batch-prediction
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest`

  returns: Result of the CreateBatchPrediction operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult`"
  (^com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest request]
    (-> this (.createBatchPrediction request))))

(defn update-data-source
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest`

  returns: Result of the UpdateDataSource operation returned by the service. - `com.amazonaws.services.machinelearning.model.UpdateDataSourceResult`"
  (^com.amazonaws.services.machinelearning.model.UpdateDataSourceResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest request]
    (-> this (.updateDataSource request))))

(defn describe-batch-predictions
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest`

  returns: Result of the DescribeBatchPredictions operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult`"
  (^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest request]
    (-> this (.describeBatchPredictions request)))
  (^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult [^AbstractAmazonMachineLearning this]
    (-> this (.describeBatchPredictions))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonMachineLearning

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonMachineLearning this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-evaluation
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.CreateEvaluationRequest`

  returns: Result of the CreateEvaluation operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateEvaluationResult`"
  (^com.amazonaws.services.machinelearning.model.CreateEvaluationResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateEvaluationRequest request]
    (-> this (.createEvaluation request))))

(defn get-data-source
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.GetDataSourceRequest`

  returns: Result of the GetDataSource operation returned by the service. - `com.amazonaws.services.machinelearning.model.GetDataSourceResult`"
  (^com.amazonaws.services.machinelearning.model.GetDataSourceResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.GetDataSourceRequest request]
    (-> this (.getDataSource request))))

(defn create-data-source-from-s-3
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request`

  returns: Result of the CreateDataSourceFromS3 operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result`"
  (^com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request request]
    (-> this (.createDataSourceFromS3 request))))

(defn get-batch-prediction
  "Description copied from interface: AmazonMachineLearning

  request - `com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest`

  returns: Result of the GetBatchPrediction operation returned by the service. - `com.amazonaws.services.machinelearning.model.GetBatchPredictionResult`"
  (^com.amazonaws.services.machinelearning.model.GetBatchPredictionResult [^AbstractAmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest request]
    (-> this (.getBatchPrediction request))))


(ns com.amazonaws.services.machinelearning.AmazonMachineLearningAsyncClient
  "Client for accessing Amazon Machine Learning asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Definition of the public APIs exposed by Amazon Machine Learning"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.machinelearning AmazonMachineLearningAsyncClient]))

(defn ->amazon-machine-learning-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonMachineLearningAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonMachineLearningAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonMachineLearningAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonMachineLearningAsyncClient aws-credentials executor-service))
  (^AmazonMachineLearningAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonMachineLearningAsyncClient client-configuration))
  (^AmazonMachineLearningAsyncClient []
    (new AmazonMachineLearningAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.machinelearning.AmazonMachineLearningAsyncClientBuilder`"
  (^com.amazonaws.services.machinelearning.AmazonMachineLearningAsyncClientBuilder []
    (AmazonMachineLearningAsyncClient/asyncBuilder )))

(defn create-realtime-endpoint-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRealtimeEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRealtimeEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest request]
    (-> this (.createRealtimeEndpointAsync request))))

(defn create-ml-model-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.CreateMLModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMLModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateMLModelResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateMLModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMLModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateMLModelRequest request]
    (-> this (.createMLModelAsync request))))

(defn predict-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.PredictRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Predict operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.PredictResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.PredictRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.predictAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.PredictRequest request]
    (-> this (.predictAsync request))))

(defn delete-evaluation-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEvaluation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DeleteEvaluationResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEvaluationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest request]
    (-> this (.deleteEvaluationAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonMachineLearningAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-data-source-from-rds-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataSourceFromRDS operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDataSourceFromRDSAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest request]
    (-> this (.createDataSourceFromRDSAsync request))))

(defn delete-tags-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.DeleteTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DeleteTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DeleteTagsRequest request]
    (-> this (.deleteTagsAsync request))))

(defn get-batch-prediction-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBatchPrediction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.GetBatchPredictionResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBatchPredictionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest request]
    (-> this (.getBatchPredictionAsync request))))

(defn get-evaluation-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.GetEvaluationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEvaluation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.GetEvaluationResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.GetEvaluationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEvaluationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.GetEvaluationRequest request]
    (-> this (.getEvaluationAsync request))))

(defn create-data-source-from-s-3-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataSourceFromS3 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDataSourceFromS3Async request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request request]
    (-> this (.createDataSourceFromS3Async request))))

(defn update-ml-model-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.UpdateMLModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMLModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.UpdateMLModelResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.UpdateMLModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMLModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.UpdateMLModelRequest request]
    (-> this (.updateMLModelAsync request))))

(defn get-ml-model-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.GetMLModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMLModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.GetMLModelResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.GetMLModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMLModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.GetMLModelRequest request]
    (-> this (.getMLModelAsync request))))

(defn create-batch-prediction-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBatchPrediction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBatchPredictionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest request]
    (-> this (.createBatchPredictionAsync request))))

(defn delete-ml-model-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.DeleteMLModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMLModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DeleteMLModelResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DeleteMLModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMLModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DeleteMLModelRequest request]
    (-> this (.deleteMLModelAsync request))))

(defn describe-batch-predictions-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBatchPredictions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBatchPredictionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest request]
    (-> this (.describeBatchPredictionsAsync request)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this]
    (-> this (.describeBatchPredictionsAsync))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonMachineLearningAsyncClient this]
    (-> this (.shutdown))))

(defn create-evaluation-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.CreateEvaluationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEvaluation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateEvaluationResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateEvaluationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEvaluationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateEvaluationRequest request]
    (-> this (.createEvaluationAsync request))))

(defn describe-evaluations-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvaluations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEvaluationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest request]
    (-> this (.describeEvaluationsAsync request)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this]
    (-> this (.describeEvaluationsAsync))))

(defn delete-batch-prediction-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBatchPrediction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBatchPredictionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest request]
    (-> this (.deleteBatchPredictionAsync request))))

(defn update-evaluation-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEvaluation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.UpdateEvaluationResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEvaluationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest request]
    (-> this (.updateEvaluationAsync request))))

(defn update-batch-prediction-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBatchPrediction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBatchPredictionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest request]
    (-> this (.updateBatchPredictionAsync request))))

(defn update-data-source-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.UpdateDataSourceResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDataSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest request]
    (-> this (.updateDataSourceAsync request))))

(defn create-data-source-from-redshift-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataSourceFromRedshift operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDataSourceFromRedshiftAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest request]
    (-> this (.createDataSourceFromRedshiftAsync request))))

(defn describe-ml-models-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMLModels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DescribeMLModelsResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMLModelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest request]
    (-> this (.describeMLModelsAsync request)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this]
    (-> this (.describeMLModelsAsync))))

(defn describe-tags-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.DescribeTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DescribeTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DescribeTagsRequest request]
    (-> this (.describeTagsAsync request))))

(defn describe-data-sources-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDataSources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDataSourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest request]
    (-> this (.describeDataSourcesAsync request)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this]
    (-> this (.describeDataSourcesAsync))))

(defn delete-realtime-endpoint-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRealtimeEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRealtimeEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest request]
    (-> this (.deleteRealtimeEndpointAsync request))))

(defn get-data-source-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.GetDataSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.GetDataSourceResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.GetDataSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.GetDataSourceRequest request]
    (-> this (.getDataSourceAsync request))))

(defn delete-data-source-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DeleteDataSourceResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDataSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest request]
    (-> this (.deleteDataSourceAsync request))))

(defn add-tags-async
  "Description copied from interface: AmazonMachineLearningAsync

  request - `com.amazonaws.services.machinelearning.model.AddTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.AddTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsyncClient this ^com.amazonaws.services.machinelearning.model.AddTagsRequest request]
    (-> this (.addTagsAsync request))))


(ns com.amazonaws.services.machinelearning.AmazonMachineLearningClient
  "Client for accessing Amazon Machine Learning. All service calls made using this client are blocking, and will not
  return until the service call completes.

  Definition of the public APIs exposed by Amazon Machine Learning"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.machinelearning AmazonMachineLearningClient]))

(defn ->amazon-machine-learning-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon Machine Learning (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonMachineLearningClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonMachineLearningClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonMachineLearningClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonMachineLearningClient aws-credentials client-configuration))
  (^AmazonMachineLearningClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonMachineLearningClient client-configuration))
  (^AmazonMachineLearningClient []
    (new AmazonMachineLearningClient )))

(defn *builder
  "returns: `com.amazonaws.services.machinelearning.AmazonMachineLearningClientBuilder`"
  (^com.amazonaws.services.machinelearning.AmazonMachineLearningClientBuilder []
    (AmazonMachineLearningClient/builder )))

(defn delete-tags
  "Deletes the specified tags associated with an ML object. After this operation is complete, you can't recover
   deleted tags.


   If you specify a tag that doesn't exist, Amazon ML ignores it.

  request - `com.amazonaws.services.machinelearning.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteTagsResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DeleteTagsResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn add-tags
  "Adds one or more tags to an object, up to a limit of 10. Each tag consists of a key and an optional value. If you
   add a tag using a key that is already associated with the ML object, AddTags updates the tag's
   value.

  request - `com.amazonaws.services.machinelearning.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.machinelearning.model.AddTagsResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.AddTagsResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.AddTagsRequest request]
    (-> this (.addTags request))))

(defn update-ml-model
  "Updates the MLModelName and the ScoreThreshold of an MLModel.


   You can use the GetMLModel operation to view the contents of the updated data element.

  request - `com.amazonaws.services.machinelearning.model.UpdateMLModelRequest`

  returns: Result of the UpdateMLModel operation returned by the service. - `com.amazonaws.services.machinelearning.model.UpdateMLModelResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.UpdateMLModelResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.UpdateMLModelRequest request]
    (-> this (.updateMLModel request))))

(defn describe-data-sources
  "Returns a list of DataSource that match the search criteria in the request.

  request - `com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest`

  returns: Result of the DescribeDataSources operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest request]
    (-> this (.describeDataSources request)))
  (^com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult [^AmazonMachineLearningClient this]
    (-> this (.describeDataSources))))

(defn describe-evaluations
  "Returns a list of DescribeEvaluations that match the search criteria in the request.

  request - `com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest`

  returns: Result of the DescribeEvaluations operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest request]
    (-> this (.describeEvaluations request)))
  (^com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult [^AmazonMachineLearningClient this]
    (-> this (.describeEvaluations))))

(defn describe-tags
  "Describes one or more of the tags for your Amazon ML object.

  request - `com.amazonaws.services.machinelearning.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeTagsResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DescribeTagsResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.DescribeTagsRequest request]
    (-> this (.describeTags request))))

(defn create-data-source-from-rds
  "Creates a DataSource object from an  Amazon Relational Database
   Service (Amazon RDS). A DataSource references data that can be used to perform
   CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.


   CreateDataSourceFromRDS is an asynchronous operation. In response to
   CreateDataSourceFromRDS, Amazon Machine Learning (Amazon ML) immediately returns and sets the
   DataSource status to PENDING. After the DataSource is created and ready
   for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in
   the COMPLETED or PENDING state can be used only to perform
   >CreateMLModel>, CreateEvaluation, or CreateBatchPrediction
   operations.


   If Amazon ML cannot accept the input source, it sets the Status parameter to FAILED and
   includes an error message in the Message attribute of the GetDataSource operation
   response.

  request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest`

  returns: Result of the CreateDataSourceFromRDS operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest request]
    (-> this (.createDataSourceFromRDS request))))

(defn delete-realtime-endpoint
  "Deletes a real time endpoint of an MLModel.

  request - `com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest`

  returns: Result of the DeleteRealtimeEndpoint operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest request]
    (-> this (.deleteRealtimeEndpoint request))))

(defn predict
  "Generates a prediction for the observation using the specified ML Model.

   Note

   Not all response parameters will be populated. Whether a response parameter is populated depends on the type of
   model requested.

  request - `com.amazonaws.services.machinelearning.model.PredictRequest`

  returns: Result of the Predict operation returned by the service. - `com.amazonaws.services.machinelearning.model.PredictResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.PredictResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.PredictRequest request]
    (-> this (.predict request))))

(defn waiters
  "returns: `com.amazonaws.services.machinelearning.waiters.AmazonMachineLearningWaiters`"
  (^com.amazonaws.services.machinelearning.waiters.AmazonMachineLearningWaiters [^AmazonMachineLearningClient this]
    (-> this (.waiters))))

(defn create-ml-model
  "Creates a new MLModel using the DataSource and the recipe as information sources.


   An MLModel is nearly immutable. Users can update only the MLModelName and the
   ScoreThreshold in an MLModel without creating a new MLModel.


   CreateMLModel is an asynchronous operation. In response to CreateMLModel, Amazon
   Machine Learning (Amazon ML) immediately returns and sets the MLModel status to PENDING
   . After the MLModel has been created and ready is for use, Amazon ML sets the status to
   COMPLETED.


   You can use the GetMLModel operation to check the progress of the MLModel during the
   creation operation.


   CreateMLModel requires a DataSource with computed statistics, which can be created by
   setting ComputeStatistics to true in CreateDataSourceFromRDS,
   CreateDataSourceFromS3, or CreateDataSourceFromRedshift operations.

  request - `com.amazonaws.services.machinelearning.model.CreateMLModelRequest`

  returns: Result of the CreateMLModel operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateMLModelResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateMLModelResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.CreateMLModelRequest request]
    (-> this (.createMLModel request))))

(defn delete-evaluation
  "Assigns the DELETED status to an Evaluation, rendering it unusable.


   After invoking the DeleteEvaluation operation, you can use the GetEvaluation operation
   to verify that the status of the Evaluation changed to DELETED.

   Caution

   The results of the DeleteEvaluation operation are irreversible.

  request - `com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest`

  returns: Result of the DeleteEvaluation operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteEvaluationResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DeleteEvaluationResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest request]
    (-> this (.deleteEvaluation request))))

(defn delete-batch-prediction
  "Assigns the DELETED status to a BatchPrediction, rendering it unusable.


   After using the DeleteBatchPrediction operation, you can use the GetBatchPrediction operation
   to verify that the status of the BatchPrediction changed to DELETED.


   Caution: The result of the DeleteBatchPrediction operation is irreversible.

  request - `com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest`

  returns: Result of the DeleteBatchPrediction operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest request]
    (-> this (.deleteBatchPrediction request))))

(defn update-batch-prediction
  "Updates the BatchPredictionName of a BatchPrediction.


   You can use the GetBatchPrediction operation to view the contents of the updated data element.

  request - `com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest`

  returns: Result of the UpdateBatchPrediction operation returned by the service. - `com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest request]
    (-> this (.updateBatchPrediction request))))

(defn create-data-source-from-redshift
  "Creates a DataSource from a database hosted on an Amazon Redshift cluster. A DataSource
   references data that can be used to perform either CreateMLModel, CreateEvaluation, or
   CreateBatchPrediction operations.


   CreateDataSourceFromRedshift is an asynchronous operation. In response to
   CreateDataSourceFromRedshift, Amazon Machine Learning (Amazon ML) immediately returns and sets the
   DataSource status to PENDING. After the DataSource is created and ready
   for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in
   COMPLETED or PENDING states can be used to perform only CreateMLModel,
   CreateEvaluation, or CreateBatchPrediction operations.


   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and
   includes an error message in the Message attribute of the GetDataSource operation
   response.


   The observations should be contained in the database hosted on an Amazon Redshift cluster and should be specified
   by a SelectSqlQuery query. Amazon ML executes an Unload command in Amazon Redshift to
   transfer the result set of the SelectSqlQuery query to S3StagingLocation.


   After the DataSource has been created, it's ready for use in evaluations and batch predictions. If
   you plan to use the DataSource to train an MLModel, the DataSource also
   requires a recipe. A recipe describes how each input variable will be used in training an MLModel.
   Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it
   be combined with another variable or will it be split apart into word combinations? The recipe provides answers
   to these questions.

   ?oxy_insert_start author=\"laurama\" timestamp=\"20160406T153842-0700\"

   You can't change an existing datasource, but you can copy and modify the settings from an existing Amazon
   Redshift datasource to create a new datasource. To do so, call GetDataSource for an existing
   datasource and copy the values to a CreateDataSource call. Change the settings that you want to
   change and make sure that all required fields have the appropriate values.

   ?oxy_insert_end

  request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest`

  returns: Result of the CreateDataSourceFromRedshift operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest request]
    (-> this (.createDataSourceFromRedshift request))))

(defn get-ml-model
  "Returns an MLModel that includes detailed metadata, data source information, and the current status
   of the MLModel.


   GetMLModel provides results in normal or verbose format.

  request - `com.amazonaws.services.machinelearning.model.GetMLModelRequest`

  returns: Result of the GetMLModel operation returned by the service. - `com.amazonaws.services.machinelearning.model.GetMLModelResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.GetMLModelResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.GetMLModelRequest request]
    (-> this (.getMLModel request))))

(defn create-realtime-endpoint
  "Creates a real-time endpoint for the MLModel. The endpoint contains the URI of the
   MLModel; that is, the location to send real-time prediction requests for the specified
   MLModel.

  request - `com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest`

  returns: Result of the CreateRealtimeEndpoint operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest request]
    (-> this (.createRealtimeEndpoint request))))

(defn get-evaluation
  "Returns an Evaluation that includes metadata as well as the current status of the
   Evaluation.

  request - `com.amazonaws.services.machinelearning.model.GetEvaluationRequest`

  returns: Result of the GetEvaluation operation returned by the service. - `com.amazonaws.services.machinelearning.model.GetEvaluationResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.GetEvaluationResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.GetEvaluationRequest request]
    (-> this (.getEvaluation request))))

(defn describe-ml-models
  "Returns a list of MLModel that match the search criteria in the request.

  request - `com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest`

  returns: Result of the DescribeMLModels operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeMLModelsResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DescribeMLModelsResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest request]
    (-> this (.describeMLModels request)))
  (^com.amazonaws.services.machinelearning.model.DescribeMLModelsResult [^AmazonMachineLearningClient this]
    (-> this (.describeMLModels))))

(defn update-evaluation
  "Updates the EvaluationName of an Evaluation.


   You can use the GetEvaluation operation to view the contents of the updated data element.

  request - `com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest`

  returns: Result of the UpdateEvaluation operation returned by the service. - `com.amazonaws.services.machinelearning.model.UpdateEvaluationResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.UpdateEvaluationResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest request]
    (-> this (.updateEvaluation request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonMachineLearningClient this]
    (-> this (.shutdown))))

(defn delete-ml-model
  "Assigns the DELETED status to an MLModel, rendering it unusable.


   After using the DeleteMLModel operation, you can use the GetMLModel operation to verify
   that the status of the MLModel changed to DELETED.


   Caution: The result of the DeleteMLModel operation is irreversible.

  request - `com.amazonaws.services.machinelearning.model.DeleteMLModelRequest`

  returns: Result of the DeleteMLModel operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteMLModelResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DeleteMLModelResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.DeleteMLModelRequest request]
    (-> this (.deleteMLModel request))))

(defn delete-data-source
  "Assigns the DELETED status to a DataSource, rendering it unusable.


   After using the DeleteDataSource operation, you can use the GetDataSource operation to verify
   that the status of the DataSource changed to DELETED.


   Caution: The results of the DeleteDataSource operation are irreversible.

  request - `com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest`

  returns: Result of the DeleteDataSource operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteDataSourceResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DeleteDataSourceResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest request]
    (-> this (.deleteDataSource request))))

(defn create-batch-prediction
  "Generates predictions for a group of observations. The observations to process exist in one or more data files
   referenced by a DataSource. This operation creates a new BatchPrediction, and uses an
   MLModel and the data files referenced by the DataSource as information sources.


   CreateBatchPrediction is an asynchronous operation. In response to
   CreateBatchPrediction, Amazon Machine Learning (Amazon ML) immediately returns and sets the
   BatchPrediction status to PENDING. After the BatchPrediction completes,
   Amazon ML sets the status to COMPLETED.


   You can poll for status updates by using the GetBatchPrediction operation and checking the
   Status parameter of the result. After the COMPLETED status appears, the results are
   available in the location specified by the OutputUri parameter.

  request - `com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest`

  returns: Result of the CreateBatchPrediction operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest request]
    (-> this (.createBatchPrediction request))))

(defn update-data-source
  "Updates the DataSourceName of a DataSource.


   You can use the GetDataSource operation to view the contents of the updated data element.

  request - `com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest`

  returns: Result of the UpdateDataSource operation returned by the service. - `com.amazonaws.services.machinelearning.model.UpdateDataSourceResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.UpdateDataSourceResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest request]
    (-> this (.updateDataSource request))))

(defn describe-batch-predictions
  "Returns a list of BatchPrediction operations that match the search criteria in the request.

  request - `com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest`

  returns: Result of the DescribeBatchPredictions operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest request]
    (-> this (.describeBatchPredictions request)))
  (^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult [^AmazonMachineLearningClient this]
    (-> this (.describeBatchPredictions))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonMachineLearningClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-evaluation
  "Creates a new Evaluation of an MLModel. An MLModel is evaluated on a set
   of observations associated to a DataSource. Like a DataSource for an
   MLModel, the DataSource for an Evaluation contains values for the
   Target Variable. The Evaluation compares the predicted result for each observation to
   the actual outcome and provides a summary so that you know how effective the MLModel functions on
   the test data. Evaluation generates a relevant performance metric, such as BinaryAUC, RegressionRMSE or
   MulticlassAvgFScore based on the corresponding MLModelType: BINARY,
   REGRESSION or MULTICLASS.


   CreateEvaluation is an asynchronous operation. In response to CreateEvaluation, Amazon
   Machine Learning (Amazon ML) immediately returns and sets the evaluation status to PENDING. After
   the Evaluation is created and ready for use, Amazon ML sets the status to COMPLETED.


   You can use the GetEvaluation operation to check progress of the evaluation during the creation
   operation.

  request - `com.amazonaws.services.machinelearning.model.CreateEvaluationRequest`

  returns: Result of the CreateEvaluation operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateEvaluationResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateEvaluationResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.CreateEvaluationRequest request]
    (-> this (.createEvaluation request))))

(defn get-data-source
  "Returns a DataSource that includes metadata and data file information, as well as the current status
   of the DataSource.


   GetDataSource provides results in normal or verbose format. The verbose format adds the schema
   description and the list of files pointed to by the DataSource to the normal format.

  request - `com.amazonaws.services.machinelearning.model.GetDataSourceRequest`

  returns: Result of the GetDataSource operation returned by the service. - `com.amazonaws.services.machinelearning.model.GetDataSourceResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.GetDataSourceResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.GetDataSourceRequest request]
    (-> this (.getDataSource request))))

(defn create-data-source-from-s-3
  "Creates a DataSource object. A DataSource references data that can be used to perform
   CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.


   CreateDataSourceFromS3 is an asynchronous operation. In response to
   CreateDataSourceFromS3, Amazon Machine Learning (Amazon ML) immediately returns and sets the
   DataSource status to PENDING. After the DataSource has been created and is
   ready for use, Amazon ML sets the Status parameter to COMPLETED.
   DataSource in the COMPLETED or PENDING state can be used to perform only
   CreateMLModel, CreateEvaluation or CreateBatchPrediction operations.


   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and
   includes an error message in the Message attribute of the GetDataSource operation
   response.


   The observation data used in a DataSource should be ready to use; that is, it should have a
   consistent structure, and missing data values should be kept to a minimum. The observation data must reside in
   one or more .csv files in an Amazon Simple Storage Service (Amazon S3) location, along with a schema that
   describes the data items by name and type. The same schema must be used for all of the data files referenced by
   the DataSource.


   After the DataSource has been created, it's ready to use in evaluations and batch predictions. If
   you plan to use the DataSource to train an MLModel, the DataSource also
   needs a recipe. A recipe describes how each input variable will be used in training an MLModel. Will
   the variable be included or excluded from training? Will the variable be manipulated; for example, will it be
   combined with another variable or will it be split apart into word combinations? The recipe provides answers to
   these questions.

  request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request`

  returns: Result of the CreateDataSourceFromS3 operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request request]
    (-> this (.createDataSourceFromS3 request))))

(defn get-batch-prediction
  "Returns a BatchPrediction that includes detailed metadata, status, and data file information for a
   Batch Prediction request.

  request - `com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest`

  returns: Result of the GetBatchPrediction operation returned by the service. - `com.amazonaws.services.machinelearning.model.GetBatchPredictionResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.GetBatchPredictionResult [^AmazonMachineLearningClient this ^com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest request]
    (-> this (.getBatchPrediction request))))

